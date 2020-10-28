package blackberry.day7OOP2;

import java.io.PrintStream;

/**
 * @Description: question
 * @author: bberzhou@gmail.com
 * @date: 4/10/20 09:23
 * Create By IntelliJ IDEA
 */
public class Question {
    /*
        面试题目
     */
    public static void main (String[] args) {
        int a = 10;
        int b = 10;
        //  需要在method方法被调用之后，仅打印出a=100,b=200，请写出method的方法代码
        method (a, b);
        System.out.println ("a=" + a);
        System.out.println ("b=" + b);

    }
    //  方法一：
//    public static void method(int a, int b){
//        a = a*10;
//        b = b*20;
//        System.out.println(a);
//        System.out.println(b);
//        //  输出之后，直接让程序结束，就不会执行上面的输出语句了
//        System.exit (0);
//    }

    //  方法二：
    public static void method (int a, int b) {
        PrintStream printStream = new PrintStream (System.out) {
            //  重写打印流里面的方法，设置输出信息
            @Override
            public void println (String x) {
                if ("a=10".equals (x)) {
                    x = "a=100";
                } else if ("b=10".equals (x)) {
                    x = "b=200";
                }
                super.println (x);
            }
        };
        System.setOut (printStream);
    }

}
