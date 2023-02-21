package Collections

/*
    Stores key-value pairs
    Keys are unique, values can be duplicates
 */


fun main() {

    // 1. creating a map
    val capitals = mapOf(
        "UK" to "London",
        "India" to "New Delhi",
        "Sweden" to "Stockholm",
        "Japan" to "Tokyo"
    )
    println(capitals)

    var alphabet: Map<Int, Char> = mapOf(1 to 'A', 2 to 'B', 3 to 'C')
    println(alphabet)

    // 2. Finding a value for a ket
    println(capitals.get("UK")) //London
    println(capitals["Sweden"])
    val number: Char? = alphabet[1] // if not in map, null will be returned
    val number2: Char? = alphabet[4]
    println(number)
    println(number2)

    // 3. adding elements to a map -> will rewrite value if key already exists
    val moreCapitals = capitals + mapOf("Canada" to "Ottawa")
    println(moreCapitals)

    // 4. remove keys from a map
    val map = capitals - "India"
    println(map)

    // 5. check maps contains a key
    println(map.containsKey("India"))
    println(map.containsKey("UK"))

    // 6. check map size
    println(capitals.size)

    // 7. iterate over a map
    for(entry in capitals){
        println("${entry.value} is the capital of ${entry.key}")
    }

    // restructure
    println()
    for((country, capital) in capitals){
        println("${capital} is the capital of ${country}")
    }
}