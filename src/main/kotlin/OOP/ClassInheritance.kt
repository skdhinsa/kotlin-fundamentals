package OOP

/*
 Class inheritance: define a class that extends from another class
 introduces some modifications to the behaviour
    same methods, slight modifications
 class must be open -> "open" modifier
 */

open class Shape {
    fun draw() {}
    protected val protectedProp = "private property"
    internal val internalProp = "private property"
    private val privateProp = "private property"
}

class Triange: Shape() {
    fun pythag() {}
}

open class Cat(val breed: String) {
    protected val protectedProp = "private property"
    internal val internalProp = "private property"
    private val privateProp = "private property"

}

class Ginger(val name: String) : Cat("ginger") {
    fun test(){
        println(protectedProp+internalProp)
    }

}

// if you define constructor param without val/var it will override parent property
class BigCat(breed:String) : Cat (breed)

private val someProperty = "abc"



fun main(){
    val ginger: Ginger = Ginger("cat")
    println(ginger.name)
    println(ginger.breed)

    val lion: BigCat = BigCat("lion")
    val cheetah: BigCat = BigCat("cheetah")
    println(lion.breed)
    println(cheetah.breed)

    val o: Shape = Triange() // can only access draw()
    val p = Triange() // can access both funcs


}