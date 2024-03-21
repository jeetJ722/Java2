package com.company;
//Celing means find smallest element in array >=to target element

public class CeilingOfNumber {
    public static void main(String[] args){
    int[] arr={2,3,5,9,14,16,18};
    int target=15;
    System.out.println(CelingNumber(arr,target));
    }

    public static int CelingNumber(int[] arr,int target) {
        if (target > arr[arr.length - 1])
        {
            return -1;
        }
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
        return start;
    }

}