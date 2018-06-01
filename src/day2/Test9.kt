package day2

/**
 * <pre>
 *     author : xiaweizi
 *     class  : day2.Test9
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/06/01
 *     desc   :
 * </pre>
 */
fun main(args: Array<String>) {
    val numbers = listOf(1, 2, 3)
    println(numbers.filter(::isOdd))
}

fun isOdd(x: Int) = x % 2 == 0