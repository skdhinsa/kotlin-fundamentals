package FunctionsClassesObjects

// primary constructor definition
class EmployeeCard (
    // read-only val
    val name: String,
    // read-write var
    var role: String)
{
    // properties inside the class body MUST be initialised
    var label: String = "$name works as a $role"

}