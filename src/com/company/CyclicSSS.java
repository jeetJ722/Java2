package com.company;

import java.util.Arrays;

public class CyclicSSS {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1, 6};
        Cyclesort(arr);
        System.out.println(Arrays.toString(arr));

    }
public static void Cyclesort(int[] arr)
{
    int i = 0;
    while(i< arr.length){
        int index = arr[i] - 1;
        if(arr[i]!=arr[index])
        {
          swap(arr,i,index);
        }
        else{
            i++;
        }
    }
}
public static void swap(int[] arr,int i,int index){
    int temp = arr[i];
    arr[i]=arr[index];
    arr[index]=temp;
}
}
