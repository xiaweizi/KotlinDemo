package day4

/**
 * <pre>
 *     author : xiaweizi
 *     class  : day4.Test3
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/06/04
 *     desc   :
 * </pre>
 */
open class Aa
class Bb: Aa()
class Cc

fun <T: Aa> T.operate() = "operate"

fun main(args: Array<String>) {
    val a = Aa()
    val b = Bb()
    val c = Cc()
    println(a.operate())
    println(b.operate())
}