package com.murali.kotlintest

fun main(){
    println(fib(5)) //5
    println(fib(9)) //34
}

//with iterator -- more code so will go with recursion
fun fibWithIterator(n: Int): Int{
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


