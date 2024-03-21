package com.company;

public class BinarySearch {
    public static void main(String[] args)
    {
        int[] arr={455,65,43,22,1};
        int target=455;
        System.out.println(binarySearch(arr,target));
    }
static int binarySearch(int[] arr,int target)
{
    int start = 0;
    int end = arr.length-1;
    while(start<=end)
    {
     int mid=start +(end - start)/2;
     if(target<arr[mid])
     {
         end = mid-1;
     }
     else if(target>arr[mid]){
         start = mid + 1;
     }
     else {
         return mid;
     }

    }
    return -1;
}

}
