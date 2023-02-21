import Dataset.Course
import Dataset.CourseCategory
import Dataset.KAFKA
import Dataset.courseList

fun main() {

    val courseList = courseList()
    val devPredicate = {course: Course -> course.category == CourseCategory.DEVELOPEMENT}
    val bizPredicate = {course: Course -> course.category == CourseCategory.BUSINESS}
    val desPredicate = {course: Course -> course.category == CourseCategory.DESIGN}

//    exploreFilter(courseList, desPredicate)
//    exploreMap(courseList, bizPredicate)
    val list = listOf(listOf(1,2,3), listOf(4,5,6))
    val listMapped = list.map {
        eachList -> eachList.map {
            it.toDouble()
        }
    }

    val flatMapped = list.flatMap {
        eachList -> eachList.map {
            it.toDouble()
        }
    }

    val kafkaCourses = exploreFlatMap(courseList, KAFKA)
//    println("Kafka course: $kafkaCourses")

//    exploreHashmap()

    collectionsNullability()

}

fun collectionsNullability() {
    // can have a null collection
    var list: MutableList<String>? = null // without ? would error
    list = mutableListOf()
    list.add("Serena")
    list.forEach { println("name: $it") }


    // can have a collection with null values
    var list2: List<String?> = listOf("Adam", "Bill", null, "Dylan")
    list2.forEach{
        println("Length of name $it is ${it?.length}") //make it null safe using ?
//        println("Length of name ${it ?: "no name"} is ${it?.length ?: 0}") using elvis operator for default values if null
    }

}

fun exploreHashmap() {
    val hashMap = mutableMapOf("Serena" to 30, "Sophie" to 29, "Jane" to 31)
    hashMap.forEach {
        (k,v) -> println("key:$k ,value: $v")
    }

    val value = hashMap.getOrElse("Dylan"){30}
    println(value)

    val result = hashMap.containsKey("Dylan")
    println("map contains dylan: $result")

    val filteredmap = hashMap.filterKeys { it.length <5 }
        .map { it.key.uppercase() }
    println("filteredmap: $filteredmap")

    // maxByOrNull -> check all values and give one with max value
    val maxAge = hashMap.maxByOrNull { it.value }
    println("maxAge: $maxAge")
}

fun exploreFlatMap(courseList: MutableList<Course>, topic: String): List<String> {
    return courseList
        .flatMap { course ->
                    val courseName = course.name
                    course.topicsCovered.filter { it == topic }
                        .map { courseName }
        }
}

fun exploreMap(courseList: MutableList<Course>, predicate:(Course)->Boolean) {
    courseList
        .filter (predicate)
        .map { "${it.name} - ${it.category}" }
        .forEach{
            println(it)
        }
}

// dynamic filter with predicate
fun exploreFilter(courseList: MutableList<Course>, predicate: (Course)->Boolean) {
    return courseList
        .filter { predicate.invoke(it) }
        .forEach {
            println("Course: $it")
        }
}

