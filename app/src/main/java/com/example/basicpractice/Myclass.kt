package com.example.basicpractice

//  kotlin class & constructor Example //

/////////////////////////////////////////////

// A kotlin class Initialize class variable using Constructor//

// this class has public constructor//

class Person{
     var personname : String
      var personage :Int

  constructor(name: String,age: Int) {
      personname= name
      personage  = age

  }
}
fun main(){
    val person = Person("Shivam",23)
    val transport = Transport("car",21.2f)

    println(person.personname)
     println(person.personage)

     println(transport.type)
    println(transport.fare)

}

///////////////////////////////////////////////////////////////

 // this class has Primary constructor //

class Transport(Type: String,Fare: Float) {
   var type: String = Type
    var fare :Float = Fare
}
