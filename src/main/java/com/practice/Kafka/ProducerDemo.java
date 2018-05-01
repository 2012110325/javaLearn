//package com.practice.Kafka;
//
//import org.apache.kafka.clients.producer.KafkaProducer;
//import org.apache.kafka.clients.producer.Producer;
//import org.apache.kafka.clients.producer.ProducerRecord;
//
//import java.util.Properties;
//
///**
// * Created by liqiang28 on 2018/4/14.
// */
//public class ProducerDemo {
//
//    public static void main (String[] args) {
//        Properties props = new Properties();
//
//        props.put("bootstrap.servers", "10.4.226.6:9092");
//        // todo 判断消息请求是否成功发送到集群， all会阻塞消息，性能低，但是可靠
//        props.put("acks", "all");
//        // 请求失败， 生产者重试的次数，如果启用了重试，会有重复消息的可能
//        props.put("retries", 0);
//        // 缓存每个分区未发送的消息， 每个分区都需要一个缓存区
//        props.put("batch.size", 16384);
//        // 设置缓冲区里的信息发送的时机。 为0则是立即发送，后面的单位是毫秒， 设置比0大，以少量的延迟换取更少，更有效的请求
//        props.put("linger.ms", 1);
//        // 控制生产者可用的缓冲总量，当缓存空间耗尽，其它发送调用将被阻塞，阻塞时间的由 max.block.ms设定，之后会抛出TimeoutException
//        props.put("buffer.memory", 33554432);
//        // 将key value 字段转换成字节,使用自带的StringSerializer序列化协议
//        props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
//        props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
//
//        Producer<String, String> producer = new KafkaProducer<String, String>(props);
//
//        for (int i = 0; i < 100; ++i) {
//            // send 是异步的，只是将消息添加到分区缓冲区（后台的io线程负责来将消息转换到请求发送到kafka汲集群） 这样可以保证消息是批量发送的。 question: 那消息发送到kafka的时机是不是不确定的？
//            producer.send(new ProducerRecord<String, String>("my-topic", Integer.toString(i), Integer.toString(i)));
//            // 同一个分区的callback保证按顺序执行
//        }
//        // 必须要关闭 否则会泄漏后台的I/O线程
//        producer.close();
//
//    }
//}
