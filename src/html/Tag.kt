package html

/**
 * <pre>
 *     author : xiaweizi
 *     class  : html.Tag
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/06/05
 *     desc   :
 * </pre>
 */
open class Tag(val name: String) : Node {
    val children = ArrayList<Node>()
    val properties = HashMap<String, String>()

    override fun render(): String {
        return StringBuilder()
                .append("<")
                .append(name)
                .append(">")
                .let {
                    stringBuilder ->
                    if (!this.properties.isEmpty()) {
                        stringBuilder.append(" ")
                        this.properties.forEach {
                            stringBuilder.append(it.key)
                                    .append("=\"")
                                    .append(it.value)
                                    .append("\" ")
                        }
                    }
                    stringBuilder
                }
                .append(">")
                .let {
                    stringBuilder ->
                    children.map(Node::render).map(stringBuilder::append)
                    stringBuilder
                }
                .append("</$name>")
                .toString()
    }

}