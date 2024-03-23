package com.company;

public class Pattern28{
    public static void main(String[] args){

        pattern28(4);
    }
    public static void pattern28(int n){
        for(int i = 1; i < 2*n ;i++){
            int totalColsinRow = i > n ? 2 * n - i: i;
            int noOfSpaces =n-totalColsinRow;
            for(int s = 0; s < noOfSpaces; s++){
                System.out.print(" ");
            }
            for(int j = 0;j < totalColsinRow;j++)
            {
                System.out.print("* ");

            }
            System.out.println();
        }

    }
}

