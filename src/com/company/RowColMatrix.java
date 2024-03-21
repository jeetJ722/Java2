package com.company;

import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };

        System.out.println(Arrays.toString(search(matrix, 49)));
    }

    public static int[] search(int[][] matrix, int target) {
        //without formula approach without the mid approach:
        int low = 0;
        int high = matrix.length - 1;
        while (low < matrix.length && high >= 0) {
            if (matrix[low][high] == target) {
                return new int[]{low, high};
            } else if (matrix[low][high] < target) {
                low++;
            } else {
                high--;
            }

        }
        return new int[]{-1, -1};
    }
}