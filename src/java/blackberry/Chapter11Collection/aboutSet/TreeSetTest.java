package blackberry.Chapter11Collection.aboutSet;

import blackberry.Chapter11Collection.CollectionMethod.Person;
import org.junit.Test;

import java.util.*;

public class TreeSetTest {
    /**
     *  TreeSet：可以按照添加对象的指定属性，进行排序，这个顺序是元素的排序顺序
     *      TreeSet之所以是有序的，是因为它实现了SortedSet接口
     *
     *      1.向TreeSet中添加的数据，要求是相同类的对象
     *      2.两种排序方式：自然排序（CompareTo）和定制排序(Comparator)
     *      3、自然排序（实现CompareTo）中，比较两个对象是否相同的标准为：compareTO()方法返回0，不再是equals()方法，treeSet里面不能放相同的数据 。
     *          使用TreeSet和使用TreeMap的要求一样，添加的元素必须正确实现Comparable接口，如果没有实现Comparable接口，那么创建TreeSet时必须传入一个Comparator对象
     *          treeSet的底层是一个树形结构，二叉排序树。hashSet底层是一个红黑树的数据结构，不能放相同的数据。
     *          b:定制排序（Comparator）
     *      4.定制排序中，比较两个对象是否相同的标准为：compare()方法返回0不再是equals()方法
     *
     *
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


    //  使用User类里面的第二个Compare方法，先比较两个对象的姓名属性，再比较两个对象的年龄属性
    //  test5里面添加两个相同属性的对象，只会添加一个到集合里面

    @Test
    public void test5(){
        TreeSet treeSet = new TreeSet();
        treeSet.add(new User("Tom",45));
        treeSet.add(new User("Jerry",44));
        treeSet.add(new User("KKK",35));
        treeSet.add(new User("Mike",20));
        treeSet.add(new User("Mike",20));

        Iterator iterator = treeSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //  输出结果Mike只输出了一个
        //User{name='Tom', age=45}
        //User{name='Mike', age=20}
        //User{name='KKK', age=35}
        //User{name='Jerry', age=44}


    }


    //  重写user类里面的compareTo()方法，先按照姓名进行比较，如果姓名属性相同，在比较age属性，
    //  可以看出姓名相同，age不同的对象，都可以成功的添加到集合中，保证没有重复的元素
    @Test
    public void test6(){
        TreeSet treeSet = new TreeSet();
        treeSet.add(new User("Tom",45));
        treeSet.add(new User("Jerry",44));
        treeSet.add(new User("KKK",35));
        treeSet.add(new User("Mike",20));
        treeSet.add(new User("Mike",10));

        Iterator iterator = treeSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //User{name='Tom', age=45}
        //User{name='Mike', age=10}
        //User{name='Mike', age=20}
        //User{name='KKK', age=35}
        //User{name='Jerry', age=44}
    }


    //  测试定制排序（comparator）
    @Test
    public void test7(){
        // 重写compare()方法，按照年龄从小到大排序
        Comparator comparator = new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                //  1、先判断两个形参是否为同一个类User的实例
                if (o1 instanceof User && o2 instanceof User){
                    User u1 = (User) o1;
                    User u2 = (User) o2;
                    //  直接判断两个对象的年龄大小
                    return Integer.compare(u1.getAge(),u2.getAge());
                }
                else {
                    throw new RuntimeException("输入的数不匹配");
                }
            }
        };

        //  重写了Comparator方法之后，再调用
        TreeSet treeSet = new TreeSet(comparator);
        treeSet.add(new User("Tom",45));
        treeSet.add(new User("Jerry",44));
        treeSet.add(new User("KKK",35));
        treeSet.add(new User("Mike",20));
        treeSet.add(new User("Mike",10));

        Iterator iterator = treeSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //User{name='Mike', age=10}
        //User{name='Mike', age=20}
        //User{name='KKK', age=35}
        //User{name='Jerry', age=44}
        //User{name='Tom', age=45}
        //这个就是按照User的age进行排序的，定制排序


    }
}
