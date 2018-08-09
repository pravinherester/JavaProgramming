package org.designpatterns.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonPreventSerialization implements Serializable {

    private static SingletonPreventSerialization soleinstance;

    private SingletonPreventSerialization() {
        if (soleinstance != null) {
            throw new RuntimeException("Cannot create via Reflection.. ");
        }

    }

    public static SingletonPreventSerialization getInstance() {

        if (soleinstance == null) {
            soleinstance = new SingletonPreventSerialization();
        }
        return soleinstance;

    }

    private Object readResolve() throws ObjectStreamException {
        System.err.println("During Deserialization");
        return soleinstance;

    }

    public static void main(String[] args)
            throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, FileNotFoundException, IOException {

        // Serialization

        SingletonPreventSerialization singleton = SingletonPreventSerialization.getInstance();
        print("s1", singleton);
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
        os.writeObject(singleton);

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("singleton.ser"));
        SingletonPreventSerialization sis = (SingletonPreventSerialization) ois.readObject();

        System.out.println(" After Deserialization");
        print("sis", sis);

    }

    private static void print(String string, SingletonPreventSerialization object) {
        System.out.println(String.format("Object :%s,Hashcode :%d", string, object.hashCode()));

    }

}
