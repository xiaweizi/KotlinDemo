package day2

/**
 * <pre>
 *     author : xiaweizi
 *     class  : day2.Demo1
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/06/01
 *     desc   :
 * </pre>
 */
fun main(args: Array<String>) {
    println(whenTest(12))
    println("干")
    println(1..10)
    println(1 until 10)
    val content = """aaaa
        ,bbb
        ,ccc
        , ddd""".trimMargin(",")
    println(content)
}

fun whenTest(age: Int): String {
    val desc = when(age) {
        in 1..12 -> "儿童"
        in 12..13 -> "少年"
        else -> "未知"
    }
    return desc
}