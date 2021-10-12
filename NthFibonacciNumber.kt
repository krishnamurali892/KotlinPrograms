package com.murali.kotlintest

fun main(){
    println(fib(5)) //5
    println(fib(9)) //34
}

//with iterator -- more code so will go with recursion
fun fibWithIterator(n: Int): Int{
    if(n == 0 || n == 1){
        return n
    }
    var fib0 = 0
    var fib1 = 1
    var fibn = -1
    var i = 2
    while(i <= n){
        fibn = fib0 + fib1
        fib0 = fib1
        fib1 = fibn
        i++
    }
    return fibn
}

//nth Fibonacci number with recursion - 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
fun fib(n: Int): Int{
    if(n == 0 || n == 1){
        return n
    }
    return fib(n - 1) + fib(n - 2)
}

fun printFibonacciSeriesWithSum(n:Int){
    if(n < 1){
        return
    }

    var fib1 = 0
    var fib2 = 1
    var fibn = -1
    var i = 1
    var sum  = fib1

    println(fib1)

    while(i < n){
        println(fib2)
        sum+=fib2
        fibn = fib1 + fib2
        fib1 = fib2
        fib2 = fibn
        i++
    }
    println("sum of n fib numbers is: $sum")
}


