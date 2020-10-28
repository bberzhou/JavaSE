package blackberry.day7OOP2;

/**
 * @Description: overloadingTest
 * @author: bberzhou@gmail.com
 * @date: 4/9/20 17:22
 * Create By IntelliJ IDEA
 */
public class MethodOverloadingTest {
    /*
        方法重载练习
        1。编写程序，定义三个重载方法并调用，方法名为MOL。
            三个方法分别接收一个int整数、两个int整数、一个字符串参数
            分别执行平方运算并输出结果，相乘并输出结构，输出字符串信息。
            在主类的main方法中分别用参数区别调用三个方法。
        2。定义三个重载方法max(),
            第一个方法求两个int值中的最大值
            第二个方法求两个double值中的最大值
            第三个方法求三个double值中的最大值，并分别调用

     */

    public static void main (String[] args) {


    }

    public int MOL (int args) {
        //  求出传入参数的立方
        return args * args * args;
    }

    public int MOL (int i, int j) {
        //  两个数相乘
        return i * j;
    }

    public void MOL (String str) {
        System.out.println (str);
    }

    public int max (int i, int j) {
//        if (i>j){
//            return i;
//        }else {
//            return j;
//        }
        return (i > j) ? i : j;
    }

    public double max (double i, double j) {
//        if (i > j) {
//            return i;
//        } else {
//            return j;
//        }
        return (i > j) ? i : j;
    }

    public double max (double i, double j, double k) {
//        if (i > j && i > k) {
//            return i;
//        } else if (j > k) {
//            return j;
//        } else {
//            return k;
//        }
        double max = (i > j) ? i : j;
        return (max > k) ? max : k;
    }
}
