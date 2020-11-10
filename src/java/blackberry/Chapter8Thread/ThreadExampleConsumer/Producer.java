package blackberry.Chapter8Thread.ThreadExampleConsumer;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 10/29/20 22:08
 * Create By IntelliJ IDEA
 */
public class Producer extends Thread{   //  生产者

    //  这样做的目的就是，让生产者和消费者共用Clerk,
    private Clerk clerk;
    public Producer(Clerk clerk){
        this.clerk = clerk;
    }

    @Override
    public void run () {
        System.out.println(Thread.currentThread ().getName ()+"：开始生产");
        while (true){
            try {
                Thread.sleep (100);

            }catch (InterruptedException e){
                e.printStackTrace ();
            }
            // 生产东西
            clerk.produceProduct();

        }
    }
}
