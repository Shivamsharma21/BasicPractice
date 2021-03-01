package com.example.java_programs;


/// example of stack in java

// stack is based on the principal of LIFO (Last in first Out)

public class Stack {

    public static void main(String []args){

     java.util.Stack<Integer> stack = new java.util.Stack<>();

        stack.push(22);
        stack.push(18);
        stack.push(220);
        stack.push(84);
        stack.push(12);
        stack.push(34);

     boolean status = stack.empty();    // shows if the stack is empty or not  //

     System.out.println(""+status);

        System.out.println(stack);

        System.out.println(stack.pop()); // return the last inserted element in Stack  //

        System.out.println(stack);


    }


}
