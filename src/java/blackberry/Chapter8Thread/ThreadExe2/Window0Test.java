package blackberry.Chapter8Thread.ThreadExe2;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 10/14/20 20:10
 * Create By IntelliJ IDEA
 */
public class Window0Test {
    /**
     * 例子：创建三个窗口卖票，总票数为100张
     */
    public static void main (String[] args) {
        Window0 window0 = new Window0 ();
        Window0 window01 = new Window0 ();
        Window0 window02 = new Window0 ();
        //  这里三个对象，如果在Window类里面不加static,每个对象都有个100
        window0.setName ("窗口1");
        window01.setName ("窗口2");
        window02.setName ("窗口3");
        window0.start ();
        window01.start ();
        window02.start ();
        //  即使把window里面的tickets设置为static的也不对，因为这里涉及到线程的安全问题


    }
}
