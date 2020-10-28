package blackberry.day8OOP1.instanceofKeyword;

import java.util.Date;

/**
 * @Description: instance of 关键字
 * @author: bberzhou@gmail.com
 * @date: 4/17/20 16:09
 * Create By IntelliJ IDEA
 */
public class InstanceOfTest {
    /*
        instanceof 关键字
        有了对象的多态性以后，内存中实际上是加载了子类特有的属性和方法的，
        但是由于变量声明为父类类型，导致在编译的时候只能调用父类中声明的属性和方法。
        子类特有的属性和方法不能调用

        那么有多态性的对象如何调用子类所特有的属性和方法？

     */
    public static void main (String[] args) {
        //
        Person p1 = new Man ();
        p1.eat ();
//        p1.makeMoney(); 此时不能调用子类里面特有的方法，因为在编译的时候就是person类型的
        p1.name = "tom";//  这里因为person类有这个属性
        //  可以进行强制转换，向下进行转型,但是转换的时候可能会有风险出现异常
        Man m1 = (Man) p1;
        m1.makeMoney ();



        /*
            为了避免出现转型时候出现异常，引入了instanceof
            instanceof关键字的使用
            a instanceof A：判断对象a是否是类A的实例，如果是返回true,如果不是，返回false
            使用情景：为了避免在向下转型的时候，出现ClassCastException的异常，
            在向下转型之前，先进行instanceof的判断，一旦返回true，就进行向下转型，如果返回false，不进行向下转型

            如果a instanceof A 返回true，且a instanceof B 也返回一个true，
            那么类B就是类A的父类

        */
        if (m1 instanceof Person) {
            //  执行instanceof检查成功
            System.out.println ("instanceof检查成功");
        }
        if (m1 instanceof Object) {
            System.out.println ("-----------object");
        }

        //  问题一：编译时通过，运行时不通过:java.lang.ClassCastException
//        Person p2 = new Woman ();
//        Man m2 = (Man)p2;

        // 问题一：编译时通过，运行时不通过
//        Person p3 = new Person ();
//        Man m3 = (Man)p3;

        //  问题二：编译通过，运行时也通过
        Object obj = new Woman ();
        Person p = (Person) obj;

        //  问题三：编译不通过，运行更不通过,类型不匹配
//        Man m4 = new Woman ()；

        //  但是可以利用多态骗过编译器，同时利用强转向下转型,运行时同样会报错，java.lang.ClassCastException
//        Object object = new Date ();
//        String  str = (String) obj;

        //  向上转型：多态   向下转型：使用instanceof关键字进行判断


    }
}
