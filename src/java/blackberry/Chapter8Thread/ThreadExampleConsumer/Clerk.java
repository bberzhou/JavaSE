package blackberry.Chapter8Thread.ThreadExampleConsumer;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 10/29/20 22:08
 * Create By IntelliJ IDEA
 */
public class Clerk {

    private int productCount = 0;    //  这个变量保存产品的数量

    //  这里produceProduct()和consumeProduct()两个方法，两个线程在同时执行的时候，
    //  可能会同时操作到productCount这个变量,导致阻塞的问题，所以在一个时间段内，只能让一个线程去做

    //  所以只需要在方法前加入一个synchronized 即可，因为这两个线程拿的都是Clerk锁
    //  同步监视器都是Clerk的对象

    //  生产产品的方法
    public synchronized void produceProduct () {
        if (productCount < 20) {
            //  首先判断产品数量是否小于20
            productCount++;
            //  这里先++ 然后输出的时候产品数量就是生产的第几个
            System.out.println (Thread.currentThread ().getName () + "：开始生产第" + productCount + "个产品");

            notify ();
        } else {
            //  如果数量大于20个的时候，生产者就需要等待 wait()，等待消费的线程消费一些
            try {
                //  wait()只能放在同步代码块或同步方法中
                wait ();
            } catch (InterruptedException e) {
                e.printStackTrace ();
            }
        }
    }

    //  消费产品的方法
    public synchronized void consumeProduct () {
        //  消费产品的前提是产品数量大于0
        if (productCount > 0) {
            System.out.println (Thread.currentThread ().getName () + "：开始消费第" + productCount + "个产品");
            //  消费完了之后就要把产品数量减1，
            productCount--;

            //  同时notify一下
            notify ();
        } else {
            //  这种情况就是产品数量等于0或者小于0，这时就需要wait(),等待生产者消费
            try {
                wait ();
            } catch (InterruptedException e) {
                e.printStackTrace ();
            }
        }
    }


}
