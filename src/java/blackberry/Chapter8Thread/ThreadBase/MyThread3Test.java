package blackberry.Chapter8Thread.ThreadBase;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 10/14/20 19:28
 * Create By IntelliJ IDEA
 */
public class MyThread3Test extends Thread {
    public static void main (String[] args) {
        MyThread3priority myThread3priority = new MyThread3priority ();

        //  设置分线程的优先级： 分线程最高
        myThread3priority.setPriority (Thread.MAX_PRIORITY);
        myThread3priority.start ();

        Thread.currentThread ().setName ("主线程：");
        Thread.currentThread ().setPriority (Thread.MIN_PRIORITY);
        //  主线程
        for (int i = 0 ; i < 100 ; i++) {
            if (i % 2 != 0) {
                System.out.println (Thread.currentThread ().getName () + ":" + Thread.currentThread ().getPriority ());

            }
        }

    }

}
