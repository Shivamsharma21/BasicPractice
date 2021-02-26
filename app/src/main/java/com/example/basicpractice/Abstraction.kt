package com.example.basicpractice

fun main(){

}
abstract class Vehicle{

    abstract val n_oftyre :Int

    abstract fun startby();

}
class Car : Vehicle() {

    override val n_oftyre: Int = 4

    override fun startby() {

       println("It will start by Key")
        TODO("Not yet implemented")
    }

}
class Scooter :Vehicle(){

    override val n_oftyre: Int = 2

    override fun startby() {
        println("it will start by kick")

    }
}