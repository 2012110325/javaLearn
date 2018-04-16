package com.practice.Kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.clients.consumer.OffsetAndMetadata;
import org.apache.kafka.common.TopicPartition;

import java.util.*;

/**
 * Created by liqiang28 on 2018/4/16.
 */
public class ConsumerDemo {

    public static void main (String[] args) {

        Properties props = new Properties();

        // 指定broker，不用指定全部的broker，它会自动发现集群中其余的broker （一般指定多个， 以免有服务器故障）
        props.put("bootstrap.servers", "localhost:9092");
        //消费者组
        props.put("group.id", "test");
        // todo offset自动提交
        props.put("enable.auto.commit", "false");
        // 自动提交的频率
        props.put("auto.commit.intervals.ms", "1000");
        // 消费者和broker机器间的 心跳检查的超时时间
        props.put("session.timeout.ms", "30000");
        // 反序列化协议
        props.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
        props.put("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");

        KafkaConsumer<String, String> consumer = new KafkaConsumer<String, String>(props);
        // 订阅的主题
        consumer.subscribe(Arrays.asList("foo", "bar"));

        final int minBatchSize = 200;
        List<ConsumerRecord<String, String>> buffer = new ArrayList<ConsumerRecord<String, String>>();
//        while (true) {
//            ConsumerRecords<String, String> records = consumer.poll(100);
//
//            for (ConsumerRecord<String, String> record : records) {
//                System.out.printf("offset = %d, key = %s, value = %s%n", record.offset(), record.key(), record.value());
//                buffer.add(record);
//            }
//
//            if (buffer.size() > minBatchSize) {
//                // dosomething()
//                // 手动提交
//                consumer.commitSync();
//                buffer.clear();
//            }
//
//        }

        String topic = "foo";
        TopicPartition partition0 = new TopicPartition(topic, 0);
        TopicPartition partition1 = new TopicPartition(topic, 1);
        // 手动分配分区，不会进行分组协调，消费者故障不会引起分区重新平衡
        // 手动分配分区(assgin) 和 动态分区分配（subcribe） 不能混合使用
        consumer.assign(Arrays.asList(partition0, partition1));

        while (true) {

            ConsumerRecords<String, String> records = consumer.poll(Long.MAX_VALUE);
            for (TopicPartition partition : records.partitions()) {
                List<ConsumerRecord<String, String>> partitionRecords = records.records(partition);

                for (ConsumerRecord<String, String> record : partitionRecords) {
                    System.out.println(record.offset() + ":" + record.value());
                }

                long lastOffset = partitionRecords.get(partitionRecords.size() - 1).offset();
                consumer.commitSync(Collections.singletonMap(partition, new OffsetAndMetadata(lastOffset + 1)));
            }
        }

    }

}
