package collections

import java.util.Stack


    fun main(args: Array<String>) {
        val stack = Stack<Int>()

        stack.push(33)
        stack.push(55)
        stack.push(44)

        stack.add(11)


        stack.add(2, 66)

        println(stack)
        println("TOP -> ${stack.peek()}")
        println("LAST -> ${stack[0]}")

        /**
         * Returns the 1-based position where an object is on this stack.
         * If the object o occurs as an item in this stack,
         * this method returns the distance from the top of the stack of the occurrence nearest the top of the stack;
         * the topmost item on the stack is considered to be at distance 1.
         * The equals method is used to compare o to the items in this stack.
         * Params: o – the desired object.
         * Returns: the 1-based position from the top of the stack where the object is located;
         * the return value -1 indicates that the object is not on the stack.
         */

        println("SEARCH 3 TIMES -> ${stack.search(33)}")
        println("SEARCH 150 TIMES -> ${stack.search(150)}")
        while(stack.isNotEmpty()){
            println("POP : ${stack.pop()}")
        }
    }

