package org.String;

import java.util.ArrayList;
import java.util.HashMap;

public class RemoveDuplicatesSortedArray {
    public static void main(String[] args) {
        String a[] = { "pravin", "pravin", "rahul", "Dravid" }; 
        String temp[] = new String[a.length];

        int j = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] != a[i + 1]) {
                a[j] = a[i];
                j++;
            }

        }

        a[j] = a[a.length - 1];
        
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }

        HashMap<String, Boolean> map = new HashMap<String, Boolean>();
        ArrayList<String> list = new ArrayList<String>();

        for (int i = 0; i < a.length; i++) {
            if (map.containsKey(a[i])) {

            }            else {
                map.put(a[i], true);
                list.add(a[i]);
            }

        }
        System.out.println(list);

    }

}
