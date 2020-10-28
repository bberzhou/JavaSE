package blackberry.day9OOP1.MainMethodTest;

/**
 * @Description: main方法
 * @author: bberzhou@gmail.com
 * @date: 4/24/20 10:50
 * Create By IntelliJ IDEA
 */
public class MainTest {

    /*
        main()方法的使用说明：
        1。main方法作为程序的入口
        2。main()方法是一个静态的方法，就可以通过  类名.方法名 进行调用
        3。main()方法也可以作为我们与控制台交互的方式，之前是使用Scanner
     */

    public static void main (String[] args) {
        //  通过类名调用其静态方法
        Main.main (new String[100]);

    }
}

class Main {
    public static void main (String[] args) {
        for (int i = 0 ; i < args.length ; i++) {
            args[i] = "args_" + i;
            System.out.println (args[i]);
        }
    }
}
