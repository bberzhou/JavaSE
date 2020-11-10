package blackberry.Chapter8Thread.ThreadBase;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 10/14/20 19:28
 * Create By IntelliJ IDEA
 */
public class MyThread3priority extends Thread {
    /**
     * 线程的优先等级：
     * MAX_PRIORITY: 10
     * MIN_PRIORITY: 1
     * NORM_PRIORITY: 5 --->默认优先级
     * 涉及到的方法有：
     * getPRIORITY():获取线程的优先级
     * setPRIORITY(int newPRIORITY)：设置线程的优先级
     * 说明：
     * 线程创建时继承父线程的优先级
     * 低优先级只是获得调度的概论低，并非一定是在高优先级线程之后才被调用
     */
    @Override
    public void run () {
        for (int i = 0 ; i < 100 ; i++) {
            if (i % 2 == 0) {
                System.out.println (Thread.currentThread ().getName () + "," + Thread.currentThread ().getPriority ());
            }
        }
    }
}
