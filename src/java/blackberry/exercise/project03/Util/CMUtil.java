package blackberry.exercise.project03.Util;

import java.util.Scanner;

/**
 * @Description: customerUtil
 * @author: bberzhou@gmail.com
 * @date: 4/12/20 11:36
 * Create By IntelliJ IDEA
 */
public class CMUtil {
    private static Scanner scanner = new Scanner (System.in);

    //  重键盘获取值的方法，封装为私有的  从键盘读入信息的方法，并且需要一个字符长度的参数和是否空值回车
    private static String readKeyBoard (int limit, boolean blankReturn) {
        String line = "";
        while (scanner.hasNextLine ()) {
            line = scanner.nextLine ();
            if (line.length () == 0) {
                if (blankReturn) return line;
                else continue;
            }
            if (line.length () < 1 || line.length () > limit) {
                System.out.println ("输入长度(不大于" + limit + "）错误，请重新输入：");
                continue;
            }
            break;

        }
        return line;
    }

    /*
        用于界面菜单的选择。该方法读取键盘，如果用户输入1～5中的任意字符，则方法返回。如果输入其他就重新选择
     */
    public static char readMenuSelection () {
        char c;
        //  无限循环
        for ( ; ; ) {
            //  此时用户输入必须是一个数字，且不能直接回车
            String str = readKeyBoard (1, false);
            c = str.charAt (0);
            if (c != '1' && c != '2' && c != '3' && c != '4' && c != '5') {
                System.out.println ("您输入错误，请重新输入：");
            } else break;
        }
        return c;
    }

    /*
        从键盘读取一个字符，并将其作为方法的返回值
     */
    public static char readChar () {
        String str = readKeyBoard (1, false);
        return str.charAt (0);
    }

    /*
        从键盘读取一个字符，并将其作为方法的返回值，如果用户不输入字符直接回车键，方法就会将以defaultValue作为返回值

     */
    public static char readChar (char defaultValue) {
        String str = readKeyBoard (1, true);
        if (str.length () <= 0) {
            return defaultValue;
        } else {
            return str.charAt (0);
        }
//            return (str.length () == 0) ? defaultValue : str.charAt (0);
    }

    /*
        从键盘读取一个长度不超过2位的正数，并将其作为方法的返回值,下面两个方法构成方法重载
     */
    public static int readInt () {
        int n;
        for ( ; ; ) {
            String str = readKeyBoard (2, false);
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
        从键盘读取一个长度不超过2位的整数，并将其作为方法的返回值,
        如果用户不输入直接回车，方法就返回默认值
     */
    public static int readInt (int defaultValue) {
        int n;
        for ( ; ; ) {
            String str = readKeyBoard (2, true);
            //  如果传入参数为空，返回默认值
            if (str.equals ("")) {
                return defaultValue;
            }
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
        从键盘读取一个长度不超过limit的字符串，并将其作为方法的返回值
     */
    public static String readString (int limit) {
        return readKeyBoard (limit, false);
    }

    /*
        用户电话号码 从键盘读取一个长度不超过limit的字符串，并将其作为方法的返回值
        如果不输入字符直接回车,为空，方法就将会返回defaultValue
     */
    public static String readString (int limit, String defaultValue) {
        String str = readKeyBoard (limit, true);
        if (str.equals ("")) {
            return defaultValue;
        } else {
            return str;
        }
    }

    /*
        用于确认选择的操作，该方法从键盘读取一个'Y' 或者' N'，并将其作为方法的返回值
     */
    public static char readConfirmSelection () {
        char c;
        //  无限循环的方式
        for ( ; ; ) {
            String str = readKeyBoard (1, false).toUpperCase ();
            c = str.charAt (0);
            if (c == 'Y' || c == 'N') {
                break;
            } else {
                System.out.println ("选择错误，请重新输入：");
            }
        }
        return c;
    }
}
