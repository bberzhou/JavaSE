package blackberry.Chapter8Thread.ThreadExeDeadLock;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 10/25/20 12:33
 * Create By IntelliJ IDEA
 */
public class ClassA {
    //  死锁的演示
    //  synchronized ，即为同步方法
    public synchronized void foo (ClassB classB) {
        //  这里加的同步锁，锁就是A类的对象, 即 这里的同步监视器就是ClassB的对象 classB
        System.out.println ("当前线程名：" + Thread.currentThread ().getName () + "进入了A实例的foo方法");
        try {
            Thread.sleep (200);

        } catch (InterruptedException e) {
            e.printStackTrace ();
        }
        System.out.println ("当前线程名：" + Thread.currentThread ().getName () + "企图调用B实例的last方法");

        //  这里调用classB的last()方法，握住的就是B的锁
        classB.last ();
    }

    //  这里加的同步锁，锁就是A类的对象, 即 这里的同步监视器就是ClassB的对象 classB
    public synchronized void last () {
        //  但是这里传入的对象是classB
        System.out.println ("进入了A类的last方法内部");
    }
}
