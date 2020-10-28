package blackberry.day9OOP1.staticKeyword;

/**
 * @Description: static关键字的使用
 * @author: bberzhou@gmail.com
 * @date: 4/22/20 23:40
 * Create By IntelliJ IDEA
 */
public class StaticKeywordTest {
    /*
        1。static:静态的
        2。static可以用来修饰：属性、方法、代码快、内部类

        3。使用static修饰属性：静态变量或者也可以叫类变量(存在于方法区的静态域里面)
            属性按是否使用static修饰，可以分为：静态属性（静态变量）和非静态属性（实例变量）
            实例变量：创建了类的多个对象，每个对象都独立的拥有一套类中的非静态属性，
                    当修改其中一个对象中的非静态属性时，不会导致其他对象中同样的属性值被修改
            静态变量：创建的多个对象共享某一个静态变量。当通过某一个对象修改静态变量的时候，
                    会导致其他对象调用此静态变量的时候是被修改过了的

             static修饰属性的其他说明：
                1⃣️：静态变量随着类的加载而加载，可以通过"类.静态变量"的方式进行调用（所以称为类变量）
                2⃣️：同时静态变量的加载要早于对象的创建，先加载类，再创建对象
                3⃣️：由于类只会加载一次，则静态变量再内存中也只存在一份：存在方法区的静态域中
                4⃣️：      类变量         实例变量
                     类     yes          no(不能通过类调用实例变量)
                     对象    yes          yes

             静态属性(类调用)举例：System.out;Math.PI


        4。使用static修饰方法：静态方法
            1⃣️：随着类的加载而加载，可以通过"类.静态方法"的方式进行调用
            2⃣️：       静态方法         非静态方法
                类       yes             no
                对象      yes             yes
            3⃣️：静态方法中，只能调用静态的属性或方法；
                非静态方法中，既可以调用非静态的方法或属性，也可以调用静态的方法或属性


        5。static注意点：
            在静态的方法内，不能使用this关键字、super关键字，因为此时可能还没有对象，而this super都是基于当前对象的
            关于静态属性和静态方法的使用，都从类的声明周期的角度去理解


      总结：在开发中，如何确定一个属性是否需要声明为static的？

            属性是可以被多个对象所共享的，不会随着对象的不同而不同
            类中的常量也常常声明为static的
           在开发中，如何确定一个方法是否需要声明为static的？

             当类中有静态属性时，操作静态属性的方法就可以设置为静态的
             工具类中的方法，习惯上声明为static的，可以直接调用，不用new 对象，比如：Math Arrays Collections等工具类




     */

    public static void main (String[] args) {
        Chinese c1 = new Chinese ();
        c1.name = "姚明";
        c1.age = 40;

        Chinese c2 = new Chinese ();
        c2.name = "马龙";
        c2.age = 35;
        //  c1对象设置nation属性值为CH
        c1.nation = "CH";
        //  c2对象调用nation，输出 CH
        System.out.println (c2.nation);

//        Chinese.name = "张继科"; 通过类调用实例变量报错

        String nation = Chinese.nation;    //  通过类调用静态变量，

        Chinese.show ();    //  通过类来调用静态方法
//        Chinese.eat();    //  不能通过类调用非静态方法
    }
}
