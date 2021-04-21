package lanqiaobei;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 4/17/21 11:07
 * Create By IntelliJ IDEA
 */
public class DPTest5 {
    /*
        对DPTest4的优化：
         动态规划中每一个需要创建一个二维数组的解法，都可以换成只创建一个一维数组的滚动数组解法，
         依据的规则是一般二维数组中存放的是所有的结果，但是一般我们需要的结果是在二维数组的最后一行的某个值，
         前面几行的值都是为了得到最后一行的值而需要的，所以可以开始就创建跟二维数组最后一行一样大的一维数组，
         每次存放某一行的值，下一次根据这一行的值算出下一行的值，再存入这个数组，也就是把这个数组滚动了，
         最后数组存储的结果就是原二维数组中最后一行的值。

         比如DPTest4里面，开始创建一个一维数组dp[n]，初始值只有dp[0]=3，新进来一行时，
         仍然遵循dp[i][j]=Math.max(dp[i-1][j-1], dp[i-1][j]) + n[i][j]，
         现在为求dp[j]，所以现在dp[i-1][j]其实就是数组中这个位置本来的元素即dp[j]，
         而dp[i-1][j-1]其实就是数组中上一个元素dp[j-1]，
         也就是说dp[j]=Math.max(dp[j], dp[j-1])+n[i][j]
     */
    public static void main (String[] args) {
        Scanner in = new Scanner (System.in);
        //  len控制二维数组的行数
        int len = in.nextInt ();
        int[][] arr = new int[len][];
        //  外层控制行数
        for (int i = 0 ; i < len ; i++) {
            //  每一行有i+1个元素
            arr[i] = new int[i + 1];
            for (int j = 0 ; j < arr[i].length ; j++) {
                arr[i][j] = in.nextInt ();

            }
        }
        int i = minNumberArr (arr);
        System.out.println (i);


    }

    public static int minNumberArr (int[][] arr) {
        int[] temp = new int[arr.length];
        temp[0] = arr[0][0];
        //  外层循环控制行数
        for (int i = 1 ; i < arr.length ; i++) {
            //
            for (int j = i ; j >= 0 ; j--) {
                //  末尾那个
                if (j == i) {
                    temp[i] = temp[i - 1] + arr[i][j];
                    //  第一列的元素
                } else if (j == 0) {
                    temp[0] += arr[i][0];
                } else {
                    //  中间的元素
                    temp[j] = Math.max (temp[j], temp[j - 1]) + arr[i][j];
                }

            }

        }
        int max = temp[0];
        //  从temp数组里面取出最大值
        for (int i = 0 ; i < temp.length ; i++) {
            if (temp[i] > max) {
                max = temp[i];
            }

        }
        return max;
    }

    /*
        优化：滚动数组，只创建一个一维数组，数组初始值是数字塔最下面一行的值，每次新加一行值，
        将数组中的值改变，最后数组中第一个数字就是最大路径的值。
        状态转化方程就是temp[j] = Math.max(temp[j], temp[j+1])+n[i][j]
     */
    public static int minNum(int[][] arr){
        int[] temp = new int[arr.length];

        for (int i = 0 ; i < arr.length ; i++) {
            //  将数字塔最下面一行的元素，赋值给一维temp数组
            temp[i] = arr[arr.length-1][i];
        }
        for (int i = arr.length-2 ; i >=0 ; i--) {
            for (int j = 0 ; j <= i ; j++) {
                temp[j] = Math.max (temp[j],temp[j+1])+arr[i][j];

            }

        }
        return temp[0];

    }

    /*
        动态规划算法：它通常用于求解具有某种最优性质的问题。在这类问题中，可能会有许多可行解。
        每一个解都对应于一个值，我们希望找到具有最优值的解。
        动态规划算法与分治法类似，其基本思想也是将待求解问题分解成若干个子问题，
        先求解子问题，然后从这些子问题的解得到原问题的解。
        与分治法不同的是，适合于用动态规划求解的问题，经分解得到子问题往往不是互相独立的。
        分治法：若用分治法来解这类问题，则分解得到的子问题数目太多，有些子问题被重复计算了很多次。
        如果我们能够保存已解决的子问题的答案，而在需要时再找出已求得的答案，
        这样就可以避免大量的重复计算，节省时间。我们可以用一个表来记录所有已解的子问题的答案。
     */

}
