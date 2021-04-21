package lanqiaobei;

import java.util.Scanner;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 4/17/21 09:57
 * Create By IntelliJ IDEA
 */
public class DPTest4 {
    /*
        数字塔从上到下所有路径中和最大的路径
        数字塔是第i行有i个数字组成，从上往下每个数字只能走到他正下方数字或者正右方数字，
        求数字塔从上到下所有路径中和最大的路径，如有下数字塔.
               3
             1   5
           8   4   3
         2   6   7   9
       6   2   3   5   1

        最大路径为 3->5->3->9->5

        可以分别从从上往下看跟从下往上看两种动态规划的方式去解这个题

        3                  3                 3                      3
        1  5               4  8              4   8                  4   8
        8  4  3            8  4  3           12  12  11             12  12  11
        2  6  7  9         2  6  7  9        14  18  19  20         14  18  19  20
        6  2  3  5  1      6  2  3  5  1     6  2  3  5  1          20  20  22  25  21

        n*n的二维数组dp[][],n是数字塔最后一行的数字个数
        二维数组每一行数字跟数字塔每一行数字个数一样，保存的值是从上方到这一个位置最大路径的值，填入边界值dp[0][0]=3
        每一行除了第一个值跟最后一个值，其他的值选择上方或者左上方更大的值与这个位置上的值相加得来的值，
        即dp[i][j]=Math.max(dp[i-1][j-1], dp[i-1][j]) + n[i][j]
     */

    public static void main(String[] args){
        Scanner in = new Scanner (System.in);
        int row = in.nextInt ();
        int[][] arr = new int[row][];
        //  这也是打印三角形的方法,因为第一行一列，第二行两列，依次类推.
        for (int i = 0 ; i < arr.length ; i++) {
            //  第一行有一个元素，第n行有n个元素,此时确定内层元素的个数
            //  根据外层的行数，来确定内层
            arr[i] = new int[i+1];
            for (int j = 0 ; j < arr[i].length ; j++) {
                arr[i][j] = in.nextInt ();
            }
        }
        int i = maxNumberRouterArray (arr);
        System.out.println (i);


    }
    public static int maxNumberRouterArray (int[][] arr) {
        //  初始化最大值为0
        int max = 0;
        int[][] dp = new int[arr.length][arr.length];
        dp[0][0] = arr[0][0];
        for (int i = 1 ; i < arr.length ; i++) {
            for (int j = 0 ; j <= i ; j++) {
                if (j==0){
                    //  如果是第一列，直接跟他上面的数字相加
                    //  则下一行的第一个元素等于这个位置原来的元素值+上一行第一个元素的值
                    dp[i][j] = dp[i-1][j]+arr[i][j];
                }else {
                    //  如果不是第一列的元素，则是选择上方或者上方左边元素的最大值来加上此位置原来的值
                    //  dp[i-1][j-1]:左上方元素，dp[i-1][j]：正上方元素，arr[i][j]：原来此位置的元素值
                    dp[i][j] = Math.max (dp[i-1][j-1],dp[i-1][j])+arr[i][j];
                }

                max = Math.max (dp[i][j],max);
            }

        }
        return max;
    }
}
