package day4

/**
 * <pre>
 *     author : xiaweizi
 *     class  : day4.Test5
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/06/04
 *     desc   :
 * </pre>
 */
open class Aaa(var name: String)
interface Bbbb {
    val age: Int
}

fun foo() {
    val adHoc = object {
        var x: Int = 12
        var y: Int = 22
    }
    println(adHoc.x + adHoc.y)
}

class Gg {
    private fun foo() = object {
        val x: String = "x"
    }

     fun publicFoo() = object {
        val x: String = "x"
    }

    fun bar() {
        val x1 = foo().x
    }
}

fun main(args: Array<String>) {
    val gg = Gg()
    println(Ee.login("12"))
    println(Ee.age)
    Ee.age++
    Ee.age++
    Ee.age++
    println(Ee.age)

    println(MyClass.age)
    println(MyClass.getName())
}

object Ee {
    var age: Int = 0
    fun register() {
        println("register")
    }
    fun login(name: String): Int {
        return name.toInt()
    }
}

class MyClass {
    companion object {
        val age: Int = 132
        fun getName() = "getName"
    }
}