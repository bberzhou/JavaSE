package blackberry.day6Array;

/**
 * @author bberzhou@gmail.com
 * @date 8/26/19 16:00
 * Create By IntelliJ IDEA
 */
public class yanghui {
    //  使用二维数组打印一个10行的杨辉三角
    //  1。第一行有一个元素1，第n行有n个元素，
    //  2。每一行的第一个元素和最后一个元素都是1
    //  3。从第三行开始对于非第一个元素和最后一个元素的元素 a[i][j] = a[i-1][j-1]+a[i-1][j]
    public static void main (String[] args) {
        //  1。声明并初始化二维数组
        int[][] arr = new int[10][];

        //  2。给数组的元素赋值
//        for (int i = 0 ; i < arr.length ; i++) {
//            //  二维数组的列数
//            arr[i] = new int[i+1];
//            //  二维数组的首末元素赋值
//            arr[i][0] = arr[i][i] = 1;
//            if (i>1){
//                for (int j = 1; j < arr[i].length-1 ; j++) {
//                    //      因为杨辉三角某个元素等于前面上一行前两个元素的和
//                    arr[i][j] = arr[i-1][j-1]+arr[i-1][j];
//
//                }
//            }
//
//        }
        // 3。遍历二维数组
        for (int i = 0 ; i < arr.length ; i++) {
            for (int j = 0 ; j < arr[i].length ; j++) {

                System.out.print (arr[i][j] + " ");
            }
            System.out.println ();

        }
    }

    /*
    * 1
1  1
1  2  1
1  3  3  1
1  4  6  4  1
1  5  10  10  5  1
1  6  15  20  15  6  1
1  7  21  35  35  21  7  1
1  8  28  56  70  56  28  8  1
1  9  36  84  126  126  84  36  9  1
*/
}
