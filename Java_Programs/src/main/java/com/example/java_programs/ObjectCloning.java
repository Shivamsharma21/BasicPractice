package com.example.java_programs;


public class ObjectCloning implements Cloneable {

    String name ="";
    int age =0;

      ObjectCloning(String name,int age){
          this.name = name;
          this.age = age;
      }

      public Object clone() throws CloneNotSupportedException {
          return super.clone();
      }

    public static void main(String []args) throws CloneNotSupportedException {
       ObjectCloning objectCloning = new ObjectCloning("Shivam",23);
       ObjectCloning objectCloning1 = (ObjectCloning) objectCloning.clone();

      System.out.println("Name = "+objectCloning1.name+" \n"+ "Age = "+objectCloning1.age);
        System.out.println("");
      }


}
