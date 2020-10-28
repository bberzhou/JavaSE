package blackberry.day11Exception2;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 8/17/20 16:35
 * Create By IntelliJ IDEA
 */
public class ReturnExceptionDemo {
    public static void methodA () {
        try {
            //  1
            System.out.println ("into method A ");

            //  3
            throw new RuntimeException ("crate exception");

        } finally {
            //  2
            System.out.println ("use method A's finally");

        }

    }

    public static void methodB () {
        try {
            System.out.println ("into method B");
            return;
        } finally {
            System.out.println ("call method B's finally");
        }
    }

    public static void main (String[] args) {
        try {
            methodA ();
        } catch (Exception e) {
            System.out.println (e.getMessage ());
        }
        /*
            输出结果：
                into method A
                use method A's finally
                crate exception

         */

        methodB ();
    }
}
