package blackberry.day6DArray;

/**
 * @Description: 2dim-Array
 * @author: bberzhou@gmail.com
 * @date: 4/5/20 11:09
 * Create By IntelliJ IDEA
 */
public class Array2Test1 {
    /*
        二维数组的使用：
            1。二维数组的声明和初始化
            2。如何调用数组指定位置的元素
            3。如果获取数组的长度
            4。如何遍历二维数组
            5。数组元素的默认初始化值
            6。二维数组的内存解析
     */
    public static void main (String[] args) {
        //  一维数组的声明
        int[] arr1 = new int[4];

        //  二维数组的声明,动态初始化,外层为3层，内层为一个元素的数组
        int[][] arr2 = new int[3][1];
        //  另外一种初始化的方式，外层元素5个内层不确定
        int[][] arr4 = new int[5][];
        //  声明二维数组
        int arr8[][] = new int[6][4];
//        错误的声明情况
//        int[][] arr5 = new int[][7];
//        int[][] arr3 = new int[3][2]{{1,2,3},{4,3,5,},{6,5,7}};

        //  动态初始化二维数组
        int[][] arr3 = new int[][]{{1, 2, 3}, {4, 3, 5,}, {7}};
        //  可以省略后面的[][],通过后面的类型来推断
        int[][] arr7 = {{}, {}, {}};

        //  2。如何调用数组指定位置的元素
        System.out.println (arr3[0][1]);
        //  报错 Exception in thread "main" java.lang.NullPointerException
//        System.out.println(arr4[1][0]);

        //  3。获取数组的长度
        System.out.println (arr3.length); // 3
        System.out.println (arr3[1].length); // 3
        System.out.println (arr3[2].length); //1

        //  4。如何遍历二维数组
        for (int i = 0 ; i < arr3.length ; i++) {
            for (int j = 0 ; j < arr3[i].length ; j++) {
                System.out.print (arr3[i][j] + "   ");
            }
            System.out.println ();
        }

    }
}
