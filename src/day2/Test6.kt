package day2

import kotlin.properties.Delegates

/**
 * <pre>
 *     author : xiaweizi
 *     class  : day2.Test6
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/06/01
 *     desc   : 观察字符串的变化
 * </pre>
 */
class Student {
    var name: String by Delegates.observable("no name") {
        d, old, new ->
        println("$old - $new")
    }
}

fun main(args: Array<String>) {
    val student = Student()
    student.name = "Carl"
    student.name = "Berry"

}