package day5

/**
 * <pre>
 *     author : xiaweizi
 *     class  : day5.Test1
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/06/04
 *     desc   :
 * </pre>
 */
open class A {
    open fun foo(i: Int = 10) {
        println(i)
    }
}

class B: A() {
    override fun foo(i: Int) {
        super.foo(i)
    }
}

fun foo(vararg strings: String) {
}

fun main(args: Array<String>) {
    val b = B()
    b.foo()
    foo(strings = *arrayOf("1"))

    println("12" add "143")

    println(addSum(10))
}

infix fun String.add(other: String): Int{
    return other.toInt() + this.toInt()
}

tailrec fun addSum(x: Int): Int {
    return if (x == 1) 1
    else addSum(x - 1) + x
}