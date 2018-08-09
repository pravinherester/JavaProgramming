package org.designpatterns.singleton;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.lang.Runtime;
public class SingletonClass implements Cloneable {
    private static SingletonClass soleInstance = null;

    private SingletonClass() {

    }

    public static SingletonClass getInstance() {
        if (soleInstance == null) {
            synchronized (SingletonClass.class) {
                if(soleInstance==null)
                soleInstance = new SingletonClass();
            }
           
        }
        return soleInstance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }

    public static void main(String args[]) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException,
            InvocationTargetException, FileNotFoundException, IOException, CloneNotSupportedException {
        // instantiating Singleton class with variable x
        SingletonClass x = SingletonClass.getInstance();

        // instantiating Singleton class with variable y
        SingletonClass y = SingletonClass.getInstance();

        // instantiating Singleton class with variable z
        SingletonClass z = SingletonClass.getInstance();

        System.out.println(x.hashCode());
        System.out.println(y.hashCode());
        System.out.println(z.hashCode());

        // Reflection
        Class cla = Class.forName("org.designpatterns.singleton.SingletonClass");
        Constructor<SingletonClass> cons = cla.getDeclaredConstructor();
        cons.setAccessible(true);
        SingletonClass reflection = cons.newInstance();
        System.out.println("After Reflection" + reflection.hashCode());

        // Serialization
        /*
         * System.out.println("Before Serialization" +z.hashCode() ); ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("z.ser")); os.writeObject(z);
         * 
         * ObjectInputStream ois = new ObjectInputStream(new FileInputStream("z.ser")); SingletonClass sis = (SingletonClass) ois.readObject();
         * 
         * System.out.println(" After Deserialization" +sis.hashCode());
         */
        // Cloning
        SingletonClass s = (SingletonClass) z.clone();
        System.out.println(" After Cloning" + s.hashCode());

        ExecutorService service = Executors.newFixedThreadPool(5);
        service.submit(TestClass::test);
        service.submit(TestClass::test);
        service.submit(TestClass::test);
        service.submit(TestClass::test);
        service.submit(TestClass::test);
       
        service.shutdown();

    }

}

class TestClass {
    static void test() {
        SingletonClass singleton = SingletonClass.getInstance();
        System.out.println("Multithreading check :" + singleton.hashCode());
    }

}