package blackberry.Chapter8Thread.ThreadExe4Lock;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 10/25/20 14:51
 * Create By IntelliJ IDEA
 */
public class LockTest {
    /**
     * 方法三：通过显式定义同步锁对象来实现同步，同步锁使用Lock对象充当----JDK5新增
     * java.util.concurrent.locks.Lock接口是控制多个线程对共享资源进行访问的工具
     * ReentrantLock类实现了Lock，
     * <p>
     * <p>
     * 面试题目：
     * synchronized方式 与lock方式的异同？
     * 相同点：两个都可以解决线程的安全
     * 不同点：synchronized(同步代码块或者同步方法)机制在执行完相应的同步代码以后，自动的释放同步监视器
     * Lock需要手动的启动同步（Lock）,同时结束同步时也需要手动的实现(unLock)
     * <p>
     * 优先使用：Lock----->同步代码块------>同步方法
     * <p>
     * 如何解决线程安全的问题？有几种方式  同步方法同步代码块，同步方法、Lock方法
     */
    public static void main (String[] args) {
        Window window = new Window ();
        Thread ta = new Thread (window);
        Thread tb = new Thread (window);
        Thread tc = new Thread (window);
        ta.setName ("窗口一");
        tb.setName ("窗口二");
        tc.setName ("窗口三");

        ta.start ();
        tb.start ();
        tc.start ();
    }
}
