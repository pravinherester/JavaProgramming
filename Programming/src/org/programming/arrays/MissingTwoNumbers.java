package org.programming.arrays;

public class MissingTwoNumbers {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 6 };

        // Range of numbers is 2 plus size of array
        int n = 2 + arr.length;
        MissingTwoNumbers ob = new MissingTwoNumbers();
        ob.findTwoMissingNumbers(arr, n);
    }

    void findTwoMissingNumbers(int arr[], int n) {
        /*
         * Get the XOR of all elements in arr[] and {1, 2 .. n}
         */
        int XOR = arr[0];
        for (int i = 1; i < n - 2; i++)
            XOR ^= arr[i];
        for (int i = 1; i <= n; i++)
            XOR ^= i;

        // Now XOR has XOR of two missing elements.
        // Any set bit in it must be set in one missing
        // and unset in other missing number

        // Get a set bit of XOR (We get the rightmost
        // set bit)
        int set_bit_no =~(6 - 1);
        System.out.println(set_bit_no);
    }

}