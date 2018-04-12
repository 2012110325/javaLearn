package com.practice.Serializable;

import java.io.*;
import java.util.Properties;

/**
 * Created by liqiang28 on 2018/4/10.
 */
public class ObjSerializeAndDe {

    private static final String path = "C:\\Users\\liq\\Downloads\\data";
    private static final String path1 = "/Users/liqiang/Downloads/shell/data";

   /* 对于序列化，需要实现 Serializable接口  若不实现，则不能用java原生的序列化和反序列化api ObjectInputStream ObjectOutputStream
      一、对于 serialversionUID 字段
      1、 序列化时加上serialversionUID字段，
        1.1 反序列化时去掉serialversionUID， 不能正常的反序列化 报错serialVersionUID 不同
        1.2 反序列化时不去掉serialversionUID这个字段，但是添加字段或去掉字段 则依旧可以序列化
      2、 序列化不加上serialversionUID字段，
        2.1 反序列化时加上 报错serialversionUID 不同
        2.2 反序列化添加或删除字段 都会报错
      二、类的静态成员不会序列化  serialVersionUID除外
      三、不想某个字段被序列化，则加上 transient字段
      四、类的方法信息是否会被序列化， 如果验证？ 答案是肯定
      五、有多种序列化协议，每种序列化协议的优缺点
      六、


      参考： https://tech.meituan.com/serialization_vs_deserialization.html
   */
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ObjSerializeAndDe obj = new ObjSerializeAndDe();
        Person p = new Person();
        p.setName("shenlei");
        p.setAge(12);
        p.setSex("nv");
        obj.serializePerson(p);

        p.notStore = 200;

        System.out.println(obj.DeserializePerson());


    }

    private void serializePerson(Person p) throws IOException {

        ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream(getDataPath()));
        o.writeObject(p);
    }

    private Person DeserializePerson() throws IOException, ClassNotFoundException {
        ObjectInputStream i = new ObjectInputStream(new FileInputStream(new File(getDataPath())));
        Person p = (Person)i.readObject();
        return p;
    }

    private static String getDataPath() {

        Properties props=System.getProperties(); //获得系统属性集
        String osName = props.getProperty("os.name"); //操作系统名称
        if (osName.contains("Mac")) {
            return path1;
        }
        return path;
    }
}
