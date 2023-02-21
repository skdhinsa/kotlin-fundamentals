package Collections

fun main() {

    // lists - immutable and mutable
    val names = listOf("Adam", "Bill", "Chloe")
    println("names: $names")

    val namesMutable = mutableListOf("Adam", "Bill", "Chloe")
    println("names mutable: $namesMutable, length of list ${namesMutable.size}")
    namesMutable.add("Dylan")
    println("names mutable after add: $namesMutable, length of list ${namesMutable.size}")

    // sets - immutable and mutable
    val set = setOf(1, 2,3 ,4)
    println("set: $set")

    val setMutable = mutableSetOf(1, 2,3 ,4)
    println("setMutable: $setMutable")
    setMutable.add(43)
    println("setMutable after add: $setMutable")

    // map - immutable and mutable
    val nameAgeMap = mapOf("Serena" to 29, "Dylan" to 32)
    println("map name to age: $nameAgeMap")

    val nameAgeMapMutable = mutableMapOf("Serena" to 29, "Dylan" to 32)
    println("nameAgeMapMutable name to age: $nameAgeMapMutable")
    nameAgeMapMutable["Noelle"] =  28
    println("nameAgeMapMutable name to age - after add: $nameAgeMapMutable")
}