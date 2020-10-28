package blackberry.Chapter8Thread;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 10/12/20 21:08
 * Create By IntelliJ IDEA
 */
public class MyThread2 extends Thread {
    /**
     * 测试Thread中的常用方法：Thread类的有关方法:
     * void start()：启动线程，并执行对象的run()方法
     * run()：线程在被调度时执行的操作，通常需要重写thread类中的此方法
     * getName()：返回线程的名称
     * setName(String name)：设置该线程名称
     * static Thread currentThread()：返回当前线程，在Thread子类中就是this,通常用于主线程和Runnable实现类
     * static void yield()：线程让步,释放当前CPU的执行权
     * 暂停当前正在执行的线程，把执行机会让给优先级相同或更高的线程
     * 如果队列中没有同优先级的线程，忽略此方法
     * join()：当某个程序执行流中调用其他线程的join()方法时，调用线程将被阻塞，直到join()方法加入的join线程执行完为止
     * 低优先级的线程也可以获得执行
     * (在线程a中调用线程b的join()，此时线程a就进入阻塞状态，直到线程b完全执行完一盒，线程a才结束阻塞状态)
     * static void sleep(long mills)：指定时间：毫秒,相当于休眠状态
     * 令当前活动线程在指定时间段内放弃对CPU控制，使其他线程有机会被执行，时间到后重新排队
     * stop()：强制线程生命期结束，不推荐使用，已经过时了
     * <p>
     * boolean isAlive()：返回boolean，判断线程是否还活着
     */
    @Override
    public void run () {
        for (int i = 0 ; i < 100 ; i++) {
            if (i % 2 == 0) {
                try {
                    sleep (1000);
                } catch (InterruptedException e) {
                    e.printStackTrace ();
                }
                System.out.println ("thread name：" + Thread.currentThread ().getName () + "，偶数" + i);
            }
        }
    }

    //  构造器，直接调用super方法
    public MyThread2 (String name) {
        super (name);
    }
}
