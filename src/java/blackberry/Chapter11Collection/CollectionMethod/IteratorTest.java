package blackberry.Chapter11Collection.CollectionMethod;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 *  一、集合元素的遍历操作，使用iterator迭代器接口，也是一种设计模式，主要用来遍历Collection集合里面的元素
 *  --迭代器设计模式：提供一种方法访问一个容器（container）对象中各个元素，而又不需要暴露该对象的内部细节。类似于售票员这种角色
 *  -- collection接口继承了java.lang.Iterable接口，该接口有一个Iterator方法，那么所有实现了Collection接口的集合类都有一个
 *      Iterator()方法，用来返回一个实现类Iterator接口的对象
 *
 *    二、Iterator是一种抽象的数据访问类型，使用Iterator模式进行迭代的好处”
 *      --对任何集合都采用同一种访问模型
 *      --调用者对集合内部结构一无所知
 *      --集合类返回的iterator对象知道如何迭代
 *      Java提供了标准的迭代器模型，即集合类实现java.util.Iterable接口，返回java.util.Iterator实例。
 *
 *    三、集合对象每次调用Iterator()方法的时候都得到一个全新的迭代器对象，默认游标都在集合的第一个元素之前
 *    四、内部定义了remove()方法，可以在遍历的时候，删除集合中的元素，此方法不同于集合里面直接调用remove()方法
 *      注意，如果还没调用next()或者在上一次调用next方法之后已经调用了remove方法，再调用remove都会报IllegalStateException错误.
 *
 *
 */
public class IteratorTest {
    @Test
    public void test1(){
        // 迭代器iterator的使用
        Collection coll = new ArrayList();
        coll.add(123);  //  自动装箱成Integer
        coll.add(456);
        coll.add(new java.lang.String("Tom"));

        coll.add(false);    //会自动装箱为 Boolean类型的值
        //  首先获得一个迭代器对象

        /**
         *  Iterator 里面包含的方法
         *      1、forEachRemaining()，对每个剩余元素执行给定的操作，直到所有元素都被处理或动作引发异常
         *
         *      2、hasNext()，如果迭代具有更多元素，则返回true Boolean值
         *
         *      3、next()，返回迭代中的下一个元素，返回值是
         *
         *      4、remove()，从底层集合中删除此迭代器返回的最后一个元素，default void
         *
         *
          */
        Iterator iterator = coll.iterator();
        //  方式一：
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        java.util.NoSuchElementException，一直next会报错信息

        //  方式二：先控制输出的次数
//        for (int i = 0; i < coll.size(); i++) {
//            System.out.println(iterator.next());
//        }

        //  方式三：通过iterator.HasNext()来判断是否还有下一个元素，next()，①指针下移，②，将下移以后集合位置上的元素返回
        while (iterator.hasNext()){
            // 如果还有下一个元素就输出
            System.out.println(iterator.next());
        }

    }
    @Test
    public void test2(){
        // 迭代器iterator的错误使用
        Collection coll = new ArrayList();
        coll.add(123);  //  自动装箱成Integer
        coll.add(456);
        coll.add(new java.lang.String("Tom"));

        coll.add(false);    //会自动装箱为 Boolean类型的值


        //  错误方式一：在判断的时候，不使用hasNext()方法来判断,使用next()是否为空来判断，此时报错
        //  首先获得一个迭代器对象
//        Iterator iterator = coll.iterator();
//        while (iterator.next() != null){
//            System.out.println(iterator.next());
//        }
//        报错信息java.util.NoSuchElementException

        //  错误方式二：出现死循环的情况，不断的输出第一个元素，因为每次coll.iterator()，
        //  都会返回一个新的Iterator对象，默认游标都是在第一个，这样每次返回的都是集合的第一个元素
//        while (coll.iterator().hasNext()){
//            System.out.println(coll.iterator().next());
//        }

    }

    @Test
    public void test4(){
        //  迭代器里面的remove()方法
        Collection coll = new ArrayList();
        coll.add(123);  //  自动装箱成Integer
        coll.add(456);
        coll.add(new java.lang.String("Tom"));

        coll.add(false);    //会自动装箱为 Boolean类型的值
        //  首先获得一个迭代器对象
        Iterator iterator = coll.iterator();
        while (iterator.hasNext()){
//            iterator.remove();,直接删除就会报错
            Object obj = iterator.next();
            //  判断如果集合里面有一个Tom对象，就删除它
            if ("Tom".equals(obj)){
                iterator.remove();
//                iterator.remove();    remove之后又继续调用也会报错
            }
        }

        //  重新遍历一下集合中的数据
        Iterator iterator1 = coll.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
//        输出结果
//123
//456
//false
    }
}
