package day2

/**
 * <pre>
 *     author : xiaweizi
 *     class  : day2.Test11
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/06/01
 *     desc   :
 * </pre>
 */
fun main(args: Array<String>) {
    val doc = mix(::f1, ::g1)
    val value = doc(1, "one")
    println(value)
}

fun f1(arg1: Int, arg2: String): String {
    println("arg1: $arg1, arg2: $arg2")
    return arg2
}

fun g1(ar1: String): Double {
    println("arg1: $ar1")
    return 1.0
}

fun <A, B, C> mix(f: (A, B) -> B, g: (B) -> C): ((A, B) -> C){
    return {
        a, b -> g(f(a, b))
    }
}
