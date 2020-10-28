package blackberry.day7OOP2;

/**
 * @Description: valueTransfer
 * @author: bberzhou@gmail.com
 * @date: 4/9/20 22:58
 * Create By IntelliJ IDEA
 */
public class ValueTransferTest {
    /*
        Java中的值传递：
        如果变量是基本数据类型，此时赋值的是变量所保存的数据值
        如果变量是引用数据类型，此时赋值的是变量所保存的数据的地址值


     */
    public static void main (String[] args) {
        //  值传递，基本数据类型
        int m = 10;
        int n = m;
        System.out.println ("m=" + m + ",n=" + n);  // 10 10
        n = 30;
        System.out.println ("m=" + m + ",n=" + n);  //  10 30


        System.out.println ("**************************");

        //  引用数据类型
        Order order = new Order ();
        order.orderId = 144;
        //  赋值以后都指向堆空间中同一个对象实体
        Order order1 = order;   //  相当于传递的是order的地址值，此时指向的是相同的地址
        System.out.println ("order.orderId = " + order.orderId + ",order1.orderId" + order1.orderId);//144
        order1.orderId = 102;
        System.out.println ("order.orderId = " + order.orderId + ",order1.orderId" + order1.orderId);//102


    }
}

class Order {
    int orderId;
}
