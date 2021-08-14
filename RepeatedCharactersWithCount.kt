package com.murali.kotlintest

fun main(){
    println(repeatedCharactersWithCount("aabbaacca"))
}

//Time complexity of O(2n), any character can be represented as ASCII int value
fun repeatedCharactersWithCount(str:String?): String{
    if(str == null || str.isEmpty()){
        return ""
    }
    val arr:Array<Int> = Array(256){0}
    for(ch in str){
        arr[ch.code]+=1
    }

    val strBuf = StringBuffer()
    for(i in arr.indices){
        if(arr[i] > 0){
            strBuf.append("${arr[i]}${i.toChar()}")
        }
    }
    return strBuf.toString()
}


