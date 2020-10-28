package blackberry.day9OOP1.DesignPattern;

/**
 * @Description: 饿汉式和懒汉式的区别
 * @author: bberzhou@gmail.com
 * @date: 4/23/20 16:08
 * Create By IntelliJ IDEA
 */
public class SingletonTest3 {
    /*
        饿汉式和懒汉式的比较
            饿汉式：程序指向时，加载类之后，就会创建一个类的实例对象，比较占用内存6。
                    坏处：对象加载时间过长
                    好处：饿汉式是线程安全的
            懒汉式：当类加载之后，不会先去创建类的实例对象，在需要的时候，才会去创建对象。
                    好处：延迟对象的创建
                    目前的写法坏处：线程不安全-------->在多线程处再修改

     */
}
