package blackberry.day8OOP3.WrapperClass;

import org.junit.Test;

/**
 * @Description: 包装类测试
 * @author: bberzhou@gmail.com
 * @date: 4/21/20 15:24
 * Create By IntelliJ IDEA
 */
public class WrapperClassTest {
    /*
        java类的使用：
        1。Java提供了8中基本的数据类型对应的包装类，使得基本数据类型的变量具有类的特征
            byte        Byte
            short       Short
            int         Integer
            double      Double
            long        Long
            float       Float
            boolean     Boolean
            char        Character
         2.主要掌握：基本数据类型、包装类，String三者之间的相互转换
     */


    //  问题一：基本数据类型如何转换为包装类:调用包装类的构造器
    @Test
    public void test1 () {
        int num1 = 10;
        //  将num1 利用包装类的构造器装箱操作
        Integer integer = new Integer (num1);
        System.out.println (integer.toString ());    //  输出 10

        Integer integer1 = new Integer ("123");
        System.out.println (integer1.toString ());   //  输出  123
//        Integer integer2 = new Integer ("123abc");
//        System.out.println(integer2.toString ()); //  "123abc"这种就会报错
        Float fl = new Float (12.3f);
        System.out.println (fl); //  12.3
        Float f2 = new Float ("12.3");
        System.out.println (f2);     //  12.3

        Boolean b1 = new Boolean (true);
        Boolean b2 = new Boolean ("tRue");
        System.out.println (b2); //  输出 true

        Boolean b3 = new Boolean ("true123");
        //  return ((s != null) && s.equalsIgnoreCase("true"));忽略大小写和true相同就可以了
        System.out.println (b3); //  输出 false


    }

    //  问题二：包装类---->基本数据类型：调用包装类的XXXValue()方法

    @Test
    public void test2 () {
        Integer integer = new Integer (12);
        int i = integer.intValue ();
        System.out.println (i);  //  此时i 就是一个int 类型的变量 12

        Float f1 = new Float (12.3);
        float f = f1.floatValue ();
        System.out.println (f);  //  12.3
    }


    //  问题三：将基本数据类型，转换成包装类之后，传入到方法做参数
    @Test
    public void test3 () {
        /*
            JDK5.0的时候，增加了一个新特性：自动拆箱和装箱
         */
        int num = 10;
        //  这里的num本来是不可以作为参数传入的，这里显示把num转换成Integer类型的,这就是自动装箱
        method (num);

        //  自动装箱：基本数据类型----->包转类
        int num2 = 20;
        Integer integer = num2; //  自动装箱，把一个基本数据类型赋值给一个对象

        boolean bool = true;
        Boolean b2 = bool;

        //  自动拆箱：包装类------>基本数据类型
        int num3 = integer;     //  自动拆箱，将integer对象赋值给一个基本数据类型num3


    }

    //  method方法需要传入一个对象
    public void method (Object o) {

    }

    //  问题四：基本数据类型、包装类---->String类型：调用String重载的valueOf（XXX XXX）

    @Test
    public void test4 () {
        //  将基本数据类型转换为String，
        //  方式一：连接运算，在后面加一个 ""
        int num1 = 10;
        String str = num1 + "";

        //  方式二：调用String重载的valueOf（XXX XXX）
        float f1 = 12.3f;
        String st1 = String.valueOf (f1);    //  此时s = "12.3"
        Double d1 = new Double (12.4);
        String st2 = String.valueOf (d1);
        System.out.println (st1);    //  12.3
        System.out.println (st2);    //  12.4


    }

    //  问题五：String类型------>基本数据类型、包装类：调用包装类的parseXXX(XXX)，比如parseBoolean parseInt
    @Test
    public void test5 () {
        String str1 = "123";
        //  注意这里不能使用强转
//        int i = (int) str1;
        int i = Integer.parseInt (str1);
        System.out.println (i);  //  123
        //  可能会报NumberFormatException的错误
        String str2 = "true";
        boolean b = Boolean.parseBoolean (str2);
        System.out.println (b);  //  true

        String str3 = "true1";
        boolean b1 = Boolean.parseBoolean (str3);
        System.out.println (b1); //  false,因为str3不是一个标准的true 或者false

    }


}
