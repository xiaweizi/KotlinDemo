package day2

import kotlin.reflect.KProperty

/**
 * <pre>
 *     author : xiaweizi
 *     class  : day2.Test4
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/06/01
 *     desc   : ´úÀí
 * </pre>
 */
class Example {
    var p: String by Delegate()
    override fun toString(): String {
        return "Example class"
    }
}

class Delegate() {
    operator fun getValue(thisRef: Any?, prop: KProperty<*>): String {
        return "$thisRef, thank you for delegation '${prop.name}' to me"
    }
    operator fun setValue(thisRef: Any?, prop: KProperty<*>, value: String){
        println("$value has been assigned to ${prop.name} in $thisRef")
    }
}

fun main(args: Array<String>) {
    val e = Example()
    println(e.p)
    e.p = "New"
}