package com.murali.kotlintest

fun main(){
    println(isPrime(3))
    println(isPrime(33))
}

fun isPrime(n: Int): Boolean{
    var isPrime = true
    var i = 2
    while (i <= 9){
        if(n%i == 0 && n != i){
            isPrime = false
            break
        }
        i++
    }
    return isPrime
}


