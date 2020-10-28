package blackberry.day9OOP1.staticKeyword;

/**
 * @Description: UtilTest
 * @author: bberzhou@gmail.com
 * @date: 4/9/20 16:21
 * Create By IntelliJ IDEA
 */
public class ArraysUtilTest {
    //  对数组工具类进行测试,将ArraysUtil类里面的方法都使用static修饰，
    //  此时就不用new 对象，直接使用 类.方法  调用即可


    public static void main (String[] args) {
        int[] arr = new int[]{3, 5, 1, 6, 9, 6, 2};
        //  new一个ArraysUtil的对象
//        ArraysUtil arraysUtil = new ArraysUtil ();
//        //  ArraysUtil调用其getMaxValue方法
//        int max = arraysUtil.getMaxValue (arr);

        //  把ArraysUtil里面的方法设置为static的，就不需要再去new 对象
        int max = ArraysUtil.getMaxValue (arr);
        System.out.println ("数组中的最大值为：" + max);
//        int min = arraysUtil.getMinValue (arr);
        int min = ArraysUtil.getMinValue (arr);
        System.out.println ("数组中的最小值为：" + min);
//        int sum = arraysUtil.getSum (arr);
        int sum = ArraysUtil.getSum (arr);
        System.out.println ("数组中的元素总和为：" + sum);

//        int average = arraysUtil.getAverageValue (arr);
        int average = ArraysUtil.getAverageValue (arr);
        System.out.println ("数组中的元素平均值为：" + average);
//          对数组元素排序
//        arraysUtil.sortArray (arr);
        ArraysUtil.sortArray (arr);
//          排序后输出
//        arraysUtil.printArray (arr);
        ArraysUtil.printArray (arr);
//        int index = arraysUtil.searchValueIndex (arr, 9);
        int index = ArraysUtil.searchValueIndex (arr, 9);
        if (index > 0) {
            System.out.println ("找到了，位置为" + (index + 1));
        } else {
            System.out.println ("没有找到");
        }

    }
}
