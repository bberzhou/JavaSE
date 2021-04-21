package lanqiaobei;

import java.util.*;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 4/15/21 19:42
 * Create By IntelliJ IDEA
 */
public class Huffman2 {
    public static void main (String[] args) {
        //  输入
        Scanner in = new Scanner (System.in);
        //  list长度
        int len = in.nextInt ();
        //  创建一个ArrayList,用于存放键盘输入的数据
        ArrayList<Integer> list = new ArrayList<> ();
        //  记录求和值
        int flag = 0;
        //  循环添加元素
        for (int i = 0 ; i < len ; i++) {
            list.add (in.nextInt ());
        }
        //  自定义升序排序，实现Comparator()接口
        Comparator<Integer> c = (o1, o2) -> {
            if ((int) o1>(int)o2){
                return 1;
            }
            else return -1;
        };
        //  遍历List,取出最小的两个值，并将这两个删除，将所求的和添加到List
        //  并记录flag值
        for (int i = list.size () ; i>1  ; i--) {
            Collections.sort (list);
            int sum = list.get (0) + list.get (1);
            System.out.println (sum);
            list.remove (0);
            list.remove (0);
            list.add (sum);
            flag += sum;
        }
        System.out.println (flag);
    }
}
