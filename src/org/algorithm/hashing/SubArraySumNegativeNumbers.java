package org.algorithm.hashing;

import java.util.HashMap;

public class SubArraySumNegativeNumbers {

    public static void main(String[] args) {
        int a[] = { 10, 2, -2, -20, 10 };
        int subArraySum = 10;
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i <a.length; i++) {
            
          
            sum = sum + a[i];
            
            if (map.containsKey((sum-subArraySum))) {
                System.out.println("SubArray sum found" + i);
                return;
            }
            
            if (sum == subArraySum) {
                System.out.println("SubArray Sum found" + i);
                return;
            }

            map.put(sum, i);
        }
    }
}
