package com.example.java_programs;

public class CustomException {

    public static void main(String []args){
       LicenceGenerator licenceGenerator = new LicenceGenerator();
        licenceGenerator.Generate(21);
         }
    }
class LicenceGenerator{
       int age ;
      public void Generate(int age){
               this.age = age;
            if(age < 18){
                throw new ArithmeticException ("You are not able to Get A new Licence");
            }else{
                System.out.println("Congratulation's For register A Driving Licence");
            }
          }
}
