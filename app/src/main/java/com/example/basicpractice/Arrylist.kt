package com.example.basicpractice

// Array list example //


fun main(){
     ArrayList2()
}
 fun ArrayList(){

        var arrylist = ArrayList<String>()
         arrylist.add("Shivam")
         arrylist.add("Jhon")
         arrylist.add("Shen")
         arrylist.add("jacy")
         arrylist.add("Shizu")
    for(i in arrylist){
        println(i)
    }
 }

// giving capacity to the array list at the time you create it //

fun ArrayList2(){

    var arrylist1 = ArrayList<String>(5)
    arrylist1.add("Shivam")
    arrylist1.add("Jhon")
    arrylist1.add("Shen")
    arrylist1.add("jacy")
    arrylist1.add("Shizu")
    for(i in arrylist1){
        println(i)
    }
}



