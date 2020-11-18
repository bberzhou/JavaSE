package blackberry.Chapter9String.StringClass;

import org.junit.Test;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 11/15/20 19:53
 * Create By IntelliJ IDEA
 */
public class AboutString {
    /**
     *  String是一个final类，代表不可变的字符序列
     *  字符串是常量，用双引号引起来表示。 它们的值在创建之后不能更改
     *  String对象的字符内容是存储在一个字符数组value[]中的
     *  String的使用
     */

    /**
     *  String:字符串，使用一对""引起来表示
     *  1。string声明为final的，不可被继承
     *  2。string实现了serializable接口：表示字符串是支持序列化的
     *  3。string内部定义了final char[] value用于存储字符串数据--->即不可修改
     *  4。string：代表不可变的字符序列
     *      提现：1.当对字符串重新赋值时，需要重新指定内存区域赋值，不能使用原有的value进行赋值
     *          2。当对现有的字符串进行连接操作时，也需要重新指定内存区域值。不能使用原有的value进行赋值
     *          3.当调用String的replace()方法修改指定字符或字符串时，也需要重新指定内存区域值。不能使用原有的value进行赋值
     *  5。通过字面量的方式（区别于new）给一个字符串赋值，此时的字符串声明在字符串常量池中
     *  6。字符串常量池中是不会存储相同内容的字符串的
     */
    @Test
    public void test(){
        String s1 = "abc";  //  字面量的定义方式
        String s2 = "abc";
//        s1 = "hello";

        System.out.println(s1 == s2);   //  比较s1和s2的地址值  false，如果上面一行注释就是true
        //  当给s1重新赋值时，实际上是在常量池里面重新开辟一点空间，然后把地址给s1
        System.out.println(s1); //  hello
        System.out.println(s2); //  abc

        System.out.println("------------");

        String s3="abc";
        s3 += "def";
        System.out.println(s3); //  abcdef    在现有的字符串上面去加也不是在原来的 abc上面加

        System.out.println(s2); // 还是abc

        System.out.println("------------");

        String s4 = "abc";
        String s5 = s4.replace ('a','c');
        System.out.println(s4); //  abc
        System.out.println(s5); //  cbc 此时修改之后，s4还是abc  s5 变成了 cbc



    }



















}
