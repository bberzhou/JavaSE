package blackberry.Chapter8Thread.NewThreadPool;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 11/14/20 15:44
 * Create By IntelliJ IDEA
 */
public class NumberThread implements Runnable{
    @Override
    public void run () {
        for (int i = 0 ; i <= 100 ; i++) {
            if (i % 2==0){
                System.out.println(Thread.currentThread ().getName ()+ "："+i);
            }
        }
    }
}
