package com.murali.kotlintest

fun main(){
    println(strReverse("abcd")) //dcba
    println(strReverse("abba")) //abba
}

//String reverse - time complexity O(n/2)
fun strReverse(str:String): String{
    var charArr = str.toCharArray()
    var start = 0
    var end = charArr.size - 1
    var temp = ' '
    while (start < end){
        //swap chars if not same
        if(charArr[start] != charArr[end]){
            temp = charArr[start]
            charArr[start] = charArr[end]
            charArr[end] = temp
        }
        start++
        end--
    }
    return String(charArr)
}


