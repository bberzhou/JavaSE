package lanqiaobei;

import java.util.Scanner;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 4/13/21 08:06
 * Create By IntelliJ IDEA
 */
public class tenToHex {
    /*
        十进制转换为十六进制

     */
    public static void main(String[] args){
        Scanner in = new Scanner (System.in);
        long num = in.nextLong();
        String output = "";
        if (num>=0 && num<=2147483647){
            //  使用Long.toHexString,返回的是一个字符串
            output =Long.toHexString((Long)num);
        }
        System.out.println(output.toUpperCase());
    }
}
