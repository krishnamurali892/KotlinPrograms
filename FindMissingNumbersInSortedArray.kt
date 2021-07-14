package com.murali.kotlintest
fun main() {
    //consider array is sorted
    val arr = arrayOf(1,3,5,7)  // Expected output - 2,4,6
    displayMissing(arr)
}

fun displayMissing(arr:Array<Int>){
    val lastIndex = arr.size - 1 - 1
    for(index in 0..lastIndex){
        var diff = arr[index + 1] - arr[index]
        var missed = arr[index]
        while (diff > 1){
            missed++
            diff--
            println(missed)
        }
    }
}