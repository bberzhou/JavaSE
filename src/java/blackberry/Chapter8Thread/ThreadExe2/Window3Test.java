package blackberry.Chapter8Thread.ThreadExe2;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 10/20/20 19:32
 * Create By IntelliJ IDEA
 */
public class Window3Test {
    public static void main (String[] args) {
        Window3 window3 = new Window3 ();

        //  开启三个线程
        Thread t1 = new Thread (window3);
        Thread t2 = new Thread (window3);
        Thread t3 = new Thread (window3);

        t1.setName ("窗口一");
        t2.setName ("窗口二");
        t3.setName ("窗口三");

        t1.start ();
        t2.start ();
        t3.start ();
    }
}
