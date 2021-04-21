package lanqiaobei;

import java.util.Scanner;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 4/13/21 09:36
 * Create By IntelliJ IDEA
 */
public class Basic5 {
    /*
        给出一个包含n个整数的数列，问整数a在数列中的第一次出现是第几个。

        第一行包含一个整数n。
        第二行包含n个非负整数，为给定的数列，数列中的每个数都不大于10000。
        第三行包含一个整数a，为待查找的数。
     */
    public static void main (String[] args) {
        Scanner in = new Scanner (System.in);
        //  标记位置
        int flag = 0;
        //  输入的元素个数
        int n = in.nextInt ();
        //  判断输入是否正确
        if ( n< 10000 && n>0){
            int[] arr = new int[n];
            //  数组赋值
            for (int i = 0 ; i < arr.length ; i++) {
                arr[i] = in.nextInt ();
            }
            int dest = in.nextInt ();
            for (int i = 0 ; i < arr.length; i++) {
                if (dest == arr[i]){
                    //  如果找到一个就返回第一次出现的位置，break掉
                    //  数组角标要  +1，才是实际的第几个
                    flag = i+1;
                    break;
                }else {
                    //  如果整个数组没找到就设置为-1
                    flag = -1;
                }
            }
        }
        //  最后输出第一次出现的位置
        System.out.println (flag);
    }
}
