package blackberry.Chapter15Reflection.ReflectionProxy;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 5/7/21 12:22 AM
 * Create By IntelliJ IDEA
 */
public class ReflectionProxy {
    /*
        反射的应用：动态代理
        代理设计模式的原理：
            使用一个代理将对象包装起来，然后用该代理对象取代原始对象。
            任何对原始对象的调用都要通过代理。代理对象决定是否以及何时将方法调用转到原始对象上。
             最好通过一个代理类完成全部的代理功能

        动态代理是指客户通过代理类来调用其他对象的方法，并且是在程序运行时根据需要动态创建目标类的代理对象

         动态代理使用场景：
                    调试
                    远程方法调用

          动态代理相比于静态代理的优点：
                抽象角色中（接口）声明的所有方法都被转移到调用处理器一个集中的方法中处理
                这样，可以更灵活和统一的处理众多的方法

     */

}
