package blackberry.day7OOP2;

/**
 * @Description: question
 * @author: bberzhou@gmail.com
 * @date: 4/10/20 09:38
 * Create By IntelliJ IDEA
 */
public class Question1 {
    /*
        定义一个int型的数组：int[] arr = new int[]{12,3,3,34,56,77,432}；
        让数组的每个位置上的值去除以首位置的元素，得到的结果，作为该位置上面的新值，遍历新的数组

     */
    public static void main (String[] args) {
        int[] arr = new int[]{12, 3, 3, 34, 56, 77, 432};
        //  如果一开始就从前面开始就容易出现问题，
//        for (int i = 0 ; i < arr.length ; i++) {
//            arr[i] = arr[i]/arr[0];
//            System.out.print(arr[i]+" "); //  1, 3, 3, 34, 56, 77, 432
//        }
        for (int i = arr.length - 1 ; i >= 0 ; i--) {
            arr[i] = arr[i] / arr[0];

        }
        for (int i = 0 ; i < arr.length ; i++) {
            System.out.print (arr[i] + " ");   //  1 0 0 2 4 6 36
        }
        System.out.println ();
        int[] arr1 = new int[]{45, 624, 6, 34};
        //  PrintStream  public void println(Object x)
        System.out.println (arr1);  //  [I@2503dbd3

        char[] arr2 = new char[]{'a', 'b', 'c'};
        //  PrintStream  public void println(char[] x )
        System.out.println (arr2);  //  abc
    }
}
