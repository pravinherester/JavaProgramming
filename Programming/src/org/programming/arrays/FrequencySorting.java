package org.programming.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class FrequencySorting {

    public static void main(String[] args) {
        int arr[] = { 2, 5, 2, 8, 5, 6, 8, 8 };
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i])+ 1);
            }

            else {
                map.put(arr[i], 1);

            }
        }

        Set<Entry<Integer, Integer>> set = map.entrySet();
        List list = new ArrayList<Entry<Integer, Integer>>(set);
        System.out.println(list);
        Collections.sort(list, new Comparator<Entry<Integer, Integer>>() {

            @Override
            public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
                // TODO Auto-generated method stub
                return o1.getValue()
                        .compareTo(o2.getValue());
            }
        });
        System.out.println(list);
    }
}