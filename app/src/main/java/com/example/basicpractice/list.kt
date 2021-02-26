package com.example.basicpractice

// list of kotlin with its functions ////

  fun list(){

      val list = listOf<String>("Ducati","Suzuki","Yamaha","Mv Agusta")
         println(list.get(1))
         println(list.size)
         println(list.isEmpty())
         println(list.random()) // fetch random item from list
        // println(list.lastIndexOf(1))
         println(list.contains("Suzuki"))
  }

   fun main(){
     list()
   }