package day5

/**
 * <pre>
 *     author : xiaweizi
 *     class  : day5.Test3
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/06/05
 *     desc   :
 * </pre>
 */
fun main(args: Array<String>) {
//    foo(33)
    foo31 {it -> it}
    val list = listOf(-1, 2)
    println(list.filter(fun(it) = it == 2))
    println(list.filter { it == 2 })
}

fun foo31(x: (Int) -> Int) {

}


fun foo2(x: Int, y: (Int, Int) -> Int): Int {
    return x
}

val demo1 = foo2(12, { a, b -> a + b})

fun foo(x: Int): Int {
    val y: Int = 12
    fun foo1(x: String): String {
        val z: Int = 22
        fun foo2() {
            println("z=$z")
        }
        foo2()
        return "foo1=$x, $y"
    }
    return foo1(y.toString()).toInt()
}