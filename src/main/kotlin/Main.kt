fun main(args: Array<String>) {
    println("Hello World!")

    val name = readln()
    // Try adding program arguments at Run/Debug configuration
    println("Program arguments: ${args.joinToString()}")
    println("Hello, $name")
}