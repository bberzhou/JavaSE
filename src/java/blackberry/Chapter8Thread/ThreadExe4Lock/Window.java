package blackberry.Chapter8Thread.ThreadExe4Lock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 10/25/20 14:55
 * Create By IntelliJ IDEA
 */
public class Window implements Runnable {
    private static int ticket = 100;
    //  commend + p 显示方法的参数
    //ReentrantLock类的有参构造器 boolean fair --->公平锁

    // 第一步；实例化
    private ReentrantLock lock = new ReentrantLock ();

    @Override
    public void run () {
        while (true) {
            try {
                //  第二步：调用锁定方法：lock()方法
                lock.lock ();
                // 24 - 30 行就类似同步代码块
                if (ticket > 0) {
                    System.out.println (Thread.currentThread ().getName () + "：售票，票号为：" + ticket);
                    ticket--;
                } else {
                    break;
                }
            } finally {

                //  第三部：调用解锁的方法：unlock()方法
                lock.unlock ();

            }
        }

    }
}
