package blackberry.Chapter15Reflection;

/**
 * @author bberzhou@gmail.com
 * @date 8/30/19 17:14
 * Create By IntelliJ IDEA
 */
public class AboutReflect {
    /*
        1、反射就是Reflection,Java的反射是指程序在运行期，可以拿到一个对象的所有信息
            反射是为了解决在运行期，对某个实例一无所知的情况下，如何调用其方法，
            借助反射能够直接操作任意对象的内部属性和方法

        2、重点：
            1、理解Class类并获取Class实例
            2、创建运行时类的对象
            3、调用运行时类的指定结构
            4、反射的应用：动态代理


        3、Java反射机制提供的功能
            在运行时判断任意一个对象所属的类
            在运行时构造任意一个类的对象
            在运行时判断任意一个类所具有的成员变量和方法
            在运行时获取泛型信息
            在运行时调用任意一个对象的成员变量和方法
            在运行时处理注解
            生成动态代理

         4、反射相关的主要API
            java.lang.Class：代表一个类
            java.lang.reflect.Method：代表类的方法
            java.lang.reflect.Filed：代表类的成员变量
            java.lang.reflect.Constructor:代表类的构造器


     */

    public static void main (String[] args) throws ClassNotFoundException {
        Number n = new Double (12.22);  //  ok
//        class（包括interface）的本质是数据类型(Type)，无继承关系的数据类型无法赋值

//        String s = new Double (123.22); //  报错,这里没有继承关系

//        当JVM加载String类时，它首先读取String.class文件到内存，然后，为String类创建一个Class实例并关联起来
//        Class cl = new Class(String);
        /*
            由于JVM为每个加载的class创建了对应的Class实例，并在实例中保存了该class的所有信息，
            包括类名、包名、父类、实现的接口、所有方法、字段等，
            因此，如果获取了某个Class实例，我们就可以通过这个Class实例获取到该实例对应的class（类）的所有信息。
            这种通过Class实例获取class信息的方法称为反射（Reflection）
         */

        //  获取一个class的Class实例，

        //  方法一：直接通过一个class的静态变量获取
        Class cl = String.class;
        System.out.println (cl); //  class java.lang.String


        //  方法二：如果我们有一个实例变量，可以通过该实例变量提供的getClass()方法获取
        String s = "hello";
        Class cls = s.getClass ();
        System.out.println (cls);    //class java.lang.String

        //  方法三：如果知道一个class的完整类名，可以通过静态方法Class.forName()获取
        Class cla = Class.forName ("java.lang.String");
        System.out.println (cla);    //  class java.lang.String


    }


}
