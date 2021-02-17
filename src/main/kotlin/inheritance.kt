open class Dog {
    open fun bark() {
        println("wow wow!")
    }
}

class Yorkshire : Dog() {
    override fun bark() {
        println("wif wif!")
    }
}

open class Tiger(val origin : String) {
    fun say() {
        println("A tiger from $origin says : grrrrh!")
    }
}

class SiberianTiger : Tiger("Siberia")

open class Lion(val age : Int, val origin :String) {
    fun say() {
        println("The lion from $origin ages $age old.")
    }
}

class IndianOldLion(age : Int) : Lion(age, "India")

fun main() {

    // Inheritance
    val dog = Dog()
    dog.bark()

    val york = Yorkshire()
    york.bark()

    // Inheritance with Parameterized Constructor
    val tiger = SiberianTiger()
    tiger.say()

    // Passing Constructor Arguments to Superclass
    val lion = IndianOldLion(13)
    lion.say()
}


