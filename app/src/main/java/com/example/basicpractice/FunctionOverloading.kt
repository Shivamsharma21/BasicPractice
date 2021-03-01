package com.example.basicpractice


// Example of function Overloading

fun main(){

    val a :Int = 20
    val f : Float = 2.3F
    val d : Double = 37.6

     printNumber(a)
    printNumber(d)
   printNumber(f)
}

   /// function are identifies by their Signature  ///

fun printNumber(n : Float){
    println("Using printNumber(n : Float)")
    println(n.toString() + "\n")
}

fun printNumber(n : Int){
    println("Using printNumber(n : Int)")
    println(n.toString() + "\n")
}

fun printNumber(n : Double){
    println("Using printNumber(n : Double)")
    println(n.toString() + "\n")
}
