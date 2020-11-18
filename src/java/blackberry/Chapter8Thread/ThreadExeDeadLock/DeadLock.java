package blackberry.Chapter8Thread.ThreadExeDeadLock;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 10/25/20 12:42
 * Create By IntelliJ IDEA
 */
public class DeadLock implements Runnable {
    /**
     *  死锁的理解：不同的线程分别占用对方需要的同步资源不放弃，
     *              都在等待对方放弃自己需要的同步资源，就形成了线程的死锁。
     *  说明：1）出现死锁后，不会出现异常，不会出现提示，只是所有的线程都处于阻塞状态，无法继续
     *      2）在使用同步的时候，要避免出现死锁
     *
     */
    //  声明两个类的对象
    ClassA classA = new ClassA ();
    ClassB classB = new ClassB ();

    public void init () {
        Thread.currentThread ().setName ("主线程");
        //  调用classA 对象的foo 方法，传入的参数是 classB 对象
        classA.foo (classB);
        System.out.println ("进入了主线程之后");
    }

    @Override
    public void run () {
        //  run方法首先设置线程名
        Thread.currentThread ().setName ("副线程");
        //  进入ClassB的同步方法B()
        classB.B (classA);
        System.out.println ("进入了副线程之后");

    }

    public static void main (String[] args) {

        //  相当于启动一个分线程
        DeadLock deadLock = new DeadLock ();
        //  main方法执行后，new 一个deadlock对象，然后创建一个线程调用start方法
        //  调用start方法之后就会执行run方法
        new Thread (deadLock).start ();


        //  同时调用init()方法，这里相当于是主线程
        deadLock.init ();

        /**
         *  这个例子中， ClassA ClassB 中的同步方法在执行时，分别去调用对方的同步的方法，机会导致死锁的发生
         *  因为自己本身的方法是同步的，同时调用的方法也是同步的，每个线程一次只能拿一把锁
         *
         *  尽量减少同步资源的定义
         *  尽量避免嵌套同步
         *
         */

    }
}
