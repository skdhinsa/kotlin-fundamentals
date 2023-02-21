package Exercises

data class Student(
    val id: Int,
    val name: String,
    val grade: Double
)

val students = listOf(
    Student(222,"Adam", 12.0),
    Student(223,"John", 12.0),
    Student(224,"Bill", 12.0)
)

fun getStudentById(id: Int?): Student? {
    if( id != null ){
        return students.find { it.id == id }
    }
    return null
}

fun searchInStudents(name: String?): Student? {
    if (name != null) {
        return students.find { it.name.lowercase() == name.lowercase() }
    }
    return null
}

fun main() {
    println(searchInStudents("Adam"))
    println(getStudentById(222))
}