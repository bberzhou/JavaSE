package blackberry.day10.InterfaceKeyWord1;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 5/31/20 10:41
 * Create By IntelliJ IDEA
 */
public class SubClassTest {
    public static void main (String[] args) {
        SubClass subClass = new SubClass ();
        //  知识点2：1。通过接口的实现类对象调用接口里面的默认方法
        //          2。如果实现类重写了接口中的默认方法，调用时仍然是重写以后的方法
        subClass.method ();     //  subClass：test

        // 知识点1：接口中定义的静态方法，只能通过接口来调用
        Compa.method1 ();

        //  子类继承父类，同时父类和接口中有同名的方法
        //  知识点3：如果子类(或实现类)继承的父类和实现的接口中声明类同名同参数的方法，
        //  那么子类在没有重写此方法的情况下，默认调用的是父类中的那一个--->类优先原则

//        subClass.method3 ();    //SuperClass method3

        //  知识点4：如果subClass实现了多个接口，并且多个接口中定义了同名同参数的方法，
        //  如果subClass实现类没有重写此方法的话，就会报错----->这称为接口冲突
        //  因此必须在实现类中去重写这个重名的方法
    }
}
