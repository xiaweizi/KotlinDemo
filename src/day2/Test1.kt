package day2

/**
 * <pre>
 *     author : xiaweizi
 *     class  : day2.Test1
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/06/01
 *     desc   :
 * </pre>
 */
fun main(args: Array<String>) {
    val pair = Pair(1, "one")
    val (num, name) = pair
    println("num: $num, name: $name")
}

class Pair<K, V>(val first: K, val second: V) {
    operator fun component2(): K {
        return first;
    }

    operator fun component1(): V {
        return second;
    }
}