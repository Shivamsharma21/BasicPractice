package com.example.java_programs;

import java.util.Scanner;

public class SwitchExample {

    public static void main(String []args){

        int operation = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("1 Addition");
        System.out.println("2 Subtraction");
        System.out.println("3 Multiplication");

        System.out.println("Enter the Operation You want to do ");

        operation   = sc.nextInt();

        switch (operation){

            case 1 :
                System.out.println("Enter The number you want to Addition");
                int a=0,b=0,c=0;
                a = sc.nextInt();
                b = sc.nextInt();
                c = a+b;
                System.out.println("Answer is ->>"+c);
                break;

            case 2 :
                    System.out.println("Enter The number you want to Subtraction");
                    int q =0,w=0,e=0;
                    q =sc.nextInt();
                    w =sc.nextInt();
                    e = q-w;
                    System.out.println("Your Answer is ->>"+ e);
                    break;

            case 3 :
                System.out.println("Enter The number you want to Multiply");
                int y =0,t=0,l=0;
                y =sc.nextInt();
                t =sc.nextInt();
                l =y*t;
                System.out.println("Answer is ->>"+l);
                break;

            case 4:
                System.out.println("Enter the numbers you want to Divide");
                int h=0,k=0,n=0;
                h = sc.nextInt();
                k = sc.nextInt();
                n = h/k;
                System.out.println("Answer is ->>"+n);
                break;

            default:
                System.out.println("Enter a valid choice");
        }
    }

}
