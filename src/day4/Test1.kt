package day4

/**
 * <pre>
 *     author : xiaweizi
 *     class  : day4.Test1
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/06/04
 *     desc   :
 * </pre>
 */


data class Student(val name: String, var age: Int = 12) {
}

fun main(args: Array<String>) {
    val student = Student("car")
    student.age = 12
    val student1 = Student("car")
    student1.age = 13

    println(student == student1)
    println(student === student1)
    println(student)
    println(student1)

    val student2 = student.copy(name = "fly")
    println(student2)
    val (name, age) = student2
    println("name=$name, age=$age")
}