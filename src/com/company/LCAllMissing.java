package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class LCAllMissing {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(arr));

    }
    public static List<Integer> findDisappearedNumbers(int[] arr) {
            int i = 0;
            while(i< arr.length){
                int index = arr[i] - 1;
                if(arr[i]!=arr[index])
                {
                    int temp = arr[i];
                    arr[i]=arr[index];
                    arr[index]=temp;
                }
                else{
                    i++;
                }
            }
    //just find missing numbers
        List<Integer> ans=new ArrayList<>();
        for(int j=0;j<arr.length;j++){
        if(arr[j]!= j+1){
            ans.add(j + 1);
        }
        }
        return ans;
    }
}
