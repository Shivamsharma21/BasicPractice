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

        LinkedList<String> linkedList1 = (LinkedList) linkedList.clone();

        System.out.println(linkedList1);

        String item = linkedList.peek();  // peek function return first element of the list

        System.out.println("First element of list is ->>"+ item);

         int size   = linkedList.size();

         System.out.println("Return the size of an list"+size); // return the size of this list  //

        String s = linkedList.get(1); // used to get the  specific element from the list  //

        System.out.println(s);

        linkedList.remove(1);  /// used to removing  item by index //

        System.out.println(linkedList);

        linkedList.clear(); // used to clear the list //

        System.out.println(linkedList);


    }
}
