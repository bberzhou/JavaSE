package blackberry.day6DArray;

/**
 * @Description: algorithm
 * @author: bberzhou@gmail.com
 * @date: 4/5/20 23:46
 * Create By IntelliJ IDEA
 */
public class Array2Test4 {
    /*
        笔试题目：创建一个长度为6的int型的数组，要求数组元素在1-30之间，
        且是随机赋值，同时，要求元素的值各不相同

     */
    public static void main (String[] args) {
        int[] arr = new int[6];
        for (int i = 0 ; i < arr.length ; i++) {
            int num = (int) (Math.random () * 30);
            for (int j = 0 ; j < arr.length ; j++) {
                if (arr[j] != num) ;
                arr[i] = num;
            }
            System.out.println (arr[i]);
        }
    }

}
