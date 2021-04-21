package lanqiaobei;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 4/16/21 15:41
 * Create By IntelliJ IDEA
 */
public class Fibonacci1 {
    public static void main (String[] args) {
        int a = 10;
        int fibonacci = Fibonacci (a);

        System.out.println (fibonacci);
        System.out.println ();
        //
        int fibonacci1 = Fibonacci2 (a);
        System.out.println (fibonacci1);


    }

    //  递归调用实现斐波那契数列
    public static int Fibonacci (int i) {
        if (i == 0) {
            return 0;
        } else if (i == 1) {
            return 1;
        } else {
            //  不断调用自身，递归调用
            return Fibonacci (i - 1) + Fibonacci (i - 2);
        }
    }

    //  动态规划实现斐波那契,把结果存在一个数组里面
    public static int Fibonacci2 (int i) {
        if (i == 0) {
            return 0;
        } else if (i == 1) {
            return 1;
        } else {
            //  使用数组的方式进行循环。
            int[] result = new int[i + 1];
            result[0] = 0;
            result[1] = 1;
            for (int j = 2 ; j <= i ; j++) {
                // 每次把前两个值的和赋值给后一个
                result[j] = result[j - 1] + result[j - 2];
            }
            return result[i];
        }
    }
}
