package blackberry.day6DArray;

import java.util.Arrays;

/**
 * @Description: Review
 * @author: bberzhou@gmail.com
 * @date: 4/7/20 17:17
 * Create By IntelliJ IDEA
 */
public class Array2TestReview {
    //  二维数组复习
    public static void main (String[] args) {
        //  1。使用冒泡排序，实现如下的数组从小到大排序
        int[] arr1 = new int[]{34, 5, 22, -98, 6, -76, 0, -3};
        for (int i = 0 ; i < arr1.length ; i++) {
            //  比较的次数依次减少
            for (int j = 0 ; j < arr1.length - i - 1 ; j++) {
                if (arr1[j] > arr1[j + 1]) {
                    //  判断相邻两位的大小，交换操作
                    int temp = arr1[j];
                    arr1[j] = arr1[j + 1];
                    arr1[j + 1] = temp;
                }
            }

        }
        System.out.println (Arrays.toString (arr1));

        //  2。反转该数组
        for (int i = 0 ; i < arr1.length / 2 ; i++) {
            //  首尾逐个元素进行交换
            int temp = arr1[i];
            arr1[i] = arr1[arr1.length - 1 - i];
            arr1[arr1.length - 1 - i] = temp;
        }
        System.out.println (Arrays.toString (arr1));

        //  3。复制上面的复组到arr2
        int[] arr2 = new int[arr1.length];
        //  遍历arr1的每个元素并复制给arr2
        for (int i = 0 ; i < arr1.length ; i++) {
            arr2[i] = arr1[i];
        }
        System.out.println (Arrays.toString (arr2)); //[34, 22, 6, 5, 0, -3, -76, -98]

        //  使用线性查找，从上面数组中查找22是否存在并返回索引值
        int[] arr3 = new int[]{-98, -76, -3, 0, 5, 6, 22, 34};
        int dest = 34;
        boolean isFlag = true;
        for (int i = 0 ; i < arr3.length ; i++) {
            if (dest == arr3[i]) {
                System.out.println ("查找成功：" + i);
                isFlag = false;
                //  查找成功时，直接break出循环
                break;
            }
        }
        if (isFlag) {
            System.out.println ("查找不成功");
        }


        //  调用方法进行二分查找
        int index = Arrays.binarySearch (arr3, dest);
        if (index > 0) {
            System.out.println ("查找成功：" + index);
        } else {
            System.out.println ("查找失败！" + index);
        }

    }
}
