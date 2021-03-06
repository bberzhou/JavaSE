package blackberry.Chapter11Collection.aboutCollection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 12/2/20 20:46
 * Create By IntelliJ IDEA
 */
public class aboutCollectionMethod {
    /**
     *  一、集合框架的概述
     *      1、集合、数组都是对多个数据进行存储操作的结构，简称Java容器。此时的存储是内存的存储，不涉及数据库等
     *          如果一个Java对象可以在内部持有若干其他Java对象，并对外提供访问接口，我们把这种Java对象称为集合
     *
     *      2.1、数组在存储多个数据方面的特点：
     *          》一旦初始化以后，长度就确定了；
     *          》数组一旦定义好，其元素的类型也确定了，只能操作指定类型的数据，比如String[], int[]
     *
     *     2.2、数组在存储多个数据方面的缺点：
     *          》数组初始化后大小不可变,CRUD数据等操作不方便
     *          》数组只能按照索引顺序存取
     *          》获取数组中实际元素的个数的需求，数组没有现成的属性或方法可以用
     *          》无法满足无序、不可重复的需求
     *     因此，我们需要各种不同类型的集合类来处理不同的数据，例如：
     *          》可变大小的顺序链表；
     *          》保证无重复元素的集合
     *     2.3、集合存储的优点
     *          解决数组存储数据方面的弊端
     *
     * 二、Collection类
     *      Java标准库自带的java.util包提供了集合类：Collection接口，它是除Map外所有其他集合类的根接口。
     *      Java的java.util包主要提供了以下三种类型的集合：
     *      List:一种有序列表的集合，例如，按索引排序的Student的List 。元素有序、可重复
     *      Set:一种保证没有重复元素的集合，例如，所有无重复名称的Student的Set。元素无序、不可重复的集合
     *      Map:一种通过键值对(key-value)查找的映射表集合，例如，根据Student的name查找对应Student的Map;
     *
     *     ｜--- Collection：是单列数据，定义了存取一组对象的方法的集合，单列集合框架结构
     *              ｜---List接口：存储有序的、可以重复的数据。   "动态数组"
     *                  ｜---ArrayList、LinkedList、Vector     具体实现类
     *
     *              ｜---Set接口：存储无序、不可重复的数据。
     *                  ｜---HashSet、
     *                  LinkedHashSet、对于频繁的遍历操作，LinkedHashSet效率高于HashSet
     *                  TreeSet   具体实现类
     *
     *     ｜--- Map接口：双列数据，保存具有映射关系的键值对（key-value）集合，   ---》类似函数 y = f(X)
     *                  ｜---HashMap、LinkedHashMap、TreeMap、Hashtable、Properties  具体实现类
     *
     * 三、Java集合的设计特点：
     *          一是实现了接口和实现类相分离，例如，有序表的接口是List，具体的实现类有ArrayList，LinkedList
     *          二是支持泛型，我们可以限制在一个集合中只能放入同一种数据类型的元素，例如，List<String> list = new ArrayList<>(); // 只能放入String类型
     *          Java访问集合总是通过统一的方式——迭代器（Iterator）来实现，
     *          它最明显的好处在于无需知道集合内部元素是按什么方式存储的
     *
     *          Java的集合设计非常久远，中间经历过大规模改进，我们要注意到有一小部分集合类是遗留类，不应该继续使用：
     *          Hashtable:一种线程安全的Map实现
     *          Vector:一种线程安全的List实现
     *          Stack:基于Vector实现的LIFO的栈
     *
     *          一小部分接口是遗留接口，也不应该继续使用：
     *          Enumeration<E> :已经被Iterator<E>取代
     *
     *四、Collection接口中的方法的使用
     *
     *
     *
     *
     *
     */

    //  Collection接口里面声明的常用方法测试
    @Test
    public void test1(){

        Collection collection = new ArrayList ();
        //  add(Object e);  添加元素到集合中，add方法添加的是对象Object，
        collection.add ("AAA");
        collection.add ("BB");
        collection.add (123);   //  自动装箱  int --->Integer
        collection.add (new Date ());

        //  contains(Object obj)：判断当前集合中是否包含obj,返回一个布尔值
        boolean contain = collection.contains (123);
        System.out.println (contain);   //  true
        System.out.println (collection.contains (new String ("AAA")));  //  true
        
        //  size()：获取添加的元素的个数
        System.out.println(collection.size ());

        //  addAll():
        Collection col = new ArrayList ();
        col.add ("CC");
        col.add (456);
        col.addAll (collection);    //  直接添加一个集合进去，相当于添加多个对象
    }
}

