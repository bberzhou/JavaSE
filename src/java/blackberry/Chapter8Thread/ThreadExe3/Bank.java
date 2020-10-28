package blackberry.Chapter8Thread.ThreadExe3;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 10/21/20 19:33
 * Create By IntelliJ IDEA
 */
public class Bank {
    //  普通的懒汉式 线程不安全
    //  构造器
    private Bank () {

    }

    private static Bank instance = null;

    //  添加一个synchronized关键字就可以了，static方法的锁是当前的类，即Bank.class
//    public static synchronized Bank getInstance () {
//        if (instance == null){
//            instance = new Bank ();
//        }
//        return instance;
//    }

    //  写法二

    public static Bank getInstance () {
        //  方式一：效率稍差点
//        synchronized (Bank.class){
//            if (instance == null){
//                instance =  new Bank ();
//            }
//        }
//        return instance;

        //  方式二：效率更高，并且线程安全，这样线程进来的时候先判断instance 是否为空
        //  如果此时有Bank的实例就不需要执行里面的内容了， instance == null ----> false
        if (instance == null) {
            synchronized (Bank.class) {
                if (instance == null) {
                    instance = new Bank ();
                }
            }
        }
        return instance;
    }
}
