package blackberry.Chapter11Collection.CollectionMethod;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 *  Collection接口中声明的方法的测试
 *  **** 重点：向Collection接口的实现类的对象中添加数据obj时，要求obj所在类要重写equals()方法。
 */
public class CollectionMethods {
    //  1、添加方法 add(Object obj), addAll(Collection coll)
    @Test
    public void test1(){
        Collection coll = new ArrayList();
        coll.add(123);  //  自动装箱成Integer
        coll.add(456);
        coll.add(new java.lang.String("Tom"));

        coll.add(false);    //会自动装箱为 Boolean类型的值



        System.out.println(coll.contains(123)); //  contains()方法返回一个布尔值 true,
        //  这里比较两个对象，调用的是equals()方法，不是==，而String里面的equals()方法已经被重写过了，比较的是内容
        System.out.println(coll.contains(new String("Tom")));   //  true

////        coll.add(new Person("Tom",88));
//        Person p = new Person("Tom",90);
//        coll.add(p);
//        coll.contains(p);   //  true

        //  在contains里面重新new 一个对象
        coll.add(new Person("Tom",88));
        //  这里因为Person里面没有重写equals方法，所以就是Object里面默认的 == ,因此返回的是false
        //  重写Person类里面的equals方法之后，返回的就是true，并且比较的次数跟coll里面添加的元素对象个数有关，因为ArrayList是有序的
        System.out.println(coll.contains(new Person("Tom",88)));    //  此时返回的是 false

        // ---结论：在使用Contains方法比较的时候，会调用Contains(Object obj)，obj对象所在类的equals方法

        //  containsAll(Collection coll):判断形参coll中所有元素是否都存在于当前集合中,
        //  Arrays.asList，把数组转换成为list
        Collection coll1 = Arrays.asList(123,456);
        System.out.println(coll.containsAll(coll1));    //  传入一个集合参数    true
        System.out.println(coll.containsAll(Arrays.asList(123,4)));     //  false

    }

    @Test
    public void test2(){
        //  remove(Object obj)
        Collection coll = new ArrayList();
        coll.add(123);  //  自动装箱成Integer
        coll.add(456);
        coll.add(new java.lang.String("Tom"));

        coll.add(false);    //会自动装箱为 Boolean类型的值
        coll.remove(123);
        System.out.println(coll);   //  [456, Tom, false] 此时集合里面还有这几个元素，移除成功，remove返回值是一个true

        //  removeAll(Collection coll)
        System.out.println(coll.removeAll(Arrays.asList(456))); //  删除成功，返回true


    }


    @Test
    public void test3(){
        //  retainAll(Collection coll1)：求交集，获取当前集合和coll1集合的交集，并返回给coll
        Collection coll = new ArrayList();
        coll.add(123);  //  自动装箱成Integer
        coll.add(456);
        coll.add(new java.lang.String("Tom"));

        coll.add(false);    //会自动装箱为 Boolean类型的值
        Collection coll1 = Arrays.asList(123,456);
        coll.retainAll(coll1);
        System.out.println(coll);       //  [123, 456] 相当于求这两个集合的交集，并且会修改coll，不会修改传入的形参

    }


    @Test
    public void test4(){
        //  equals(Object obj)：要想返回true，需要当前集合和形参集合的元素都相同（List的就是有序的，set就是无序的）
        Collection coll = new ArrayList();
        coll.add(123);  //  自动装箱成Integer
        coll.add(456);
        coll.add(new java.lang.String("Tom"));

        coll.add(false);    //会自动装箱为 Boolean类型的值

        Collection coll1 = new ArrayList();
        coll1.add(123);  //  自动装箱成Integer
        coll1.add(456);
        coll1.add(new java.lang.String("Tom"));

        coll1.add(false);    //会自动装箱为 Boolean类型的值
        System.out.println(coll.equals(coll1));     //  true，
        // 两个集合里面的元素一个一个比较，并且比较的时候也是按照每个集合里面的顺序进行比较的，因为ArrayList是有序的集合


    }

    @Test
    public void test5(){
        Collection coll = new ArrayList();
        coll.add(123);  //  自动装箱成Integer
        coll.add(456);
        coll.add(new java.lang.String("Tom"));

        coll.add(false);    //会自动装箱为 Boolean类型的值
        System.out.println(coll.hashCode());    //  返回当前集合对象的哈希值：7639761

        //  转换成对象数组 Object[] toArray()，集合---->数组.toArray()
        Object[] objects = coll.toArray();
        //  循环遍历数组
        for (int i = 0; i < objects.length; i++) {
            System.out.print(objects[i]+ " ");      // 123 456 Tom false
        }
        System.out.println();
        //  数组转换为集合, 数组---->集合，调用Arrays类的静态方法aslist()
        List<String > list = Arrays.asList(new String[]{"AAA","BBB","CCC"});
        System.out.println(list);   //  将字符串数组转换为List集合，[AAA, BBB, CCC]
        List arr1 = Arrays.asList(new int[]{123,456});
        System.out.println(arr1.size());    //  1，此时把传入的形参数组看成了一个元素,所以list集合的长度为1
        List arr2 = Arrays.asList(new Integer[]{123,456});
        System.out.println(arr2.size());        //  2，如果是包装类的话，此时的集合元素大小就是2

        // 也可以直接不用数组
        List arr3 = Arrays.asList(124,456);     //  这样就是两个参数
        System.out.println(arr3.size());


    }

    @Test
    public void test6(){
        //iterator()：返回iterator接口的实例，用于遍历集合元素，

    }
    //  2、获取元素个数int size()


    //  3、清空集合 void clear()


    //  4、集合是否为空 boolean isEmpty()

    //  5、是否包含某个元素 Boolean contains(Object obj)：是通过元素的equals方法来判断是否是同一个对象，
    //      Boolean containsAll(Collection c):也是调用元素的的equals方法来比较的，拿两个集合的元素挨个比较

    //  6、删除 boolean remove(Object obj)：通过元素的equals方法判断是否是要删除的那个元素，只会删除找到的第一个元素，
    //      boolean removeAll(Collection c)：去当前集合的差集

    //  7、取两个集合的交集 boolean retainAll(Collection c)：把交集的结果存在当前集合中，不影响c

    //  8、两个集合是否相等 Boolean equals(Object obj)

    //  9、转换成对象数组 Object[] toArray()

    //  10、获取集合对象的哈希值 hashcode()

    //  11、 遍历 iterator()：返回迭代器对象，用于集合遍历




}
