fun main(){
    var str = "aabbaa"
    println(repeatedConsecutiveCharsWithCount(str)) //ouput: 2a2b2a
}


fun repeatedConsecutiveCharsWithCount(str:String):String{
    var count = 0
    var result = StringBuffer()
    var prevchar:Char? = null

    for(ch in str){
        if(prevchar == null || prevchar == ch){
            prevchar = ch
            count++
        }else{
            result.append("$count$prevchar")
            prevchar = ch
            count = 1
        }
    }

    //append last ch with repeat count
    result.append("$count$prevchar")
    return result.toString()
}

