package OOP

abstract class SomeAbstractClass {
    abstract fun abstractMethod()
    fun callAbstractTwice() {
        abstractMethod() // can use abstract methods inside the class, it is assumed they will be overridden
        abstractMethod()
    }
    val a = 19
    fun d() {}
}

class SomeRegularClass : SomeAbstractClass() {
    override fun abstractMethod() {
        println("Calling abstract method"+a)
    }

}

fun main() {
    val regular = SomeRegularClass()
    regular.abstractMethod()
    regular.callAbstractTwice()
}