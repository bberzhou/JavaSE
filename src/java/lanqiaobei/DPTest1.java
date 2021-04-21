package lanqiaobei;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 4/16/21 22:05
 * Create By IntelliJ IDEA
 */
public class DPTest1 {
    /*
        动态规划测试：
            数组最大不连续递增子序列
            arr[] = {3,1,4,1,5,9,2,6,5}的最长递增子序列长度为4。最大不连续递增子序列即为：1,4,5,9
            设置一个数组temp，长度为原数组长度，数组第i个位置上的数字代表0...i上最长递增子序列，
            当增加一个数字时，最大递增子序列可能变成前面最大的递增子序列+1，
            也可能就是前面最大递增子序列，这需要让新增加进来的数字arr[i]跟前面所有数字比较大小。
            即当 arr[i] > arr[j]，temp[i] = max{temp[j]}+1，其中，j 的取值范围为：0,1...i-1，此时子序列长度+1
            当 arr[i] < arr[j]，temp[i] = max{temp[j]}，j 的取值范围为：0,1...i-1，此时子序列长度不变
            所以在状态转换方程为temp[i]=max{temp[i-1], temp[i-1]+1}，
     */

    public static void main(String[] args){
        int[] arr = new int[]{3,1,4,5,9,2,6,5};
        int max = MaxChildArrayOrder (arr);
        System.out.println (max);
    }

    public static int MaxChildArrayOrder(int[] arr){
        int len = arr.length;
        //  temp数组第i个位置上的数字代表0...i上最长递增子序列长度
        int[] temp = new int[len];
        for (int i = 0 ; i < len ; i++) {
            temp[i] =1; //  初始值都设置为1
        }
        //  外层循环arr数组
        for (int i = 1 ; i < len ; i++) {
            //  内层循环0...j where 0<j<i-1
            for (int j = 0 ; j < i ; j++) {
                //  如果arr[i]>arr[j],表明子序列+1，并且还要temp[j]+1>temp[i]，避免有相同的情况，
                if (arr[i]>arr[j] && temp[j]+1>temp[i]){
                    //  满足，则在前面0...j个里面的最大值+1赋值给temp[i]
                    temp[i] = temp[j]+1;
                }
            }
        }
        //  最大子序列的个数，初始选temp[0]
        int max = temp[0];
        for (int j : temp) {
            if (j > max) {
                max = j;
            }
        }
        return max;

    }


}
