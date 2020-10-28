package blackberry.exercise.project01;

import java.util.Scanner;
import java.util.TreeMap;

/**
 * @author bberzhou@gmail.com
 * @date 3/29/20 18:52
 * Create By IntelliJ IDEA
 */
public class Utility {
    //    Utility工具类，将不同的功能封装为方法，可以直接调用方法使用，而无需考虑具体的功能实现细节
    private static Scanner in = new Scanner (System.in);

    /*
        用于界面菜单的选择，该方法读取键盘输入。如果用户从键盘输入'1-4'中的任意字符，则方法返回。返回值为用户输入的字符

     */
    public static char readMenuSelection () {
        char c;
        for ( ; ; ) {
            String str = readKeyBoard (1);
            c = str.charAt (0);
            if (c != '1' && c != '2' && c != '3' && c != '4') {
                System.out.print ("选择错误，请重新输入：");
            } else break;
        }
        return c;
    }

    /*
        用于收入和指出金额的输入。该方法从键盘读取一个不超过4位长度的整数，并将其作为方法的返回值

     */
    public static int readNumber () {
        int n;
        for ( ; ; ) {
            String str = readKeyBoard (4);
            try {
                n = Integer.parseInt (str);
                break;
            } catch (NumberFormatException e) {
                System.out.println ("数字输入错误，请重新输入：");
            }
        }
        return n;
    }

    /*
        用于收入和支出说明的输入。该方法从键盘读取一个不超过8位长度的字符串，并将其作为方法的返回值
     */
    public static String readString () {
        String str = readKeyBoard (8);
        return str;
    }

    /*
        用于确认选择的输入，该方法从键盘读取"Y"或者"N",并将其作为方法的返回值
     */
    public static char readConfirmSelection () {
        char c;
        for ( ; ; ) {
            String str = readKeyBoard (1).toUpperCase ();
            c = str.charAt (0);
            if (c == 'Y' || c == 'N') {
                break;
            } else {
                System.out.println ("选择错误，请重新输入：");
            }
        }
        return c;
    }

    /*
        从键盘读入信息的方法，并且带有一个字符长度的参数
     */
    private static String readKeyBoard (int limit) {
        String line = "";

        while (in.hasNext ()) {
            line = in.nextLine ();
            //  判断当前设置的字符长度，如果超过此范围，则重新继续
            if (line.length () < 1 || line.length () > limit) {
                System.out.println ("输入的字符长度" + limit + "有误，请重新输入:");
                continue;
            }
            break;
        }
        return line;
    }


}

