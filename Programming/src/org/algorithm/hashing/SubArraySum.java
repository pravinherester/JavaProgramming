package org.algorithm.hashing;

import java.util.HashMap;

public class SubArraySum {

    public static void main(String[] args) {
        int arr[] = { 0, 2, 3, 1, 6 };

        boolean isSubArraySumZero = checForSubArraySum(arr);
        System.out.println(isSubArraySumZero);

    }

    private static boolean checForSubArraySum(int[] arr) {
        int sum = 0;
        HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            if (sum == 0 || map.containsKey(sum)) {
                return true;
            }
            map.put(sum, true);
        }
        return false;

    }
}
