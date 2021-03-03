package blackberry.day9OOP1.DesignPattern;


/**
 * @Description: 单例模式之懒汉式
 * @author: bberzhou@gmail.com
 * @date: 4/23/20 15:56
 * Create By IntelliJ IDEA
 */
public class SingletonTest2 {
    /*
        单例模式的懒汉式实现
     */
    public static void main (String[] args) {
        Order order1 = Order.getInstance ();
        Order order2 = Order.getInstance ();
        System.out.println (order1 == order2);  //  true order1 和order2的地址是相同的
    }

}

//  懒汉式
class Order {

    //  1。私有化类的构造器

    private Order () {

    }

    //  2。声明当前类对象，没有初始化
    //  4。此对象也必须声明为static的
    private static Order instance = null;

    //  3。声明public、static的返回当前类对象的方法
    public static Order getInstance () {
//        instance = new Order ();
//        return instance;      这样写是错误的，因为每次调用getInstance方法时，都会去new一个对象并赋值给instance

        //  再创建对象之前，先判断是否已经有instance实例了
        if (instance == null) {
            //  之所以线程不安全是因为：当两个线程同时调用此方法时，
            //  线程一进入时，发现没有instance实例，就会创建对象，若在创建过程中阻塞，
            //  而此时线程二进入，发现也没有instance实例，也会创建一个对象，这样两个对象都会创建一个对象，导致线程不安全
            instance = new Order ();
        }
        return instance;
    }
}
