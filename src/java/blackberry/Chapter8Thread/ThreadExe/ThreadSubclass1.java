package blackberry.Chapter8Thread.ThreadExe;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 10/12/20 20:41
 * Create By IntelliJ IDEA
 */
public class ThreadSubclass1 extends Thread {
    @Override
    public void run () {
        for (int i = 0 ; i < 100 ; i++) {
            if (i % 2 == 0) {
                System.out.println (Thread.currentThread ().getName () + "偶数" + i);
            }
        }
    }
}
