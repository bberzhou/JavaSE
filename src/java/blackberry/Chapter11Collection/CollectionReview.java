package blackberry.Chapter11Collection;

public class CollectionReview {
    /**
     *  Collection复习：
     *      1、集合collection中存储的如果是自定义类的对象，需要自定义类重写哪个方法？为什么？
     *          答:重写equals()方法，
     *              List:也需要重写equals()方法，
     *              Set：（HashSet、LinkedHashSet为例）：equals(),hashcode()方法
     *                  (treeSet为例，存储有序的、不可重复的数据)：Comparable:compareTo(Object obj)
     *                                    Comparator:compare(Object o1,Object o2)，这是在插入的时候，比较两个对象
     *      2、ArrayList,LinkedList,Vector三者的相同点和不同点？【面试】
     *          答：
     *              相同点：ArrayList,LinkedList,Vector都是实现了List接口，存储的数据是有序可重复的
     *              同：三个类都是实现了list接口，存储数据得特点相同：存储有序得、可重复得数据
     *          不同点：
     *              ｜---ArrayList（用的 比较多）：作为list接口得主要实现类，执行效率比较高，线程不安全的，查询时比较方便。底层使用Object[]数组存储，扩容是1.5倍
     *              |---LinkedList:对于频繁的插入、删除操作，使用此类效率比ArrayList高，底层使用的双向链表存储，查询效率比较低，需要全部遍历
     *              |---Vector：list得古老实现类，线程安全的，效率比较低。底层使用Object[]数组存储，扩容是2倍
     *
     *
     *
     *      3、List接口的常用方法有哪些？（增、删、改、查、插、长度、遍历）
     *          add()
     *          remove(int index)/remove(Object obj)
     *          set(int index, Object obj)
     *          get(int index)
     *          add(int index,Object obj)
     *          size()：元素的个数，不是底层数组的长度
     *          三种遍历的方法:
     *              Iterator
     *              foreach
     *              for循环
     *
     *      4、如何使用Iterator和增强for循环遍历List，举例
     *
     *      5、Set存储数组的特点是什么？常见的实现类有什么？说明一下彼此的特点
     *          无序的，不可重复的
     *          下面三个是一一对应的。
     *          hashset---->HashMap
     *          linkedHashSet--------->LinkedHashMap
     *          treeSet---->TreeMap
     *
     *
     */
}
