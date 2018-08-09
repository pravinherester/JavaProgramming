package org.algorithm.hashing;

public class SubArraySumNonneativeIntegers {
    public static void main(String[] args) {
        int a[] = { 1, 26, 6, 5, 4, 7, 8, 10 };
        int subArraySum = 10;
        int start = 0;
        int sum = a[0];
        for (int i = 1; i <= a.length; i++) {

            while (sum > subArraySum && start < i - 1) {
                sum = sum-a[start];
                start++;
            }

            if (sum == subArraySum) {
                System.out.println("Sub array Sum found at index" + (i - 1));
            }

            if (i < a.length) {
                sum = sum + a[i];
            }

        }

    }

}
