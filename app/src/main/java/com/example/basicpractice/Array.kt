package com.example.basicpractice
import java.util.*;
fun main() {

    MulDimArray()

    val arr = arrayOf("Shivam ", "Won ", "Pixi ", "Gale ")
    val Bikes: Array<String> = arrayOf("Ducati", "Mv")
    //for ((i,e) in arr.withIndex())
    //println("$i - $e")

    var sum: Int = sumOfArray()
    println(sum)

    // Traversing an array with change its value during travers//
       val num = arrayOf<Int>(1, 2, 3, 4, 5)
        num.set(0, 10)
        num.set(1, 6)
        for (i in num.indices)
        {
            println(num[i])
        }
    }
// sorting array with pre-defined function


// sum of array //
    fun sumOfArray():Int{

    var temp =0

    var arr1 = arrayOf(22,33,56,12,98,67,34)

    for(element in arr1){
        temp += element
    }
    return temp
}
// arrange

 fun AcArray() {
      val a = arrayOf(22,334,23,76,34,90,65,32)
     for (currentPosition in 0 until (a.size - 1)) {
         if (a[currentPosition] > a[currentPosition + 1]) {
             val tmp = a[currentPosition]
             a[currentPosition] = a[currentPosition + 1]
             a[currentPosition + 1] = tmp
         }
     }
 }

 //   Multi Dimension Array   //
    fun MulDimArray(){

     val marray = arrayOf(
                  arrayOf(1,2,3),
                  arrayOf(1,2,3),
                  arrayOf(1,2,3))
     println(marray[1][2])

 }