package day5

/**
 * <pre>
 *     author : xiaweizi
 *     class  : day5.Test5
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/06/05
 *     desc   :
 * </pre>
 */
fun main(args: Array<String>) {
    println("请输入算式例如 3 + 4")
    val input = readLine()
    if (input != null) {
        val splits = input.split(" ")
        val arg1 = splits[0].toDouble()
        val op = splits[1]
        val arg2 = splits[2].toDouble()
        println("$arg1 $op $arg2  = ${Operator(op).operate(arg1, arg2)}")
    }
}

class Operator(op: String) {
    val opFunc: (left: Double, right: Double) -> Double
    init {
        opFunc = when(op) {
            "+" -> {l, r -> l + r}
            "-" -> {l, r -> l - r}
            "*" -> {l, r -> l * r}
            "/" -> {l, r -> l / r}
            else -> {
                throw UnsupportedOperationException(op)
            }
        }
    }

    fun operate(left: Double, right: Double): Double {
        return opFunc(left, right)
    }
}
