package interfaces

import classes.Course

// can inherit from multiple interfaces
interface CourseRepository {
    val isCoursePersisted: Boolean // changes when course is saved
    fun getById(id: Int): Course

    fun save(course: Course): Int {
        println("course $course")
        return course.id
    }
}

class SqlCourseRepository: CourseRepository {
    override var isCoursePersisted: Boolean = false

    override fun getById(id: Int): Course {
        return Course(id, "sql fundamentals", "sql guy")
    }

    override fun save(course: Course): Int {
        isCoursePersisted = true
        return super.save(course)
    }
}

class NoSqlCourseRepository: CourseRepository {
    override var isCoursePersisted: Boolean = false

    override fun getById(id: Int): Course {
        return Course(id, "nosql fundamentals", "nosql guy")
    }

    override fun save(course: Course): Int {
        println("course in NoSqlCourseRepository $course")
        isCoursePersisted = true
        return course.id
    }
}

fun main() {
    val sqlCourseRepository = SqlCourseRepository()
    val course = sqlCourseRepository.getById(1);
    println(course)
    println("is course saved: ${sqlCourseRepository.isCoursePersisted}")

    val noSqlCourseRepository = NoSqlCourseRepository()
    val course2 = noSqlCourseRepository.getById(2)
    println(course2)

    val course3 = Course(5, "more nosql", "nosql guy")
    val savedCourseId = noSqlCourseRepository.save(course3)
    println(savedCourseId)
    println("is course saved: ${noSqlCourseRepository.isCoursePersisted}")

}