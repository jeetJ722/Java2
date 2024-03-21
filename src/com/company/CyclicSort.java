package com.company;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args)
    {
    int[] arr={5, 4, 3, 2, 1, 6};
    CyclicSort(arr);
    System.out.println(Arrays.toString(arr));
    }
public static void CyclicSort(int[] arr) {
    int i = 0;
    while (i < arr.length) {
        int correctindex = arr[i] - 1;
        if (arr[i] != arr[correctindex]) {
            swap(arr, i, correctindex);
        } else {
            i++;
        }

    }
}
     public static void swap(int[] arr,int start ,int end){
         int temp =arr[start];
         arr[start]=arr[end];
         arr[end]=temp;
     }
}



