package blackberry.exercise.project01;

import java.util.Scanner;

/**
 * @author bberzhou@gmail.com
 * @date 4/2/20 12:03
 * Create By IntelliJ IDEA
 */
public class Test1 {
    public static void main (String[] args) {
        System.out.println ("请输入一个数");
        Scanner in = new Scanner (System.in);
        int n = in.nextInt ();
        int oddSum = 0;
        int evenSum = 0;
        for (int i = 0 ; i <= n ; i++) {
            if (i % 2 == 0) {
                oddSum += i;

            } else {
                evenSum += i;
            }
        }
        System.out.println ("奇数和" + evenSum);
        System.out.println ("偶数和：" + oddSum);
    }
}
