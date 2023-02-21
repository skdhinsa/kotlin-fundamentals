package SpecialClasses

sealed class Role
class CeoRole(val name: String) : Role()
class ManagerRole(val name: String): Role()
class WorkerRole(val name: String): Role()

/*
 Sealed class: when statement doesn't need else, if you cover all possible subtypes.
 due to the sealed modifier
 */

fun constructLabel(role: Role): String {
    return when(role) {
        is CeoRole -> "CEO: ${role.name}"
        is ManagerRole -> "Manager: ${role.name}"
        is WorkerRole -> "Worker: ${role.name}"
    }
}

fun main(){
    val worker = WorkerRole("John")
    constructLabel(worker)
    println(constructLabel(worker))
}