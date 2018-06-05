package java;

import day5.Student;
import day5.Test2Kt;
import kotlin.reflect.KFunction;

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


    public static void main(String[] args) {
        KFunction<Student> demo = Test2Kt.getDemo();
        Student student = new Student("123");
        day5.Test2Kt.foo(1, 2, (integer, integer2) -> integer + integer2 + "");
    }
}

interface Source<T> {
    T next();
}
