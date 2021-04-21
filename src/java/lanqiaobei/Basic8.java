package lanqiaobei;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 4/13/21 09:20
 * Create By IntelliJ IDEA
 */
public class Basic8 {
    public static void main (String[] args) {
        //  1221是一个非常特殊的数，它从左边读和从右边读是一样的，编程求所有这样的四位十进制数。
        for (int i = 1000 ; i < 10000 ; i++) {
            int g = i % 10;
            int s = i / 10 % 10;
            int b = i / 100 % 10;
            int q = i / 1000 % 10;
            if (g == q && s == b){
                System.out.println (i);
            }

        }
    }
}
