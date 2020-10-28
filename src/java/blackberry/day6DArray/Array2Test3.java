package blackberry.day6DArray;

/**
 * @Description: review
 * @author: bberzhou@gmail.com
 * @date: 4/5/20 16:32
 * Create By IntelliJ IDEA
 */
public class Array2Test3 {
    /*
        数组复习
     */
    public static void main (String[] args) {
        //  1。写出一维数组初始化的两种方式，静态初始化 和动态初始化
        int[] arr1 = new int[]{2, 4, 5, 6, 2};
        int[] arr2 = new int[4];

        //  2。写出二维数组初始化的两种方式，数组一旦初始化其长度就是确定的且不可修改
        int[][] arr3 = new int[4][3];   //动态
        int[][] arr4 = new int[][]{{3, 5, 1}, {6, 4, 2}, {5, 3, 2}};
        int[][] arr6 = new int[4][];    //动态


        //  3。遍历如下数组
        int[][] arr5 = new int[][]{{1, 2, 3}, {4, 5}, {6, 7, 8}};
        for (int i = 0 ; i < arr5.length ; i++) {
            for (int j = 0 ; j < arr5[i].length ; j++) {
                System.out.print (arr5[i][j] + "   ");
            }
            System.out.println ();
        }

        /*
            4。不同类型的一维数组元素的默认初始化值是多少
                1）int --->0
                2)boolean---->false
                3）char ---> 0 或者'\u0000'
                4)float----> 0.0
                5)引用数据类型---->null
         */
    }

}
