package blackberry.Chapter11Collection.aboutSet;

import blackberry.Chapter11Collection.CollectionMethod.Person;
import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {
    /**
     *  TreeSet：可以按照添加对象的指定属性，进行排序，这个顺序是元素的排序顺序
     *      TreeSet之所以是有序的，是因为它实现了SortedSet接口
     *
     *      1.向TreeSet中添加的数据，要求是相同类的对象
     */
    @Test
    public void test() {
        //  失败：
//        TreeSet set = new TreeSet();
//        set.add(456);
//        set.add(123);
//        set.add("AAA");
//        set.add(new User("LL", 89));

        //  上面的代码在执行的时候就会报错：
        //  java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String

    }

    @Test
    public void test2(){
        //  在TreeSet中添加整数
        TreeSet treeSet = new TreeSet();
        treeSet.add(56);
        treeSet.add(89);
        treeSet.add(888);
        Iterator iterator = treeSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
            //56
            //89
            //888

            //  添加的Int类型元素数据，按照从小到大的顺序排列的
        }
    }
    @Test
    public void test3(){
        //  在TreeSet中添加整数
        TreeSet treeSet = new TreeSet();
        treeSet.add("Zoom");
        treeSet.add("carry");
        treeSet.add("TTT");
        Iterator iterator = treeSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
            //TTT
            //Zoom
            //carry

            //  添加的string类型元素数据，按照首字母的A-Z,a-z的顺序排列的
        }
    }

    @Test
    public void test4(){
        //  在TreeSet中添加自定义对象
        TreeSet treeSet = new TreeSet();
        treeSet.add(new User("Tom",45));
        treeSet.add(new User("Jerry",44));
        treeSet.add(new User("KKK",35));
        treeSet.add(new User("Mike",20));

        //  再添加一个Mike，22，这里如果在User类里面的compareTo()方法只是指定了name这一个属性，那么如果对象的name属性相同，
        //  在比较时，compareTo()就会返回true/1，这样就不能把第二个同name对象添加进去，如果想要添加则，需要修改compareTo()方法。
//        treeSet.add(new User("Mike",22));


        Iterator iterator = treeSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
            //TTT
            //Zoom
            //carry

            //  添加的自定义类型元素的数据，如果没有在自定义类里面写好comparable()方法就会报错，
             // java.lang.ClassCastException: blackberry.Chapter11Collection.aboutSet.User cannot be cast to java.lang.Comparable

            //  按照User类的name属性进行的顺序排列的
            //User{name='Jerry', age=44}
            //User{name='KKK', age=35}
            //User{name='Mike', age=20}
            //User{name='Tom', age=45}
        }
    }
}
