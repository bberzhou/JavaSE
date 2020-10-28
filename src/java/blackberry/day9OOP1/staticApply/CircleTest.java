package blackberry.day9OOP1.staticApply;

/**
 * @Description: static关键字的使用
 * @author: bberzhou@gmail.com
 * @date: 4/23/20 09:06
 * Create By IntelliJ IDEA
 */
public class CircleTest {
    public static void main (String[] args) {
        Circle c1 = new Circle ();
        Circle c2 = new Circle ();
        Circle c3 = new Circle (3);
        System.out.println ("c1的id：" + c1.getId ());    //  1001
        //  这是因为当第一次创建对象时，修改了Circle类里面的静态变量init,所以在new一个新的对象时，init的值就是改变了的
        System.out.println ("c2的id：" + c2.getId ());    //  1002

        System.out.println ("c3的id：" + c3.getId ());
        System.out.println ("创建对象的个数：" + Circle.getTotal ());      //创建对象的个数：3

    }
}
