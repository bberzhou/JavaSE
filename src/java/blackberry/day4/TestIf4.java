package blackberry.day4;

import java.util.Scanner;

/**
 * @author bberzhou@gmail.com
 * @date 3/25/20 15:54
 * Create By IntelliJ IDEA
 */
public class TestIf4 {
    /*
        根据键盘输入算出狗的年龄，前两年相当于人的10.5岁，后面每年相当于人的4岁
     */

    public static void main (String[] args) {
        System.out.println ("请输入你家狗年龄：");
        Scanner in = new Scanner (System.in);
        int age = in.nextInt ();
        if (age > 0) {
            if (age <= 2) {
                //  如果是0～2之间
                System.out.println ("狗的年龄：" + age * 10.5);
            } else {
                //  如果大于2
                System.out.println ("狗的年龄：" + (((age - 2) * 10.5) + 21));
            }

        } else {
            System.out.println ("输入的年龄不正确");
        }
    }
}
