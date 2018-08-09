package org.programming.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Input: A1[] = {2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8} 
 * A2[] = {2, 1, 8, 3} Output: A1[] = {2, 2, 1, 1, 8, 8, 3, 5, 6, 7, 9}
 */
public class RelativeSorting {

    public static void main(String[] args) {
        int arr1[] = { 2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8 };
        int arr2[] = { 2, 1, 8, 3 };
        ArrayList<Integer> list = new ArrayList<Integer>();

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < arr1.length; i++) {
            if (map.containsKey(arr1[i])) {
                map.put(arr1[i], (map.get(arr1[i]) + 1));
            }

            else {
                map.put(arr1[i], 1);
            }
        }
        Set<Entry<Integer, Integer>> set = map.entrySet();
        for (int i = 0; i < arr2.length; i++) {
            while (map.containsKey(arr2[i])) {
                list.add(arr2[i]);
                if(map.get(arr2[i])==1)
                    map.remove(arr2[i]);
                else
                {
                    map.put(arr2[i], (map.get(arr2[i]) - 1));
                }
              
            }
            
        }
        Set<Entry<Integer, Integer>> set1 = map.entrySet();
        
        for (Entry<Integer, Integer> i : set1) {
            list.add(i.getKey());
        }
     
        System.out.println(list);
    }
}
