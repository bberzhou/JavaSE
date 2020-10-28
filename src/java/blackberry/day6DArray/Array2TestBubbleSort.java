package blackberry.day6DArray;

/**
 * @Description: Sort
 * @author: bberzhou@gmail.com
 * @date: 4/7/20 10:22
 * Create By IntelliJ IDEA
 */
public class Array2TestBubbleSort {
    /*
        排序：
            根据关键字的序列进行排序，升序或者降序
            时间复杂度，空间复杂度，稳定性
            算法的五大特征：
                1）输入，0个或者多个输入数据
                2）输出，至少有一个或者多个输出结果，不可以没有输出结果
                3）有穷性
                4）确定性
                5）可行性
     */
    public static void main (String[] args) {
        //  冒泡排序
        int[] arr = new int[]{4, 6, 3, 5, 17, 9, 3, 6, 8};

        System.out.print ("排序前的数组：");
        for (int i = 0 ; i < arr.length ; i++) {
            System.out.print (arr[i] + " ");
        }

        //  实现冒泡排序，第一次的时候比较7次，第二次
        for (int i = 0 ; i < arr.length - 1 ; i++) {
            //  比较次数arr.length - 1 - i
            for (int j = 0 ; j < arr.length - 1 - i ; j++) {
                //  判断两个相邻元素的大小.
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println ("排序之后的：");
        for (int i = 0 ; i < arr.length ; i++) {
            System.out.print (arr[i] + " ");
        }
    }
}
