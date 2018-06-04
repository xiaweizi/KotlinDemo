package day3

/**
 * <pre>
 *     author : xiaweizi
 *     class  : day3.Test5
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/06/04
 *     desc   :
 * </pre>
 */
open class E

class D : E()

fun E.foo() = "e"

fun D.foo() = "d"

fun printFoo(e: E) {
    println(e.foo())
}

val <T> List<T>.lastIndex: Int
    get() = size - 1

fun main(args: Array<String>) {
    // ��Ϊ���õ���չ����ֻȡ���ڲ��� e ���������ͣ�������Ӧ���� E
    printFoo(E())
    printFoo(D())
    val list = listOf(1, 2, 4)
    val lastIndex = list.lastIndex
    println(lastIndex)
}