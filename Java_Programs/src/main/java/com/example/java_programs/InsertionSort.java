package com.example.java_programs;


public class InsertionSort {

    public static void main(String[] args) {

        int arr[] = {46, 21, 13, 41, 47, 87, 19, 55};
        int i;
        int temp = 0;
        int min = 0;

        for (i = 0; i < arr.length; i++) {

            min = i;

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] < arr[min]) {
                    min = j;
                }


            }
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;

        }
        for (int z = 0; z < arr.length; z++) {
            System.out.println(arr[z]);
        }
    }
}


