package blackberry.Chapter8Thread.ThreadExe2;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 10/20/20 19:32
 * Create By IntelliJ IDEA
 */
public class Window3 implements Runnable {
    /**
     * 使用同步方法的方式来解决实现Runnable接口的线程安全问题
     */

    private static int tickets = 100;

    @Override
    public void run () {
        while (tickets > 0) {
            show ();
        }

    }

    //  这个show()方法就是操作共享数据的方法
    private synchronized void show () {    //  同步监视器：this 默认的，因为this 是唯一的
        //  这里可以采用同步代码块，但是可以直接在方法上面加上synchronized
//        synchronized (this) {
        if (tickets > 0) {
            try {
                Thread.sleep (100);
            } catch (InterruptedException e) {
                e.printStackTrace ();
            }
            System.out.println (Thread.currentThread ().getName () + "：售票，票号：" + tickets);
            tickets--;
        }
//        }
    }


    /**
     *  这里就不能使用synchronized 这样会导致只有一个线程执行的情况
     */


//    Object object = new Object ();
//    @Override
//    public void run () {
////        synchronized (object) {
//            while (true) {
//                if (tickets > 0) {
//                    try {
//                        Thread.sleep (100);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace ();
//                    }
//                    System.out.println (Thread.currentThread ().getName () + "：售票，票号为：" + tickets);
//                    tickets--;
//                } else {
//                    break;
//                }
//            }
//
////        }
//
//    }


}
