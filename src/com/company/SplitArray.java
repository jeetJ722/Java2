package com.company;

public class SplitArray {
    public static void main(String[] args){

    }
    public static int SplitArray(int[] nums,int m){
        int start = 0;
        int end = 0;
        for(int i =0 ; i < nums.length;i++){
           start = Math.max(start, nums[i]);//Max element from the array
           end+=nums[i];//Sum of all the values
        }
        //Now we have start and end we will apply binary search
        while(start <end) {
            //try middle for potential answer
            int mid = start + (end - start) / 2;
            int sum = 0;
            int pieces = 1;//Atleast one piece
            for (int num : nums) {
                    if (sum + num > mid)
                    {
                       //then create new subarray:
                        sum = num;
                        pieces++;
                    }
                    else {
                        sum += num;
                    }
                }
            if(pieces > m)
            {
                start = mid + 1;
            }
            else{
                end = mid;
            }
        }
        return end;
    }
}
