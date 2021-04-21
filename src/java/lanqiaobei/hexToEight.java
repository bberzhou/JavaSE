package lanqiaobei;

import java.util.Scanner;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 4/13/21 08:12
 * Create By IntelliJ IDEA
 */
public class hexToEight {
    /*
        十六进制转换为8进制
     */
    public static void main (String[] args) {
        //  输入字符n确定输入行数
        Scanner scanner = new Scanner (System.in);
        int n = scanner.nextInt ();
        //  创建字符串数组
        String[] str = new String[n];
        //  循环遍历输入
        if (n >= 1 && n <= 10) {
            for (int i = 0 ; i < n ; i++) {
                String input = scanner.next ();
                str[i] = input;

            }
            for (int i = 0 ; i < n ; i++) {
                String strBinary = toBinary (str[i]);    //  先将字符串转换为二进制
                int len = strBinary.length ();   //  看转化完之后的二进制长度
                if (len % 3 == 1) {
                    strBinary = "00" + strBinary;
                } else if (len % 3 == 2) {
                    strBinary = "0" + strBinary;
                }
                String strOctal = toOctal (strBinary);
                System.out.println (strOctal);
            }
        }
    }

    //  十六进制转换为二进制的算法
    private static String toBinary (String str) {
        //  先获取字符串的长度
        int length_str = str.length ();
        StringBuilder stringBuilder = new StringBuilder ();
        //  循环遍历每一个字符串,判断该字符的二进制表示
        for (int i = 0 ; i < length_str ; i++) {
            //  截取十六进制数的每一个字符，并将其转换为对应的二进制数
            switch (str.charAt (i)) {
                case '0':
                    stringBuilder.append ("0000");
                    break;
                case '1':
                    stringBuilder.append ("0001");
                    break;
                case '2':
                    stringBuilder.append ("0010");
                    break;
                case '3':
                    stringBuilder.append ("0011");
                    break;
                case '4':
                    stringBuilder.append ("0100");
                    break;
                case '5':
                    stringBuilder.append ("0101");
                    break;
                case '6':
                    stringBuilder.append ("0110");
                    break;
                case '7':
                    stringBuilder.append ("0111");
                    break;
                case '8':
                    stringBuilder.append ("1000");
                    break;
                case '9':
                    stringBuilder.append ("1001");
                    break;
                case 'A':
                    stringBuilder.append ("1010");
                    break;
                case 'B':
                    stringBuilder.append ("1011");
                    break;
                case 'C':
                    stringBuilder.append ("1100");
                    break;
                case 'D':
                    stringBuilder.append ("1101");
                    break;
                case 'E':
                    stringBuilder.append ("1110");
                    break;
                case 'F':
                    stringBuilder.append ("1111");
                    break;
                default:
                    break;
            }

        }
        //  返回二进制字符
        return stringBuilder.toString ();

    }

    //  转换为8进制的方法
    public static String toOctal (String strBinary) {
        int length = strBinary.length ();
        int k;
        StringBuilder stringBuffer = new StringBuilder ();
        if (strBinary.startsWith ("000")) {
            k = 3;
        } else {
            k = 0;
        }
        //  for循环设置每一次加三，因为8进制三位表示
        for (int i = k ; i < length - 2 ; i += 3) {
            switch (strBinary.substring (i, i + 3)) {
                case "000":
                    stringBuffer.append ("0");
                    break;
                case "001":
                    stringBuffer.append ("1");
                    break;
                case "010":
                    stringBuffer.append ("2");
                    break;
                case "011":
                    stringBuffer.append ("3");
                    break;
                case "100":
                    stringBuffer.append ("4");
                    break;
                case "101":
                    stringBuffer.append ("5");
                    break;
                case "110":
                    stringBuffer.append ("6");
                    break;
                case "111":
                    stringBuffer.append ("7");
                    break;
                default:
                    break;
            }

        }
        return stringBuffer.toString ();
    }
}
