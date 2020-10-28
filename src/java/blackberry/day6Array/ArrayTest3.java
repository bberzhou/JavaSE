package blackberry.day6Array;

/**
 * @author bberzhou@gmail.com
 * @date 8/26/19 15:54
 * Create By IntelliJ IDEA
 */
public class ArrayTest3 {
    public static void main (String[] args) {
        //  求二维数组所有数据的和
        int[][] arr = new int[][]{{3, 5, 8}, {12, 9}, {7, 0, 6, 4}};
        int sum = 0;
        for (int i = 0 ; i < arr.length ; i++) {
            for (int j = 0 ; j < arr[i].length ; j++) {
                //  求和并赋值到sum
                sum += arr[i][j];
            }

        }
        System.out.println ("总和为：" + sum);
    }
}
