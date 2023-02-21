package classes

/*
    Data class is for classes used as data container.
    use case: Store results from query to a class.
    use case: Building a service, have a DTO that will be used for controller layer
 */

data class Course (
    val id: Int,
    val name: String,
    val author: String,
    var category: CourseCategory = CourseCategory.DEVELOPMENT
)

enum class CourseCategory {
    DEVELOPMENT,
    BUSINESS,
    DESIGN,
    MARKETING
}

fun main() {
    val course = Course(1, "programming with kotlin", "some guy")
    println(course) // prints every property, useful for logging and debugging
    println("course name: ${course.name}, taught by ${course.author}")

    val course2 = Course(1, "programming with kotlin", "some guy")
    println("checking object equality: ${course == course2}") // true since all properties are same

    val course3 = course.copy(id=2) // cloning object as new instance and diff props
    println(course3)
    println("checking object equality: ${course == course3}") //false

    val course4 = Course(3, "Marketing 101", "Steve Jobs", CourseCategory.MARKETING)
    println(course4)

}