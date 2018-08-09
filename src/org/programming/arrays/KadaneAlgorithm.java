package org.programming.arrays;

public class KadaneAlgorithm {
    public static void main(String[] args) {
        int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 };
        
        //First Approach-Considering all the negative values
        int maxEndinghere = arr[0];
        int maxSoFar = arr[0];

        for (int i = 0; i < arr.length; i++) {
            maxEndinghere = Math.max(arr[i], arr[i] + maxEndinghere);

            maxSoFar = Math.max(maxSoFar, maxEndinghere);
        }
        System.out.println(maxSoFar);
        
       //Second Approach making negative values to 0 

        maxSoFar = 0;
        maxEndinghere = 0;
        for (int i = 0; i < arr.length; i++) {
            maxEndinghere = arr[i] + maxEndinghere;
            if(maxEndinghere <0)
            {
                maxEndinghere=0;
            }

            if (maxSoFar < maxEndinghere)
                maxSoFar = maxEndinghere;
        }
        System.out.println(maxSoFar);
    }

}
