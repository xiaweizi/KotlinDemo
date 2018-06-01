package day2

/**
 * <pre>
 *     author : xiaweizi
 *     class  : day2.Test2
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/06/01
 *     desc   : java bean
 * </pre>
 */
data class User(var name: String, val id: Int)

fun getUser(): User {
    return  User("Alex", 1);
}

fun main(args: Array<String>) {
    val user = getUser()
    println("name: ${user.name}, id: ${user.id}")
    val (name, id) = user
    println("name: $name, id: $id")
    println("name: ${getUser().component1()}, id: ${getUser().component2()}")
    user.name = "Super";
    println(user.toString())
    println()
    println()
    println()
    val user1 = User("one", 1)
    val user2 = User("two", 2)
    println(user1.toString())
    println(user2.toString())
    // copy function
    println(user1.copy())
    println(user1.copy("Three"))
    println(user1.copy(id = 2))
}