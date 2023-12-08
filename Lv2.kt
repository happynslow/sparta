package com.example.myapplication

fun main() {
    val dataNumber1 = readLine()!!.toInt()
    val dataNumber2 = readLine()!!.toInt()
    println("연산자를 입력하세요")
    var dataString = readLine()!!.toString()

    class Calculator

    if(dataString == "+") {
        val plusResult = dataNumber1 + dataNumber2
        println(" ${plusResult} ")
    }
    else if(dataString == "-") {
        val minusResult = dataNumber1 - dataNumber2
        println(" ${minusResult} ")
    }
    else if(dataString == "*") {
        val multipleResult = dataNumber1 * dataNumber2
        println(" ${multipleResult} ")
    } else if(dataString == "/") {
        val divideResult = dataNumber1 / dataNumber2
        println(" ${divideResult} ")
    }

    else if(dataString == "%") {
        val modResult = dataNumber1 % dataNumber2
        println(" ${modResult} ")
    }
    else {
        println("제대로 된 연산자를 입력해주세요.")
    }
}