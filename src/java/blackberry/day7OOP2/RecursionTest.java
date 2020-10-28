package blackberry.day7OOP2;

/**
 * @Description: recursion
 * @author: bberzhou@gmail.com
 * @date: 4/10/20 10:09
 * Create By IntelliJ IDEA
 */
public class RecursionTest {
    /*
        递归：
        1。自己调用自身的方法
        2。方法的递归包含了一种隐式的循环，会重复的执行某段代码，这种重复执行不需要循环控制
        3。递归一定要向已知的方向递归，否则这种递归就变成了无穷递归的，类似于死循环
     */

    public static void main (String[] args) {
        //  计算1-100之间所有自然数的和
        //  方式一：
//        int sum = 0;
////        for (int i = 1 ; i <= 100 ; i++) {
////            sum += i;
////        }

        //  方式二
        RecursionTest r = new RecursionTest ();
        int sum = r.getSum (10);
        System.out.println (sum);

    }

    //  递归实现1-i的累加和
    public int getSum (int i) {
        if (i == 1) {
            return 1;
        } else {
            //  计算i+ i-1+i-2+...
            return i + getSum (i - 1);
        }
    }

    //  递归实现1-i的阶乘
    public int getMultiply (int i) {
        if (i == 1) {
            return 1;
        } else {
            //  计算i* i-1*i-2+...
            return i * getSum (i - 1);
        }
    }

    //  例三：已知有一个数列：f(0) = 1,f(1)=4,f(n+2) = 2*f(n+1)+f(n),
    //  其中n是一个大于0的整数，求f(10)的值

    public int f (int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 4;
        } else {
            return 2 * f (n - 1) + f (n - 2);
        }
    }
    //  斐波那契额数列（Fibonacci）：1 1 2 3 5 8  13 21 34 55 一个数等于前面两个数的和

    //  n阶台阶，每次只能跳一阶或者2阶，共有多少种情况
    //  汉诺塔问题
    //  快速排序

}
