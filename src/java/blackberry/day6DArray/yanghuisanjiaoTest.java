package blackberry.day6DArray;

/**
 * @Description: sanjiao
 * @author: bberzhou@gmail.com
 * @date: 4/5/20 23:12
 * Create By IntelliJ IDEA
 */
public class yanghuisanjiaoTest {
    //  打印一个15行的杨辉三角
    public static void main (String[] args) {
        //  1。声明并初始化数组
        int[][] arr = new int[10][];

        //  2。给数组的元素赋值,数组下标从0开始，所以内层i+1开始
        for (int i = 0 ; i < arr.length ; i++) {
            // 第一行有一个元素，第n行有n个元素,此时确定内层元素的个数
            arr[i] = new int[i + 1];
            //  杨辉三角首尾元素都是1
            arr[i][0] = arr[i][i] = 1;
            //  给每行的非首末元素赋值，从第三行开始
            for (int j = 1 ; j < arr[i].length - 1 ; j++) {
                if (i > 1) {
                    arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
                }
            }

            //  3。遍历二维数组，并输出
            for (int j = 0 ; j < arr[i].length ; j++) {
                System.out.print (arr[i][j] + "   ");
            }
            System.out.println ();
        }
    }
}
