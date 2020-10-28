package blackberry.day7OOP2;

/**
 * @Description: ArraysUtil
 * @author: bberzhou@gmail.com
 * @date: 4/9/20 16:11
 * Create By IntelliJ IDEA
 */
public class ArraysUtil {
    /*
        自定义一些数组的方法
     */


    //  求数组中的最大值
    public int getMaxValue (int[] arr) {
        int temp = arr[0];
        for (int i = 0 ; i < arr.length ; i++) {

            if (arr[i] > temp) {
                temp = arr[i];
            }
        }
        return temp;
    }

    //  求数组中的最小值
    public int getMinValue (int[] arr) {
        int temp = arr[0];
        for (int i = 0 ; i < arr.length ; i++) {

            if (arr[i] < temp) {
                temp = arr[i];
            }
        }
        return temp;
    }

    //  求数组的总和
    public int getSum (int[] arr) {
        int sum = 0;
        for (int i = 0 ; i < arr.length ; i++) {
            sum += arr[i];
        }
        return sum;
    }

    //  求数组的平均值
    public int getAverageValue (int[] arr) {
//        int average = 0;
//        int sum = 0;
//        for (int i = 0 ; i < arr.length ; i++) {
//            sum += arr[i];
//        }
//        average = sum / arr.length;
//        return average;
        //  直接在方法里面调用方法
        return getSum (arr) / arr.length;
    }

    //  反转数组
    public void reverseArray (int[] arr) {
        for (int i = 0 ; i < arr.length / 2 ; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1];
            arr[arr.length - 1 - i] = temp;
        }

    }

    //  复制数组
    public int[] copyArray (int[] arr) {
        int[] arr1 = new int[arr.length];
        for (int i = 0 ; i < arr.length ; i++) {
            arr1[i] = arr[i];
        }
        return arr1;
    }

    //  数组排序
    public void sortArray (int[] arr) {
        for (int i = 0 ; i < arr.length ; i++) {
            for (int j = 0 ; j < arr.length - 1 - i ; j++) {
                if (arr[j] > arr[j + 1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
                    //  直接调用数字交换指定位置元素的方法,交换的是j和j+1两个位置的元素
                    swap (arr, j, j + 1);
                }
            }
        }
    }

    //  Java中的引用数据类型的传递
    //  错误的：交换数组中指定两个位置元素的值
//    public void swap(int i, int j){
//        int temp = i;
//        i = j;
//        j = temp;
//    }
    //  正确的写法
    public void swap (int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    //  遍历数组
    public void printArray (int[] arr) {
        for (int i = 0 ; i < arr.length ; i++) {
            System.out.print (arr[i] + " ");
        }

    }

    //  查找指定元素
    public int searchValueIndex (int[] arr, int dest) {
        //  线性查找
//        int index = 0;
//        boolean isFlag = true;
//        for (int i = 0 ; i < arr.length ; i++) {
//            if (arr[i] == dest) {
//                index = i;
//                isFlag = false;
//                break;
//            }
//        }
//        if(isFlag){
//            System.out.println("在数组中没有找到");
//        }
//        return index;

        //  改进
        for (int i = 0 ; i < arr.length ; i++) {
            if (arr[i] == dest) {
                return i;
            }
        }
        return -1; //   返回一个负数表示在数组中没有查找到与dest相同的元素
    }
}
