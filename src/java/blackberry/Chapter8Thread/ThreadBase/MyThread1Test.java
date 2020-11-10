package blackberry.Chapter8Thread.ThreadBase;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 10/12/20 20:11
 * Create By IntelliJ IDEA
 */
public class MyThread1Test {
    public static void main (String[] args) {
        MyThread1 myThread1 = new MyThread1 ();
        //  调用start方法的时候，就会自动去调用MyThread的run()方法
        //  start方法的作用就是使得当前这个线程开始执行，Java虚拟机就会调用这个线程的run()方法
        myThread1.start ();

        //  问题一：不能直接调用线程里面的run方法去启动线程
//        myThread.run ();

        //  问题二：再启动一个线程，遍历100以内的偶数，不能让已经start()的线程去执行，会报错误
        //  需要重新创建一个线程的对象
//        myThread.start ();


        //  下面的操作仍然是在main线程中执行的
        for (int i = 0 ; i < 50 ; i++) {
            System.out.println ("这是主线程");
        }
    }
}
