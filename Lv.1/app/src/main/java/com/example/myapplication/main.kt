package com.example.myapplication

fun main(){
    val add = AddOperation()
    val minus = Subtraction()
    val mult = Multiplication()
    val divi = Division()
    val remain = Remainder()

    println("선택하시오 : +, -, *, /, %")
    val arithmetic = readLine()
    print("계산할 숫자를 입력하시오")
    val num1:Int = try{
        Integer.parseInt(readLine()!!)
    }catch (e: NumberFormatException){
        println("잘못된 문자를 입력하였습니다.계산을 종료합니다.")
        return
    }
    val num2: Int = try{
        Integer.parseInt(readLine()!!)
    }catch (e: NumberFormatException){
        println("잘못된 문자를 입력하였습니다. 계산을 종료합니다.")
        return
    }

    when (arithmetic) {
        "+" -> {
            // 덧셈일 때
            println("$num1 $arithmetic $num2 = ${add.operate(num1, num2)} 입니다")
        }
        "-" -> {
            // 뺄셈일 때
            println("$num1 $arithmetic $num2 = ${minus.operate(num1, num2)} 입니다")
        }
        "*" -> {
            // 곱셈일 때
            println("$num1 $arithmetic $num2 = ${mult.operate(num1, num2)} 입니다")
        }
        "/" -> {
            // 나눗셈일 때
            println("$num1 $arithmetic $num2 = ${divi.operate(num1, num2)} 입니다")
        }
        "%" -> {
            // 나머지연산일 때
            println("$num1 $arithmetic $num2 = ${remain.operate(num1, num2)} 입니다")
        }
        else -> {
            // 잘못된 연산자 일 때
            throw Exception("arithmetic is wrong")
        }
    }
}
