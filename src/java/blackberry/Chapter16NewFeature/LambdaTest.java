package blackberry.Chapter16NewFeature;

import org.junit.Test;

import java.util.Comparator;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 5/9/21 8:53 AM
 * Create By IntelliJ IDEA
 */
public class LambdaTest {
    /*
        Lambda表达式：
            使用举例
     */

    @Test
    public void test(){
        //  Runnable()匿名实现一个run方法
        Runnable runnable = new Runnable () {
            @Override
            public void run () {
                System.out.println ("我来自重庆");
            }
        };
        runnable.run ();

        //  通过Lambda表达式改写
        Runnable runnable2 =() -> System.out.println ("我是Lambda");
        runnable2.run ();
        //  我是Lambda


    }

    @Test
    public void test1(){
        Comparator<Integer > comparator = new Comparator<Integer> () {
            @Override
            public int compare (Integer o1, Integer o2) {
                //  比较两个大小
                return Integer.compare (o1,o2);
            }
        };
        int compare = comparator.compare (21, 12);  //  compare()方法返回的是一个值
        //  如果o1> o2 :返回 1
        //  如果o1< o2 :返回 -1
        //  如果o1 =o2 :返回 0
        System.out.println (compare);


        //  使用Lambda表达式重写，带有参数的情况
        Comparator<Integer > comparator1 =  (o1,o2) -> Integer.compare (o1,o2);
        int compare1 = comparator1.compare (21, 12);  //  compare()方法返回的是一个值
        //  如果o1> o2 :返回 1
        //  如果o1< o2 :返回 -1
        //  如果o1 =o2 :返回 0
        System.out.println (compare1);


        //  方法引用的方式
        Comparator<Integer > comparator2 = Integer::compare;
        int compare2 = comparator1.compare (21, 12);  //  compare()方法返回的是一个值
        //  如果o1> o2 :返回 1
        //  如果o1< o2 :返回 -1
        //  如果o1 =o2 :返回 0
        System.out.println (compare2);

    }
}
