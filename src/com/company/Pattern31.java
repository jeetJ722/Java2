package com.company;

public class Pattern31 {
    public static void main(String[] args){
        pattern31(4);
    }

    public static void pattern31(int n){
        int originalN = n;
        n = 2 * n;
        for(int i = 0; i <= n;i++){

            for(int j = 0; j <= n;j++){
                int atEveryIndex = originalN - (Math.min(Math.min(i,j),Math.min(n - j, n -i)));
                System.out.print(atEveryIndex +" ");
            }
            System.out.println();
        }

    }
}
