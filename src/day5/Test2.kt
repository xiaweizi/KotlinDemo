package day5

/**
 * <pre>
 *     author : xiaweizi
 *     class  : day5.Test2
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/06/05
 *     desc   :
 * </pre>
 */
class Student(var name: String) {

    operator fun plus(student: Student): Student {
        return Student("$name + ${student.name}")
    }

    override fun toString(): String {
        return "name = $name"
    }
}

public val demo = Student::plus

public fun foo(first: Int, second: Int, x: (Int, Int) -> String): String {
    return x(first, second)
}

fun main(args: Array<String>) {
    val student1 = Student("first")
    val student2 = Student("second")
    println(student1 + student2)
}