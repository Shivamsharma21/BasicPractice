package com.example.java_programs;


        // Bubble Sort Algorithm

public class BubbleSortExample {

    public static void main(String[] args) {

        int temp = 0;


        int arr[] = {22, 56, 21, 2, 56, 87};
        for (int j = 0; j < arr.length-1; j++) {
            for (int i = 0; i < arr.length-1; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                                         }
            }
            }
        for(int k =0; k<arr.length; k++){
               System.out.println(arr[k]);
            }
    }
}