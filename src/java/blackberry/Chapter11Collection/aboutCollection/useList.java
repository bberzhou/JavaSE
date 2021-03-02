package blackberry.Chapter11Collection.aboutCollection;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 12/2/20 21:15
 * Create By IntelliJ IDEA
 */
public class useList {
    /**
     * 在集合类中，List是最基础的一种集合：它是一种有序列表
     * List的行为和数组几乎完全相同：List内部按照放入元素的先后顺序存放，
     * 每个元素都可以通过索引确定自己的位置，List的索引和数组一样，从0开始。
     * <p>
     * 在实际应用中，需要增删元素的有序列表，我们使用最多的是ArrayList。
     * 实际上，ArrayList在内部使用了数组来存储所有元素。
     * 例如，一个ArrayList拥有5个元素，实际数组大小为6（即有一个空位）
     * 数组已满，没有空闲位置的时候，ArrayList先创建一个更大的新数组，然后把旧数组的所有元素复制到新数组，紧接着用新数组取代旧数组
     * ArrayList把添加和删除的操作封装起来，让我们操作List类似于操作数组，却不用关心内部元素如何移动
     * <p>
     * <p>
     * <p>
     * 比较               ArrayList   LinkedList
     * <p>
     * 获取指定元素              速度很快    需要从头开始查找元素
     * 添加元素到末尾             速度很快    速度很快
     * 在指定位置添加/删除元素    需要移动元素   不需要移动
     * 内存占用                 少           较大
     * <p>
     * List的特点：
     * 使用List时，我们要关注List接口的规范。List接口允许我们添加重复的元素，即List内部的元素可以重复
     */

    public static void main (String[] args) {
        //  创建List的方式一：
        List<Integer> list = new ArrayList<> ();
        list.add (1);
        list.add (4);
        System.out.println (list.size ());

        //  遍历List
        for (int i = 0 ; i < list.size () ; i++) {
            //  list.get()方法获取元素
            System.out.println (list.get (i));

        }

        //  创建List的方式二：
//        List<Integer> list1 = List.of(1,3,4);


    }
}
