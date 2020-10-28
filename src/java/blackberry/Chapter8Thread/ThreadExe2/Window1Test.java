package blackberry.Chapter8Thread.ThreadExe2;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 10/15/20 20:46
 * Create By IntelliJ IDEA
 */
public class Window1Test {
    public static void main (String[] args) {
        Window1 window1 = new Window1 ();

        //  这里启动了三个线程，但是传入的对象都是window1，所以即使window1类里面的ticket不加也没关系
        Thread t1 = new Thread (window1);
        Thread t2 = new Thread (window1);
        Thread t3 = new Thread (window1);

        //  为三个线程分别设置名字
        t1.setName ("线程一：");
        t2.setName ("线程二：");
        t3.setName ("线程三：");


        t1.start ();
        t2.start ();
        t3.start ();
    }
}
