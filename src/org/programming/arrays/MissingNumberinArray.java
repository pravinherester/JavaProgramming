package org.programming.arrays;

public class MissingNumberinArray {
public static void main(String[] args) {
    int arr[]={1, 2, 4, 6, 3, 7, 8};
    int originalLenght=arr.length+1;
    int originalSum=(originalLenght)*(originalLenght+1)/2;
    
    int actualSum=0;
    for(int i=0;i<arr.length;i++)
    {
        actualSum=actualSum+arr[i];
    }
    System.out.println(originalSum-actualSum);
}
}
