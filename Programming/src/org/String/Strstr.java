package org.String;

public class Strstr {

    public static void main(String[] args) {
        strstr("pravin", "ra");
    }

    private static void strstr(String string1, String string2) {
        if(string1==null || string2==null)
        {
            System.out.println("String is null");
        }
        
        if(string2.length()==0)
        {
            System.out.println("String 2 length is 0");
        }
        
        

    }

}
