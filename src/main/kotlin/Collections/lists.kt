package Collections

/*
 list is read-only, cannot change internally. Once written it is set
 Use: ordered list of elements (i.e. if you want the delivery options to stay in same order on payment page)
 can use same values and elements multiple times
 */
val shoppingList = listOf(
    "Tomatoes",
    "Bananas",
    "Apples"
)

var anotherShoppingList = shoppingList + "kiwi" + "grapes"

fun main() {

    for(food in shoppingList){
        println(food)
    }
    println(shoppingList.size)
    println("last index of shoppingList is ${shoppingList.lastIndex}")
    println(anotherShoppingList.size)
    println("last index of anotherShoppingList is ${anotherShoppingList.lastIndex}")

    // if var, can change list by copying
    println(anotherShoppingList)
    anotherShoppingList = anotherShoppingList + "pear"
    println(anotherShoppingList)

    // how to add to mutable list
    var mutableList =  mutableListOf("A", "B") // can change internally
    mutableList.add("C")
    println(mutableList)

    // 1. create a list
    println("\n creating a list and manipulating")
    val nums: List<Int> = listOf(1,2,3)

    // 2. add elements to list
    println(nums + listOf(4, 5, 6))
    println(listOf(10) + nums)
    println(nums + 5)

    // 3. size of list
    println(nums.size)
    println(nums.size == 0)
    println("is list empty? ${nums.isEmpty()}")
    val empty:List<Int> = listOf()
    println("empty list size: ${empty.size}")
    println(empty.size == 0)

    // 4. get elements
    println(nums.get(0))
    println(nums[1])

    // 5. check list contains element
    println("list contains 3: ${nums.contains(3)}")
    println("list contains 20: ${nums.contains(20)}")
}