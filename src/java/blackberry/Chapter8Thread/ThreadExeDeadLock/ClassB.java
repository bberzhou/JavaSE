package blackberry.Chapter8Thread.ThreadExeDeadLock;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 10/25/20 12:36
 * Create By IntelliJ IDEA
 */
public class ClassB {
    //  这里是同步方法，加的同步锁就是ClassB的对象，默认就是this
    public synchronized void B (ClassA classA) {  // 同步监视器就是 B类的对象
        System.out.println ("当前线程名：" + Thread.currentThread ().getName () + "进入了B实例的B方法");
        try {
            Thread.sleep (200);
        } catch (InterruptedException e) {
            e.printStackTrace ();
        }
        System.out.println ("当前线程名：" + Thread.currentThread ().getName () + "企图调用A实例的last方法");

        //  这里就需要握住a的同步监视器
        classA.last ();
    }

    //  这里是同步方法，加的同步锁就是ClassB的对象，同步监视器就是 B类的对象
    public synchronized void last () { //  同步监视器 :classB
        System.out.println ("进入了B类的last方法内部");
    }
}
