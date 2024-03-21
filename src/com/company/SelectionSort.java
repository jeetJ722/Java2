package com.company;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args){
        int[] arr={3,1,4,6,8};
        SelectionSort(arr);

    }
    public static void SelectionSort(int[] arr){
       for(int i = 0; i<arr.length - 1;i++) {
           int minimum = i;
           for (int j = 1; j < arr.length -1; j++) {
               if (arr[j] < arr[minimum]) {
                   minimum = j;
               }
           }
           int temp = arr[i];
           arr[i] = arr[minimum];
           arr[minimum] = temp;
       }
       System.out.println(Arrays.toString(arr));

    }
}
