package com.company;

import java.util.Arrays;

public class Search2DArrays {
public static void main(String[] args)
{
    int[][] arr={//new int[][] is not mandatory over here
            {1,2,3},
            {4,5,6},
            {8,9,3}
    };
    int target=9;
    int[] ans=Search(arr,target);
    System.out.println(Arrays.toString(ans));
}
    static int[] Search(int[][] arr,int target)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i][j]==target)
                {
                    return new int[]{i,j} ;//here you to mention new to initialise object
                }
            }
        }
    return new int[]{-1,-1};
    }
}

