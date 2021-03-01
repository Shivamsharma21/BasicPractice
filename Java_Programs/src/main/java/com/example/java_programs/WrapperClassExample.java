package com.example.java_programs;

public class WrapperClassExample {

    public static void main(String []args){

        ///////     Primitive data type Declaration

        int i =10;

        char a ='a';

        float f =364.3f;

        double d =216498686;

        ////  Wrapper class  converting Primitive data type to Object    ////

        String s1 ="Shivam";

        Integer  integer = new Integer(10);

        Float   _float = new Float(200.3f);

        Character character = new Character('A');

        Double _double = new Double(82641986);



        String s = Integer.toString(i);         //  Wrapper class Method converting Int value tp string

        String L ="1732.3f";

        Float parseFloat = Float.parseFloat(L);

        System.out.println(s);

        System.out.println(parseFloat);

        String k ="1726";

        Integer integer1 = Integer.parseInt(k);

        System.out.println(integer1);
    }

}
