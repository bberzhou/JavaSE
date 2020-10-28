package blackberry.day6DArray;

/**
 * @Description: CopyArray
 * @author: bberzhou@gmail.com
 * @date: 4/6/20 15:16
 * Create By IntelliJ IDEA
 */
public class Array2Test5copy {
    /*
        1。声明两个int型的数组array1和array2
        2。array1初始化为:2,3,5,7,11,13,17,19
        3。显示array1的数组内容
        4。赋值array2变量等于array1，修改array2中的偶索引元素，使其等于索引值，在打印array1
     */
    public static void main (String[] args) {
//        int[] arr1 = new int[]{2, 3, 5, 7, 11, 13, 17, 19};
////        int[] arr2 = new int[8];
////        for (int i = 0 ; i < arr1.length ; i++) {
////            System.out.println (arr1[i]);
////            arr2[i] = arr1[i];
////            if (i % 2 == 0){
////                arr2[i] = i;
////            }
////        }
////        for (int i = 0 ; i < arr2.length ; i++) {
////            System.out.print(arr2[i]+"  ");
////
////        }
        //  声明两个数组
        int[] array1, array2;
        //  给数组1赋值
        array1 = new int[]{2, 3, 5, 7, 11, 13, 17, 19};
        //  遍历输出array1
        for (int i = 0 ; i < array1.length ; i++) {
            System.out.print (array1[i] + " ");

        }
        //  赋值数组1给数组2
        //  相当于把array1的地址值赋给array2。
        //  此时相当于两个都指向该数组的内层地址，不能称之为数组的赋值,
        //  此时array1和array2指向同一个堆空间的地址值
//        array2 = array1;


        //  这个方法才是数组的复制，要区别于数组变量的赋值：array1 = array2
        //  通过new的方式，给array2在堆空间中新开辟了数组的空间，
        //  将array1数组中的元素值一个一个的赋值给array2数组中
        array2 = new int[array1.length];
        for (int i = 0 ; i < array1.length ; i++) {
            array2[i] = array1[i];

        }
        System.out.println ();
//        修改array2中的偶索引元素，使其等于索引值
        for (int i = 0 ; i < array2.length ; i++) {
            if (i % 2 == 0) {
                //  若下标为偶数就修改，使其等于当前脚标
                array2[i] = i;
            }

        }

        //  打印array1
        for (int i = 0 ; i < array1.length ; i++) {
            System.out.print (array1[i] + " ");

        }
        System.out.println ();

        //  此时打印出array2 为 0 3 2 7 4 13 6 19
        for (int i = 0 ; i < array2.length ; i++) {
            System.out.print (array2[i] + " ");
        }


    }
}
