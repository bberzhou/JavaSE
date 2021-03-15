package blackberry.Chapter11Collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsUtilClass {
    /**
     *  Collections工具类（是一个操作Set、List、和Map等集合）的使用;
     *  Collections是JDK提供的工具类，同样位于java.util包中。
     *  它提供了一系列静态方法，能更方便地操作各种集合进行排序、查询和修改等操作，
     *  还提供了对集合对象设置不可变、对集合对象实现同步控制等方法
     *
     *  一、创建空集合，Collections提供了一系列方法来创建空集合
     *      创建空List：List<T> emptyList()
     *      创建空Map：Map<K, V> emptyMap()
     *      创建空Set：Set<T> emptySet()
     *      要注意到返回的空集合是不可变集合，无法向其中添加或删除元素
     *
     *      也可以用各个集合接口提供的of(T...)方法创建空集合。例如，以下创建空List的两个方法是等价的：
     *      List<String> list1 = List.of();
     *      List<String> list2 = Collections.emptyList();
     *
     *   二、创建单元素集合
     *      Collections提供了一系列方法来创建一个单元素集合：
     *      创建一个元素的List：List<T> singletonList(T o)
     *      创建一个元素的Map：Map<K, V> singletonMap(K key, V value)
     *      创建一个元素的Set：Set<T> singleton(T o)
     *
     *      要注意到返回的单元素集合也是不可变集合，无法向其中添加或删除元素。
     *      此外，也可以用各个集合接口提供的of(T...)方法创建单元素集合。例如，以下创建单元素List的两个方法是等价的
     *      List<String> list1 = List.of("apple");
     *      List<String> list2 = Collections.singletonList("apple");
     *
     *      实际上，使用List.of(T...)更方便，因为它既可以创建空集合，
     *      也可以创建单元素集合，还可以创建任意个元素的集合
     *
     *   三、排序操作：（都是static方法）
     *      reverse(List)：反转List中元素的顺序
     *      shuffle(List)：对List集合元素进行随机排序
     *      sort(List)：根据元素的自然顺序对指定List集合元素按升序排序
     *      sort（List，comparator）：根据指定的Comparator产生的顺序对List集合元素进行排序
     *      swap（List，int i，int j）:将指定的list集合中的第i和第j个元素进行交换
     *      Object max(Collection)：根据元素的自然排序，返回给定集合中的最大元素
     *      Object max(Collection, Comparator)：根据Comparator指定的排序顺序，返回给定集合中的最大元素
     *      Object min(Collection)
     *      Object min(Collection, Comparator)：
     *      int frequency(Collection, Object):返回指定集合中指定元素的出现次数
     *      void copy(List dest, List src)：将src中的内容复制到dest中
     *      boolean replaceAll( List list, Object oldVal, Object newVal)：使用新值替换List
     *
     *
     *
     *
     *
     *    四、面试题：
     *      Collection和Collections的区别？
     *      Collection是创建集合的接口，Collections是工具类
     *      Collections是操作Collection的工具类，Collection是存储单列数据的接口
     *
     *
     *
     *
     *
     *
     */

    @Test
    public void test(){
        List list  = new ArrayList<>();
        list.add(123);
        list.add(322);
        list.add(78);
        list.add(889);
        System.out.println(list);   // 输出结果： [123, 322, 78, 889]
//        Collections.reverse(list);
//        System.out.println(list);   //  list元素反转 [889, 78, 322, 123]

//        Collections.shuffle(list);
//        System.out.println(list);     //  list元素随机排序

//        Collections.sort(list);
//        System.out.println(list);   //  sort()方法，按照list元素升序排序：[78, 123, 322, 889]

//        Collections.swap(list,1,2); //  交换list的第1和第j个位置的元素
//        System.out.println(list);
        //[123, 322, 78, 889]
        //[123, 78, 322, 889]


    }
}
