package blackberry.day4;

/**
 * @author bberzhou@gmail.com
 * @date 3/25/20 10:06
 * Create By IntelliJ IDEA
 */
public class TestIf3 {
    public static void main (String[] args) {
        int x = 4;
        int y = 1;
        if (x > 2)
            if (y > 2)
                System.out.println (x + y);
            else    //就近原则
                System.out.println ("x" + x);
    }
}
