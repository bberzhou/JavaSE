package blackberry.day5Loop;

/**
 * @author bberzhou@gmail.com
 * @date 3/29/20 11:49
 * Create By IntelliJ IDEA
 */
public class QiantaoLoop {
    /*
        嵌套循环：
            1、兼顾一个循环结构A声明在另外一个循环结构B中，就构成了嵌套循环
            2、外层循环控制行数和内层循环控制列数
            3、内层循环结构遍历一遍，只相当于外层循环循环体执行了一次
            4、假设外层循环需要执行m次，内层循环需要执行n次，此时内层循环的循环体一共执行了m*n次
            5、外层循环控制行数 i（行数），内层循环控制列数j（列数）
     */
    public static void main (String[] args) {
        for (int i = 1 ; i <= 6 ; i++) {
            for (int j = 1 ; j <= i ; j++) {
                System.out.print ("*");

            }
            System.out.println ();
        }
        for (int i = 1 ; i <= 6 ; i++) {
            for (int j = i ; j <= 6 ; j++) {
                System.out.print ("*");

            }
            System.out.println ();
        }

        //  打印金字塔
        /*
         *
         * *
         * * *
         * * * *
         * * * * *
         */
        for (int i = 0 ; i < 5 ; i++) {
            for (int j = 0 ; j < 4 - i ; j++) {
                System.out.print (" ");
            }
            for (int k = 0 ; k < i + 1 ; k++) {
                System.out.print ("* ");
            }
            System.out.println ();
        }

        //  倒金字塔
        /*
         * * * * *
         * * * *
         * * *
         * *
         *
         */

        for (int i = 0 ; i < 4 ; i++) {
            for (int k = 0 ; k < i + 1 ; k++) {
                System.out.print ("-");
            }
            for (int j = i ; j < 4 ; j++) {
                System.out.print ("* ");
            }
            System.out.println ();
        }
    }
}
