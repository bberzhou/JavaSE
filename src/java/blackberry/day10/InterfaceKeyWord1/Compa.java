package blackberry.day10.InterfaceKeyWord1;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 5/31/20 07:48
 * Create By IntelliJ IDEA
 */
public interface Compa {
    /*
        JDK8之后，在接口里面除了定义全局常量和抽象方法之外，还可以定义静态方法、默认方法

        public是可以省略的

     */
    //  静态方法 static，可以直接通过接口调用
    public static void method1 () {
        System.out.println ("静态方法comp:北京");
    }

    //  默认方法,只有通过接口实现类的对象调用。使用default关键字来修饰
    default void method () {
        System.out.println ("默认方法");
    }

    default void method3 () {
        System.out.println ("interface method3");
    }
}
