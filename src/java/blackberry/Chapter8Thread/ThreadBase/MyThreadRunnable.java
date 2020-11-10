package blackberry.Chapter8Thread.ThreadBase;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 10/14/20 20:28
 * Create By IntelliJ IDEA
 */
public class MyThreadRunnable implements Runnable {

    /**
     * 创建多线程的方式二：实现runnable接口的方式，
     * 1、创建一个实现了runnable接口的类
     * 2、实现类去实现runnable中的抽象方法:run()
     * 3、创建实现类的对象；
     * 4、将此对象作为参数传递到Thread类的构造器中，创建Thread类的对象
     * 5、通过Thread类的对象调用start()
     */
    @Override
    public void run () {
        for (int i = 0 ; i < 100 ; i++) {
            if (i % 2 == 0) {
                System.out.println (Thread.currentThread ().getName () + "：" + i);
            }
        }
    }
}
