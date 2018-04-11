package com.practice.Serializable;

import java.io.*;

/**
 * Created by liqiang28 on 2018/4/10.
 */
public class ObjSerializeAndDe {

    private static final String path = "C:\\Users\\liq\\Downloads\\data";
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ObjSerializeAndDe obj = new ObjSerializeAndDe();
        Person p = new Person();
//        p.setName("shenlei");
        p.setAge(12);
        p.setSex("nv");
        p.notStore = 200;
//        obj.serializePerson(p);

        System.out.println(obj.DeserializePerson());
    }

    private void serializePerson(Person p) throws IOException {

        ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream(path));
        o.writeObject(p);
    }

    private Person DeserializePerson() throws IOException, ClassNotFoundException {
        ObjectInputStream i = new ObjectInputStream(new FileInputStream(new File(path)));
        Person p = (Person)i.readObject();
        return p;
    }
}
