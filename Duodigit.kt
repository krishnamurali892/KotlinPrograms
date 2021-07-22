fun main(){
    println(isDuoDigit(-2020)) // true
    println(isDuoDigit(-2021)) // false

}


fun isDuoDigit(digit:Int):Boolean{
    // if any number falls between 0 <= num <= 99
    // or -99 <= num <= -1, then its sure its formed from not more than 2 types digits
    if((digit in 0..99) || (digit in -1 downTo -99)){
        return true
    }else{
        //if number is contains more than 2 digits, then it may formed from more than 2 types of digits
        //in such case convert number to char array, and put chars to hashmap, if map size exceeds 2 then not
        //duo digit
        //example1: 2020 = is a duo digit as it formed from 0 and 2
        //example2: 2021 = is not a duo digit as it formed from 3 digits 0, 1 and 2
        var map = mutableMapOf<Char, Any?>()
        val arr = Math.abs(digit).toString().toCharArray()
        for (ch in arr){
            map[ch] = null
            if(map.size > 2){
                return false
            }
        }
        return true
    }
}

