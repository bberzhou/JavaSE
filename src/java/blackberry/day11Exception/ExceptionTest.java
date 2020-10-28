package blackberry.day11Exception;

import org.junit.Test;

import java.util.Date;

/**
 * @Description: java中的异常
 * @author: bberzhou@gmail.com
 * @date: 6/27/20 11:21
 * Create By IntelliJ IDEA
 */
public class ExceptionTest {
    /*
        一、异常的体系结构
        java.lang.Throwable
                Java.lang.Error：一般不编写针对性的代码进行处理

                java.lang.Exception：可以进行异常的处理
                    编译时的异常
                        ----IOException
                        ----ClassNotFoundException
                    运行时的异常
                        ----RuntimeException
                        ----ClassCastException
                        ----NullPointerException
        编译时异常：执行javac.exe命令时，可能出现的异常，
        运行时异常：执行java.exe命令时，出现的异常

     */


    //  空指针异常例子
    @Test
    public void test1 () {
        int[] arr = null;
        System.out.println (arr[2]);
        //  java.lang.NullPointerException
    }


    //  数组角标越界
    @Test
    public void test2 () {
        int[] ar = new int[10];
        System.out.println (ar[12]);
        //  java.lang.ArrayIndexOutOfBoundsException: 12

    }

    //  字符串角标越界
    @Test
    public void test3 () {
        String str = "abc";

        System.out.println (str.charAt (5));
        //  java.lang.StringIndexOutOfBoundsException: String index out of range: 5

    }

    //  类型转换异常
    @Test
    public void test4 () {
        Object obj = new Date ();
        String str = (String) obj;  //  强转，编译时没有报错，在运行时就报错了
        //java.lang.ClassCastException: java.util.Date cannot be cast to java.lang.String


    }

    //  数字格式化异常，NumberFormatException
    @Test
    public void test5 () {
        String str = "123";
        str = "abc";
        int num = Integer.parseInt (str);
        //java.lang.NumberFormatException: For input string: "abc"
    }


    //  算术异常,ArithmeticException
    @Test
    public void test6 () {
        int a = 10;
        int b = 0;
        System.out.println (a / b);
        //java.lang.ArithmeticException: / by zero
    }
}















