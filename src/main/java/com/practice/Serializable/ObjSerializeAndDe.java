package com.practice.Serializable;

import java.io.*;

/**
 * Created by liqiang28 on 2018/4/10.
 */
public class ObjSerializeAndDe {


    private void serializePerson(Person p) throws IOException {

        ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream(new File("")));
        o.writeObject(p);
    }

    private Person DeserializePerson() throws IOException, ClassNotFoundException {
        ObjectInputStream i = new ObjectInputStream(new FileInputStream(new File("")));
        Person p = (Person)i.readObject();
        return p;
    }
}
