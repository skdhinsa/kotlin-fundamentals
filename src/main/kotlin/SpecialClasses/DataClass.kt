package SpecialClasses

/*
 Comparison of objects -> all objects are unique, every instance of regular class is unique.
 Therefore, they will not be equal.
 Unless the two objects have same reference to the same object.

 A class to represent the data it holds.
 So two objects should be considered equal if they have the same values for the properties.
 They display info about props if asked to transfer the object to string.

 DTOs, domain classes and value object classes fall under this category.
 Java beans would be data classes

 Auto generates: equals(), hashCode(), toString() methods
 */

data class Dog(
    val name: String,
    val breed: String,
    val age: Int
)

fun main(){
    val dog1 = Dog("Murph", "Husky", 1)

    // two objects/instances of a class with same constructor properties are equal. Not reliant on reference.
    val dog2 = Dog("Murph", "Husky", 1)
    println(dog1 == dog2)
    println(dog1)

    // destructuring -> reading values from class and assigning them to variables. Based on position
    println(dog1.age)
    println(dog1.name)
    println(dog1.breed)

    val dog3 = Dog("Rex", "Labrador", 1)
    val (d1Name, d1Age) = dog1
    val (d3Name, d3Age) = dog3

    println("dog1 name: $d1Name, age: $d1Age")
    println("dog2 name: $d3Name, age: $d3Age")

    // copy function (useful for val properties) -> dog got older, so change age only of object
    val newDog3 = dog3.copy(age = 2)
    println(dog3) // age remains unchanged
    println(newDog3) // new age


}
