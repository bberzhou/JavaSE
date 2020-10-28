package blackberry.day6DArray;

import java.util.Arrays;

/**
 * @Description: ArraysToolClass
 * @author: bberzhou@gmail.com
 * @date: 4/7/20 16:04
 * Create By IntelliJ IDEA
 */
public class Array2TestArraysTool {
    //  Arrays是数组的一个工具类，里面提供了很多方法
    public static void main (String[] args) {
        //  1。boolean equals(int[] a,int[] a2)，判断两个数组是否相等,返回一个boolean值
        int[] arr1 = new int[]{1, 4, 5, 1};
        int[] arr2 = new int[]{4, 2, 2, 5};
        boolean isEq = Arrays.equals (arr1, arr2);
        System.out.println (isEq);   //  false


        //  2。toString(int[] a):输出数组信息,不用一个一个遍历
        System.out.println (Arrays.toString (arr1)); //[1, 4, 5, 1]

        //  3。void fill(int[] a,int val): 将指定的值填充到数组当中，直接替换掉每一个
        //  val - the value to be stored in all elements of the array
        Arrays.fill (arr1, 5);
        System.out.println (Arrays.toString (arr1)); // [5, 5, 5, 5]

        //  4。Sorts the specified array into ascending numerical order
        //  底层使用快速排序
        Arrays.sort (arr2);
        System.out.println (Arrays.toString (arr2)); //[2, 2, 4, 5]

        //  5。二分查找
        int[] arr3 = new int[]{-78, -29, -10, 13, 19, 34, 57, 89, 90,};
        int dest = 90;
        //  返回查找结果的索引值
        int index = Arrays.binarySearch (arr3, dest);
        System.out.println (index);  //


    }
}
