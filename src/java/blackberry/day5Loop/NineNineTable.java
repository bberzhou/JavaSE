package blackberry.day5Loop;

/**
 * @author bberzhou@gmail.com
 * @date 3/29/20 15:13
 * Create By IntelliJ IDEA
 */
public class NineNineTable {
    /*
        打印99乘法表
     */
    public static void main (String[] args) {
        for (int i = 0 ; i < 10 ; i++) {
            for (int j = 1 ; j < i + 1 ; j++) {
                System.out.print (j + "*" + i + "=" + i * j + " ");
            }
            System.out.println ();
        }

    }
}
