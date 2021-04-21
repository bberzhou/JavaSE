package lanqiaobei;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 4/14/21 20:57
 * Create By IntelliJ IDEA
 */
public class adv370 {
    /*
        高精度减法
     */
    public static void main(String[] args){
//        两行，表示两个非负整数a、b，且有a > b。
        Scanner in = new Scanner(System.in);
//        BigInteger bigInteger = in.nextBigInteger ();
//        BigInteger bigInteger1 = in.nextBigInteger ();
////        System.out.println (bigInteger.subtract (bigInteger1));
//        System.out.println (bigInteger.add (bigInteger1));

        int len = in.nextInt ();
        if (len>= 1 && len <= 1000000000){
            long sum=0;
            for (long i = 1 ; i <=len ; i++) {
                sum = sum+i;

            }
            System.out.println (sum);
        }
    }

}
