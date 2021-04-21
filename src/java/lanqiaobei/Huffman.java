package lanqiaobei;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 4/15/21 18:38
 * Create By IntelliJ IDEA
 */
public class Huffman {
    /*
        Huffman树的构造过程
     */
    public static void main (String[] args) {
        Scanner in = new Scanner (System.in);
        int len = in.nextInt ();
        int[] arr = new int[len];
        int sum = 0;
        //  输入初始元素
        for (int i = 0 ; i < len ; i++) {
            arr[i] = in.nextInt ();
        }

        //  Arrays工具类的排序方法
            Arrays.sort (arr);
            sum = arr[0] + arr[1];
            int[] ints = newArr (sum, arr);
            for (int l : ints) {
                System.out.print (l + " ");
            }
            System.out.println ();
            System.out.println (sum);


    }


    public static int[] newArr (int i, int[] sour) {
        int[] arr = new int[sour.length - 1];
        arr[0] = i;
        for (int j = 1 ; j < sour.length - 1 ; j++) {
            arr[j] = sour[j + 1];
        }
        return arr;
    }
}
