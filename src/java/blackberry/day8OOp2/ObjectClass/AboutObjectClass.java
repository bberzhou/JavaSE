package blackberry.day8OOp2.ObjectClass;

import java.util.Objects;

/**
 * @Description: Object类
 * @author: bberzhou@gmail.com
 * @date: 4/19/20 21:27
 * Create By IntelliJ IDEA
 */
public class AboutObjectClass {
    private int age;

    /*
        java.lang.Object 类
        1。Object类是所有Java类的父类
        2。如果在类的声明中未使用extends关键字指明其父类，则默认父类为java.lang.Object
        3。Object类中的功能(属性、方法)就具有通用性
            没有属性
            方法：equals()/toString() /getClass()/ hashCode()/finalize()
        4。Object类中只有一个空参构造器



        可以通过System.gc()或者Runtime.getRuntime().gc()来通知系统进行垃圾回收，

      */
    //  带参构造器
    public AboutObjectClass (int age) {
        this.age = age;
    }

    public AboutObjectClass () {

    }

    //  重写Object类的equals()方法,：比较两个对象的实体内容是否相同
//    @Override
//    public boolean equals (Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj instanceof AboutObjectClass) {
//            AboutObjectClass aboutObjectClass = (AboutObjectClass) obj; //向下转型
//            //  比较两个对象的每个属性是否都相同，不是比较两个对象的地址是否相同
//            if (this.age == aboutObjectClass.age) {
//                return true;
//            } else {
//                return false;
//            }
//        }
//        return false;
//    }


    //  自动生成重写equals()方法
    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || getClass () != o.getClass ()) return false;
        AboutObjectClass that = (AboutObjectClass) o;
        return age == that.age;
    }


}
