package blackberry.day6DArray;

import java.util.Arrays;

/**
 * @Description: structure
 * @author: bberzhou@gmail.com
 * @date: 4/5/20 16:02
 * Create By IntelliJ IDEA
 */
public class Array2Test2 {
    /*
        二维数组的使用：
            1。数组元素的默认初始化值
                针对于初始化方式一：int[][] arr1 = new int[4][3]；
                            外层元素的初始值为：地址值
                            内层元素的初始化值为：与一维数组初始化情况相同
                针对初始化方式二：int[][] arr3 = new int[4][];
                            外层元素的初始值为：null
                            内层元素的初始值为：不能调用，否则报空指针异常
            2。数组的内存解析
     */
    public static void main (String[] args) {
        int[][] arr1 = new int[3][2];
        //  根据堆栈结构来解析，int类型
        System.out.println (Arrays.toString (arr1[0]));    //地址值[I@2503dbd3     [0, 0]
        System.out.println (arr1[0][0]);     //0

        //  float类型
        float[][] arr2 = new float[4][3];
        System.out.println (arr2[0]);    //  [F@2503dbd3
        System.out.println (arr2[0][0]); //  0.0

        //  string类型
        String[][] arr3 = new String[4][3];
        System.out.println (arr3[0]);    //[Ljava.lang.String;@4b67cf4d 地址值
        System.out.println (arr3[0][0]); // null 内层跟一维相同
        //  数组属于引用类型，默认值为null
        System.out.println ("******************");
        double[][] arr4 = new double[4][];
        System.out.println (arr4[1]);   //  null,此时外层为4，内层为动态声明，此时为null
//        System.out.println(arr4[1][2]);   输出内层时爆空指针异常错误
    }
}
