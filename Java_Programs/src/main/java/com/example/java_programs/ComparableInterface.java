package com.example.java_programs;


import java.util.ArrayList;
import java.util.Collections;

public class ComparableInterface{

    public static void main(String []args){

        ArrayList<Student> arrayList = new ArrayList<>();

        arrayList.add(new Student("Shivam",23,1009));
        arrayList.add(new Student("James",34,5021));
        arrayList.add(new Student("Will",20,7779));
        arrayList.add(new Student("Max",31,1239));
        arrayList.add(new Student("Blake",28,1009));
        arrayList.add(new Student("Smith",26,9876));
        arrayList.add(new Student("Wiz",19,8241));
        arrayList.add(new Student("Drake",17,9356));


        Collections.sort(arrayList);

        for (Student student: arrayList){
            System.out.println(student.rollno+" "+student.name+" "+student.age);
        }

    }

}
class Student implements Comparable<Student>{

    int rollno =0;

    int age =0;

    String name ="";


    Student(String name,int age,int rollno){

        this.name = name;

        this.age = age;

        this.rollno = rollno;
    }

    public int compareTo( Student s) {

    if (age == s.age){
            return 0;
        }
        if(age>s.age){
            return 1;
        }
        else{
            return -1;
        }
    }

    }
