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
     * String str = new String();   //  char value = new char[0]
     *
     * String str1 = new String("abc");     //  char value = new char[]{'a','b','c'};
     * StringBuffer sb1 = new StringBuffer();   //  char[] value = new char[16];   底层创建了一个初始长度是16 的数组
     * system.out.println(sb1.length());    //  0
     * sb1.append('a');  //  value[0] = 'a';
     * sb1.append('b'); // value[1] = 'b';
     *
     * StringBuffer  sb2 = new StringBuffer("abc"); //  char[] value = new char["abc".length+16]
     *
     *
     * 问题1。system.out.println(sb2.length());    //  3   ，底层代码有一个count
     * 问题2。扩容问题：如果要添加的数据底层数组放不下了，那就需要扩容底层的数组
     *      默认情况下，扩容为原来容量的2倍+2，同时将原有数组中的元素复制到新的数组中
     *
     *      意义：如果开发中需要使用StringBuffer时，可以优先使用StringBuffer(int capacity)这个构造器，
     *          指定底层数组的长度或者StringBuilder(int capacity)
     *
     *     常用的方法
     *     StringBuffer append(XXX):提供了很多的append()方法，用于进行字符串拼接
     *     StringBuffer delete(int start,int end)
     *     StringBuffer replace(int start,int end, String str):把[start,end)位置替换为str
     *     StringBuffer insert(int offset,XXX):在指定位置插入XXX
     *     StringBuffer reverse():把当前字符序列逆转
     *
     *     总结：
     *     增：append(XXX)
     *     删：delete(int start,int end)
     *     改：setCharAt(int n,char ch)   /replace(int start, int end,String str)
     *     查：charAt(int index)
     *     插：insert(int offset,XXX)
     *     长度：length();
     *     遍历：fori
     *
     */

    public static void main (String[] args) {
        StringBuffer sb1 = new StringBuffer ();
        System.out.println(sb1.length ());  //  0   在底层有一个count用来记录字符数组里面的实际个数The count is the number of characters used.
        sb1.append (2);
        sb1.append ('d');
        System.out.println(sb1);
        sb1.reverse ();
        System.out.println(sb1);
    }
}
