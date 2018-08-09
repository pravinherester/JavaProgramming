package org.searching;

import javax.swing.text.AbstractDocument.LeafElement;

public class BinarySearchInteger {

    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 10, 12, 14, 16 };
        int x = 6;

        int index=findIndex(arr, 0, arr.length - 1, x);
        System.out.println(index);

    }

    private static int findIndex(int[] arr, int l, int r, int x) {

        if (r >= l) {
            int middleIndex = l + (r - l) / 2;
            if (arr[middleIndex] == x)
                return middleIndex;

            else if (x > arr[middleIndex]) {
                return findIndex(arr, middleIndex + 1, r, x);
            }

            else if (x < arr[middleIndex]) {
                return findIndex(arr, l, middleIndex - 1, x);
            }

            return middleIndex;

        }

        return -1;

    }
}
