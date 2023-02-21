package classes

// can use default values in constructor
class Person(
    val name: String = "",
    val age: Int = 0
) {
    // avoid secondary constructor
    var email: String = ""
    var nameLength: Int = 0

    constructor(_email: String = "", _name:String = "", _age: Int = 0) : this(_name, _age) {
        email = _email
    }

    init {
        println("inside init block")
        // initialise value by overriding with actual name length
        println("initial name length $nameLength")
        nameLength = name.length
    }

    fun action() {
        println("$name walks")
    }

}

fun main() {
    val person = Person("Serena", 29)
//    val person2 = Person()
//    person.action()
//    println( "${person2.name}, ${person2.age}")
//
//    val person3 = Person(_email = "abc@gmail.com", _name = "someone", _age = 30)
//    println("person email is ${person3.email}, name is: ${person3.name}, age is: ${person3.age}")

    println(person.nameLength)

}