package blackberry.day7OOP1;

/**
 * @author bberzhou@gmail.com
 * @date 8/28/19 10:31
 * Create By IntelliJ IDEA
 */
public interface TestInterface {
    //          在接口里面定义的静态字段
    public static final int MAl = 1;
    //    因为interface的字段只能是public static final类型，所以我们可以把这些修饰符都去掉，
//    上述代码可以简写为,编译器会自动把该字段变为public static final类型。
    int Fa = 3;
    /*
        在抽象类中，抽象方法本质上是定义接口规范：即规定高层类的接口，
        从而保证所有子类都有相同的接口实现，这样，多态就能发挥出威力。
        如果一个抽象类没有字段，所有方法全部都是抽象方法，就可以把该抽象类改写为一个接口：interface

        因为接口定义的所有方法默认都是public abstract的，所以这两个修饰符不需要写出来
        当一个具体的class去实现interface时就需要implements关键字

        抽象类和接口的对比：
                        abstract class              interface
       继承            只能extends一个class        可以implements多个interface
       字段            可以定义实例字段               不能定义实例字段
       抽象方法         可以定义抽象方法               可以定义抽象方法
       非抽象方法       可以定义非抽象方法            可以定义default方法

       在使用的时候，实例化的对象永远只能是某个具体的子类，但总是通过接口去引用它，因为接口比抽象类更抽象
       接口也是数据类型，适用于向上转型和向下转型；


     */

    void Show ();

    void Run ();

    //     在接口里面，可以定义default方法，实现类可以不必覆写default方法。
//     default方法的目的是，当我们需要给接口新增一个方法时，会涉及到修改全部子类。
//     如果新增的是default方法，那么子类就不必全部修改，只需要在需要覆写的地方去覆写新增方法。
//    default方法和抽象类的普通方法是有所不同的。因为interface没有字段，
//    default方法无法访问字段，而抽象类的普通方法可以访问实例字段。
    default void Tes () {
        System.out.println ("hello");
    }

}

interface Air extends TestInterface {
    //  一个接口可以继承自另外一个interface,此时Air相当于有三个抽象方法其中两个来自继承的TestInterface的接口
    String getName ();
}