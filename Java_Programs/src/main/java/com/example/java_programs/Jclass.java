package com.example.java_programs;

///////  this is an example of static variable in Java


public class Jclass {

    static int count =0;

    Jclass(){
        count++;
    }

    public static void main(String []args){
       Jclass jclass = new Jclass();
        Jclass jclass1 = new Jclass();
        Jclass jclass2 = new Jclass();
        System.out.println(count);

    }
}
/////

