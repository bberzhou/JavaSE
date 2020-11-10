package blackberry.Chapter8Thread.ThreadBase;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 10/14/20 20:38
 * Create By IntelliJ IDEA
 */
public class MyThreadRunTest {
    public static void main (String[] args) {
        //  创建实现类的对象
        MyThreadRunnable myThreadRunnable = new MyThreadRunnable ();

        //  4、将此对象作为参数传递到Thread类的构造器中，创建Thread类的对象
        Thread t1 = new Thread (myThreadRunnable);
        t1.setName ("线程1");

        //  5、通过Thread类的对象调用start() ,
        //          1)启动线程  2)调用当前线程的run()--->调用了runnable类型的target的run()
        t1.start ();

        //  再启动一个线程，遍历100以内的偶数
        Thread t2 = new Thread (myThreadRunnable);
        t2.setName ("线程2");
        t2.start ();
    }
}
