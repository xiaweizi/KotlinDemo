package day5

/**
 * <pre>
 *     author : xiaweizi
 *     class  : day5.Test7
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/06/05
 *     desc   :
 * </pre>
 */
fun fibonaci(): Iterable<Long> {
    var first = 0L
    var second = 1L
//    return fun(): Long {
//        val result = second
//        val tem = first
//        first = second
//        second += tem
//        return result
//    }

    return Iterable {
        object : LongIterator() {
            override fun hasNext(): Boolean {
                return true
            }
            override fun nextLong(): Long {
                val result = second
                val tem = first
                first = second
                second += tem
                return result
            }
        }
    }
}

fun add(x: Int): (Int) -> Int {
    return fun(y: Int): Int {
        return x + y
    }
}

fun main(args: Array<String>) {
    fibonaci()
            .takeWhile { it <= 100 }
            .forEach { println(it) }

    println(add(2)(5))
}