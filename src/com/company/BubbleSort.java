package com.company;

import java.util.Arrays;

public class BubbleSort {
    public static void  main(String[] args){
    int[] arr ={1,2,3,4,5};
    System.out.println(Arrays.toString(BubbleSort(arr)));

    }
    static int[] BubbleSort(int[] arr ){
        //run steps n-1 times:
        boolean swapped ;//for 0(n) complexity using boolean function:
        for(int i = 0; i<arr.length;i++){
            swapped = false;
            for(int j = 0;j<arr.length-1;j++)
            {
                if(arr[j]>arr[j + 1]){
                    int temp = arr[j];
                    arr[j]= arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
    if(swapped == false)
    {
        break;
    }
        }
        return arr;
    }

}
