package blackberry.Chapter9String.StringClass;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 11/15/20 21:48
 * Create By IntelliJ IDEA
 */
public class AboutString2 {

    public static void main (String[] args) {
        /**
         *  结论：常量和常量的拼接结果在常量池中，且常量池中不会存在相同内容的常量
         *      只要其中有一个是变量，结果就在堆中
         *      如果拼接的结果调用intern()方法，返回值就在常量池中
         */

        String s1 = "javaee";
        String s2 = "hadoop";
        String s3 = "javaeehadoop";
        String s4 = "javaee"+"hadoop";  //  这种链接的方式，相当于跟字面量是一样的
        //  有变量名参与的就不是在常量池了，在堆空间中去开辟
        String s5 = s1+"hadoop";
        String s6 = "javaee"+s2;
        String s7 = s1 + s2;

        //  测试intern()方法，此时s8使用的常量池中已经存在的
        String s8 = s5.intern ();

        //  ==比较地址
        System.out.println(s3 == s4);   // true
        System.out.println(s3 == s5);   // false
        System.out.println(s3 == s6);   // false
        System.out.println(s5 == s6);   // false
        System.out.println(s5==s7);     // false
        System.out.println(s6==s7);     // false
        //  此时返回true
        System.out.println(s3 == s8);
    }
}
