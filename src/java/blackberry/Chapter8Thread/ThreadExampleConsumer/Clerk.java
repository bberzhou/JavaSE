package blackberry.Chapter8Thread.ThreadExampleConsumer;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 10/29/20 22:08
 * Create By IntelliJ IDEA
 */
public class Clerk {

    private int productCount = 0;    //  这个变量保存产品的数量

    //  生产产品的方法
    public void produceProduct () {
        if (productCount < 20) {
            //  首先判断产品数量是否小于20
            productCount++;
            //  这里先++ 然后输出的时候产品数量就是生产的第几个
            System.out.println (Thread.currentThread ().getName () + "：开始生产第" + productCount + "个产品");
        } else {
            //  如果数量大于20个的时候，生产者就需要等待 wait()
        }
    }

    //  消费产品的方法
    public void consumeProduct () {
        //  消费产品的前提是产品数量大于0
        if (productCount > 0){
            System.out.println(Thread.currentThread ().getName ()+"：开始消费第"+productCount+"个产品");
            //  消费完了之后就要把产品数量减1，
            productCount--;
        }else {
            //  这种情况就是产品数量等于0或者小于0，这时就需要wait(),等待生产者消费

        }
    }


}
