package org.dummy;

import java.util.Arrays;
import java.util.LinkedList;

public class Test {

    public static void main(String[] args) {
        String a="abc";
        String b="abc";
        System.out.println(a.equals(b));
        
        String aa[]={"Pravin"};
        System.out.println(Arrays.toString(aa));
        
        LinkedList list=new LinkedList();
        
        String text="1234";
       System.out.println(text.matches("[0-9]+"));
    }
}
