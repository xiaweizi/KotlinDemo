package day2

/**
 * <pre>
 *     author : xiaweizi
 *     class  : day2.Test8
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/06/01
 *     desc   :
 * </pre>
 */
class User1(val map: Map<String, Any?>) {
    val name: String by map
    val age: Int by map
    val stop: Int by map
}

fun main(args: Array<String>) {
    val user = User1(mapOf("name" to "g",
            "age" to 25, "stop" to 25))
    println("name = ${user.name}, age = ${user.age}, stop = ${user.stop}")
}