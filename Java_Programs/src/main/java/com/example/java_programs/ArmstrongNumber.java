package com.example.java_programs;

public class ArmstrongNumber {

    public static void main(String []args){


      int n = 153;
       int l = n;
      int temp =0;
      int c =0;

      while( n !=0){

            temp = n % 10;
            n = n/10;
            c = c +(temp * temp* temp);

                }
       if (c==l){
           System.out.println("Number is Armstrong Number");
       }
    }

}
