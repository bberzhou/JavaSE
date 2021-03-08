package blackberry.Chapter11Collection;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 3/8/21 09:22
 * Create By IntelliJ IDEA
 */
public class ListReview {
    /**
     *  List接口复习：
     *   1、Collection：是单列数据，定义了存取一组对象的方法的集合，单列集合框架结构
     *        ｜---List接口：存储有序的、可以重复的数据。   "动态数组"
     *          具体实现类：
     *           ｜---ArrayList、作为list接口的主要实现类，线程不安全的，效率较高，底层使用object[] elementData存储
     *           ｜---LinkedList、对于频繁的插入、删除操作，使用此类效率比ArrayList高，底层使用双向链表存储
     *           ｜---Vector 、作为list接口的古老实现类：线程安全的，效率低，底层使用object[] elementData[]存储
     *
     *   2、常用方法：
     *      增：
     *      删：
     *      改：
     *      查：
     *      插：
     *      长度：
     *      遍历：
     *  3、存储的元素的要求：
     *      添加的对象，所在的类要重写equals()方法
     *
     *
     *   面试题：
     *      ArrayList、LinkedList、Vector三者的异同？
     *          相同点：三个类都实现了list接口，存储数据的特点相同：存储有序的，可重复的数据
     *          不同点：1部分和底层源码
     *
     *
     *
     */
}
