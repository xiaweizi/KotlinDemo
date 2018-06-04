package day3

/**
 * <pre>
 *     author : xiaweizi
 *     class  : day3.Test2
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/06/04
 *     desc   :
 * </pre>
 */
interface MyInterface {
    val prop: Int
    fun bar()
    fun foo(name: String) {
        println("name=$name")
    }
}

class Child() : MyInterface {
    override val prop: Int
        get() = 12
    override fun bar() {
    }

}

fun main(args: Array<String>) {
    val iView = object : MyInterface {
        override val prop: Int
            get() = 12

        override fun bar() {
            println("bar")
        }
    }
    iView.bar()
    iView.foo("car")
    println(iView.prop)
}