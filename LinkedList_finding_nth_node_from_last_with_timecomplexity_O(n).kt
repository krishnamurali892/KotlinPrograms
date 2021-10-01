package com.murali.kotlintest

fun main() {
    var ll = LinkedList()
    ll.addLast(LinkedList.Node(1))
    ll.addLast(LinkedList.Node(2))
    ll.addLast(LinkedList.Node(3))
    ll.addLast(LinkedList.Node(4))
    ll.addLast(LinkedList.Node(5))

    ll.findNthNodeFromLast(3)
}

class LinkedList {

    var head: Node? = null

    data class Node(val data: Int) {
        var next: Node? = null
    }

    //Adding node
    fun addLast(node: Node) {
        if (head == null) {
            head = node
            return
        }
        var temp = head
        while (temp!!.next != null) {
            temp = temp.next
        }
        temp.next = node
    }

    fun addFirst(node: Node) {
        if (head == null) {
            head = node
        } else {
            node.next = head
            head = node
        }
    }

    //Finding nth node from Last
    /*
    * Here we are finding nth node from last - with time complexity of O(n)
    * to achieve this lets have a scenario ...
    * 1. we have a staircase, need to find out nth step from top
    * 2. so will take 2 people who are at bottom of staircase i,e at head of linked list
    * 3. 2 people are main and reference
    * 4. first move reference to n steps
    * 5. later move both reference and main both step by step still reference reaches
    *    end of staircase i,e top. By this time main will be at nth position from top
    * */
    fun findNthNodeFromLast(n: Int){

        if(head == null){
            println("list is empty")
            return
        }

        var main_ptr = head
        var ref_ptr = head

        var count = 0

        while(count < n){
            if(ref_ptr == null){
                println("given nth node $n is greater than no of nodes in list")
                return
            }
            ref_ptr = ref_ptr.next
            count++
        }

        if(ref_ptr == null){
            println("nth node $n from last is head node = $main_ptr")
        }else{
            while (ref_ptr != null){
                ref_ptr = ref_ptr.next
                main_ptr = main_ptr!!.next
            }
        }

        println("nth node from last is $main_ptr")
    }// end of function


}










