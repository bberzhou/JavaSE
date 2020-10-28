package blackberry.Chapter8Thread.ThreadExe2;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 10/18/20 11:09
 * Create By IntelliJ IDEA
 */
public class Window2 extends Thread {

    /**
     * 使用同步代码块的方式来解决继承Thread类的方式的线程安全问题
     * <p>
     * 例子：使用继承Thread类的方式，创建三个窗口卖票总票数为100张
     * <p>
     * 说明：在继承Thread类创建多线程的方式中，要尽量慎用this充当同步监视器，可以考虑使用当前类来充当同步监视器
     */
    private static int tickets = 100;

    //  这里使用obj是因为继承的方式，在创建线程的时候会new对象，
    //  然后每个对象都会有一个obj，这样会导致不是同一把锁
    private static Object obj = new Object ();

    @Override
    public void run () {
        while (true) {
            synchronized (obj) {
                //  这里不能直接写this,如果是this，则分别代表t1,t2,t3三个对象
                //  但是这里可以写成 synchronized(Window2.class)，Window2这个对象，类也是对象 ，类只会加载一次
//            synchronized(this){

                if (tickets > 0) {
                    try {
                        Thread.sleep (100);
                    } catch (InterruptedException e) {
                        e.printStackTrace ();
                    }
                    System.out.println (Thread.currentThread ().getName () + "：卖票，票号为" + tickets);
                    tickets--;

                } else {
                    break;
                }
            }
        }

    }
}
