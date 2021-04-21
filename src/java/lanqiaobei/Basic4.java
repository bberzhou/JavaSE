package lanqiaobei;

import java.util.Scanner;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 4/13/21 10:48
 * Create By IntelliJ IDEA
 */
public class Basic4 {
    /*
        给出n个数，找出这n个数的最大值，最小值，和。
     */
    public static void main (String[] args) {
        Scanner in = new Scanner (System.in);
        int length = in.nextInt ();
        int[] arr = new int[length];
        int Max=0,Min=0,Sum =0;
//        int {Max,Min,Sum} =0;

        //  数组赋值
        for (int i = 0 ; i < arr.length ; i++) {
            int value = in.nextInt ();
            if (Math.abs (value) < 10000) {
                arr[i] = value;
            }
        }
        //  循环
        Max = arr[0];
        Min = arr[0];
        int temp;
        for (int i = 0 ; i <arr.length; i++) {
            if (arr[i]>Max){
                Max = arr[i];
            }else if (arr[i]<Min){
                Min = arr[i];
            }
            Sum += arr[i];
        }
        System.out.println (Max);
        System.out.println (Min);
        System.out.println (Sum);
    }
}
