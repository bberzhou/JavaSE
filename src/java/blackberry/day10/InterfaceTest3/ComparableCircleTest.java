package blackberry.day10.InterfaceTest3;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 5/31/20 07:24
 * Create By IntelliJ IDEA
 */
public class ComparableCircleTest {
    //  测试comparableCircle
    public static void main (String[] args) {
        ComparableCircle c1 = new ComparableCircle (3.5);
        ComparableCircle c2 = new ComparableCircle (3.2);
        int result = c1.compare (c2);
        if (result > 0) {
            System.out.println ("first object bigger");
        } else if (result < 0) {
            System.out.println (" second object bigger ");
        } else {
            System.out.println ("they are equal");
        }
    }
}
