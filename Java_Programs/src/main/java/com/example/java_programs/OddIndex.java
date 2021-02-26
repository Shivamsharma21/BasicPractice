package com.example.java_programs;

public class OddIndex {
    public static void main(String []args){

        String name = "Shivam";
        /// h v m
        /// m v h

        char ac[] = name.toCharArray();
        char oddChar[] = new char[6];

        int z =0;

           for (int i =0; i<ac.length; i++){
                 if(i %2 != 0){
                          oddChar[z]  = ac[i];
                          z++;
                 }
           }
      for (int c =oddChar.length-1; c >= 0; c--){
          System.out.println(oddChar[c]);
      }

    }
}
