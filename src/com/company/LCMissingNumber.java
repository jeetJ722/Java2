package com.company;
//https://leetcode.com/problems/missing-number/

import java.util.Arrays;

public class LCMissingNumber {

        public static void main(String[] args) {
            int[] arr = {4,0,2,1};
            System.out.println(missingNumber(arr));
        }
    public static  int missingNumber (int[] arr) {
            int i = 0;
            while (i < arr.length) {
                int index = arr[i];
                if (arr[i] < arr.length && arr[i] != arr[index]) {
                    int temp = arr[i];
                    arr[i] = arr[index];
                    arr[index] = temp;
                } else {
                    i++;
                }
            }
            for(int j = 0;j<arr.length;j++)
            {
                if(arr[j]!=j){
                    return j;
                }
            }
            return arr.length;

    }

}