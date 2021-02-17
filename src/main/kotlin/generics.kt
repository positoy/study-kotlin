class MutableStackOf<T>(vararg items : T) {
    private val elements = items.toMutableList()

    fun push(item :T) = elements.add(item)

    fun peek()= elements.last()

    fun pop() = elements.removeAt(elements.size-1)

    fun isEmpty() = elements.isEmpty()

    fun size() = elements.size

    override fun toString() = "MutableStack(${elements.joinToString()})"
}

fun main()
{
    // generic class
    val stringStack = MutableStackOf<String>("Andy", "Candy", "Cathy", "Henry")
    println(stringStack.toString())

    val intStack = MutableStackOf<Int>(1,2,3,4,5,6)
    println(intStack.toString())

    // generic function
    printMutableStackOf("Andy", "Candy", "Cathy", "Henry")
    printMutableStackOf(1,2,3,4,5,6)

    printStack(stringStack)
    printStack(intStack)
}

fun<T> printMutableStackOf(vararg elements : T) {
    println(MutableStackOf<T>(*elements).toString())
}

fun<T> printStack(stack:T) {
    println(stack.toString())
}


