package org.programming.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class LargestNumberFormedInArray {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("84");
        list.add("546");
        list.add("548");
        list.add("960");
        findLargestNumber(list);
    }

    private static void findLargestNumber(List<String> list) {
        Collections.sort(list, new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {

                String o1o2 = o1 + o2;
                String o2o1 = o2 + o1;
                // TODO Auto-generated method stub
                return o1o2.compareTo(o2o1) > 0 ? -1 : 1;
            }
        });

        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.print(it.next());
        }
    }

}
