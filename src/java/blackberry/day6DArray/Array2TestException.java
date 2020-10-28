package blackberry.day6DArray;

/**
 * @Description: Exception
 * @author: bberzhou@gmail.com
 * @date: 4/7/20 16:29
 * Create By IntelliJ IDEA
 */
public class Array2TestException {

    /*
       数组中常见的异常
        1。数组越界的异常：ArrayIndexOutOfBoundsException

        2。空指针异常：NUllPointerException

     */
    public static void main (String[] args) {
        //  空指针情况1
        int[] arr1 = new int[]{1, 2, 5, 6};
//        arr1 = null;
//        System.out.println(arr1[0]);    //java.lang.NullPointerException

        //  空指针情况2，对于二维的数组,注意内存结构
        int[][] arr2 = new int[4][];
        //  此时会报空指针异常，因为未内层元素初始化值，外层的元素初始化值为null
        //  int[][] arr= new int[4][3]; 内层元素的初始化默认值与一维的相同，
        //  外层元素的初始化值为地址值
        System.out.println (arr2[1][2]);

        //  空指针情况三：
        String[] arr3 = new String[]{"AA", "bb", "V"};
        arr3[0] = null;
        System.out.println (arr3.toString ());   // nullpointerexception
    }
}
