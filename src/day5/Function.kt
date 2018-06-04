package day5

/**
 * <pre>
 *     author : xiaweizi
 *     class  : day5.Function
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/06/04
 *     desc   :
 * </pre>
 */
val func1 = {i: Int -> i + i}
val func2: (Int) -> Int = { it + it }

fun <A> func(a: A, x: (A) -> A, y: (A) -> A): A {
    return x(y(a))
}

val fun3 = {first: Int, seond: Int -> first + seond}
val fun5: (Int, Int) -> Int = {_, seond -> seond}
val fun4: Int.(Int) -> Int = Int::plus

fun main(args: Array<String>) {
    val stringPlus: (String, String) -> String = String::plus
    val stringPlus1: String.(String) -> String = String::StrPlus
    val intPlus: (Int, Int) -> Int = Int::plus
    val intPlus1: Int.(Int) -> Int = Int::plus

    println(stringPlus.invoke("22", "11"))
    println(intPlus(1, 2))
    println(stringPlus1("2", "3"))
    println("12".stringPlus1("3232"))
    println("----")
    println(fun3(1, 2))
    println(2.fun4(5))
    println(fun5(2, 10))
}

fun String.StrPlus(other: String) = "this=$this, other=$other"

val sum: Int.(Int) -> Int = {other -> plus(other)}
val sum1 = fun Int.(other: Int): Int = this + other

class HTML {
    fun body() {

    }
}

fun html(init: HTML.() -> Unit): HTML {
    val html = HTML()  // 创建接收者对象
    html.init()       // 将该接收者对象传给该 lambda
    return html
}