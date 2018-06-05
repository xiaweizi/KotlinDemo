package day5

/**
 * <pre>
 *     author : xiaweizi
 *     class  : day5.Test6
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/06/05
 *     desc   :
 * </pre>
 */
fun op(x: (Int) -> Int): Int {
    return 1
}

fun op1(a: Int) : Int {
    return a
}

fun main(args: Array<String>) {
    val list = listOf("1", "d", "3")
    println(list)
    val demo = Demo()
    list.filter(String::isNotEmpty)
    println(list.filter(demo::isNotEm))
}

class Demo {
    fun isNotEm(content: String?): Boolean {
        return content != null
    }
}