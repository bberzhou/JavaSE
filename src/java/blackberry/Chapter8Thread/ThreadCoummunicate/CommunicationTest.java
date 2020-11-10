package blackberry.Chapter8Thread.ThreadCoummunicate;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 10/29/20 20:56
 * Create By IntelliJ IDEA
 */
public class CommunicationTest {
    /**
     *  线程通信的例子：使用两个线程打印1-100。线程1，线程2交替打印
     *
     *
     */
    public static void main (String[] args) {
        Number number = new Number ();

        Thread thread = new Thread (number);
        Thread thread1 = new Thread (number);

        thread.setName ("线程一");
        thread1.setName ("线程二");

        thread.start ();
        thread1.start ();


    }
}
