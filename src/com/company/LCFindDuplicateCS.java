package com.company;
//https://leetcode.com/problems/find-the-duplicate-number/description/
import java.util.Arrays;

public class LCFindDuplicateCS {

    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};

        System.out.println(findDuplicate(arr));

    }
        public static int findDuplicate(int[] arr) {
            int i = 0;
            while(i< arr.length){
                int index = arr[i] - 1;
                if(arr[i]!=i + 1)
                {
                    if( arr[i]!=arr[index])
                    {
                        int temp = arr[i];
                        arr[i]=arr[index];
                        arr[index]=temp;
                    }
                    else{
                        return arr[i];
                    }
                }
                else{
                    i++;
                }
            }

            return -1;
        }
}



