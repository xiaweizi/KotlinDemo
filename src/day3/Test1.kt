package day3

/**
 * <pre>
 *     author : xiaweizi
 *     class  : day3.Test1
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/06/02
 *     desc   :
 * </pre>
 */
fun main(args: Array<String>) {
    val user = User()
    user.name = "tree"
    println(user.name)
    println(user.sex)
}

class User {
    var name: String = ""
        set(value) {
        println("set $value")
        field = value
    }
    get() {
        println("get $field")
        return "value: $field"
    }

    lateinit var sex: String
    fun func1() {
        println(sex)
    }
}




