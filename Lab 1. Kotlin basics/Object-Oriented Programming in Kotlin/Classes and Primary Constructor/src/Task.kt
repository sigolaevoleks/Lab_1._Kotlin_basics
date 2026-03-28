class Student(val name: String, var age: Int)

fun createStudent(): String {
    val student = Student("Ivan", 20)
    student.age = 21
    return "${student.name} is ${student.age}"
}
