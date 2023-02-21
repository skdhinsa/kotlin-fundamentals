package OOP

interface Animal {
    val breed: String
    fun pet()
    fun makeNoise()
}

class Dog (override val breed: String): Animal {
    override fun pet() {
         println("petting dog")
    }

    override fun makeNoise() {
        println("woof")
    }

    fun something(){}
}

class Emu(override val breed: String): Animal {
    override fun pet() {
        println("petting Emu")
    }

    override fun makeNoise() {
    }
}

fun pet(animal:Animal) {
    println("Pet: ${animal.breed}")
    animal.makeNoise()
    animal.pet()
}

// "is" keyword -> check object type
fun checkIsEmu(animal: Animal){
    if(animal is Emu){
        println(true)
    }
    println(false)

}

fun main() {
    pet(Emu("Emu"))
    pet(Dog("Labrador"))
    var emu: Emu = Emu("Emu")
    var dog: Dog = Dog("Husky")

    checkIsEmu(dog)
    checkIsEmu(emu)

    var a: Animal = Dog("husky")
    
}

