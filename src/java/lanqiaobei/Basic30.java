package lanqiaobei;


import java.math.BigInteger;
import java.util.Scanner;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 4/13/21 11:46
 * Create By IntelliJ IDEA
 */
public class Basic30 {
    /*
        输入一个正整数n，输出n!的值。 其中n!=1*2*3*…*n。
     */
    public static void main (String[] args) {

        Scanner in = new Scanner (System.in);
        long n = in.nextInt ();
        BigInteger bigInteger = new BigInteger (String.valueOf (1));
        if (n<=1000 && n>0){
            for (int i = 1 ; i <=n ; i++) {
                BigInteger i_value = new BigInteger (String.valueOf (i));
                bigInteger = bigInteger.multiply (i_value);

            }
        }
        System.out.println (bigInteger);
    }
}
