package com.example.kotlinbasics

fun main(){
    var age = 0
    print("Enter your age as a whole number: ")
    val enteredValue = readln()
    age = enteredValue.toInt()

//    if(age >= 18 && age <=40){
    if(age in 18..40){
        println("You can enter the club.")
    }else if(age > 40){
        println("You cannot go into the club, please go home.")
    }else{
        println("Age not verified. Please contact support.")
    }
}