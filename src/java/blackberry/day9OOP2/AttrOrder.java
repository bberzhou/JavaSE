package blackberry.day9OOP2;

/**
 * @Description: 属性赋值的先后顺序
 * @author: bberzhou@gmail.com
 * @date: 4/25/20 11:32
 * Create By IntelliJ IDEA
 */
public class AttrOrder {
    /*

        对属性可以赋值的位置有：
            1。默认初始化
            2。显式初始化
            3。构造器中初始化
            4。有了对象以后，可以通过 "对象.属性"或者"对象.方法(set)"方法进行赋值
            5。在非静态代码块中赋值

            执行的先后顺序：1--->2/5---->3---->4   2和5是顺序执行，谁先写谁就先执行
     */
    public static void main (String[] args) {
        Order order = new Order ();
        System.out.println (order.orderId);  //  4
    }

}

class Order {
    int orderId = 3;

    {
        orderId = 4;
    }
    /*
        {
        orderId = 4;
    }
    int orderId = 3;
    //  此时执行时的结果时orderId = 3;

     */
}
