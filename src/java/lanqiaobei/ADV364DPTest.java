package lanqiaobei;

import java.util.Scanner;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 4/17/21 20:26
 * Create By IntelliJ IDEA
 */
public class ADV364DPTest {
    /*
        天天向上题目：

        问题描述：
            A同学的学习成绩十分不稳定，于是老师对他说：“只要你连续4天成绩有进步，那我就奖励给你一朵小红花。”
            可是这对于A同学太困难了。于是，老师对他放宽了要求：“只要你有4天成绩是递增的，我就奖励你一朵小红花。”
            即只要对于第i、j、k、l四天，满足i<j<k<l并且对于成绩wi<wj<wk<wl，那么就可以得到一朵小红花的奖励。
            现让你求出，A同学可以得到多少朵小红花。

        输入格式：
            第一行一个整数n，表示总共有n天。第二行n个数，表示每天的成绩wi。

        输出格式：
            一个数，表示总共可以得到多少朵小红花。

        样例输入：
            6
            1 3 2 3 4 5
        样例输出：
            6
         数据规模和约定：
            对于40%的数据，n<=50;
            对于100%的数据，n<=2000，0<=wi<=10^9.
     */
    public static void main (String[] args) {
//        Scanner in = new Scanner (System.in);
//        int len = in.nextInt ();
//        //  二维状态数组
//        int[][] temp = new int[len][len];
//        //  计数器4天
//
//        //  一维数组用于成绩
//        int[] arr = new int[len];
//        for (int i = 0 ; i < len ; i++) {
//            //  数组循环赋值
//            arr[i] = in.nextInt ();
//        }
//        for (int i = 0 ; i < len ; i++) {
//            temp[0][i] = 1;
//            for (int j = i+1 ; j < len ; j++) {
//                if (arr[j] > arr[i]){
//                    temp[1][j] += temp[0][i];
//                    temp[2][j] += temp[1][i];
//                    temp[3][j] += temp[3][i];
//                }
//
//            }
//
//        }
//        long sum =0L;
//        for (int i = 3 ; i <len  ; i++) {
//            sum+=temp[3][i];
//
//        }
//        System.out.println (sum);
//    }
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt ();
        //下标都从1开始
        int[] nums = new int[n + 1];
        //  二维状态数组dp[i][k]表示数字nums[i]在子序列abcd中处于第k个位置时，
        //  满足条件的子序列总数。那么则有状态转移方程：
        int[][] dp = new int[n + 1][5];
        long count = 0;
        for (int i = 1 ; i <= n ; i++) {
            nums[i] = sc.nextInt ();
            dp[i][1] = 1;
        }
        sc.close ();
        for (int i = 2 ; i <= n ; i++) {
            for (int k = 2 ; k <= 4 ; k++) {
                for (int j = i - 1 ; j >= 1 ; j--) {
                    //满足条件时累计和
                    if (nums[i] > nums[j]) {
                        dp[i][k] += dp[j][k - 1];
                    }
                }
                //记录完所有情况后累加
                //  count保存每次记录完 k == 4的所有结果后的值的和。
                if (k == 4) {
                    count += dp[i][k];
                }
            }
        }
        System.out.println (count);
    }
}
