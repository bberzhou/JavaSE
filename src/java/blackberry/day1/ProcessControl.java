package blackberry.day1;

import org.junit.Test;

import java.util.Scanner;

/**
 * @author bberzhou@gmail.com
 * @date 7/24/19 08:57
 * Create By IntelliJ IDEA
 */
public class ProcessControl {
    public static void main (String[] args) {
        //求两个数的最大公约数
        Scanner in = new Scanner (System.in);
        int a1 = in.nextInt ();
        int a2 = in.nextInt ();
        System.out.println (a1 + " " + a2);

        int max = (a1 > a2) ? a1 : a2;
        int min = (a1 < a2) ? a1 : a2;
        for (int i = min ; i >= 1 ; i--) {
            if (max % i == 0 && min % i == 0) {
                System.out.println ("最大公约数：" + i);
                break;
            }

        }
        for (int i = max ; i < max * min ; i++) {
            if (i % min == 0 && i % max == 0) {
                System.out.println ("最小公倍数：" + i);
                break;
            }

        }


    }


}
