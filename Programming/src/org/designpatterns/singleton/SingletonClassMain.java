package org.designpatterns.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonClassMain {
    public static void main(String args[])
            throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        // instantiating Singleton class with variable x
        SingletonClass x = SingletonClass.getInstance();

        // instantiating Singleton class with variable y
        SingletonClass y = SingletonClass.getInstance();

        // instantiating Singleton class with variable z
        SingletonClass z = SingletonClass.getInstance();

        System.out.println(x.hashCode());
        System.out.println(y.hashCode());
        System.out.println(z.hashCode());

        Class cla = Class.forName("org.designpatterns.singleton.SingletonClass");
        Constructor<SingletonClass> cons = cla.getDeclaredConstructor();
        cons.setAccessible(true);
        SingletonClass reflection = cons.newInstance();
        

        // changing variable of instance x

    }
}