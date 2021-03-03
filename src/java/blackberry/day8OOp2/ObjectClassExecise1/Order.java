package blackberry.day8OOp2.ObjectClassExecise1;


import java.util.Objects;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 4/20/20 12:24
 * Create By IntelliJ IDEA
 */
public class Order {
    /*
        编写Order类，有int类型的orderId,String类型的orderName
        相应的getter()和setter()方法，以及带参数的构造器，
        重写父类的equals()方法：public boolean equals(Object o)
        并判断两个对象是否相等
     */
    private int orderId;
    private String orderName;

    //  无参构造器
    public Order () {

    }

    //  有参构造器
    public Order (int orderId, String orderName) {
        this.orderId = orderId;
        this.orderName = orderName;
    }
    //  重写父类的equals()方法，判断两个对象是否相等


//    @Override
//    public boolean equals (Object o) {
//        if (this == o) return true;
//        if (o == null || getClass () != o.getClass ()) return false;
//        Order order = (Order) o;
//        return orderId == order.orderId &&
//            orderName.equals (order.orderName);
//    }


    @Override
    public boolean equals (Object Obj) {
        //  首先判断Obj 和this是否相等
        if (this == Obj) {
            return true;
        }
        if (Obj instanceof Order) {
            //  判断Obj是不是Order的实例,并将Obj向下转型
            Order order = (Order) Obj;
            //  判断这两个对象的属性是否相同，基本数据类型就使用== ,与引用数据类型就调用equals()方法
            return this.orderName.equals (order.orderName) && this.orderId == order.orderId;

            //  注意这里的orderName是string类型的
//            return  this.orderName == order.orderName && this.orderId == orderId;
        }
        return false;
    }


    public void setOrderId (int orderId) {
        this.orderId = orderId;
    }

    public void setOrderName (String orderName) {
        this.orderName = orderName;
    }

    public int getOrderId () {
        return orderId;
    }

    public String getOrderName () {
        return orderName;
    }
}
