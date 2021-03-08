package blackberry.Chapter11Collection.aboutSet;

import blackberry.Chapter11Collection.CollectionMethod.Person;
import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class interfaceSet {
    /**
     * 1.Set接口的框架：
     *   ｜--- Collection：是单列数据，定义了存取一组对象的方法的集合，单列集合框架结构
     *      ｜---Set接口：存储无序的、不可重复的数据。---》类似高中里面的集合
     *          具体实现类：
     *          ｜---HashSet：作为Set接口的主要实现类：线程不安全的，并且可以存储null值
     *              ｜---LinkedHashSet：是HashSet的子类，遍历其内部数据时，可以按照添加的顺序遍历
     *
     *          ｜---TreeSet：底层是二叉树存储的（红黑树），是同一个类new的对象，可以按照对象的某些属性排序，对象排序接口：Comparable,Comparator
     *                  可以按照添加对象的指定属性，进行排序
     *
     *          Set接口里面没有额外定义新的方法，使用的都是Collection里面的方法
     *
     *     一、Set:存储无序的、不可重复的数据，HashSet是无序的，因为它实现了Set接口，并没有实现SortedSet接口
     *          1、无序性：
     *              无序性不等于随机性。存储的数据在底层数组中并非按照数组索引的顺序添加的，而是先hash之后再按照Hash值按存放的
     *
     *          2、不可重复性：
     *              保证添加的元素按照equals()方法判断时候，不能返回true，即相同的元素的只能添加一个
     *
     *            Set接口并不保证有序，而SortedSet接口则保证元素是有序的：
     *
     *              HashSet是无序的，因为它实现了Set接口，并没有实现SortedSet接口；
     *              TreeSet是有序的，因为它实现了SortedSet接口。
     *
     *
     *
     *      Set用于存储不重复的元素集合，它主要提供以下几个方法：
     *      将元素添加进Set<E>：boolean add(E e)
     *      将元素从Set<E>删除：boolean remove(Object e)
     *      判断是否包含元素：boolean contains(Object e)
     *
     *      二、Set添加元素的过程，以hashSet为例
     *          HashSet底层实际上一个数组，初始长度为16，添加元素a时，首先计算该元素a的hash值，
     *          即调用改元素a所属类的hashcode()方法进行计算的，此hash值接着通过某种算法计算出在HashSet底层数组中的存放位置（即为索引位置）
     *          判断此位置上是否已经有元素：
     *          如果此位置上没有其他元素，则元素a添加成功 1
     *          如果此位置上有其他元素b(或以链表形式存在的多个元素，则比较元素a与元素b的hash值，
     *              如果hash值相同的话，还需要调用该元素a所在类的equals()方法，
     *                  如果返回true，则表明两个元素完全一样，添加失败；
     *                  如果返回false,则表明两个元素不同，元素a添加成功2
     *              如果hash值不一样则直接使用hash散列的拉链法，加到前一个元素的后面3，（JDK７、８有点区别，７上八下，P５３５），
     *          (就是数据结构里面的散列冲突问题)
     *
     *          对于添加成功的情况2和3而言：元素a与已经存在指定索引位置上的数据以链表的方式存储
     *          JDK7：元素a放到数组中，指向原来的元素b
     *          JDK8：原来的元素放到数组中，指向元素a
     *
     *
     *        hashSet底层就是：数组+链表的结构
     *
     *        1、Set接口中没有额外定义新的方法，使用的都是Collection里面声明过的方法，
     *        2、要求：向Set中添加的数据其所在的类一定要重写hashCode()和 equals()方法
     *          要求：重写的hashCode()和 equals()方法一定要保持一致性：即相同的对象必须具有相等的散列码
     *              重写两个方法的小技巧：对象中用作equals()方法比较的filed,都应该用来计算hashcode
     *
     *
     *
     *
     */

    @Test
    public void test(){
        Set set = new HashSet();
        set.add(456);
        set.add(123);
        set.add("AAA");
        set.add("CCC");
        set.add(new Person("Tom",56));
        set.add(129);


        //  重写User类里面的equals方法
        set.add(new User("LL",89));
        set.add(new User("LL",89));

        //  如果将User类里面的hashcode()方法注释之后，set添加的时候，里面就会有重复的数据
        //Person{name='Tom', age=56}
        //AAA
        //129
        //User{name='LL', age=89}
        //CCC
        //User{name='LL', age=89}
        //456
        //123

        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
            //Person{name='Tom', age=56}
            //AAA
            //129
            //CCC
            //456
            //123
            //输出结果跟添加的顺序不相同，
        }



    }

    @Test
    public void test1(){
        Set set = new HashSet();
        set.add(456);
        set.add(123);
        set.add("AAA");
        set.add("CCC");
        set.add(new Person("Tom",56));
        set.add(129);


        //  重写User类里面的equals方法
        set.add(new User("LL",89));
        set.add(new User("LL",89));

        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //User equals()...方法
        //Person{name='Tom', age=56}
        //AAA
        //129
        //CCC
        //456
        //123
        //User{name='LL', age=89}
        //  如果hashcode方法没有注释的话，此时再添加的时候，就会拿添加的对象的hash值调用equal方法进行比较

    }

}
