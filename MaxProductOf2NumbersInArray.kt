package com.murali.kotlintest

fun main(){
    // product of 2 numbers in integer array which gives maximum value
    // Note array may include negative numbers also. but product of 2 smallest
    // negative numbers gives bigger positive value i,e -100 * -10 = 1000
    val arr1 = arrayOf(1,3,4,5)  // 4*5 = 20
    val arr2 = arrayOf(1,3,-4,5) // 3*5 = 20
    val arr3 = arrayOf(1,3,-4,-5) // -4*-5 = 20(minus * minus  = plus)
    println(maxProduct(arr1))
}

// here time complexity is O(n) as we are doing single iteration
// space complexity is O(1) as we are using only four
// extra int variables, which is almost neglisible
fun maxProduct(arr: Array<Int>): Int{
    if(arr.isEmpty()){
        return 0
    }
    var max1 = Int.MIN_VALUE
    var max2 = Int.MIN_VALUE

    var min1 = Int.MAX_VALUE
    var min2 = Int.MAX_VALUE

    for (i in arr){
        if(i > max1){
            max2 = max1
            max1 = i
        }else if(i > max2){
            max2 = i
        }
    }

    for (i in arr){
        if(i < min1){
            min2 = min1
            min1 = i
        }else if(i < min2){
            min2 = i
        }
    }
    //Math is a part of java.lang package so need of import
    return Math.max(max1*max2, min1*min2)
}

