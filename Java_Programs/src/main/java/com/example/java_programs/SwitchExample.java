package com.example.java_programs;

import java.util.Scanner;

public class SwitchExample {

    public static void main(String []args){

        int operation = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Operation You want to do ");

        operation   = sc.nextInt();

        switch (operation){

            case 1 :
                System.out.println("1 Add");
                break;
            case 2 :
                System.out.println("2 Sub");
                break;
            case 3 :
                System.out.println("Minus");
                break;
            case 4:
                System.out.println("Mul");
                break;
                
            default:
                System.out.println("Enter a valid choice");
        }
    }

}
