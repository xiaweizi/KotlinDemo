package day1

/**
 * <pre>
 *     author : xiaweizi
 *     class  : day1.CommonDemo
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/05/30
 *     desc   :
 * </pre>
 */

fun main(args: Array<String>) {
    println("=== print ===")
    println("this is main method")

    println("=== variables ===")
    val x: Int = 2
    val y = 1
    // x = 1; 常量不能再被赋值
    println(x)
    println(y)
    var a: String = "a"
    a = "b"
    println(a)

    println("=== null ===")
    var name: String? = null
    // name.length 可能为空，编译时报错
    var sex: String
    // sex = null  必须声明的时候声明可为空，或者直接赋值
    val length = name?.length
    println(length)

    println("=== String ===")
    val name1 = "John"
    val lastName = "Smith"
    val text = "My name is $name1 $lastName"
    println(text)
    val otherText = "My name is : ${name1.substring(2)}"
    println(otherText)
    val text1 = """
        | First Line
        | Second Line
        | Third Line
        | gag
        """.trimMargin()
    println(text1)

    println("=== Ternary Operator ===")
    val x1 = 2
    val text2 = if (x1 > 5) "x > 5" else "x <= 5"
    println(text2)

    println("=== Is As In ===")
    val x2 = 2
    println(x2 is Int)
    println(x2 in 1..2)

    println("=== Smart Cast ===")
    val a3 = "gfag"
    if (a3 is String) {
        val result = a3.substring(1)
    }

    println("=== when ===")
    val q = 12
    val result1 = when (q) {
        0, 11 -> "0 or 1"
        in 1..10 -> "from 1 to 10"
        !in 12..14 -> "not from 1 to 10"
        else -> {
            "else"
        }
    }
    println(result1)

    println("=== for ===")
    for (i in 1 until 11) print(i)
    println()
    for (i in 1..10) print(i)
    println()
    for (i in 1..10 step 2) print(i)
    println()
    val colleciton = listOf(1, 2, 3)
    for (i in colleciton) {
        print(i)
    }
    println()
    val map = mapOf(1 to "a",
            2 to "b",
            3 to "c")
    for ((key, value) in map) {
        println("key: $key, value: $value")
    }

    println("=== Collections ===")
    colleciton.forEach {
        print(it)
    }
    println()
    colleciton.filter { it > 1 } .forEach { print(it)}
    println()
    val groups = colleciton.groupBy {
        if (it and 1 == 0) "even" else "old"
    }
    println(groups)
    val (evens, odds) = colleciton.partition {
        it and 1 == 0
    }
    println(evens)
    println(odds)
    colleciton.sortedBy {
        it < it - 1
    }
    println(colleciton)
}
