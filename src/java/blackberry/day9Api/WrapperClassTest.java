package blackberry.day9Api;

/**
 * @author bberzhou@gmail.com
 * @date 8/29/19 10:42
 * Create By IntelliJ IDEA
 */
public class WrapperClassTest {
    /*
        Java的数据类型：
            基本数据类型: byte,char,short,int,long,boolean,float,double
            引用数据类型: 所有的class(如：String类)和interface类型
            引用类型可以赋值为null,表示空，但是基本类型不能赋值为null

     */
    public static void main (String[] args) {
        String s = null;
//        int n = null;     基本数据类型赋值为null，就会报错


//        想要把int基本类型变成一个引用类型，我们可以定义一个Integer类，
//        它只包含一个实例字段int，这样，Integer类就可以视为int的包装类（Wrapper Class）

        /*
            java核心库里面每种基本类型对应的包装类型
            基本类型                        对应的引用类型
            boolean                     java.lang.Boolean
            byte                        java.lang.Byte
            short                       java.lang.Byte
            int                         java.lang.Integer
            long                        java.lang.Long
            float                       java.lang.Float
            double                      java.lang.Double
            char                        java.lang.char

         */

        int i = 100;
        // 通过new操作符创建Integer实例(不推荐使用,会有编译警告):
        Integer n1 = new Integer (i);
        // 通过静态方法valueOf(int)创建Integer实例:
        Integer n2 = Integer.valueOf (i);
        // 通过静态方法valueOf(String)创建Integer实例:
        Integer n3 = Integer.valueOf ("100");
        System.out.println (n3.intValue ());


        int i1 = 100;
        Integer n = Integer.valueOf (i1);

        int x = n.intValue ();


        Integer integer = 100; // 编译器自动使用Integer.valueOf(int)
        int x1 = integer; // 编译器自动使用Integer.intValue()
        //  这种直接把int变为Integer的赋值写法，称为自动装箱（Auto Boxing），反过来，把Integer变为int的赋值写法，称为自动拆箱（Auto Unboxing
        //  自动装箱和自动拆箱只发生在编译阶段，目的是为了少写代码。

        //  所有的包装类型都是不变类，一旦创建了Integer对象，该对象就是不变的，
        //  对两个Integer实例不能使用 == 比较，因为Integer是引用类型，必须使用equals()比较：
        //  Integer类本身还提供了大量方法，例如，最常用的静态方法parseInt()可以把字符串解析成一个整数
        //  所有的整数和浮点数的包装类型都继承自Number，因此，可以非常方便地直接通过包装类型获取各种基本类型

    }
}
