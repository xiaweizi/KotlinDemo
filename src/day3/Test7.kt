package day3

/**
 * <pre>
 *     author : xiaweizi
 *     class  : day3.Test7
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/06/04
 *     desc   :
 * </pre>
 */
class DD {
    fun bar() {
        println("bar")
    }
}

class CC {
    fun baz() {
        println("baz")
    }

    fun DD.foo() {
        baz()
        bar()
    }

    fun caller(d: DD) {
        d.foo()
    }
}

fun main(args: Array<String>) {
    CC().caller(DD())
}