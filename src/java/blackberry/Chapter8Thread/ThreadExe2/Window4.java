package blackberry.Chapter8Thread.ThreadExe2;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 10/20/20 20:07
 * Create By IntelliJ IDEA
 */
public class Window4 extends Thread {
    /**
     * 使用同步方法的方式来解决继承Thread类的线程安全问题
     * <p>
     * 关于同步方法的总结：
     * 1、同步方法仍然涉及到同步监视器，只是不需要我们显式的声明。
     * 2、非静态的同步方法，同步监视器是：this
     * 静态的同步方法，同步监视器是：当前类本身
     */
    private static int tickets = 100;

    @Override
    public void run () {
        while (true) {
            show ();

        }
    }

    public static synchronized void show () { //  Window4.class
        //  public synchronized void show()这种方式是错误的
        //  这里直接在方面前面加锁是有问题的，这里的同步监视器的this就是指的window4 window 41
        //  静态方法里面的变量也得静态的，非静态可以调用静态方法
        if (tickets > 0) {
            try {
                Thread.sleep (100);
            } catch (InterruptedException e) {
                e.printStackTrace ();
            }
            System.out.println (Thread.currentThread ().getName () + "：售票，票号：" + tickets);
            tickets--;
        }
    }
}
