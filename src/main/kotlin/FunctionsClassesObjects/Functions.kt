package FunctionsClassesObjects

fun sayHelloTo(name:String){
    println("Hello, $name")
}

// return type is after param definition
// fun funcName({parameters}): {returnType} {body}
fun double(value:Int): Int{
    return value*2
}

// defining default arguments
fun openBrowser(url: String, incognitoMode: Boolean = false) {
    println("Opening $url" + if(incognitoMode) " in incognito mode." else ".")
}

fun main() {

    sayHelloTo("Serena")
    double(321)
    openBrowser("www.google.com")
    openBrowser("www.google.com", true)

}