package blackberry.Chapter9String.SystemClass;

import org.junit.Test;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 11/30/20 20:47
 * Create By IntelliJ IDEA
 */
public class aboutSystem {
    /**
     *  其他常用类的使用：
     *  1。System
     *  2。Math
     *  3。BigInteger 和BigDecimal
     *  系统类：系统级的很多属性和控制方法都放置在该类的内部。该类位于java.lang包下面
     *          该类的构造器是private的，所以无法创建该类的对象，也就是无法实例化该类
     *          内部的成员变量和成员方法都是static的，所以也可以很方便的进行调用
     *
     *     System类内部包含in、out、err三个成员变量，分别代表标准输入流、标准输出流和标准错误输出流
     *
     */

    //  System类相关测试
    @Test
    public void test(){
        String javaVersion = System.getProperty ("java.version");
        System.out.println(javaVersion);
        String javaHome = System.getProperty ("java.home");
        System.out.println(javaHome);
        String osName = System.getProperty ("os.name");
        System.out.println(osName);
        String osVersion = System.getProperty ("os.version");
        System.out.println(osVersion);
        String userName = System.getProperty ("user.name");
        System.out.println(userName);
        String userHome = System.getProperty ("user.home");
        System.out.println(userHome);
        /**
         *  1.8.0_181
         *  /Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre
         *  Mac OS X
         *  10.15.7
         *  zhouzhaojian
         *  /Users/zhouzhaojian
         */
    }


    /**
     *  java.lang.Math提供了一系列静态方法用于科学计算，其方法的参数和返回值类型一般为double类型
     *  abs     绝对值
     *  sin cos tan acos asin   三角函数
     *  sqrt    平方根
     *  pow(double a ,double b)， a的b次幂
     *  exp   e 为底指数
     *  max(double a,double b)
     *  min(double a,double b)
     *  random()  返回0.0到1.0的随机数
     */


    /**
     *  BigInteger：可以表示不可变的任意精度的整数
     *  和 BigDecimal：支持不可变的，任意精度的有符号十进制定点数
     */
}
