package day4

/**
 * <pre>
 *     author : xiaweizi
 *     class  : day4.Test4
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/06/04
 *     desc   :
 * </pre>
 */

// 嵌套类
class Outer {
    private val bar: Int = 1
    class Nested {
        fun foo() = 2
    }
}
val demo = Outer.Nested().foo()


// 内部类
class Outer1 {
    private val bar: Int = 1
    inner class Inner {
        fun foo() : Int {
            return bar + 1
        }
    }
}
val demo1 = Outer1().Inner().foo()

interface MyInterface {
    fun foo()
}

val demo2 = object : MyInterface {
    override fun foo() {

    }

}

fun main(args: Array<String>) {
    println(demo)
    println(demo1)
}