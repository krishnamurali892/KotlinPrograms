package com.murali.kotlintest

fun main(){
    println(isPalindrome("dad"))
    println(isPalindrome("aabaaa"))
}

fun isPalindrome(str:String): Boolean{
    var arr = str.toCharArray()
    var isPalindrome = true
    var start = 0
    var end = arr.size - 1
    while (start < end){
        if(arr[start] != arr[end]){
            isPalindrome = false
            break
        }
        start++
        end--
    }
    return isPalindrome
}


