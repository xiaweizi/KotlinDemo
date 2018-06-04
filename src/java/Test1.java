package java;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : java.Test1
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/06/04
 *     desc   :
 * </pre>
 */

class Test1 {
    void demo(Source<String> strs) {
        Source<?> strs1 = strs;
    }
}

interface Source<T> {
    T next();
}