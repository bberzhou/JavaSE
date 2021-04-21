package lanqiaobei;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 4/13/21 19:53
 * Create By IntelliJ IDEA
 */
public class Basic29 {
    /*
        输入两个整数a和b，输出这两个整数的和。a和b都不超过100位。
        由于a和b都比较大，所以不能直接使用语言中的标准数据类型来存储。对于这种问题，一般使用数组来处理。
　　      定义一个数组A，A[0]用于存储a的个位，A[1]用于存储a的十位，依此类推。同样可以用一个数组B来存储b。
　　      计算c = a + b的时候，首先将A[0]与B[0]相加，如果有进位产生，则把进位（即和的十位数）存入r，把和的个位数存入C[0]，即C[0]等于(A[0]+B[0])%10。然后计算A[1]与B[1]相加，这时还应将低位进上来的值r也加起来，即C[1]应该是A[1]、B[1]和r三个数的和．如果又有进位产生，则仍可将新的进位存入到r中，和的个位存到C[1]中。依此类推，即可求出C的所有位。
　　      最后将C输出即可。
     */

    //  数组相加
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        //  输入两个字符串
        String num1 = scanner.next ();
        String num2 = scanner.next ();
        //  两个int类型的数组，
        int[] A = reverse (num1);
        System.out.println (Arrays.toString (A));
        int[] B = reverse (num2);
        System.out.println (Arrays.toString (B));
        ArrayList C = add (A,B);
        for (int i = C.size ()-1; i >=0; i--) {
            System.out.print (C.get (i)+"");
        }

    }

    //  reverse()方法，将字符串转换为int类型的数组，注意字符'0'和数字0的差别
    public static int[] reverse (String a) {
        //  先转换为char型数组
        char[] temp = a.toCharArray ();
        int[] A = new int[a.length ()];
        int index = 0;
        //  将字符'0'~'9'转换成数字0~9，需要将要转换的数字-'0'
        for (int i = a.length ()-1; i>=0 ; i--) {
            //  注意这个
           A[index++] = temp[i] -'0';
        }
        return A;
    }
    public static ArrayList add(int[] A, int[] B){
        int min;
        int max;
        boolean flag = true;
        //  判断两个长度
        if (A.length < B.length){
            min = A.length;
            max = B.length;
            flag = false;
        }else if (A.length > B.length){
            min = B.length;
            max = A.length;
        }else {
            min = max = A.length;
        }
        ArrayList<Integer> C = new ArrayList<> ();
        int r = 0;
        //  A和B长度相同时进行的运算
        for (int i = 0 ; i < min ; i++) {
            //  这样添加方便进位
            C.add ((A[i] + B[i] +r) %10);
            if ((A[i] + B[i] +r) <10){
                r = 0;
            }else {
                r = 1;
            }
        }

        //  相同且进位，则需要整体进位
        if (r==1 && min ==max){
            C.add (1);
        }
        //  不相同的位数的时候
        if (min != max){
            for (int i = min ; i < max ; i++) {
                C.add ((r+(flag ? A[i]:B[i])) % 10);
                if ((r + (flag ? A[i]:B[i])) < 10){
                    r = 0;
                }else {
                    r = 1;
                    if (i == max-1){
                        C.add (1);
                    }
                }

            }
        }
        return C;
    }
}
