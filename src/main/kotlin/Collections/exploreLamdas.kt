package Collections

/*
 Higher-order function -> function that accepts a function as arg or returns a function
 any function that matches the signature (x: Int, y: Int) can be passed, returning Int
 3rd variable of type function that returns integer
 */
fun calculate(x: Int, y: Int, op: (x: Int, y: Int) -> Int) : Int{

    return op(x,y)
}

fun main() {

    val addLambda = {x:Int -> x+x}
    val add2 = addLambda(2)
    println("add = $add2")

    val multiplyLambda = {x:Int, y:Int ->
        println("x is $x, y is $y")
        x*y
    }
    val multiply2 = multiplyLambda(7,6)
    println("multiply = $multiply2")

    val add = {x:Int, y:Int -> x+y}
    val subtract = {x:Int, y:Int -> x-y}
    val multiply = {x:Int, y:Int -> x*y}

    val calculateAdd = calculate(2,3, add)
    val calculateSubtract = calculate(51,3, subtract)
    val calculateMultiply = calculate(3,6,multiply)

    println("calculateAdd = $calculateAdd")
    println("calculateSubtract = $calculateSubtract")
    println("calculateMultiply = $calculateMultiply")

}