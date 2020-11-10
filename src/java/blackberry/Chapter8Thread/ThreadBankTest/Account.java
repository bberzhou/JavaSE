package blackberry.Chapter8Thread.ThreadBankTest;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 10/28/20 21:29
 * Create By IntelliJ IDEA
 */
public class Account {
    //  账户类
    private double balance;
    private ReentrantLock lock = new ReentrantLock ();

    //  账户类里面的存钱方法
    //  这里使用lock 的方式可以解决这个问题
//    public  void deposit ( double amt){
//        try{
//            lock.lock ();
//            if (amt > 0){
//                balance += amt;
//                try {
//                    Thread.sleep (1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace ();
//                }
//                System.out.println(Thread.currentThread ().getName ()+"存钱成功，余额为："+balance);
//            }
//        }finally {
//
//        }lock.unlock ();
//
//    }

    //  也可以使用synchronized 方法解决此问题
    //  通常继承情况下尽量少用this，但是这里使用this充当同步监视器，
    //  就是因为两个Customer对象都是使用的同一个account
        public  synchronized void deposit ( double amt){
        try{
            lock.lock ();
            if (amt > 0){
                balance += amt;
                try {
                    Thread.sleep (1000);
                } catch (InterruptedException e) {
                    e.printStackTrace ();
                }
                System.out.println(Thread.currentThread ().getName ()+"存钱成功，余额为："+balance);
            }
        }finally {

        }lock.unlock ();

    }

    public Account (double balance) {
        this.balance = balance;
    }

    public double getBalance () {
        return balance;
    }

    public void setBalance (double balance) {
        this.balance = balance;
    }
}
