package lanqiaobei;

import java.util.Scanner;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 4/15/21 17:58
 * Create By IntelliJ IDEA
 */
public class LowerToUpper {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        String next = scanner.next ();
        //  字符串变字符数组，大转小，字符值加32，小转大，字符值减32 。
        //  大写字母范围是：65-90，小写字母范围是：97-122

        //  1、直接调用String类的方法
//        String s = next.toUpperCase ();
//        System.out.println (s);

        //  小写转大写 -32 ，大写转小写 +32
        //  2、采用ASCII码的差值进行计算
        char c = next.charAt (0);
        char i = (char)((int) c - 32);
        System.out.println (i);
    }
}
