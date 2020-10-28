package blackberry.day7OOP1;

/**
 * @author bberzhou@gmail.com
 * @date 8/27/19 22:55
 * Create By IntelliJ IDEA
 */
public class override {
    public static void main (String[] args) {
        P p = new P ();
        p.run ();

        Per per = new Per ();
        per.run ();

        Per per1 = new P ();

        per1.run ();    // P.hello,实际类型为 p,引用类型为per,最后调用的还是p的方法

        Per per2 = new Per ();
//        per2.name = "kjjj";   这里就会报错，因为name字段是final修饰的，
        //  final修饰的成员遍历可以在创建对象的时候初始化，一旦初始化，随后就不可以修改


    }
}

//  class p extends Per
class P extends Per {
    //  重写父类的run 方法
    //  在继承关系中，子类如果定义了一个与父类方法名完全相同的方法，称为覆写(override)，
    /*
        方法重载(overload)：
            1。参数列表：被重载的方法必须改变参数列表
            2。返回类型：可以改变返回类型
            3。修饰符：可以改变修饰符
            4。异常：可以声明新的或者更广泛的异常
        方法重写(override)：
            1。参数列表：必须与被重写方法的参数列表完全相同
            2。返回类型：必须与超类中的被重写的方法中声明的返回类型或子类型完全相同
            3。访问级别：一定不能比被重写方法强，可以比被重写方法弱
            4。非检查异常：重写方法可以抛出任何非检查的异常，无论被重写方法是否查明了该异常
            5。检查异常：重写方法一定不能抛出新的异常
            6。不能重写标志为final,static 的方法

            重写是父类与子类之间多态性的一种表现，而重载是一个类中多态性的表现




        **  Java的实例方法调用是基于运行时的实际类型的动态调用，而非变量的声明类型。
            这个非常重要的特性在面向对象编程中称之为多态。它的英文拼写非常复杂：Polymorphic
            多态是指，针对某个类型的方法调用，其真正执行的方法取决于运行时期实际类型的方法。
            多态的特性就是，运行期才能动态决定调用的子类方法。对某个类型调用某个方法，执行的实际方法可能是某个子类的覆写方法。

            在子类的覆写方法中，如果要调用父类的被覆写的方法，可以通过super来调用

     */
    @Override
    public void run () {
//        System.out.println("P.hello");
        //  调用父类的被覆写的方法
        super.run ();

    }

    //  此处override就会报错，因为父类里面这个方法是final修饰的
    //  用final修饰的方法不能被Override，同理如果是希望一个类不被继承，也可以标记为final
    //  对于一个类的某个字段，同样可以使用final修饰符，用final修饰的字段在初始化之后不能被修改
//    @Override
//    public void Hello(){
//
//    }

}

class Per {
    public final String name = "unnamed";

    public void run () {
        System.out.println ("Per.hello");
    }

    public final void Hello () {
        System.out.println ("hello,我是Per");
    }
}
