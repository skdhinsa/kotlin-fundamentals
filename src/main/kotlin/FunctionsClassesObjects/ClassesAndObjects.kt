package FunctionsClassesObjects


fun main() {

    val employee1 = EmployeeCard("Meg", "Waitress")
    val employee2 = EmployeeCard("Heracles", "Chef")

    println(employee2.label)
    println(employee1.name)
    println("current role is: "+employee1.role)
    employee1.role = "Host"
    println("new role is: "+employee1.role)

}