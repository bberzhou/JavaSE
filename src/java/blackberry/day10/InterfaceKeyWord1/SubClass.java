package blackberry.day10.InterfaceKeyWord1;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 5/31/20 10:40
 * Create By IntelliJ IDEA
 */
public class SubClass extends SuperClass implements Compa, Compa1 {
    //  因为Compa接口里面的方法有具体实现，所以不需要重写里面的方法

    @Override
    public void method () {
        System.out.println ("subClass：test");
    }

    @Override
    public void method3 () {
        System.out.println ("子类重写接口中的同名方法");
    }


    //  知识点5：在子类或（实现类）中的方法中调用父类、接口中被子类(或实现类)重写的方法
    public void myMethod () {

        method3 (); //  调用自己重写的方法
        //  当子类重写父类中的方法之后，可以使用super关键字调用父类中的方法
        super.method3 ();   //  调用父类中声明的方法

        // 使用接口名.super. 方法来调用接口中的默认方法
        Compa.super.method3 ();
        Compa1.super.method3 ();
    }
}
