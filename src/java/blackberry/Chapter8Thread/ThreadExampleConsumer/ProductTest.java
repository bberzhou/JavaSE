package blackberry.Chapter8Thread.ThreadExampleConsumer;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 10/29/20 21:58
 * Create By IntelliJ IDEA
 */
public class ProductTest {
    /**
     * 线程通信的应用
     *  生产者消费者问题：经典例题：生产者/消费者
     *  生产者（Producer）将产品交给店员（Clerk），而消费者(consumer)从店员处取走产品，
     *  店员一次只能持有固定数量的产品(比如：20),如果生产者试图生产更多的产品，店员会叫生产者停一下，
     *  如果店中有空位放产品了再通知生产者继续生产，如果店中没有产品了，店员会告诉消费者等一下，
     *  如果店中有产品了再通知消费者来取走产品
     *
     *
     *  分析：
     *  1、是否是多线程问题？是，生产者线程和消费者线程
     *  2、是否有共享数据？是，店员（或者产品）
     *  3、如何来解决线程的安全问题？同步机制，同步代码块、同步方法和lock方式
     *  4、是否线程的通信？  是店员通知生产者和消费者
     */

    public static void main (String[] args) {
        Clerk clerk = new Clerk ();
        //  线程一
        Producer p1 = new Producer (clerk);
        p1.setName ("生产者1");
        //  线程二
        Consumer c1 = new Consumer (clerk);
        c1.setName ("消费者1");

        p1.start ();
        c1.start ();


    }
}
