package blackberry.day9Api;

import java.io.UnsupportedEncodingException;

/**
 * @author bberzhou@gmail.com
 * @date 8/28/19 20:09
 * Create By IntelliJ IDEA
 */
public class AboutString {
    /*
        在Java中，String是一个引用类型，它本身也是个class,
        Java编译器对String有特殊处理，即可以直接用"..."来表示一个字符串

     */

    public static void main (String[] args) throws UnsupportedEncodingException {
        String h = "hello";
        //实际上字符串在String内部是通过一个char[]数组表示的
        String h1 = new String (new char[]{'h', 'e', 'l', 'l', 'o'});
        System.out.println (h1);
        String s = h.toUpperCase ();
        System.out.println (s);      //  HELLO
        System.out.println (s == h);    //     false
        System.out.println (s.equals (h));// false

        String s2 = "hello";
        String s3 = "hello";
        //  从表面上看，两个字符串用==和equals()比较都为true，
        //  但实际上那只是Java编译器在编译期，会自动把所有相同的字符串当作一个对象放入常量池，
        //  自然s1和s2的引用就是相同的，所以两个字符串比较必须使用equals方法，
        //  如果需要忽略大小写比较，就可以使用equalsIgnoreCase()方法
        System.out.println (s2 == s3); //  true
        System.out.println (s2.equals (s3)); //  true


        //  String类还提供了多种方法来搜索子串、提取子串。

        int i = h.indexOf ("l");
        System.out.println (i);      // 2
        //  提取子串 substring() 可以传入一个（从哪一个开始截取）或者两个参数（截取一段）
//        使用trim()方法可以移除字符串首尾空白字符。空白字符包括空格，\t，\r，\n：，
        //  trim()并没有改变字符串的内容，而是返回了一个新字符串
        //  strip()方法也可以移除字符串首尾空白字符。它和trim()不同的是，类似中文的空格字符\u3000也会被移除
        //  String还提供了isEmpty()和isBlank()来判断字符串是否为空和空白字符串：
        "".isEmpty ();  //true
        "   ".isEmpty ();//false


//        要在字符串中替换子串，有两种方法。一种是根据字符或字符串替换：
        String st = "hello";
        st.replace ('l', 'w'); // "hewwo"，所有字符'l'被替换为'w'
        st.replace ("ll", "~~"); // "he~~o"，所有子串"ll"被替换为"~~


//        要把任意基本类型或引用类型转换为字符串，可以使用静态方法valueOf()。这是一个重载方法，编译器会根据参数自动选择合适的方法
        String.valueOf (123); // "123"
        String.valueOf (45.67); // "45.67"
        String.valueOf (true); // "true"
        String.valueOf (new Object ()); // 类似java.lang.Object@636be97c


//        要把字符串转换为其他类型，就需要根据情况。例如，把字符串转换为int类型：其他同理
        int n1 = Integer.parseInt ("123");  //  int 类型的123
        int n2 = Integer.parseInt ("ff", 16); //  按十六进制转换

//        String和char[]类型可以互相转换，方法是：

        char[] cs = "Hello".toCharArray (); // String -> char[]
        String stri = new String (cs); // char[] -> String

        byte[] bytes = "hello".getBytes ("UTF-8");
        System.out.println (bytes);  //  [B@266474c2

//        Java的String和char在内存中总是以Unicode编码表示。


    }
}
