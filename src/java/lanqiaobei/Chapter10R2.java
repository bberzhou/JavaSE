package lanqiaobei;

import java.util.Scanner;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 4/14/21 16:46
 * Create By IntelliJ IDEA
 */
public class Chapter10R2 {
    public static void main (String[] args) {
        /*
            A 对应数字1，B--》2，Z---》26
            AA--->27，AB---->28
         */

        Scanner in = new Scanner (System.in);
        String str = in.next ();
        String s = str.toUpperCase ();
        char[] chars = s.toCharArray ();
        int len = chars.length;
        int sum=0;
        for (int i = 0 ; i < chars.length ; i++) {
//            System.out.println (Reverse (chars[i]));
            double pow =  Math.pow (26, len - i - 1);
            sum += pow*Reverse (chars[i]);
        }
        System.out.println (sum);
    }
    public static int Reverse(char s){
        int flag=0;
        switch (s){
            case 'A':
                return flag = 1;
            case 'B':
                return flag = 2;
            case 'C':
                return flag =3;
            case 'D':
                return flag =4;
            case 'E':
                return flag =5;
            case 'F':
                return flag =6;
            case 'G':
                return flag =7;
            case 'H':
                return flag =8;
            case 'I':
                return flag =9;
            case 'J':
                return flag =10;
            case 'K':
                return flag =11;
            case 'L':
                return flag =12;
            case 'M':
                return flag =13;
            case 'N':
                return flag =14;
            case 'O':
                return flag =15;
            case 'P':
                return flag =16;
            case 'Q':
                return flag =17;
            case 'R':
                return flag =18;
            case 'S':
                return flag =19;
            case 'T':
                return flag =20;
            case 'U':
                return flag =21;
            case 'V':
                return flag =22;
            case 'W':
                return flag =23;
            case 'X':
                return flag =24;
            case 'Y':
                return flag =25;
            case 'Z':
                return flag =26;
        }
        return flag;
    }
}
