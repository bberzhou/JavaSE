package blackberry.Chapter9String.StringClass;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 11/17/20 20:13
 * Create By IntelliJ IDEA
 */
public class AboutString4 {
    /**
     *  String和基本数据类型转换
     *  字符串String---->基本数据类型、包装类：调用包装类的静态方法：paresXXX(str)
     *  基本数据类型、包装类---->字符串  String:  调用String重载的valueof(XXX)
     *
     *
     *  String 和char[] 之间的转换
     *  String --->char[]:调用String的toCharArray()
     *  char[] ---->String:调用String的构造器
     *
     *
     *  String 与byte[]之间的转换
     *  String ---->byte[]：调用String的getBytes()
     *  byte[]------>String:调用String的构造器
     *
     *  出现乱码的原因：编码和解码不同，编码和解码时使用的字符集应该一致
     *
     *
     *
     */
    public static void main (String[] args) throws UnsupportedEncodingException {
        String str1 = "123";
        int num = Integer.parseInt (str1);  //  123

        String str2 = String.valueOf (num);     // string 123

        System.out.println("----------");

        String str3 = "abc123";
        char[] a = str3.toCharArray ();
        for (int i = 0 ; i < a.length ; i++) {
            System.out.println(a[i]);
        }

        System.out.println("-------");
        char[] arr = {'a','c','f','d'};
        String sr = new String (arr);   //  调用构造器
        System.out.println(sr);     //  acfd
        System.out.println("-----------");

        //  小练习 ---- abc123 输出为 a21cb 3
        String str4 = "abc123";

        char[] arr1 = str4.toCharArray ();
        //  注意这里直接把 arr1的地址赋给arr2会出现错误
        char[] arr2 = new char[6];
        for (int i = 0 ; i < arr1.length ; i++) {
            arr2[i] = arr1[i];

        }
        int length = arr1.length;
        for (int i = 1 ; i <length-1 ; i++) {
            arr1[i] = arr2[length-i-1];
        }

        String sub = new String (arr1);
        System.out.println(sub);    //  a21cb3

        System.out.println("---------");

        String str = "abczhongguo";
        byte[] bytes = str.getBytes (); //  使用默认的字符集进行转换
        System.out.println(Arrays.toString (bytes));    //  [97, 98, 99, 122, 104, 111, 110, 103, 103, 117, 111]
        byte[] gbks = str.getBytes ("gbk"); //  GBK 两个字节对应一个汉字
        System.out.println(Arrays.toString (gbks));
    }
}
