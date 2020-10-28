package blackberry.Chapter8Thread.ThreadExe2;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 10/15/20 20:43
 * Create By IntelliJ IDEA
 */
public class Window1 implements Runnable {
    /**
     * 用同步代码块的方式解决实现Runnable接口的线程安全问题
     * <p>
     * 创建三个窗口卖票，总票数为100张，使用实现runnable接口的方式实现
     * 1、问题：卖票过程中，出现了重票、错票---->出现了线程的安全问题
     * 2、问题出现的原因：当某个线程操作车票的过程中，操作尚未完成时候，其他线程也参与进来，操作车票。
     * 3、如何解决：当一个线程在操作ticket时候，其他线程不能参与进来，直到线程a操作完ticket之后，
     * 线程才可以操作ticket，这种情况即使线程a出现了阻塞，也不能被改变。
     * 4、在Java中通过同步机制，来解决线程的安全问题
     * <p>
     * 方法一：同步代码块
     * synchronized(同步监视器){// 需要被同步的代码 }
     * 说明：1、操作共享数据的代码，即为需要被同步的代码，
     * 2、共享数据就是共同操作的变量，比如例子里面的ticket
     * 3、同步监视器：俗称锁。任何一个类的对象，都可以充当锁
     * 要求：多个线程必须要使用同一把锁，即相当于用同一个对象。
     * <p>
     * 补充：在实现Runnable接口创建多线程的方式中，可以考虑使用this来充当同步监视器
     * <p>
     * 方法二：同步方法
     * <p>
     * 如果操作共享数据的代码完整的声明在一个方法中，可以将此方法声明为同步的
     * <p>
     * <p>
     * 5、同步的方式，解决了线程的安全问题，
     * 但是在操作同步代码块的时候，只能有一个线程参与，其他线程等待，相当于一个单线程的过程，效率比较低
     */

    private static int ticket = 100;
    Object object = new Object ();

    @Override
    public void run () {
        while (true) {
            synchronized (object) {
                if (ticket > 0) {
                    // 使用sleep可能出现 错票 -1的情况
                /*
                    线程一：：卖票，票号为：5
                    线程二：：卖票，票号为：4
                    线程三：：卖票，票号为：4
                    线程一：：卖票，票号为：2
                    线程二：：卖票，票号为：1
                    线程三：：卖票，票号为：1
                    线程一：：卖票，票号为：-1
                 */
                    try {
                        Thread.sleep (100);
                    } catch (InterruptedException e) {
                        e.printStackTrace ();
                    }
                    System.out.println (Thread.currentThread ().getName () + "：卖票，票号为：" + ticket);
                    ticket--;
                } else {
                    break;
                }
            }
        }

    }

}
