package blackberry.Chapter11Collection.aboutSet;

import blackberry.Chapter11Collection.CollectionMethod.Person;
import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetTest {
    /**
     *   LinkedHashSet的使用：
     *   1、LinkedHashSet在存放的时候，在HashSet的基础上，额外的增加了前指针和后指针来记录了先后顺序，
     *      这里的有序不是指的在底层数组里面存放时的顺序，而是每个元素之间的链式关系。
     *      LinkedHashSet作为HashSet的子类，在添加数据的同时，每个数据还维护了两个引用，记录此数据的前一个和后一个
     *
     *      LinkedHashSet的优点是，对于频繁的遍历操作，LinkedHashSet效率高于HashSet
     *
     *
     */
    @Test
    public void test() {
        Set set = new LinkedHashSet();
        set.add(456);
        set.add(123);
        set.add("AAA");
        set.add("CCC");
        set.add(new Person("Tom", 56));
        set.add(129);


        //  重写User类里面的equals方法
        set.add(new User("LL", 89));
        set.add(new User("LL", 89));

        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());

            //456
            //123
            //AAA
            //CCC
            //Person{name='Tom', age=56}
            //129
            //User{name='LL', age=89}
            //  LinkedHashSet的输出结果
        }
    }
}
