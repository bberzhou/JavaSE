package blackberry.day3;

import java.util.Scanner;

/**
 * @author bberzhou@gmail.com
 * @date 3/21/20 18:18
 * Create By IntelliJ IDEA
 */
public class AriTest {
    public static void main (String[] args) {
        /**
         *  练习：随意给出一个三位数的整数，打印显示它的个位数、十位数、百位数
         */

        int num;
        System.out.println ("请输入一个三位数:");
        Scanner in = new Scanner (System.in);
        num = in.nextInt ();
        if (num > 999 || num < 100) {
            System.out.println ("输入的数字不合法！");
        } else {
            System.out.println ("输入的数字为：" + num);
//            int bai = num / 100;
//            int shi = (num - bai*100) / 10;
//            int ge = (num-bai*100-shi*10);
            int bai = num / 100;
            int shi = num % 100 / 10;
            int ge = num % 10;
            System.out.println ("这个数的百位：" + bai);
            System.out.println ("这个数的十位：" + shi);
            System.out.println ("这个数的个位：" + ge);
        }


    }
}
