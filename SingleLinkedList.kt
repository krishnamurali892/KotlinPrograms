package com.murali.kotlintest

fun main(){
    var ll = LinkedList()
    ll.printAll() //list is empty
    println()

    ll.addLast(LinkedList.Node(20))
    ll.addLast(LinkedList.Node(30))
    ll.addLast(LinkedList.Node(40))
    ll.printAll() //20 30 40
    println()

    ll.findNthNodeFromFirst(3) // 40
    ll.findNthNodeFromLast(3) // 20

    ll.findMidNode()//30
    println()

    ll.addFirst(LinkedList.Node(10))
    ll.printAll() //10 20 30 40
    println()

    ll.findMidNode()//30
    println()

    ll.removeFirst()
    ll.printAll() //20 30 40
    println()

    ll.removeLast()
    ll.printAll() //20 30
    println()

    ll.reverse()
    ll.printAll() //30 20
    println()

    ll.addLast(LinkedList.Node(10))
    ll.addLast(LinkedList.Node(5))
    ll.addLast(LinkedList.Node(0))
    ll.printAll() //30 20 10 5 0
    println()

    ll.removeNthNodeFromLast(3)
    ll.printAll() // 30 20 5 0
    println()

    ll.removeNthNodeFromFirst(2)
    ll.printAll() // 30 20 0

}


class LinkedList{

    var head: Node?=null

    class Node(val data:Int){
        var next:Node?=null
    }

    //Adding node
    fun addLast(node: Node){
        if(head == null){
            head = node
            return
        }
        var temp = head
        while (temp!!.next != null){
            temp = temp.next
        }
        temp.next = node
    }

    fun addFirst(node: Node){
        if(head == null){
            head = node
        }else{
            node.next = head
            head = node
        }
    }

    fun replaceNthNode(n:Int, node:Node){

    }

    //Iterating List
    fun printAll(){
        if(head == null){
            println("list is empty")
            return
        }
        var curNode = head
        while(curNode != null){
            print("${curNode.data} ")
            curNode = curNode.next
        }
    }

    //Removing node
    fun removeFirst(){
        if(head == null){
            return
        }else{
            var prevHead = head
            head = head!!.next
            prevHead = null
        }
    }

    fun removeLast(){
        if(head == null){
            return
        }else{
            var curNode = head
            var prevNode = head
            while (curNode!!.next != null){
                prevNode = curNode
                curNode = curNode.next
            }
            //when only one element in LL
            if(curNode == prevNode){
                head = null
            }else{
                curNode = null
                prevNode!!.next = curNode
            }
        }
    }

    //Brute force approach
    fun removeNthNodeFromFirst(n: Int){
        //first get length of list
        var len = 0
        var cur = head
        while(cur != null){
            len++
            cur = cur.next
        }
        //if n is greater than list size
        if(n > len){
            return
        }

        var i = 1
        cur = head
        var prev:Node? = null
        while (i < n){
            prev = cur
            cur = cur!!.next
            i++
        }
        prev!!.next = cur!!.next
    }

    //Brute force approach
    fun removeNthNodeFromLast(n: Int){
        //first get length of list
        var len = 0
        var cur = head
        while(cur != null){
            len++
            cur = cur.next
        }
        //if n is greater than list size
        if(n > len){
            return
        }
        //from first kth node i,e k = len - n
        var k = len - n

        //if node to remove is head node
        if(k == 1){
            head = head!!.next
            return
        }

        var i = 0
        cur = head
        var prev:Node? = null
        while (i < k){
            prev = cur
            cur = cur!!.next
            i++
        }
        prev!!.next = cur!!.next
    }

    // Finding element
    fun findNthNodeFromFirst(n: Int){

        //first get length of list
        var len = 0
        var cur = head
        while(cur != null){
            len++
            cur = cur.next
        }
        //if n is greater than list size
        if(n > len){
            return
        }

        var i = 1
        cur = head
        while (i < n){
            cur = cur!!.next
            i++
        }
        println(cur!!.data)
    }

    fun findNthNodeFromLast(n: Int){
        //first get length of list
        var len = 0
        var cur = head
        while(cur != null){
            len++
            cur = cur.next
        }
        //if n is greater than list size
        if(n > len){
            return
        }
        //from first kth node i,e k = len - n
        var k = len - n

        //if node to remove is head node
        if(k == 1){
            println(head!!.data)
            return
        }

        var i = 0
        cur = head
        while (i < k){
            cur = cur!!.next
            i++
        }
        println(cur!!.data)
    }

    fun findMidNode(){
        if(head == null){
            return
        }
        var step1 = head
        var step2 = head
        while (step1!!.next !=null && step2!!.next != null){
            step1 = step1.next
            if(step1?.next != null){
                step2 = step1.next
            }
        }
        print(step1.data)
    }

    //Reverse List
    fun reverse(){
        if(head != null){
            var prev: Node? = null
            var cur = head
            var next: Node? = null
            while (cur != null){
                next = cur.next
                cur.next = prev
                prev = cur
                cur = next
            }
            head = prev
        }
    }

}


