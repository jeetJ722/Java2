package com.company;

public class Pattern3 {
    public static void main(String[] args){
    int n = 5;
    pattern3(n);
}
    public static void pattern3(int n){
        for(int i = 1; i <= n;i++){
            for(int j = n;j>=i;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}



