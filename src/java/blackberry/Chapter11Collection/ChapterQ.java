package blackberry.Chapter11Collection;

import blackberry.Chapter11Collection.aboutSet.User;
import org.junit.Test;

import java.util.*;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 3/14/21 21:11
 * Create By IntelliJ IDEA
 */
public class ChapterQ {
    /**
     * 章节问题：
     * 1、请从键盘随机输入10个整数保存到List中，并按照倒序，从大到小的顺序显示出来。
     * 2、请把学生名和考试分数录入到集合中，并按照分数显示前三名成绩学员的名字
     */

    public static void main (String[] args) {
//        System.out.println ("请输入10个整数：");
//        Scanner scanner = new Scanner (System.in);
//        List list = new ArrayList ();
//        for (int i = 0 ; i < 10 ; i++) {
//            int j = scanner.nextInt ();
//            list.add (j);
//        }
//        //  没有反转前的list
//        System.out.println ("没反转前："+list);
//        Collections.reverse (list);
//        System.out.println ("after reverse:"+list);
//
//        //  给list先排序之后再反转
//        Collections.sort (list);
//        Collections.reverse (list);
//        System.out.println (list);


        System.out.println ("---------------第二题----------");

        HashMap hashMap = new HashMap ();
        User u1 = new User ("Jack", 21);
        User u2 = new User ("Tony", 22);
        User u3 = new User ("Mike", 18);
        User u4 = new User ("Jon", 24);
        User u5 = new User ("kk", 20);
        hashMap.put (u1, 90);
        hashMap.put (u2, 88);
        hashMap.put (u3, 79);
        hashMap.put (u4, 94);
        hashMap.put (u5, 95);
        //  a set view of the mappings contained in this map
        List list1 = new ArrayList (hashMap.entrySet ());
        /**
         *  Comparator可以对集合对象或者数组进行排序的比较器接口，实现该接口的public compare(T o1,To2)方法即可实现排序，
         *  该方法主要是根据第一个参数o1,小于、等于或者大于o2分别返回负整数、0或者正整数
         */
        Collections.sort (list1, new Comparator<Map.Entry<User, Integer>> () {

            //            @Override
//            public int compare (Map.Entry<User, Integer> o1, Map.Entry<User, Integer> o2) {
//                return o1.getValue () - o2.getValue ();
//
//            }
            @Override
            public int compare (Map.Entry<User, Integer> o1, Map.Entry<User, Integer> o2) {
                return o2.getValue () - o1.getValue ();

            }
        });
//        for (Object o : list1) {
//            System.out.println (o);
//        }
        for (int i = 0 ; i <3 ; i++) {
            System.out.println (list1.get (i));
        }
        //User{name='Mike', age=18}=79
        //User{name='Tony', age=22}=88
        //User{name='Jack', age=21}=90
        //User{name='Jon', age=24}=94
        //User{name='kk', age=20}=95
        //  排序之前，先将HashMap转换成list，然后调用Collections.sort(list ,)，按照指定的方式进行排序，
        //  因为这里是HashMap，所以获取value值进行排序时，需要

    }

    /**
     *  问题：对一个Java源文件中的关键字进行计数操作
     *      提示：Java源文件中的每一个单词，需要确定该单词是否是一个关键字，可以将所有的关键字保存在一个HashSet里面
     *      再使用Contains()方法来测试
     *
     *     Enumeration:此接口是Iterator迭代器的“古老版本”
     *
     *
     */
    @Test
    public void test4(){


    }
}
