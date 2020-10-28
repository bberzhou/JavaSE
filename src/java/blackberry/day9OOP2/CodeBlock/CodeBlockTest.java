package blackberry.day9OOP2.CodeBlock;

/**
 * @Description: 代码块
 * @author: bberzhou@gmail.com
 * @date: 4/24/20 11:22
 * Create By IntelliJ IDEA
 */
public class CodeBlockTest {
    /*
        类的成员之四：代码块（初始化块）
            代码块就是 { } static{}
        1。代码块的作用：用来初始化类、对象
        2。代码块如果有修饰的话，只能使用static。
        3。根据有没有static可以分为静态代码块和非静态代码块
                //  静态代码块,就是一个 static{ }
            static {
                    System.out.println("hello,static code block");
                }
                //  非静态代码块
                    {
                    System.out.println("hello,非静态代码块");
                }

        4。静态代码块
                内部可以有输出语句
                随着类的加载而执行，并且只执行一次，就是在类加载的时候
                作用：在类加载的时候，对static类型的属性进行赋值



        5。非静态代码块
                内部可以有输出语句
                随着对象的创建而执行
                每创建一个对象，就会执行一次非静态代码块
                作用：可以在创建对象时，对对象的属性进行初始化
                如果一个类中定义了多个静态代码块，则按照声明的先后顺序进行执行
                静态代码块的执行要优先与非静态代码块
                在静态代码块里面只能调用静态的方法和属性，不能调用非静态的结构



        对属性可以赋值的位置有：
            1。默认初始化
            2。显式初始化
            3。构造器中初始化
            4。有了对象以后，可以通过 "对象.属性"或者"对象.方法(set)"方法进行赋值
            5。在非静态代码块中赋值
            如果一个类中定义了多个非静态代码块，则按照声明的先后     顺序进行执行
            在非静态的代码块里面，既可以调用静态属性和方法也可以调用非静态的属性和方法




     */
    public static void main (String[] args) {
        String des = People.describe;
        //  类加载的时候就执行了这个静态代码块

        People p1 = new People ();
        /*
            hello,static code block
            hello,非静态代码块
         */

        People p2 = new People ();
        /*
            hello,static code block
            hello,非静态代码块
            hello,非静态代码块
         */
        System.out.println (p2.age);     //  p2.age = 1;
        System.out.println (People.describe);    //   我是静态代码块中的人


    }
}
