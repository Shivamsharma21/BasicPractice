package com.example.java_programs;

public class FindLeapYear {

    public static void main(String []args){

        int year = 2016;

        if (year % 4 ==0 ){

            if (year % 100 ==0){

                if (year % 400 ==0){

                    System.out.println("Its a leap year");

                }else{
                    System.out.println("Its Not a leap Year");
                }
            }else {
                System.out.println("Its a leap year");
            }
        }else {
            System.out.println("Its Is not a leap year");
        }
    }


}
