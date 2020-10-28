package blackberry.day4;

import java.util.Scanner;

/**
 * @author bberzhou@gmail.com
 * @date 3/28/20 09:57
 * Create By IntelliJ IDEA
 */
public class SwitchTest1 {
    /*
        使用switch把小写类型的char型转换为大写，只转换a,b,c,d,e其他的转换为"other"
     */
    public static void main (String[] args) {
        System.out.println ("请输入一个字符：");
        Scanner in = new Scanner (System.in);
        String word = in.next ();
        char letter = word.charAt (0);
        switch (letter) {
            case 'a':
                System.out.println ("输入的是A");
                break;
            case 'b':
                System.out.println ("输入的是B");
                break;
            case 'c':
                System.out.println ("输入的是C");
                break;
            case 'd':
                System.out.println ("输入的是D");
                break;
            default:
                System.out.println ("other");

        }
    }
}
