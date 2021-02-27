package com.example.java_programs;

import java.util.LinkedList;

public class LlinkedList {
    public static void main(String []args){
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("Shivam");
        linkedList.add("Won");
        linkedList.add("Pixi");
        linkedList.add("John");
        linkedList.add("Drake");

        System.out.println(linkedList);

        String s = linkedList.get(1); // used to get the  specific element from the list  //

        System.out.println(s);

        linkedList.remove(1);  /// used to removing specific item from list

        System.out.println(linkedList);

        linkedList.clear(); // used to clear the list //

        System.out.println(linkedList);


    }
}
