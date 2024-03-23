package com.company;

public class Pattern17 {
    public static void main(String[] args){

        pattern17(4);
    }

    public static void pattern17(int n){
        for(int i = 1; i < 2*n ;i++)//outer loop no.of lines =5

        {
            int c =  i > n ? 2 * n - i: i;;
            int noOfSpaces = n - c;//example row = 1 & n = 5 thus noOfSpaces = n - r = 1;
            for(int s = 0; s <= noOfSpaces; s++){
                System.out.print("  ");
            }
            for(int j =  c;j >= 1 ;j--)//example row = 4 thus from 4 to 1 and the 2 to row thus (int j = row;j>=1;j--) && (int j = 2;j<= row;j++)
            {
                System.out.print(j + " ");
            }
            for(int j = 2;j <= c;j++){
                System.out.print(j +" ");
            }
            System.out.println();//at every new line thus println();
        }
    }
}

