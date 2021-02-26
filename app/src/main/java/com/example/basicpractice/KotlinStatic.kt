package com.example.basicpractice


////   this Object  keyword create a singleton Obj for this class ////

    // Now this class Behave as Static and all the function and variables are static in this //

object DefStatic{
    var NUM : Int =0

    fun function(){
        println("Static function")
    }

    }

fun main(){



    DefStatic.NUM = 20   // variable access by the class name rather than the class object

      println(DefStatic.NUM)

    DefStatic.function() // function access by class name rather than the class object

}