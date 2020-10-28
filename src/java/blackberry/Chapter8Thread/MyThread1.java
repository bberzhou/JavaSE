package blackberry.Chapter8Thread;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 10/12/20 20:05
 * Create By IntelliJ IDEA
 */
public class MyThread1 extends Thread {
    /**
     * 多线程的创建：方法一，继承thread类
     * 1。继承thread类的方法创建一个线程
     * 2。重写thread类的run()方法---->将此线程需要执行的操作声明在run()里面
     * 3。创建Thread子类的对象
     * 4。通过子类的对象调用start()，
     * <p>
     * 例子：做遍历100以内的偶数
     */
    @Override
    public void run () {
        for (int i = 0 ; i < 100 ; i++) {
            if (i % 2 == 0) {
                System.out.println ("myTest" + i);
            }
        }
    }
}
