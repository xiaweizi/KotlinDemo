package day4

/**
 * <pre>
 *     author : xiaweizi
 *     class  : day4.Test2
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/06/04
 *     desc   :
 * </pre>
 */
class Box<T>(var t: T) {
    val value = t
}

interface Source<out T> {
    fun nextT(): T
}

fun demo(strs: Source<String>) {
    val objects : Source<Any> = strs
    var nextT = objects.nextT()
}

interface Compareable<in T> {
    operator fun compareTo(other: T): Int
}

fun demo1(x: Compareable<Number>) {
    x.compareTo(1.1)
    val y: Compareable<Double> = x
}

fun <T> T.basicToString() : String {
    return "basic to string = ${toString()}"
}

fun main(args: Array<String>) {
    val box = Box(1)
    println(box.t)
    println(box.value)
    println(box.basicToString())
}