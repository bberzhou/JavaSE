package blackberry.day3;

/**
 * @author bberzhou@gmail.com
 * @date 3/21/20 18:12
 * Create By IntelliJ IDEA
 */
public class OperatorTest {
    public static void main (String[] args) {
        int i1 = 10;
        int i2 = 20;
        int i = i1++;
        System.out.println ("i=" + i); // 10
        System.out.println ("i1=" + i1);   // 11
        i = ++i1;
        System.out.println ("i=" + i); // 12
        System.out.println ("i1=" + i1);   //12
        i = i2--;
        System.out.println ("i=" + i); //20
        System.out.println ("i2=" + i2);   //19
        i = --i2;
        System.out.println ("i=" + i); //18
        System.out.println ("i2=" + i2);   //18
    }
}
