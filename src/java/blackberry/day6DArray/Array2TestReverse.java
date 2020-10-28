package blackberry.day6DArray;

/**
 * @Description: Reverse
 * @author: bberzhou@gmail.com
 * @date: 4/7/20 09:16
 * Create By IntelliJ IDEA
 */
public class Array2TestReverse {
    /*
        数组元素的反转
     */
    public static void main (String[] args) {
        String[] arr1 = new String[]{"AA", "BB", "CC", "GG", "MM"};
        //  遍历打印原始数组里面的元素
//        for (int i = 0 ; i < arr1.length ; i++) {
//            System.out.print (arr1[i] + " ");
//        }
//
//        //  反转数组里面的元素
//        //  方式一
//        for (int i = 0 ; i < arr1.length/2 ; i++) {
//            String temp = arr1[i];
//            arr1[i] = arr1[arr1.length - 1 - i];
//            arr1[arr1.length - 1 - i] = temp;
//
//        }
//        //  方法二：定义两个数组下标值，
//        for (int i = 0,j = arr1.length-1;i <j  ; i++,j--) {
//            String temp = arr1[i];
//            arr1[i] = arr1[j];
//            arr1[j] = temp;
//        }

        System.out.println ();
        for (int i = 0 ; i < arr1.length ; i++) {
            System.out.print (arr1[i] + " ");
        }
    }
}
