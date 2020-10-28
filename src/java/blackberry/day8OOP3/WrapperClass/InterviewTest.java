package blackberry.day8OOP3.WrapperClass;

import org.junit.Test;

/**
 * @Description: 面试题目
 * @author: bberzhou@gmail.com
 * @date: 4/21/20 22:15
 * Create By IntelliJ IDEA
 */
public class InterviewTest {
    /*
        关于包装类使用的面试题目
     */
    @Test
    public void test1 () {
        //  此时输出1.0，是因为在编译的时候前面的Integer和后面的Double类型不统一，有一个自动类型提升
        Object obj = true ? new Integer (1) : new Double (2.0);
        System.out.println (obj);    //  1.0
    }

    @Test
    public void test2 () {
        Object obj;
        if (true) {
            obj = new Integer (1);
        } else {
            obj = new Double (1.0);
        }
        System.out.println (obj);   //  1
    }


    @Test
    public void test3 () {
        Integer i = new Integer (1);
        Integer j = new Integer (1);
        System.out.println (i == j);     //  false

        Integer m = 1;
        Integer n = 1;
        System.out.println (m == n);    //  true

        /*
            在Integer类里面存了一个cache[]数组，从-128~127,当超过这个范围之后才会new一个对象
            此时128已经超出了127
            Integer内部定义了IntegerCache结构，IntegerCache中定义了Integer[]，
            保存了-128～127范围内的整数，当使用自动装箱的方式给Integer赋值的范围在-128～127范围
            内时就可以直接使用数组中的元素，不用new。目的就是在于提高效率
         */
        Integer x = 128;    //  此时相当于 new Integer(128)
        Integer y = 128;
        System.out.println (x == y);     // false
    }
}
