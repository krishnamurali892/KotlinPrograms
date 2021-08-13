package com.murali.kotlintest

fun main(){
    println(fib(5)) //5
    println(fib(9)) //34
}

//nth Fibonacci number with recursion - 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
fun fib(n: Int): Int{
    if(n == 0 || n == 1){
        return n
    }
    return fib(n - 1) + fib(n - 2)
}


