package blackberry.Chapter8Thread;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 10/13/20 21:07
 * Create By IntelliJ IDEA
 */
public class MyThread2Test {
    public static void main (String[] args) {
//        MyThread2 myThread2 = new MyThread2 ();
//
//        //  setName()方法
////        myThread2.setName ("线程二：");

        //  构造器的方法
        MyThread2 myThread2 = new MyThread2 ("构造器线程名");

        Thread.currentThread ().setName ("主线程执行:");

        myThread2.start ();
        System.out.println (myThread2.isAlive ());

    }
}
