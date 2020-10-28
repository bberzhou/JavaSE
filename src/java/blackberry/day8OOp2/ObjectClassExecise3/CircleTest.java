package blackberry.day8OOp2.ObjectClassExecise3;

/**
 * @Description: circle测试类
 * @author: bberzhou@gmail.com
 * @date: 4/21/20 14:48
 * Create By IntelliJ IDEA
 */
public class CircleTest {
    public static void main (String[] args) {
        /*
            创建circle两个对象，判断其颜色是否相等，
            利用其equals()方法，判断两个对象的半径是否相等，
            利用toString()方法输出其半径
         */

        Circle c1 = new Circle (2);
        Circle c2 = new Circle ("black", 2.0, 2.0);
        System.out.println ("颜色是否相同:" + c1.getColor ().equals (c2.getColor ()));

        //  因为已经重写了equals方法，所以直接  对象.equals(Obj)，判断半径是否相同
        System.out.println ("半径是否相同：" + c1.equals (c2));

        System.out.println (c1.toString ());
        System.out.println (c2.toString ());
    }
}
