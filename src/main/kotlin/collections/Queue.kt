package collections

import java.util.*

fun main(){

    val sampleQueue : Queue<Int> = LinkedList<Int>()


    sampleQueue.add(130)
    sampleQueue.add(0)
    sampleQueue.add(0)
    sampleQueue.add(1)
    sampleQueue.add(2)
    sampleQueue.add(3)

    println(sampleQueue)

    while(sampleQueue.isNotEmpty()){
        println(" LAST -> ${sampleQueue.element()}")
        println(" NOW -> ${sampleQueue.poll()}")
        println(" NEXT -> ${sampleQueue.peek()}")

    }

    println(sampleQueue)


}