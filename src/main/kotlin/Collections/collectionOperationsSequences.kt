package Collections

import Dataset.Course
import Dataset.CourseCategory
import Dataset.courseList

fun main() {

    val namesListSequence = listOf("alex", "bill", "chloe")
        .asSequence()
        .filter { it.length>4 }
        .map { it.uppercase() }
        .toList() // terminal operator reqd to process elements in pipeline

    println("namesListSequence: $namesListSequence")

    val desPredicate = {course: Course -> course.category == CourseCategory.DESIGN}
    val res = exploreFilterUsingSequence(courseList(), desPredicate)

    val range = 1..1000_000_000

    // sequence processes elements one by one
    range
        .asSequence()
        .map { it.toDouble() }
        .take(40)
        .forEach{println("value is: $it")}
}

fun exploreFilterUsingSequence(courseList: MutableList<Course>, predicate: (Course)->Boolean) {
    return courseList
        .asSequence()
        .filter { predicate.invoke(it) }
        .forEach {
            println("Course: $it")
        }
}