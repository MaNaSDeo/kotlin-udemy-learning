package com.example.kotlinbasics

fun main (){
    var circleRatio = 3.14
    println(circleRatio)
    var circleRatioF = 3.14f
    println(circleRatioF)

    //So if we have assigned a varibale with one type(e.g. double) we can't assign other type to that variable after that(e.g. float)
    circleRatioF = 3.1415926535f
    println(circleRatioF)

    circleRatio = 3.1415926535
    println(circleRatio)

}