package blackberry.Chapter11Collection.aboutMap;

import org.junit.Test;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class intro {
    /**
     * 一、Map的实现类的结构
     *  List是顺序表，而Map这种键值（key-value）映射表的数据结构，作用就是能高效通过key快速查找value（元素）
     *  --|Map：双列数据，存储key-value的键值对数据，类似高中的函数
     *      --| HashMap：作为Map的主要实现类，线程不安全的，效率高；可以存储null的key和Value。底层使用得
     *          --| LinkedHashMap:保证在遍历map元素得时候，可以按照添加得顺序进行遍历
     *                  原因：在原有得HashMap底层结构得基础上，添加了一堆指针，指向前一个和后一个元素。
     *                  此类对于频繁得遍历操作，此类执行效率高于HashMap
     *      --| Hashtable：作为古老的实现类，线程安全的，效率低；不可以存储null的key和Value。底层使用得
     *          --| Properties：常用来处理配置文件，key和value都是String类型的
     *
     *       --| TreeMap:类似TreeSet，保证按照添加得key-value键值对进行排序，实现排序遍历，此时考虑key得自然排序或者定制排序。
     *                  底层是使用得红黑树
     *
     *
     *         HashMap的底层：数组+链表（JDK7以及之前的版本）
     *                       数组+链表+红黑树（JDK8）
     *
     *   面试题目：
     *   1、HashMap的底层实现原理？
     *   2、HashMap和Hashtable的异同？
     *   3、CurrentHashMap（分段锁）和Hashtable的异同？
     *
     *   二、Map
     *      Map<K, V>是一种键-值映射表，无序的，不可重复的，使用Set存储所有的Key。当我们调用put(K key, V value)方法时，就把key和value做了映射并放入Map。
     *      当我们调用V get(K key)时，就可以通过key获取到对应的value。
     *      如果key不存在，则返回null。和List类似，Map也是一个接口，最常用的实现类是HashMap，key不同，到那时value可以相同
     *      map中的key:无序的、不可重复的，使用Set存储所有的key。----》key所在的类需要重写equals()和HashCode()方法（以HashMap为例），如果是treeMap,还需实现comparable
     *      map中的value:无序的、可重复的，使用Collection存储所有的value，----》value所在的类需要重写equals()方法。
     *                  一个键值对：key-value，构成一个Entry对象
     *       map中的entry：无序的、不可重复的，使用Set存储所有的entry
     *       Map中不存在重复的key，因为放入相同的key，只会把原有的key-value对应的value给替换掉。
     *
     *
     *   三、HashMap的底层实现原理？ P550,注意复习
     *      以JDK7为例：
     *      HashMap map = new HashMap();
     *      在实例化以后，底层创建了长度是16的一维数组Entry[] table。
     *      ......可能经过执行过多次put....
     *      map.put(key1, value1)
     *      首先，调用key1所在类的HashCode()计算key1的哈希值，此哈希值经过某种算法计算以后，得到在Entry数组中的存放位置，
     *          如果此位置上的数据为空，此时的key1-value1添加成功，---------情况1
     *          如果此位置上的位置不为空，（就意味着此位置上存在一个或者多个数据（以链表的形式存在），比较key1和已经存在的一个或多个数据的哈希值：
     *                  如果key1的哈希值与已经存在的数据的哈希值都不相同，则此时key1-value1添加成功 ---------情况2
     *                  如果key1的哈希值和已经存在的某一个数据(key2,value2)的哈希值相同，继续比较：调用key1所在类的equals(key 2)方法，
     *                  比较：如果equals()返回false,此时key1-value1添加成功；---------情况3
     *                      如果equals()返回true：使用value替换相同Key的value值。
     *
     *                      因为：Map中不存在重复的key，因为放入相同的key，只会把原有的key-value对应的value给替换掉。
     *                     在一个Map中，虽然key不能重复，但value是可以重复的，即可以：map.put("apple", 123) map.put("pear",123)
     *
     *          补充：关于情况2 和情况3：此时key1-value1和原来的数据以链表的方式存储。
     *
     *          在不断的添加过程中，会涉及到扩容的问题，当超出临界值（且要存放的位置非空的）时，扩容。默认的扩容方式：扩容为原来的2倍，并将原来的数据复制过来
     *
     *
     *
     *          JDK8相较于JDK7在底层实现方面的不同：
     *          1.new HashMap()：底层没有创建一个长度为16的数组
     *          2.JDK8底层的数组是Node[],而非Entry[]
     *                      final int hash;
     *                      final K key;
     *                      V value;
     *                      Node<K,V> next;
     *
     *                      Node(int hash, K key, V value, Node<K,V> next) {
     *                              this.hash = hash;
     *                              this.key = key;
     *                              this.value = value;
     *                              this.next = next;
     *                          }
     *           3.首次调用put()方法时，底层创建长度为16的数组
     *           4.JDK7底层结构只有数组+链表。JDK8中底层结构：数组+链表+红黑树
     *              当数组的某一个索引位置上的元素以链表的形式存储的个数超过8且当前数组的长度超过64时，此时此索引位置上的所有数据改为红黑树存储
     *              loadFactor：加载因子
     *              threshold：临界值
     *
     *              JDK8
     *
     *
     */


    //  测试HashMap和HashTable存放null值得情况
    @Test
    public void test1(){

        Map map = new HashMap();

//        Map map = new Hashtable();
        //  如果是Hashtable就会报错：java.lang.NullPointerException,空指针异常

        //  将key为null得数据放入HashMap,没有报错
        map.put(null,123);
        map.put(null,null);

    }

}
