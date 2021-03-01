package com.example.java_programs;

        /// program of addition of two matrix ///

public class Matrix {
    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3}, {4, 5, 6}, {1, 1, 1}};

        int arr2[][] = {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}};

        int arr3[][] = new int[3][3];

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr2.length; j++) {

                arr3[i][j] = arr[i][j] + arr2[i][j];

            }

        }

        /// loop for printing resultant Matrix
        for (int k = 0; k < arr3.length; k++) {

            System.out.println("");

            for (int t = 0; t < arr3.length; t++) {

                System.out.print(arr3[k][t]);
            }
        }
    }
}