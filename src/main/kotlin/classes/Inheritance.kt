package classes

open class User(val name: String){
    open var isLoggedIn: Boolean = false
    // to override use open modifier
    open fun login(){
        println("inside user login")
    }
}

class Student(name: String): User(name) {
    override var isLoggedIn: Boolean = false

    companion object {
        const val noOfEnrolledCourses = 8
        fun country() = "USA"
    }

    override fun login() {
        super.login()
        println("Student login for: $name")
    }
}

class Instructor(name: String): User(name) {
    override var isLoggedIn: Boolean = false
    override fun login() {
        super.login()
        println("Instructor login for: $name")
    }
}

fun main() {
    println(Student.country()) //static object
    println("no of enrolled courses for students: ${Student.noOfEnrolledCourses}") //static object

    val student1 = Student("Alex")
    println("name is ${student1.name}")
    student1.login()
    student1.isLoggedIn = true
    println("Student logged in: ${student1.isLoggedIn}")
    println()

    val instructor1 = Instructor("John")
    println("name is ${instructor1.name}")
    instructor1.login()
    instructor1.isLoggedIn = true
    println("Instructor logged in: ${instructor1.isLoggedIn}")
}