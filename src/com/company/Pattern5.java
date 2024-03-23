package com.company;

public class Pattern5 {
    public static void main(String[] args){

        pattern5(5);
    }
    public static void pattern5(int n){
        for(int i = 0; i < 2*n ;i++){
            int totalColsinRow = i > n ? 2 * n - i: i;//?: This is the ternary operator's syntax, separating the condition from the expressions that will be evaluated based on the condition.
            //i: If the condition i > n evaluates to false, this expression is evaluated. It just assigns the value of variable i to totalColsinRow.
            //So, in simple terms, this line of code assigns the value of 2 * n - i to totalColsinRow if i is greater than n, otherwise, it assigns the value of i to totalColsinRow.
            for(int j = 0;j < totalColsinRow;j++)
            {
                    System.out.print("* ");

            }
        System.out.println();
        }

        }
    }


