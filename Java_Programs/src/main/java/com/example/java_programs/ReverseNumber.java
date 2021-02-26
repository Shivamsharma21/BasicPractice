package com.example.java_programs;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String []args){

        int reverse = 0,rem = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to reverse");
         int num = 3976;//sc.nextInt();
         while(num != 0){
                rem= num %10;
                reverse = reverse *10 +rem;
                num= num /10;
         }
       System.out.println("Reverse Number is ->"+ reverse);
    }
}
