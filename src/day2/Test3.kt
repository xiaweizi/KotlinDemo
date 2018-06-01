package day2

/**
 * <pre>
 *     author : xiaweizi
 *     class  : day2.Test3
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/06/01
 *     desc   :
 * </pre>
 */
fun main(args: Array<String>) {
    val map =  hashMapOf<String, Int>()
    map.put("one", 1)
    map.put("two", 2)
    for ((key, value) in map) {
        println("key: $key, value: $value")
    }
}