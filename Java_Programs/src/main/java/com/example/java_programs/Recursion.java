package com.example.java_programs;

// recursion example with Factorial ///

public class Recursion {

    public int fact(int n) {
        if (n != 0) {
            return n * fact(n - 1);
        }else
        {
            return 1;
        }
    }
    public static void main(String []args){
          Recursion recursion = new Recursion();
            int num = recursion.fact(45);
        System.out.println(num);
    }
}