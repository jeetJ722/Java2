package com.company;

public class Pattern4 {
    public static void main(String[] args){
        int n = 5;
        pattern4(n);
    }
    public static void pattern4(int n){
        for(int i = 1; i <= n;i++){
            int count = 1;
            for(int j = 1;j<=i;j++)
            {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }
}

