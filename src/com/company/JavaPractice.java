package com.company;

import java.util.Scanner;
public class JavaPractice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
    //Linear Search:
        int n=sc.nextInt();
        int val=18;
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }
        for(int num:arr)
        {
            if(num==val){
                System.out.println("The value is searched in the array");
            }
            else{
                System.out .println("The value is not in array");
            }
        }
    }
}