
fun printMessage(message : String) {
    println("Hello, $message")
}

fun printMessageWithPrefix(message: String="Log", prefix: String = "Info") {
    println("[$prefix] $message")
}

fun sum(a :Int, b:Int) : Int{
    return a+b
}

fun mul(a:Int,b:Int):Int = a*b

fun main() {

    // Default Parameter Values and Named Arguments
    parameters()

    // Infix Functions
    infix()

    // Operator Functions
    operator()

    // Functions with vararg Parameters
    varargs()


}

fun varargs() {
    printAll("Hello", "World", "Isnt","This","World","Much","Beautiful")
    printAllWithPrefix("Hello", "World", "Isnt","This","World","Much","Beautiful", prefix="ho")
    log("Hello", "World", "Isnt","This","World","Much","Beautiful")
}

fun printAll(vararg messages : String) {
    println()
    for(m in messages) print(m)
}

fun printAllWithPrefix(vararg messages : String, prefix:String) {
    println()
    for (m in messages) print("$prefix$m,")
}

fun log(vararg entries : String) {
   printAllWithPrefix(*entries,prefix="e")
}
fun parameters() {
    printMessage("Andy")
    printMessageWithPrefix("print log", "level")
    printMessageWithPrefix(message = "print log")
    printMessageWithPrefix(prefix = "level")
    printMessageWithPrefix(prefix = "level", message = "print log")
    println(sum(1,2))
    println(mul(3,4))

}

fun infix() {
    infix fun Int.times(str:String) = str.repeat(this)
    println(2 times "Hello")

    val pair = "Ferrari" to "Katrina"
    println(pair)

    infix fun String.onto(str:String) = Pair(this,str)
    val myPair = "Tom" onto "Jerry"
    println(myPair)

    val sophia = Person("sophia")
    val lucas = Person("lucas")
    sophia likes lucas
}

fun operator() {
    operator fun Int.times(str: String) = str.repeat(this)
    println(2 * "Hello")

    operator fun String.get(range:IntRange) = substring(range)
    val str = "Hello world this world looks so nice"
    println(str[2..10])
}

class Person(name: String) {
    val likedPeople = mutableListOf<Person>()
    infix fun likes(other:Person) { likedPeople.add(other)}
}
