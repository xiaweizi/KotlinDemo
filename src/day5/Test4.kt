package day5

/**
 * <pre>
 *     author : xiaweizi
 *     class  : day5.Test4
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/06/05
 *     desc   :
 * </pre>
 */
inline fun foo(value: Int, noinline f: (Int) -> Int, g: () -> Unit) {
    val x = value + 1
    f(x)
    println("foo")
}

fun main(args: Array<String>) {
    args.forEach(::println)
}