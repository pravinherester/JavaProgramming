package org.algorithm.hashing;

import java.util.HashMap;

public class FirstElementWithKCounts {
    public static void main(String[] args) {
        int a[] = { 1, 8, 3, 4, 5, 3, 51, 55 };
        int k = 2;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i=0;i<a.length;i++) {
            if (map.containsKey(a[i])) {
                map.put(a[i], map.get(a[i]) + 1);

            } else {
                map.put(a[i], 1);
            }
        }
        
        for(int i=0;i<a.length;i++)
        {
            if(map.get(a[i])==k)
            {
                System.out.println(a[i]);
                return;
            }
        }

    }
}
