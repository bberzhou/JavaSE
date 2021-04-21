package lanqiaobei;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 4/17/21 09:42
 * Create By IntelliJ IDEA
 */
public class DPTest3 {
    /*
        数组最大连续子序列之和
        arr[] = {6,-1,3,-4,-6,9,2,-2,5}的最大连续子序列和为14。即为：9,2,-2,5
        创建一个数组a，长度为原数组长度，不同位置数字a[i]代表0...i上最大连续子序列和。
        当进来一个新的数字arr[i+1]时，判断到他前面数字子序列和a[i]+arr[i+1]跟arr[i+1]哪个大，
        前者大就保留前者，后者大就说明前面连续数字加起来都不如后者一个新进来的数字大，
        前面数字就可以舍弃，从arr[i+1]开始，每次比较完都跟max比较一下，最后的max就是最大值

     */
    public static void main(String[] args){
        int[] arr = new int[]{6,-1,3,-4,-6,9,2,-2,5};
        int i = maxArraySum (arr);
        System.out.println (i);

    }
    public static int maxArraySum (int[] arr) {
        int len = arr.length;
        int max = arr[0];
        int sum = arr[0];
        for (int i = 1 ; i < len ; i++) {
            //  比较第i个值和第i个值+前面的子序列和，
            //  如果arr[i]大，表明前面的所有子序列只和都小于arr[i]，所以只需要记录arr[i]就可以
            //  如果arr[i]+sum 大，表明arr[i]较小，则sum = sum + arr[i]，
            //  这样就不需要去记录前面子序列的每一个值
            sum = Math.max (sum + arr[i], arr[i]);
            if (sum >= max) {
                max = sum;
            }

        }
        return max;
    }
}
