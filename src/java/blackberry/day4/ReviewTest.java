package blackberry.day4;

/**
 * @author bberzhou@gmail.com
 * @date 3/23/20 18:47
 * Create By IntelliJ IDEA
 */
public class ReviewTest {
    public static void main (String[] args) {
        int num1 = 10, num2 = 21, num3 = -21;
        int max;
        if (num1 >= num2 && num1 >= num3) {
            max = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            max = num2;
        } else {
            max = num3;
        }
        System.out.println (max);

    }
}
