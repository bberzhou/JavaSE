package blackberry.Chapter8Thread.ThreadExe2;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 10/18/20 11:09
 * Create By IntelliJ IDEA
 */
public class Window2Test {
    public static void main (String[] args) {
        //  继承Thread类的方式，需要几个线程就要创建几个继承类的对象
        Window2 window2 = new Window2 ();
        Window2 window21 = new Window2 ();
        Window2 window22 = new Window2 ();

        window2.setName ("线程一：");
        window21.setName ("线程二：");
        window22.setName ("线程三：");

        window2.start ();
        window21.start ();
        window22.start ();
    }
}
