package org.designpatterns.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonPreventReflection {

    private static SingletonPreventReflection soleinstance;

    private SingletonPreventReflection() {
        if(soleinstance!=null)
        {
            throw new RuntimeException("Cannot create via Reflection.. ");
        }

    }

    public static SingletonPreventReflection getInstance() {

        if (soleinstance == null) {
            soleinstance = new SingletonPreventReflection();
        }
        return soleinstance;

    }

    public static void main(String[] args)
            throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

      

        SingletonPreventReflection singleton = SingletonPreventReflection.getInstance();
        print("s1", singleton);
        // Reflection
        Class clazz = Class.forName("org.designpatterns.singleton.SingletonPreventReflection");
        Constructor<SingletonPreventReflection> cons = clazz.getDeclaredConstructor();
        cons.setAccessible(true);
        SingletonPreventReflection s2 = cons.newInstance();
        print("s2", s2);
    
    }

    private static void print(String string, SingletonPreventReflection object) {
        System.out.println(String.format("Object :%s,Hashcode :%d", string, object.hashCode()));

    }

}
