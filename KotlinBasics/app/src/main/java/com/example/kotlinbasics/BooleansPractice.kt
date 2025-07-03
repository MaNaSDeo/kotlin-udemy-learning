package com.example.kotlinbasics

fun main (){
    var myTrue = true
    var myFalse = false

    println("myTrue: $myTrue") //This will be true
    println("myFalse: $myFalse") //This will be false
    println("OR: ${myTrue || myFalse}") //This will be true
    println("AND : ${myTrue && myFalse}") //This will be false
    println("negate: ${!myTrue}") //This will be false
}