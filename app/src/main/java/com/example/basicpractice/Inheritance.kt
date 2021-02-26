package com.example.basicpractice

//  class Declaration,Inheritance example with Method Overriding //

fun main(){
    val phone = Phone()
     // println(phone.i3())
      val laptop = Laptop()
         laptop.i3()
}

open class Processor(){

    open fun i3(){
       println("Parent class")
    }
}
class Phone : Processor() {

    override fun i3(){
  }

}
class Laptop : Processor(){
}
//// Example 2

open class Person1(name:String,age:Int){

}
