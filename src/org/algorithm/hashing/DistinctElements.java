package org.algorithm.hashing;

import java.util.HashMap;
import java.util.HashSet;

public class DistinctElements {
    public static void main(String[] args) {
        int arr[] = { 1, 5, 2, 6, 4, 1, 1, 1 };

        HashSet<Integer> set = new HashSet<Integer>();
        
        for(int i=0;i<arr.length;i++)
        {
            if(!set.contains(arr[i])){

                set.add(arr[i]);
                System.out.println(arr[i]);
            }
          

    }
    }
}

