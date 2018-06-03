package day3

/**
 * <pre>
 *     author : xiaweizi
 *     class  : day3.Test
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/06/02
 *     desc   :
 * </pre>
 */

fun main(args: Array<String>) {
    loop@ for (i in 1..10) {
        for (j in 11..20) {
            if (j % 2 == 0) {
                println("i=$i, j=$j")
                break@loop
            }
            println("---i=$i, j=$j---")
        }
    }
}

fun sum(x: Int, y: Int) = x + y