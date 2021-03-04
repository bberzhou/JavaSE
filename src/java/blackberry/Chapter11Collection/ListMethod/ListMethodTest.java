package blackberry.Chapter11Collection.ListMethod;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListMethodTest {
    /**
     *  List里面的常用方法：、
     *
     *  一、因为List是Collection里面的子接口，所以Collection里面的方法List都可以使用，
     *      除此之外还添加了一些根据索引来操作集合元素的方法，因为List是有序的
     *
     *    void add(int index, Object o):在index位置插入o元素
     *    Boolean addALl(int index, Collection coll):从index位置开始将coll中的所有元素添加进来
     *    int indexOf(Object o):返回o在集合中首次出现的位置
     *    int lastIndexOf(Object obj)：返回obj在当前集合中最后出现的位置
     *    Object get(int index):返回指定index位置的元素
     *    Object remove(int index):移除指定index位置的元素，并返回此元素
     *    Object set(int index, Object o)：设置指定index位置得元素为o
     *    List subList(int fromIndex, int toIndex):返回从fromIndex到toIndex位置得子集合
     *
     *    总结：
     *      常用方法：
     *          增：add(Object obj)
     *          删:remove(int index), remove(Object obj)这个是在Collection里面定义的
     *          改：set(int index, Object obj)
     *          查: get(int index)
     *          插：add(int index,Object obj)
     *          长度：size()
     *          遍历：① iterator迭代器方式
     *                ②增强for循环，foreach
     *                ③普通for循环
     *
     *
     */

    @Test
    public void test1(){
        //  测试List接口得相关方法
        List list = new ArrayList();
        list.add(56);
        list.add("apple");
        list.add(new String("Tom"));

        //  list里面运行添加重复得元素
        list.add("apple");
        System.out.println(list.size());    //  4
        //  list里面还允许添加元素null
        list.add(null);
        System.out.println(list.size());    //  添加null之后为 5
        System.out.println(list);   //  输出得时候，也是有序输出得，[56, apple, Tom, apple, null]


        //  void add(int index, Object o):在index位置插入o元素
        list.add(3,555);
        System.out.println(list);       //  [56, apple, Tom, 555, apple, null]，在index3 插入元素

//        Boolean addALl(int index, Collection coll):从index位置开始将coll中的所有元素添加进来
        //  Boolean addALl(int index, Collection coll):从index位置开始将coll中的所有元素添加进来
        List list1 = Arrays.asList(568,98,78);

//        list.addAll(list1);
//        System.out.println(list.size());    //  依次把list1加入进去， 长度为9

        //  如果是add()，就是把形参作为一个整体插入
        list.add(list1);
        System.out.println(list.size());    //  如果是add()，那么插入得就是list1这个整体。  输出为7

        //  int indexOf(Object o):返回o在集合中首次出现的位置
        System.out.println(list.get(3));    //。如果不存在返回-1    //  返回值为555

        //  int lastIndexOf(Object obj)：返回obj在当前集合中最后出现的位置
        System.out.println(list.lastIndexOf("apple"));  //  4

        //  Object remove(int index):移除指定index位置的元素，并返回此元素
        //  remove(int index)，这里是按照索引删除，remove (Object obj)按照对象删除不是这个要注意
        System.out.println(list.remove(2));     //  删除完成之后，返回的是被删除得那个元素
        System.out.println(list);       // 删除之后 [56, apple, 555, apple, null, [568, 98, 78]]

        //  Object set(int index, Object o)：设置指定index位置得元素为o
        Object o = list.set(0,"hhh");
        System.out.println(o);  //  注意此时返回的对象是被替换的位置的原始元素，//  返回值为56
        System.out.println(list);       //  删除之后的集合[hhh, apple, 555, apple, null, [568, 98, 78]]

        //  List subList(int fromIndex, int toIndex):返回从fromIndex到toIndex位置得子集合

        System.out.println(list.subList(2,4));  //  子集截取的时候是左闭又开


    }
    @Test
    public void test2(){
        //  测试List接口得相关方法
        List list = new ArrayList();
        list.add(56);
        list.add("apple");
        list.add(new String("Tom"));

        //  list里面运行添加重复得元素
        list.add("apple");
        System.out.println(list);

        //  Object set(int index, Object o)：设置指定index位置得元素为o
        Object o = list.set(0,"hhh");
        System.out.println(o);  //  注意此时返回的对象是被替换的位置的原始元素
        System.out.println(list);

        //  List subList(int fromIndex, int toIndex):返回从fromIndex到toIndex位置得子集合

        System.out.println(list.subList(2,3));

    }
    @Test
    public void test3(){
        //  测试List接口得相关方法
        List list = new ArrayList();
        list.add(56);
        list.add("apple");
        list.add(new String("Tom"));

        //  list里面运行添加重复得元素
        list.add("apple");

        //  测试list遍历

        //  方式一、iterator
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
            //  56
            //apple
            //Tom
            //apple
            //  使用迭代器遍历输出
        }
        //  方式二、增强for循环
        for (Object obj :
                list) {
            System.out.println(obj);
        }
        //56
        //apple
        //Tom
        //apple
        //  使用foreach遍历


        //  方式三、for循环
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        //56
        //apple
        //Tom
        //apple
        //      使用for循环遍历
    }
}
