package lanqiaobei;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 4/13/21 09:31
 * Create By IntelliJ IDEA
 */
public class Basic7 {
    /*
        153是一个非常特殊的数，它等于它的每位数字的立方和，
        即153=1*1*1+5*5*5+3*3*3。编程求所有满足这种条件的三位十进制数。
        按从小到大的顺序输出满足条件的三位十进制数，每个数占一行。
     */
    public static void main (String[] args) {
        for (int i = 100 ; i < 1000 ; i++) {
            int g = i % 10;
            int s = i / 10 % 10;
            int b = i / 100 % 10;
            if (i == (g*g*g + s*s*s+b*b*b)){
                System.out.println (i);
            }
        }

    }
}
