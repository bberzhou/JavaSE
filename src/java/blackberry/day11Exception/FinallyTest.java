package blackberry.day11Exception;

import org.junit.Test;

import java.io.*;

/**
 * @Description: try-catch-finally中的finally使用
 * @author: bberzhou@gmail.com
 * @date: 6/28/20 11:25
 * Create By IntelliJ IDEA
 */
public class FinallyTest {
    /*
        try-catch-finally中的finally使用

        1.finally是可选的
        2.finally中声明的是一定会被执行的代码，
            即使catch中又出现了异常，try中有return语句，catch中有return语句等情况，
            finally中的代码还是会执行。
        3. 像数据库连接、输入输出流、网络编程Socket等资源，JVM是不能自动的回收的，需要
            手动的进行资源的释放。此时就需要声明在finally中。
        4。try-catch-finally 结果可以相互嵌套。

        体会1：使用try-catch-finally处理编译时异常，使得程序在编译时就不再报错，但是在运行时仍可能报错


       面试题目：
       final finally finalize 三者的区别
       throw throws
       Collection Collections
       String StringBuffer StringBuilder
       重写 重载
       结构不相似的：
       抽象类，接口
       == 、equals()
       sleep()、wait()


       使用说明：
        throw 和throws的区别：
        throw 表示抛出一个异常类的对象，生成异常对象的过程，声明在方法体内
        throws 属于异常处理的一种方式，声明在方法的声明处
     */


    // 测试
    @Test
    public void test2 () {
        FileInputStream fileInputStream = null;
        try {
            //  文件输入流，使用文件的绝对路径
            File file = new File ("/Users/zhouzhaojian/IdeaProjects/JavaSE/src/java/blackberry/day11Exception/hello.txt");
            fileInputStream = new FileInputStream (file);
            int data = fileInputStream.read ();
            while (data != -1) {
                System.out.print ((char) data);
                data = fileInputStream.read ();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace ();
        } catch (IOException e) {
            e.printStackTrace ();
        } finally {
            try {
                //  关闭连接
                fileInputStream.close ();
            } catch (IOException e) {
                e.printStackTrace ();
            }
        }

    }

    @Test
    public void testMethod () {
        //  调用method函数
        int num = method ();
        System.out.println (num);
        //  输出结果
        //  最后一定被执行的代码
        //  2
    }

    public int method () {
        try {
            int[] arr = new int[10];
            System.out.println (arr[10]);
            return 1;
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace ();
            return 2;
        } finally {
            System.out.println ("最后一定被执行的代码");
        }
    }


    @Test
    public void test () {
        try {
            int a = 10;
            int b = 0;
            System.out.println (a / b);
        } catch (ArithmeticException e) {//   算术异常
            //  捕获异常
            e.printStackTrace ();
        } finally {
            System.out.println ("最后一定会执行的代码");
        }
    }
}
