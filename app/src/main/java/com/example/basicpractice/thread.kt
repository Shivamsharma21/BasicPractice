package com.example.basicpractice

class Mythread :Thread(){
    override fun run() {
        var count:Int =0
        while(count<10){
            println(count)
            count++
        }
    }
}
 fun main(){
      var thread = Mythread()
       thread.start()
     println("Main function out of thread")
 }