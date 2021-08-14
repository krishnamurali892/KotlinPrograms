package com.murali.kotlintest

fun main(){
   println(factorial(5))
}

fun factorial(n: Int): Int{
    var fact = 1
    var i = n
    while (i >= 1){
        fact*=i
        i--
    }
    return fact
}

fun factorialRecursion(n: Int): Int{
    if(n == 1){
        return 1
    }
    return n * factorialRecursion(n - 1)
}


