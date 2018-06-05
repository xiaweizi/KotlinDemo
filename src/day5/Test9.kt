package day5

import java.io.OutputStream

/**
 * <pre>
 *     author : xiaweizi
 *     class  : day5.Test9
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/06/05
 *     desc   :
 * </pre>
 */
fun log(tag: String, target: OutputStream, message: Any?) {
    target.write("[$tag] $message\n".toByteArray())
}

//fun log(tag: String)
//    = fun (target: OutputStream)
//    = fun (message: Any?)
//    = target.write("[$tag] $message\n".toByteArray())

fun main(args: Array<String>) {
    log("myTag", System.out, "hello world!")
//    log("myTag")(System.out)("hello world!")
    ::log.curried()("myTag")(System.out)("hello world!")
}

fun <P1, P2, P3, R> Function3<P1, P2, P3, R>.curried()
    = fun(p1: P1) = fun (p2: P2) = fun(p3: P3) = this(p1, p2, p3)