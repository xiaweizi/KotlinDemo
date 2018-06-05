package html

/**
 * <pre>
 *     author : xiaweizi
 *     class  : html.DSLMain
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/06/05
 *     desc   :
 * </pre>
 */
fun main(args: Array<String>) {
    Tag("html").apply {
        properties["id"] = "htmlId"
        children.add(Tag("head"))
    }.render().let(::println)
}