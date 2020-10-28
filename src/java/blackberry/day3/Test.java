package blackberry.day3;

/**
 * @author bberzhou@gmail.com
 * @date 3/23/20 10:08
 * Create By IntelliJ IDEA
 */
public class Test {
    public static void main (String[] args) {
        boolean x = true;
        boolean y = false;
        short z = 42;
        if ((z++ == 42) && (y == true)) ;
        z++;
        if ((x == false) || (++z == 45)) ;
        z++;
        System.out.println ("z=" + z); // z=46
    }
}
