package com.company;

public class FindPositionIninfiniteArray {
    public static void main(String[] args) {
        int[] arr ={3,5,7,9,10,90,100,130,140,160,170};
        int target = 10;
        System.out.println(ans(arr,target));

    }
    public static int ans(int[] arr,int target)
    {//Finding range for getting the start and end value and then simply applying BS on that:
        int start=0;
        int end=1;
        while(target > arr[end]) {
            int temp = end + 1;
            //new start will be current end position + 1;
            end = end + (end - start) * 2;//end is formula based logic is that end + sizeofbox()*2;
            start = temp;
        }
        return FindPostion(arr,target,start,end);
        }

    public static int FindPostion(int[] arr,int target,int start,int end)
    {

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
