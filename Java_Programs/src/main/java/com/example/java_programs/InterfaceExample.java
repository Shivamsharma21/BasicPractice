package com.example.java_programs;

public class InterfaceExample implements Interface  {
    public static void main(String [] args) {

        InterfaceExample interfaceExample = new InterfaceExample();
        interfaceExample.A();
        interfaceExample.B();
        interfaceExample.C();
        interfaceExample.D();

    }

    @Override
    public void A() {
   System.out.println("This Is an interface in java");
    }

    @Override
    public void B() {
        System.out.println("This Is an interface in java");
    }

    @Override
    public void C() {
        System.out.println("This Is an interface in java");
    }

    @Override
    public void D() {
        System.out.println("This Is an interface in java");
    }
}
interface  Interface
{
    void A();
    void B();
    void C();
    void D();
}