package day3

/**
 * <pre>
 *     author : xiaweizi
 *     class  : day3.Test6
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/06/04
 *     desc   :
 * </pre>
 */
class MyClass {
    companion object {
        fun getName(): String {
            return "name"
        }
    }
}

fun MyClass.Companion.foo() {
    println("value=${getName()}")
}

fun main(args: Array<String>) {
    val clazz = MyClass.Companion
    println(clazz.getName())
    clazz.foo()
}