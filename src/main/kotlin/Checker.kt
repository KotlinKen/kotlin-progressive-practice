class Checker {

    fun checkNum(score : Int){
        when (score) {
            0 -> println("this is 0")
            1 -> println("this is 1")
            2, 3 -> println("this is 2 or 3")
        }

        when (score) {
            in 90..100 -> println("You are genius")
            in 10..80 -> println("not bad")
            else -> println("okay done")
        }
    }

    fun testLooper(){
        for( i in 5 downTo 1) println(i)

        for( i in 1..5 step 2) println(i)

        for( i in 5 downTo 1 step 2) println(i)

    }

    fun triangle(){
        val n = 5

        for(line in 1..n){
            for(space in 1..(n-line)) print(" ")
            for(star in 1 until 2 * line) print("*")
            println()
        }
    }




}