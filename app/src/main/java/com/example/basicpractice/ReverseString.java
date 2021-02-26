package com.example.basicpractice;

public class ReverseString {
    public static void main(String [] args){
        String rev ="";
        String Data ="Shivam";
         for(int i =0; i<Data.length(); i++){
             rev = rev+ Data.charAt(i);
         }
     System.out.println(rev);
    }
}
