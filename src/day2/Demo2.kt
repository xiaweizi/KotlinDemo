package day2

/**
 * <pre>
 *     author : xiaweizi
 *     class  : day2.Demo2
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/06/01
 *     desc   :
 * </pre>
 */
fun main(args: Array<String>) {
    println(123.5e10)
    val oneMillion = 1_000_000
    val creditCardNumber = 1234_5678_9012_3456L
    val socialSecurityNumber = 999_99_9999L
    val hexBytes = 0xFF_EC_DE_5E
    val bytes = 0b11010010_01101001_10010100_10010010
    println(oneMillion)
    println(creditCardNumber)
    println(socialSecurityNumber)
    println(hexBytes)
    println(bytes)

    val anInt: Int = 10000
    val anInt1: Int? = anInt
    val anInt2: Int? = anInt
    println(anInt1 === anInt2)

    val a: Int = 200
    val boxedA: Int? = a
    val anotherBoxedA: Int? = a
    println(boxedA === anotherBoxedA)
    println(a.toDouble())
    println(a.toByte())

    val content = "2.2.23.4"
    println(content.split(".").toString())

    val arr = Array(5, {a -> ("$a + 1")})
    arr.forEach {
        println(it)
    }
    val text = """
    for (c in "foo")
        print(c)
"""
    println(text)
}