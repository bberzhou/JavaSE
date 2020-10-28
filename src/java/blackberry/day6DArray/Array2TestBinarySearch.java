package blackberry.day6DArray;

/**
 * @Description: binary-search
 * @author: bberzhou@gmail.com
 * @date: 4/7/20 09:50
 * Create By IntelliJ IDEA
 */
public class Array2TestBinarySearch {
    /*
        二分法查找：前提是所查找的数组必须是有序的(熟悉)
     */
    public static void main (String[] args) {
        int[] arr = new int[]{-98, -34, 2, 34, 54, 66, 79, 105, 210};
        int dest = 50;
        int head = 0;// 初始的首索引
        int rear = arr.length - 1;//    初始的末索引
        //  设置一个标志来判断是否查找到
        boolean isFlag = true;
        //  注意while条件
        while (head <= rear) {
            //  先取下标中间值
            int mid = (rear + head) / 2;
            //  判断是否和中间值相等
            if (dest == arr[mid]) {
                System.out.println ("找到了，指定的位置为：" + mid);
                isFlag = false;
                break;
                //  判断中间值和所查找值的大小，并改变head和rear的值
            } else if (arr[mid] > dest) {
                rear = mid - 1;
            } else {
                //  arr[mid] < dest
                head = mid + 1;
            }
        }
        //  当isFlag为false的时候就表明正确找到了该元素
        if (isFlag) {
            System.out.println ("没有找到该元素！");
        }
    }
}
