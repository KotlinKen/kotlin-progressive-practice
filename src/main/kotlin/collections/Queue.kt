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
    sampleQueue.remove()
    sampleQueue.element()
    println(sampleQueue)

    while(sampleQueue.isNotEmpty()){
        println(" LAST -> ${sampleQueue.element()}")
        println(" NOW -> ${sampleQueue.poll()}")
        println(" NEXT -> ${sampleQueue.peek()}")
    }
    sampleQueue.offer(155)
    sampleQueue.offer(156)
    sampleQueue.offer(157)
    sampleQueue.offer(158)
    sampleQueue.offer(159)


    println(sampleQueue)


}