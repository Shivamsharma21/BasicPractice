package com.example.basicpractice

fun main(){
    ///////////////

    val circle :Circle = Circle(22.39)
    val square :Square = Square(9.9)

    //println(circle.area())
    //println(square.area())

    val shapes :Array<Shape> = arrayOf(Circle(2.3),Square(33.4),Circle(12.3),Triangle(21.0,1.0))
     calculateAreas(shapes)
    //////////////
}
open class Bike{
   open fun run(){
        println("Running")
    }
}
class SmallBike : Bike(){
    override fun run(){
        fun run(){
            println("Run at 50km/h")
        }
    }
}
open class Shape{
    open fun area():Double{
      return 0.0
    }
}

fun calculateAreas(shapes: Array<Shape>){
    for (shape in shapes){
        println(shape.area())
    }
}

class Circle(val radius :Double): Shape(){
      override fun area() :Double{
          return Math.PI * radius * radius
      }
}
class Square(val side:Double): Shape(){
      override fun area(): Double{
          return side*side
      }
}
class Triangle(val base:Double,val height:Double):Shape(){
   override fun area():Double{
       return base*height
   }
}