package day6

import java.io.File

/**
 * <pre>
 *     author : xiaweizi
 *     class  : day6.Test1
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/06/05
 *     desc   :
 * </pre>
 */
fun main(args: Array<String>) {
    val map = HashMap<Char, Int>()
    File(".gitignore").readText().toCharArray().filterNot(Char::isWhitespace)
            .groupBy { it }.map {
        it.key to it.value.size
    }

    File(".gitignore").readText().toCharArray().filterNot(Char::isWhitespace)
            .groupBy { it }.forEach(::println)
}