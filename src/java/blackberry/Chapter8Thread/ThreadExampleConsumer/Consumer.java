package blackberry.Chapter8Thread.ThreadExampleConsumer;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 10/29/20 22:11
 * Create By IntelliJ IDEA
 */
public class Consumer extends Thread{   //  消费者
    private Clerk clerk;

    public Consumer ( Clerk clerk){
        this.clerk = clerk;
    }

    //  重写run方法
    @Override
    public void run () {
        System.out.println(Thread.currentThread ().getName ()+":开始消费产品...");
        while (true){
            try {
                Thread.sleep (20);
            } catch (InterruptedException e) {
                e.printStackTrace ();
            }
            clerk.consumeProduct();

        }

    }
}
