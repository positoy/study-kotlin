fun main()
{
    var neverNull : String = "This can't be never null"
//    neverNull = null

    var nullable : String? = "This can be null"
    nullable = null

    var inferredNonNull = "This can't be never null"
//    inferredNonNull = null

    println(strLength(neverNull)) // can't put nullable

    println(strLengthNullable(nullable)) // can put nullable

    val len = strLengthNullable(nullable)
    if (len != null) {
        println("It's not null")
    } else {
        println("it's null")
    }

}

fun strLengthNullable(nullable: String?): Int? {
    return nullable?.length
}

fun strLength(neverNull: String): Int {
    return neverNull.length
}
