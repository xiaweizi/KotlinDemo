package day3

/**
 * <pre>
 *     author : xiaweizi
 *     class  : day3.Test4
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/06/04
 *     desc   :
 * </pre>
 */
fun String.test(name: String) {
    println("this=$this, name=$name")
}

fun Any?.toString(name: String) {
    println("this=${this.toString()}, name=$name")
}

class Student {
    var name: String = ""
    override fun toString(): String {
        return "name=$name"
    }
}

fun <T> MutableList<T>.swap(index1: Int, index2: Int) {
    val tmp = this[index1]
    this[index1] = this[index2]
    this[index2] = tmp
}

fun main(args: Array<String>) {
    val content = "content"
    content.test("car")
    content.toString("phone")
    val student = Student()
    student.name = "小明"
    student.toString("大明")

    val list = arrayListOf(1, 2, 3)
    list.swap(1, 2)
    println(list)
}
