package blackberry.Chapter11Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class InterViewTest1 {
    /**
     * Set主要的一个点就是不重复的元素，用HashSet来过滤
     *  Set接口面试题目
     *   在List内除去重复数字值，要求尽量简单
     *
     */
    public static List duplicate(List list){
        //  首先创建一个HashSet对象
        HashSet set = new HashSet();
        //  然后将需要过滤的List作为参数传入的addAll()方法里面,在插入到set的时候，相同元素会被自动过滤掉
        set.addAll(list);
        //  过滤完成之后，再把Set作为一个新的List返回
        return new ArrayList(set);
    }

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Integer(1));
        list.add(new Integer(2));
        list.add(new Integer(2));
        list.add(new Integer(4));
        list.add(new Integer(4));
        List list1 = duplicate(list);
        for (Object integer :
                list1) {
            System.out.println(integer);
        }

        //1
        //2
        //4
        //  里面重复的元素就没有了


        //  ***但是要注意，如果是自定义的类，想要过滤掉，就需要重写改类的hashCode方法
        //      因为底层就是hash之后再存储的。


        /**
         *  面试题2：
         *      HashSet hashset = new HashSet();
         *      Person p1 = new Person(1001,"AA");
         *      Person p2 = new Person(1002,"BB");
         *
         *      set.add(p1);
         *      set.add(p2);
         *      System.out.println(set) :此时的输出应该时有p1,p2两个对象
         *
         *      p1.name = "CC";
         *      set.remove(p1);
         *      System.out.println(set);    //此时把原来的1001，AA对象改了之后实际上1001,CC 经过hash之后位置可能就变了，
         *                                  此时输出Set,应该是 1001,cc 和1002 AA
         *
         *      set.add(new Person(1001,"CC"))
         *      System.ot.println(set)      //重新添加一个1001,CC经过计算之后的HASH值，跟前面两个都不一样，所以此时会被添加到集合中去，
         *                                  //  因为开始是 1001，AA经过Hash，然后才把AA属性改为CC ，其实不一样
         *                                  //  所以这里输出会有三个元素
         *
         *      set.add(new Person(1001,"AA"))
         *      System.out.println(set);    //  这里添加的时候计算的Hashcode值跟开始的时候是一样的，所以Hash值是一样的，
         *                                      hash值是一样的就会继续调用equals()方法进行比较看两个属性是否一样，
         *                                      但是这里因为开始改成1001，CC，跟1001，AA不同，所以是能加进去的
         *                                  //  这里的四个输出是：1001,CC; 1002 BB; 1001,CC
         *
         *      要注意HashSet的底层存储方式，在存的时候，先比较hash值，
         *          如果不同直接插入，相同的话，再继续调用equals()方法进行比较，
         *          如果相等就不能插入，如果不相等就采用拉链法插入
         *
         *
         *      其中Person类中重写了HashCode()和equals()方法。
         */

    }
}
