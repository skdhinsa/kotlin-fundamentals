package ScopeFunctions

import classes.Course
import classes.CourseCategory

/*
 Scope funcs that can be attached to object
 apply -> this
 also -> it
 Good for logic required to execute as part of context of object itself.
 */

fun main() {

    exploreApply()
    exploreAlso()
    exploreApplyThenAlso()

}

fun exploreApplyThenAlso() {
    Course(6,
        "Marketing with Mitch",
        "Mitch").apply {
            category = CourseCategory.MARKETING
    } .also {
        println(it)
    }
}

fun exploreAlso() {
    // use also if we have side-effect to execute after construction of object
    Course(4,
        "Business Coutse",
        "some guy") .also {
            it.category = CourseCategory.BUSINESS
            println(it)
    }

}

fun exploreApply() {
    // configure an object, if it is partially constructed
    val course1 = Course(1,
        "Design Thinking in Kotlin",
        "some guy") .apply {
            category = CourseCategory.DESIGN
    }

    println(course1)
}
