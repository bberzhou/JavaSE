package blackberry.Chapter8Thread.ThreadCoummunicate;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 10/29/20 20:57
 * Create By IntelliJ IDEA
 */
public class Number implements Runnable {

    /**
     * 线程通信涉及到的三个方法：
     * wait()：一旦执行此方法，当前线程就进入阻塞状态，并释放同步监视器
     * notify():一旦执行此方法，就会唤醒被wait 的一个线程，如果有多个线程被wait,就唤醒优先级高的那个
     * notifyAll():一旦执行此方法，就会唤醒所有被wait 的线程（里面的随机一个）
     * <p>
     * 说明：
     * 1、wait()、notify()、notifyAll()，这三个方法使用前提，只能使用到同步代码块，或者同步方法当中。
     * 2、wait()、notify()、notifyAll()，这三个方法的调用者必须是同步代码块或者同步方法中的同步监视器
     * 否者就会出现异常
     * 3、wait()、notify()、notifyAll()，这三个方法不是定义在Thread类里面的，而是定义在Object类中
     * 这样是为了任何类的对象都可以直接调用这三个方法。
     * <p>
     * <p>
     * 面试题：sleep()方法和wait()方法的异同？
     * <p>
     * 1、相同点：一旦执行方法，都可以使得当前的线程进入阻塞状态。
     * 2、不同点：1）两个方法声明的位置不同：Thread类中声明sleep()，Object类中声明wait()
     * 2) 调用的要求不同：sleep()可以在任何需要的场景下调用，wait()必须使用在同步代码块或者同步方法中进行调用
     * 3）关于是否释放同步监视器：如果两个方法都使用在同步代码块或者同步方法中，sleep()不会释放锁，wait()会释放锁（即同步监视器）
     */
    private int number = 1;

    @Override
    public void run () {
        while (true) {
            //  这里使用同步代码块的方式，并且用this做同步监视器，因为 implements的方式，两个都Number对象
            synchronized (this) {

                //  当进入循环的时候，先notify 其他的线程，这是都是this调用的此方法
                this.notify ();
                if (number <= 100) {
                    try {
                        Thread.sleep (100);
                    } catch (InterruptedException e) {
                        e.printStackTrace ();
                    }
                    System.out.println (Thread.currentThread ().getName () + "：" + number);
                    number++;
                    try {
                        //  使用wait()方法，让当前执行的这个线程进入阻塞状态。同时会把同步锁给释放掉
                        wait ();
                    } catch (InterruptedException e) {
                        e.printStackTrace ();
                    }

                } else {
                    break;
                }
            }
        }
    }
}
