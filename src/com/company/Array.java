package com.company;
import java.util.Arrays;
import java.util.Scanner;
import java.util.SequencedSet;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
            /*int[][] arr1= {
                    {2, 3, 4},
                    {1, 3, 4},
                    {3, 4, 5}

            };
        System.out.println(arr1[0][1]);

        }
             */
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr.length; col++) {
                arr[row][col] = sc.nextInt();

            }
        }
            for (int row = 0; row < arr.length; row++) {
                for (int col = 0; col < arr.length; col++) {
                    System.out.print(arr[row][col]+" ");

                }
                System.out.println();
            }
        }
    }



