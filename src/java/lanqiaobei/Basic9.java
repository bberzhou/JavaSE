package lanqiaobei;

import java.util.Scanner;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 4/13/21 08:21
 * Create By IntelliJ IDEA
 */
public class Basic9 {
    /*
        特殊回文数的判断：123321是一个非常特殊的数，它从左边读和从右边读是一样的。
　　输入一个正整数n， 编程求所有这样的五位和六位十进制数，满足各位数字之和等于n 。
     */
    public static void main (String[] args) {
        Scanner in = new Scanner (System.in);
        int n = in.nextInt ();
        //  10000-999999
        for (int j = 10000 ; j < 1000000 ; j++) {
            if (j < 100000) {
                //  五位数
                int g = j % 10;
                int s = j / 10 % 10;
                int b = j / 100 % 10;
                int q = j / 1000 % 10;
                int w = j / 10000 % 10;
                if (g == w && s == q && g + s + b + q + w == n) {
                    System.out.println (j);
                }
            } else {
                //六位数
                //  五位数
                int g = j % 10;
                int s = j / 10 % 10;
                int b = j / 100 % 10;
                int q = j / 1000 % 10;
                int w = j / 10000 % 10;
                int sw = j / 100000 % 10;
                if (g == sw && s == w && b == q && g + s + b + q + w+sw == n) {
                    System.out.println (j);

                }

            }
        }
    }
}
