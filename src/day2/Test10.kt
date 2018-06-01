package day2

/**
 * <pre>
 *     author : xiaweizi
 *     class  : day2.Test10
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/06/01
 *     desc   :
 * </pre>
 */

fun main(args: Array<String>) {
    val oddLength = compose1(::isOdd1, ::length)
    val strings = listOf("a", "ab", "abc")
    println(strings.filter(oddLength))
}

fun isOdd1(x: String) = x == "a"
fun length(s: Boolean) = s

fun <A, B, C> compose1(g: (A) -> C, f: (C) -> B): (A) -> B {
    return { x -> f(g(x)) }
}
