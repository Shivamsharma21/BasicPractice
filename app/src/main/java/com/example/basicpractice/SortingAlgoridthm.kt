package com.example.basicpractice

fun main(){

}

fun SortingOfArray(){

    var temp = 0
    var arr1 = arrayOf(21,33,12,1,45,87,32,78,56)
      for(element in arr1){
          if(element>arr1[element+1]){
                      temp = element
                   //   element = arr1.get(element)
          }
      }
}