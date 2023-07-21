package com.example.myapplication

import com.example.myapplication.AbstractOperation


// +
class AddOperation : AbstractOperation() {
   override fun operate(num1: Int, num2: Int): Double = (num1 + num2).toDouble()
}
// -
class Subtraction : AbstractOperation(){
   override fun operate(num1: Int, num2: Int): Double = (num1 - num2).toDouble()
}
// *
class Multiplication : AbstractOperation(){
   override fun operate(num1: Int, num2: Int): Double = (num1 * num2).toDouble()
}
// /
class Division : AbstractOperation(){
   override fun operate(num1: Int, num2: Int): Double = (num1 / num2).toDouble()
   }
// %
class Remainder : AbstractOperation(){
   override fun operate(num1: Int, num2: Int): Double = (num1 % num2).toDouble()
   }




