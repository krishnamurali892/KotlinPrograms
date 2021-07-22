import java.util.ArrayList

fun main(){
    val arr = intArrayOf(100, 2, 3, 4, 44, 8, 9)
    var max1 = Int.MIN_VALUE
    var max2 = Int.MIN_VALUE

    for(item in arr){
        if(max1 < item){
            max2 = max1
            max1 = item
        }else if(max2 < item){
            max2 = item
        }
    }

    println(max1)
    println(max2)
}

