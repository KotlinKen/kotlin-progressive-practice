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
}