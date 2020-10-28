package blackberry.day7OOP2;

/**
 * @Description: test
 * @author: bberzhou@gmail.com
 * @date: 4/10/20 12:27
 * Create By IntelliJ IDEA
 */
public class StackTest {
    /*
            注意这段代码的内层结构图
            1.内存结构：栈（局部变量）、堆（new出来的结构：对象（成员变量（非static））、数组）
            2。变量：成员变量和局部变量（方法内的，方法形参，代码块内，构造器）
     */
    public static void main (String[] args) {
        StackTest test = new StackTest ();
        test.first ();
    }

    public void first () {
        int i = 5;
        Value value = new Value ();
        value.i = 25;
        second (value, i);
        System.out.println (i);

    }

    public void second (Value v, int i) {
        i = 0;
        v.i = 20;
        Value val = new Value ();
        v = val;
        System.out.println (v.i + " " + i);
    }
}

class Value {
    int i = 15;
}