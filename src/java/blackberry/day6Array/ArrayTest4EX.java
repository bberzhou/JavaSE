package blackberry.day6Array;

/**
 * @Description: exercise
 * @author: bberzhou@gmail.com
 * @date: 4/5/20 10:40
 * Create By IntelliJ IDEA
 */
public class ArrayTest4EX {
    public static void main (String[] args) {
        //  网红题目：出租房间的问题
        int[] arr1 = new int[]{8, 2, 1, 0, 3};
        int[] index = new int[]{2, 0, 3, 2, 4, 0, 1, 3, 4, 3, 3};
        String tel = "";
        for (int i = 0 ; i < index.length ; i++) {
            tel += arr1[index[i]];
        }
        //  18013820300
        System.out.println ("联系方式：" + tel);
    }
}
