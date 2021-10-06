package com.example.myfirstlab

import kotlin.random.Random

class NumbersExercise {
  val numbers: List<Int> = List(10){ Random.nextInt(1, 10) }


    fun lessThan(number:Int): Int{

        return numbers.filter {it < number }.size
    }
}
