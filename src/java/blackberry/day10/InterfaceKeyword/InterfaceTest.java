package blackberry.day10.InterfaceKeyword;

/**
 * @Description: 关于接口
 * @author: bberzhou@gmail.com
 * @date: 4/30/20 23:43
 * Create By IntelliJ IDEA
 */
public class InterfaceTest {
    /*
        接口的使用：
        1。接口的使用用interface关键字来定义，
        2。在Java中接口和类class是并列的
        3。如何定义接口：定义接口中的成员
            3。1  JDK7以及以前：只能定义全局常量和抽象方法
                  >全局常量：public static final的，但是可以省略不写
                  >抽象方法 public abstract的 ，也是可以省略的


            3。2  JDK8：除了定义全局常量和抽象方法以外，还可以定义静态方法、默认方法

        4。接口中是不能定义构造器的，因此接口是不可以实例化的

        5。java开发中，接口都是通过让类去实现(implements)的方式来使用，使用implements关键字
            如果实现类覆盖了接口中的所有抽象方法，则此实现类就可以实例化
            如果实现类没有覆盖接口中所有的抽象方法，则此实现类仍为抽象的
        6。Java类可以实现多个接口---->这样就弥补了Java中的单继承性
            格式：Class AA extends BB implements CC,DD,EE      有继承有实现
        7。接口与接口之间可以继承，也可以多继承


        ***************************

        8。接口的具体使用，就可以体现出多态性
        9。接口，实际上就可以看作是一种规范。
        10。接口的应用：代理模式(proxy)，Java开发中使用比较多的一种设计模式


        面试题：抽象类和接口有哪些异同？
        相同点：不能被实例化，都可以包含抽象方法
        不同点：从抽象类和接口的定义、内部结构解释说明
     */
    public static void main (String[] args) {
        //  直接调用接口中的全局常量
        System.out.println (Flyable.MAX_SPEED);
//        Flyable.MAX_SPEED = 6;    ,   给全局常量重新赋值就会报错

    }
}
