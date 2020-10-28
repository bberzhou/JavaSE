package blackberry.day6Array;

/**
 * @author bberzhou@gmail.com
 * @date 8/24/19 14:27
 * Create By IntelliJ IDEA
 * 一维数组练习
 */

public class ArrayTest {
    //  数组是多个相同类型数据按照一定顺序排列的集合，并使用一个名字来命名
    /*
        数组相关的概念：
            1。数组名字
            2。元素
            3。数组是有序的排列
            4。数组属于引用数据类型的变量
            5。数组里面的元素可以是基本数据类型也可以是引用数据类型
            6。数组对象会在内存中开辟一整块连续的空间，数组名就是引用的就是在这块连续空间的首地址
            7。数组的长度一旦确定，就不能修改
            8。可以使用下标对数据进行访问
            9。数组的分类：一维数组、二维数组


     */
    public static void main (String[] args) {
        int[] arr = new int[]{8, 2, 1, 0, 3};
        int[] index = new int[]{2, 0, 3, 2, 4, 0, 1, 3, 2, 3, 3};
        String tel = "";
        //  使用.length 属性来获取数组的长度
        for (int i = 0 ; i < index.length ; i++) {
            tel = tel + arr[index[i]];
            //  18013820100

        }
        System.out.println (tel);
    }


}
