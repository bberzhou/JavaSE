package blackberry.Chapter16NewFeature;

/**
 * @Description: 自定义函数式接口
 * @author: bberzhou@gmail.com
 * @date: 5/9/21 10:05 AM
 * Create By IntelliJ IDEA
 */

@FunctionalInterface
public interface FunctionalInterfaceTest {
    /*
        函数式接口，使用@FunctionalInterface注解也可以来进行检验，如果有多个抽象方法就会报错
     */
    //  只能有一个抽象方法
   void method();
//    void me1();如果有多个就会报错

    //  这样的话，相当于函数式接口的实例，就是lambda表达式，也即是Lambda表达式就是一个函数式接口的实例

    //  所以以前用匿名实现类表示的都可以使用Lambda表达式来写

    /*
        java 内置4大核心函数式接口
            函数式接口        参数类型       返回类型           用途
            Consumer<T       T            void         对类型为T的对象应用操作，包含方法void accept(T t)
            消费型接口，

            Supplier<T>
            供给型接口       无               T           返回类型为T的对象，包含方法：T get()

        Functional<T, R>    T              R            对类型为T的对象应用操作，并返回结果，
                                                        结果是R类型的对象，包含方法，R apply(T t)

           Predicate<T >
           断定型接口        T           boolean         确定类型为T 的对象是否满足某约束，并返回boolean值，包含方法，boolean test(T t)


     */

}
