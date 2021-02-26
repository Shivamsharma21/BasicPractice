package com.example.java_programs;

public class DecendingOrderArray {

    public static void main(String [] args){

        int arr[] = {22,34,67,1,45,13,78,23};
         int temp =0;
         for (int j =0; j<arr.length;j++){
        for (int i=0; i<arr.length-1; i++) {
            if(arr[i] < arr[i+1]){
                temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] =temp;
            }
        }
         }
        for(int i =0; i<arr.length; i++){
           System.out.println(arr[i]);
             }
    }
}
