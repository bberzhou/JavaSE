package blackberry.Chapter11Collection;

import org.junit.Test;

import javax.jnlp.ClipboardService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsUtilClass {
    /**
     * Collections工具类的使用:操作Collection、Map的工具类
     * <p>
     * 面试题：Collection和Collections的区别？
     * Collection是创建集合的接口，Collections是操作集合（Collection）的工具类
     * Collection是存储单列数据的接口
     * <p>
     * 常用的方法：
     * reverse(List):反转list中的元素的顺序
     * shuffle(List):对list集合元素进行随机排序
     * sort(List):根据元素的自然顺序对指定List集合中的元素按照升序排序
     * sort(List,Comparator):根据指定的Comparator产生的顺序对List集合中的元素进行排序
     * <p>
     * swap(List, int i,int j):将指定list集合中的i处元素和j处元素进行交换
     * <p>
     * Object max(Collection):根据元素的自然顺序，返回给定集合中的最大元素
     * Object max(Collection,Comparator):根据Comparator指定的顺序，返回给定集合中的最大元素
     * <p>
     * Object min(Collection):
     * Object min(Collection, Comparator):
     * <p>
     * int frequency(Collection,Object):返回指定集合中指定元素的出现次数
     * void copy(List dest, List src):将src中的内容复制到dest中
     * boolean replaceAll(List list, Object oldVal, Object newVal):使用新值替换list中指定的旧值
     */

    @Test
    public void test () {
        List list = new ArrayList ();
        list.add (123);
        list.add (566);
        list.add (189);
        list.add (-98);
        System.out.println (list);  //  输出原始集合中的元素：[123, 566, 189, -98]
        //  对list进行一个反转操作
        Collections.reverse (list);
        System.out.println (list);  //  反转之后的输出结果：[123, 566, 189, -98]

        //  对list随机排序
        Collections.shuffle (list);
        System.out.println (list);  //  list随机排序的输出结果

        //  sort()方法默认升序排序
        Collections.sort (list);
        System.out.println (list);  //  升序排序结果：[-98, 123, 189, 566]

        //  将指定位置的元素交换
        Collections.swap (list,1,2);
        System.out.println (list);  //  [-98, 189, 123, 566],第一个和第二个元素交换之后

        //  返回改集合中的max
        Object o = Collections.max (list);
        System.out.println (o);     //  566

        //   元素出现的次数
        System.out.println (Collections.frequency (list,566));  //  1，出现一次


    }
    @Test
    public void test1(){
        // 复制问题
        List list = new ArrayList ();
        list.add (123);
        list.add (566);
        list.add (189);
        list.add (-98);
        //  将list集合复制到dest里面去
//        List dest = new ArrayList (); 这里也不能直接指定list的长度
        //  输出的时候报错：IndexOutOfBoundsException: Source does not fit in dest
//        Collections.copy (dest,list);
        List dest = Arrays.asList (new Object[list.size ()]);   //  使用Arrays.asList来创建，并初始化长度为list的长度
        System.out.println (dest);      //  初始的时候，全部为null，[null, null, null, null]
        Collections.copy (dest,list);
        System.out.println (dest);      //  这样就能成功的复制list到dest，[123, 566, 189, -98]


    }

    /**
     *  Collections常用方法：同步控制
     *  Collections类中提供了多个synchronizedXXX()方法，该方法可以使将指定集合包装成线程同步的集合，
     *  从而可以解决多线程并发访问集合时的线程安全问题
     *
     */
    @Test
    public void test2(){
        List list1 = new ArrayList ();
        List list = Collections.synchronizedList (list1);
        //  这样就可以把list1变成线程安全的了
    }
}
