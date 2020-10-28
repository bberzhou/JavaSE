package blackberry.day5Loop;

import java.util.Scanner;

/**
 * @author bberzhou@gmail.com
 * @date 3/28/20 21:21
 * Create By IntelliJ IDEA
 */
public class ForLoopTest2 {
    /*
        题目：输入两个正整数，求其最大公约数和最小公倍数。

        说明：break关键字的使用

     */
    public static void main (String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println ("请输入第一个正整数：");
        int m = in.nextInt ();
        System.out.println ("请输入第二个正整数：");
        int n = in.nextInt ();
        int k = 0;
        //  找最大公约数先从最小的那个开始往前面找，
        //  先获取两个数中的最小值
        k = (m > n) ? n : m;
//        if (m > n) {
//            k = n;
//        } else {
//            k = m;
//        }
        //  遍历找两个数中的最大公约数
        for (int i = k ; i >= 1 ; i--) {
            if (m % i == 0 && n % i == 0) {
                System.out.println ("最小公约数：" + i);
                break;
            }
        }

        //  获取最小公倍数
        int min = (m > n) ? m : n;
        for (int i = min ; i <= m * n ; i++) {
            if (min % n == 0 && min % m == 0) {
                System.out.println ("最小公倍数：" + i);
                break;
            }

        }


    }

}
