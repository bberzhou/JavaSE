package blackberry.Chapter9String.StringBufferBuilder;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 11/17/20 21:33
 * Create By IntelliJ IDEA
 */
public class StringBufferTest {
    /**
     *  String、StringBuffer、StringBuilder三者的区别
     *  String:不可变的字符序列，底层使用char[] 进行存储
     *  StringBuffer:可变的字符序列，且是线程安全的，效率比较低。底层使用char[] 进行存储
     *  StringBuilder：可变的字符序列，但线程不安全，效率较高。JDK5.0新增。底层使用char[] 进行存储
     *
     *
     * 源码分析：
     * String str = new String();   //  new char[0]
     * String str1 = new String("abc");     //  new char[]{'a','b','c'};
     * StringBuffer sb1 = new StringBuffer();   //  new char[16];   底层创建了一个长度是16 的数组
     * sb1.append('a')
     */
}
