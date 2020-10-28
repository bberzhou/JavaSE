package blackberry.day8OOP1.Execise;

/**
 * @Description: 继承成员变量和继承方法的区别
 * @author: bberzhou@gmail.com
 * @date: 4/17/20 21:34
 * Create By IntelliJ IDEA
 */
public class FieldMethodTest {
    public static void main (String[] args) {
        Sub sub = new Sub ();
        System.out.println (sub.count);  //  20
        sub.display ();     //  20
        Base base = sub;    //  将子类sub的一个对象赋值给父类的一个引用：多态性
        //  == 对于引用数据类型来讲，比较的是两个引用数据类型变量的地址值是否相同
        System.out.println (base == sub);    //  true
        System.out.println (base.count);     //  多态性不适用于属性，此时左边是Base类，所以调用的count是base类中的count

        //  方法可以被重写，但是属性不能被重写
        //  注意：多态性，由于Base base = sub; 此时调用子父类中都有的方法时，是执行的子类中重写的方法
        base.display ();    //  20

        /*
            总结：1。如果子类重写了父类的方法，就意味着子类里面定义的方法彻底覆盖了父类里面的同名方法
                 系统将不可能把父类里的方法转移到子类中去。base.display ()就是调用的重写的同名方法
                    编译看左边，运行看右边
                 2。对于实例变量(属性)则不存在这样的对象，即使子类里面定义了与父类完全相同的实例变量，
                 这个实例变量依然不可能覆盖父类中定义的实例变量，比如(count)，调用时，声明的是谁调用的就是谁的
                    编译运行看左边


         */
    }
}
