package blackberry.day6DArray;

/**
 * @Description: Sum
 * @author: bberzhou@gmail.com
 * @date: 4/6/20 10:35
 * Create By IntelliJ IDEA
 */
public class Array2Test5 {
    /*
        数组算法题目：求数组中元素的最大值、最小值、平均数、总和等
        定义一个int型的一维数组，包含10个元素，分别赋值一些随机整数
        然后求出所有元素的最大值，最小值，和值，平均值，并输出出来，所有的随机数都是两位数(10-99)
     */
    public static void main (String[] args) {
        //  定义一个10个元素的一维数组
        int[] arr = new int[10];
        int max = 0;
        int min = 0;
        int sum = 0;
        //  Math.random() 是随机产生 [0.0,1]的随机数，获取[a,b]范围内的随机数：(int)(Math.random()*(b-a+1)+a)
        //  给数组元素赋值，并输出
        for (int i = 0 ; i < arr.length ; i++) {
            arr[i] = (int) (Math.random () * 90 + 10);
            System.out.println (arr[i]);
            //  求和
            sum += arr[i];
            //  求最大值，放到第一个
            if (arr[0] < arr[i]) {
                arr[0] = arr[i];
            }

        }

        for (int i = 0 ; i < arr.length ; i++) {

            //  求最小值，放到末尾
            if (arr[i] < arr[arr.length - 1]) {
                arr[arr.length - 1] = arr[i];
            }
        }


        System.out.println ("数组中的最大值为：" + arr[0]);
        System.out.println ("数组中的最小值为：" + arr[arr.length - 1]);
        System.out.println ("数组中的元素和为：" + sum);
        System.out.println ("数组中的平均值为：" + sum / arr.length);


    }
}
