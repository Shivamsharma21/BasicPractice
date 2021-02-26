package com.example.java_programs;

/// this is an example of inner nested class in java

public class StaticClass {   ///// outer class
    static class NestedStaticClass{    // inner nested class
          void run(){
              System.out.println("This is a nested class");
          }
    }

  public static void main(String []args){

        StaticClass.NestedStaticClass nestedStaticClass = new StaticClass.NestedStaticClass(); // accessing the static class with its Outer class
            nestedStaticClass.run();

  }

}
