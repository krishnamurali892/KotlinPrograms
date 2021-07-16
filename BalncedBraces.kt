package com.murali.kotlintest

import java.util.*

fun main() {
   val str = "{[()]}}"
   println(isBalanced(str))
}

fun isBalanced(str:String): Boolean{
   if(str.length%2 != 0){
      return false
   }

   var balanced = true
   var st = Stack<Char>()

   for(ch in str){
      when(ch){
         '{','[','(' -> {
            st.push(ch)
         }
         '}' ->{
            if(!st.empty() && st.peek() == '{'){
               st.pop()
            }else{
               balanced = false
            }
         }
         ']' ->{
            if(!st.empty() && st.peek() == '['){
               st.pop()
            }else{
               balanced = false
            }
         }
         ')' ->{
            if(!st.empty() && st.peek() == '('){
               st.pop()
            }else{
               balanced = false
            }
         }
      }
      if(!balanced){
         break
      }
   }
   if(!st.empty()){
      balanced = false
   }
   return balanced
}