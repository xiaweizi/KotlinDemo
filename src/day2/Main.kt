package day2

/**
 * <pre>
 *     author : xiaweizi
 *     class  : day2.Main
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/06/01
 *     desc   :
 * </pre>
 */
fun main(args: Array<String>) {
    val content: String? = null
    println(content?.length ?: "empty")
    println(content?.firstOrNull())
    content?.let {
        println("let let")
    }
}

fun String.test(): String {
    println("gagd ${toString()}")
    return "ddad"
}