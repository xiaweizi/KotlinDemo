package day2

import kotlin.properties.Delegates

/**
 * <pre>
 *     author : xiaweizi
 *     class  : day2.Test7
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/06/01
 *     desc   :
 * </pre>
 */
class People {
    var name: String by Delegates.notNull()
    fun init(name: String) {
        this.name = name
    }
}

fun main(args: Array<String>) {
    val people = People()
//    people.init("Carl")
    println(people.name)
}