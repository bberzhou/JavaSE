package blackberry.Chapter8Thread.ThreadExe2;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 10/14/20 20:11
 * Create By IntelliJ IDEA
 */
public class Window0 extends Thread {
    private static int tickets = 100;   //  窗口总的票张数

    @Override
    public void run () {
        while (true) {
            if (tickets > 0) {
                System.out.println (Thread.currentThread ().getName () + ":卖票，票号为" + tickets);
                //  每执行一次，票数--
                tickets--;

            } else {
                break;
            }
        }
    }
}
