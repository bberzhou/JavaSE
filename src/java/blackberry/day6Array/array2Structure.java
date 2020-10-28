package blackberry.day6Array;

/**
 * @author bberzhou@gmail.com
 * @date 8/24/19 14:15
 * Create By IntelliJ IDEA
 */
public class array2Structure {
    /*
        数组的内存解析
     */

    public static void main (String[] args) {
        //  堆栈的理解，常量池(字符串)，静态域（static）
        //  方法里的局部变量，new出来的结构：对象和数组

        /*
            数组名实际是保存的堆空间的内存首地址，arr1是放在栈空间中的
         */
        int[] arr1 = new int[3];
        System.out.println (arr1.length);
    }
}
