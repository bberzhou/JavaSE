package lanqiaobei;

import java.util.Scanner;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 4/13/21 08:09
 * Create By IntelliJ IDEA
 */
public class hexToTen {
    /*
        十六进制转换为十进制
     */
    public static void main(String[] args){
        Scanner in = new Scanner (System.in);
        //  读入字符串
        String hex_num = in.nextLine ();
        //  使用Long.parseLong(String s, int radix)
        long dec_num = Long.parseLong (hex_num,16);
        System.out.println (dec_num);
    }
}
