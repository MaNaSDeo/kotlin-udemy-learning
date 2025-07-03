package com.example.kotlinbasics

fun main(){
    println("Hello MaNaS!")

//    val number1 = 23
//    number1 = 34
//    Val is like const that we use in JS.
//    Whereas var can be reassigned.

    var myAge = 27
    println(myAge)
    myAge = 28
    println(myAge)

    var changingNumber: Byte = 23
    println(changingNumber)
//    changingNumber = 234 -> Can't be assigned as changingNumber's type is Byte and we can not set a Int in it.
    var changingInteger : Int = 1234567
    changingInteger = 1

    var firstDouble = 32.0 // By default a decimal will be save as double.
    var firstFloat = 1.0f // To set a float just use "f" at the end

//    val doubleNumber : Double = 1 -> we can't assign like this as 1 is integer.
    var pi = 3.14f
    println(pi)
    pi = 3.1415926535f
    println(pi) // If you will notice the console we get only "3.1415927" so the value after 6 i.e. "535" is cut and "6535" is considered as 7 now, i.e. rounding.

    //Basically UShort can't be negative so it give use double the count of positive number in same memory space that we can get in Byte.
    var manasAge: UShort = 28u
    println(manasAge)

    val myTrue: Boolean = true
    val myFalse: Boolean = false
    val boolNull: Boolean? = null

    println(myTrue || myFalse)
// true
    println(myTrue && myFalse)
// false
    println(!myTrue)
// false
    println(boolNull)
// null

    val aChar: Char = 'a'
    println("aChar: $aChar")
    println('\n')
    println('\u092E')
    println('\u0906')
    println('\u0928')
    println('\u0938')
    println('\\') //Here the first "\" is escape character and the 2nd "\" is the actual character that will be printed.

    val emptyString = ""
    val name = "Manas"
    val nameSentence = "My name is Manas Kumar"
    val firstName = "Manas"
    val lastName = "Kumar"
    println("emptyString: $emptyString and it has a length of ${emptyString.length}")
    println("name: $name and it has a length of ${name.length}")
    println("nameSentence: $nameSentence and it has a length of ${nameSentence.length}")
    println("nameSentence in uppercase is ${nameSentence.uppercase()}")
    println("nameSentence in lowercase is ${nameSentence.lowercase()}")
    println("My full name is $firstName $lastName")
    println(firstName + " " + lastName)

    var age = 28
    println("Please enter your age in number")
    val enteredValue = readln()
    age = enteredValue.toInt()

//    if(age >= 18 && age <=100){
    if(age in 18..100){
        println("You can cast vote!")
    }else if(age > 100){
        println("Let me check with government!")
    }else {
        println("Please wait till you turned 18!")
    }
}
