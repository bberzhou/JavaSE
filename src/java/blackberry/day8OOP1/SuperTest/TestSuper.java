package blackberry.day8OOP1.SuperTest;

/**
 * @Description: 测试super关键字
 * @author: bberzhou@gmail.com
 * @date: 4/14/20 23:35
 * Create By IntelliJ IDEA
 */
public class TestSuper {
    /*
        super关键字的使用
            1。super理解为： 父类的
            2。super可以用来调用：属性、方法、构造器
            3。super的使用：调用属性和方法
                1.可以在子类的方法或构造器中，通过使用"super".属性或"super.方法"的方式，
                    显式的调用父类中声明的属性或方法，但是通常情况下都会省略掉super.
                2。特殊的情况，当子类和父类有同名的属性时，我们如果想要在子类中调用父类中声明的属性，
                    就必须显式的使用"super.属性"和"super.方法"进行调用，表示调用的是父类的属性和方法

                3。当子类重写父类中的方法以后，如果想在子类中调用父类中被重写的方法时，
                    必须显式的使用"super.方法"的方式，表明调用的是父类中被重写的方法

            4。super的使用：调用构造器
                1。可以在子类的构造器中显式的使用"super(形参列表)"的方式，调用父类中声明的指定的构造器
                2。"super(形参列表)"的使用，必须声明在子类构造器的首行
                3。我们在类的构造器中，针对于"this(形参列表) 本类中的构造器"或"super(形参列表)父类中指定的构造器"只能选一个
                4。在构造器的首行，没有显式的声明"this(形参列表)"或"super(形参列表)，则默认调用的父类中空参的构造器：super();
                5。在类的多个构造器中，至少有一个类的构造器中使用了"Super()"，调用父类中的构造器

     */
    public static void main (String[] args) {
        Student student = new Student ();
        //  此时输出的id就是子类的id值，那么如果想调用父类的id就需要使用super关键字  id= 1002

        //  super  id = 1001
        student.show ();
        //  此时study()方法里面调用的eat方法实际上是子类自己的方法 学生吃有营养的食物
        //  当使用super.eat()时候就是使用的父类eat方法,输出  人：吃饭
        student.study ();

        //  通过super调用构造器,name=Tom,age21,major software
        Student student1 = new Student ("Tom", 21, "software");
        student1.show ();
        System.out.println ("**********************");
        //  创建一个新的student对象来验证空参super调用构造器
        Student student2 = new Student ();  //我是空参构造器

    }

}
