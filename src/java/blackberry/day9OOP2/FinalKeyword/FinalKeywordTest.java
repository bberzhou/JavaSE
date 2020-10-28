package blackberry.day9OOP2.FinalKeyword;

import blackberry.day9OOP2.CodeBlockExe.Leaf;

/**
 * @Description: final关键字
 * @author: bberzhou@gmail.com
 * @date: 4/25/20 13:20
 * Create By IntelliJ IDEA
 */
public class FinalKeywordTest {
    /*
        final：最终的
        1。final可以用来修饰的结构：类、方法、变量
        2。final用来修饰一个类，就表示此类是最后一个类，不能再被继承了，即没有子类，此类不能被其他类继承
            比如：String类、system类、StringBuffer类，
        3。final用来修饰方法：表明此方法不可以被重写了
            比如：Object类中的getClass()方法，
        4。final用来修饰一个变量：表明此变量就变为一个常量
            4.1 final修饰一个属性：可以考虑赋值的位置有：显式初始化，代码块中初始化、构造器中初始化
            4.2 final修饰局部变量：尤其是使用final修饰形参时，表明此形参是一个常量。
                        当我们调用此方法时，给常量形参赋一个实参，一旦赋值以后，就只能使用此形参，不能进行重新赋值


        static final：用来修饰属性和方法，当修饰属性时：全局常量


     */


    final int LEFT;
    final int RIGHT;

    //  代码块中给final变量赋值
    {
        LEFT = 1;
    }

    //  通过构造器给final修饰的变量赋值
    public FinalKeywordTest () {
        RIGHT = 2;
    }

    public FinalKeywordTest (int n) {
        RIGHT = n;
    }

    //    final int down;

    //  不可以通过方法给变量赋值，是因为当创建一个对象时，构造器就会对一个对象的属性进行初始化，
    //  而调用方法去赋值，此时final修饰的变量还没有被赋值。
    //  不可以通过方法给final 修饰的变量赋值
//    public void setDown(int down){
//        this.down = down;
//    }

    //  final修饰方法体里面的变量
    public void show () {
        final int NUM = 10;     // 常量
//        NUM += 20;            //  此时就不可以修改此常量
    }

    //  final 修饰形参，当形参是一个final修饰的时候，当调用时传入实参之后，就不能再在方法体的内部进行修改
    public void show1 (final int num) {
//        num += 20;
//        num = 20;         //   此时就不能再修改传入的实参
        System.out.println (num);
    }


    final int Width = 10;   //  这就是显式的初始化

    public void doWidth () {
//        Width = 20;       此时就不能声明一个值给final修饰的变量

    }

}
//final class A{
//
//}
//class B extends A{
//
//}
//class AA{
//    public final void show(){
//
//    }
//}
//class BB extends AA{
//
//    public void show(){       此时就会报错
//
//    }
//}