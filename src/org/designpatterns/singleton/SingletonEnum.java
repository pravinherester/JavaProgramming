package org.designpatterns.singleton;

public class SingletonEnum {

    public static void main(String[] args) {
        Singleton singleton =Singleton.INSTANCE;
        System.out.println(singleton.hashCode());
        singleton.configuration();
    }
}

enum Singleton{
    INSTANCE;
    public void configuration()
    {
        System.out.println("gello");
    }
}

