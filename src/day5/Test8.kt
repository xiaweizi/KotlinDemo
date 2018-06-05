package day5

/**
 * <pre>
 *     author : xiaweizi
 *     class  : day5.Test8
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/06/05
 *     desc   :
 * </pre>
 */
val add5 = { i: Int -> i + 5 }
val add2 = { i: Int -> i + 2 }

val func = {value: Int, f: (Int) -> Int, g: (Int) -> Int -> f(g(value))}

fun main(args: Array<String>) {
    println(add5(add2(2)))
    println(func(2, add5, add2))
    val addThen = add5 addThen add2
    println(addThen(2))
}

infix fun <P1> Function1<P1, P1>.addThen(function: Function1<P1, P1>): Function1<P1, P1> {
    return fun(p1: P1): P1 {
        return function.invoke(this.invoke(p1))
    }
}