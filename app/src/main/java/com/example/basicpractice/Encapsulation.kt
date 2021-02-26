package com.example.basicpractice

fun main(){

      val abs = Abs()
      abs.setter(35)
      println(abs.getter())
}
class Abs(){

    private var Data :Int =0

    fun setter(data :Int){
        Data =  data
    }
    fun getter():Int{
        return Data
    }

}