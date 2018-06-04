package day4

import day2.Delegate
import kotlin.properties.Delegates

/**
 * <pre>
 *     author : xiaweizi
 *     class  : day4.Test6
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/06/04
 *     desc   :
 * </pre>
 */
interface Base {
    val message: String
    fun foo()
}

class BaseImpl(val x: Int) : Base {
    override val message: String
        get() = "new message"
    override fun foo() {
        println("x=$x")
    }
}

class Derived(b: Base) : Base by b {
    override val message: String = "derived message"
}

class Example {
    var p: String by Delegate()
}

// 延迟属性
val lazyValue: String by lazy {
    println("computed!")
    "hello"
}

// 可观察属性
class User {
    var name: String by Delegates.observable("<no name>") {
        prop1, old, new ->
        println("$old -> $new")
    }
}

// 把属性值存在映射中
class Student1(val map: Map<String, Any?>) {
    val name: String by map
    val age: Int by map
    init {
        println("init")
        println("name=$name, age=$age")
    }
}
val student = Student1(mapOf("name" to "car", "age" to 12))

fun main(args: Array<String>) {
    val b = BaseImpl(12)
    Derived(b).foo()
    println(Derived(b).message)
    val exmple = Example()
    exmple.p = "name"
    println(exmple.p)
    println(lazyValue)
    println(lazyValue)
    val user = User()
    user.name = "first"
    user.name = "second"
    println(student.name)
    println(student.age)
    println(student.map)
    println("------")
    exmple({
        println("example")
        "result"
    })
}

fun exmple(computeFoo: () -> Unit) {
    val memoizedFoo by lazy(computeFoo)
    memoizedFoo.toString()
    memoizedFoo.toString()
}


