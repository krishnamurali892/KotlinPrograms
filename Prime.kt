package com.murali.kotlintest

fun main(){
    println(isPrime(3))
    println(isPrime(33))
}

//check is divisible by (2..square root of number)
fun isPrime(n:Int): Boolean {
    var isPrime = true
    var j = 2
    while (j * j <= n) {
        if (n % j == 0) {
            isPrime = false
            break
        }
        j++
    }
    if (isPrime) {
        println("prime")
    } else {
        println("not prime")
    }
    return isPrime
}


