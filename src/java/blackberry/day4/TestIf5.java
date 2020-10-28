package blackberry.day4;

import java.util.Scanner;

/**
 * @author bberzhou@gmail.com
 * @date 3/25/20 16:40
 * Create By IntelliJ IDEA
 */
public class TestIf5 {
    /*

     */
    public static void main (String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println ("请输入你的身高：");
        double height = in.nextDouble ();
        System.out.println ("请输入你的财富:");
        int wealth = in.nextInt ();
        System.out.println ("请输入你是否帅？(true/false)");
        boolean isHandsome = in.nextBoolean ();
        //  同时满足三个条件
        if (height >= 1.8 && wealth >= 1 && isHandsome) {
            System.out.println ("我要嫁给你！");
            //  只要有一个条件为真
        } else if (height >= 1.8 || wealth >= 1 || isHandsome) {
            System.out.println ("也可以嫁。");
        } else {
            System.out.println ("不嫁");
        }
    }
}
