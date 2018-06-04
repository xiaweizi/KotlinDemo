package day3

/**
 * <pre>
 *     author : xiaweizi
 *     class  : day3.Test3
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/06/04
 *     desc   :
 * </pre>
 */
interface A {
    fun foo() {
        println("A-foo")
    }
    fun bar()
}

interface B {
    fun foo() {
        println("B-foo")
    }
    fun bar()
}

class C : A, B {
    override fun foo() {
        super<A>.foo()
        super<B>.foo()
    }

    override fun bar() {
    }
}

fun main(args: Array<String>) {
    val c = C()
    c.foo()
}