package blackberry.day8OOP1.SuperTest;

/**
 * @Description: 子类对象实例化的过程
 * @author: bberzhou@gmail.com
 * @date: 4/16/20 17:22
 * Create By IntelliJ IDEA
 */
public class SubClassInstanceTest {
    /*
        子类对象实例化的全过程：
            1.从结果上来看：（继承性）
                子类继承父类以后，就获取了父类中声明的属性和方法，创建子类的对象时，在堆空间中就会加载所有父类中声明的属性
            2.从过程上看：
                当我们通过子类的构造器创建子类对象时，我们一定会直接或间接的调用其父类的构造器，进而调用父类的父类的构造器，
                一直到调用了Java.lang.Object类中空参的构造器为止，
                正因为加载过所有的父类的结构，所以才可以看到内存中有父类中的结构，子类对象才可以考虑进行调用

            要明确：虽然创建子类对象时，调用了父类的构造器，但是自始自终只创建了一个对象，即new的那个对象


     */
}
