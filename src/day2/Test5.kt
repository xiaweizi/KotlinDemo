package day2

/**
 * <pre>
 *     author : xiaweizi
 *     class  : day2.Test5
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/06/01
 *     desc   : ¿¡º”‘ÿ
 * </pre>
 */
class LazySample {
    val lazy: String by lazy {
        println("computed")
        "my lazy"
    }
}

fun main(args: Array<String>) {
    val sample = LazySample()
    println("lazy = ${sample.lazy}")
    println("lazy = ${sample.lazy}")
}
