package blackberry.day8OOp2.ObjectClassExecise1;


/**
 * @Description: order测试类
 * @author: bberzhou@gmail.com
 * @date: 4/20/20 22:00
 * Create By IntelliJ IDEA
 */
public class OrderTest {
    public static void main (String[] args) {
        //  重写了order类的equals()方法之后，判断order1和order2两个对象是否相等
        Order order1 = new Order (11, "li");
        Order order2 = new Order (11, "li");
        System.out.println (order1.equals (order2)); //  true
        Order order3 = new Order (11, "lo");
        System.out.println (order1.equals (order3)); //  false
    }
}
