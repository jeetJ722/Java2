package com.company;

public class Minnumber {
    public static void main(String[] args)
    {
        int[] arr={1,3,4,7,-7};
        System.out.println(min_number(arr));
    }
    public static int min_number(int[] arr)
    {
        int min=arr[0];
        for (int i=1;i<arr.length;i++)
        {
            if(arr[i]<min) {
                min = arr[i];
            }
        }
    return min;
    }
}
