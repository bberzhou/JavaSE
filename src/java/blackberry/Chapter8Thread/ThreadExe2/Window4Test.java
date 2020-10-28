package blackberry.Chapter8Thread.ThreadExe2;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 10/20/20 20:07
 * Create By IntelliJ IDEA
 */
public class Window4Test {
    public static void main (String[] args) {
        Window4 window4 = new Window4 ();
        Window4 window41 = new Window4 ();
        Window4 window42 = new Window4 ();

        window4.setName ("窗口一：");
        window41.setName ("窗口二：");
        window42.setName ("窗口三：");

        window4.start ();
        window41.start ();
        window42.start ();
    }
}
