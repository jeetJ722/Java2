package com.company;

public class Patten30 {
    public static void main(String[] args){

        pattern30(5);
    }
    public static void pattern30(int n){
        for(int i = 1; i <= n ;i++)//outer loop no.of lines =5
            {
            int noOfSpaces =n - i;//example row = 1 & n = 5 thus noOfSpaces = n - r = 1;
            for(int s = 1; s <= noOfSpaces; s++){
                System.out.print("  ");
            }
            for(int j =  i;j >=1 ;j--)//example row = 4 thus from 4 to 1 and the 2 to row thus (int j = row;j>=1;j--) && (int j = 2;j<= row;j++)
            {
                System.out.print(j + " ");
            }
            for(int j = 2;j <= i;j++){
                System.out.print(j + " ");
            }
            System.out.println();//at every new line thus println();
        }
    }
}

