package blackberry.Chapter8Thread.ThreadBankTest;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 10/28/20 21:29
 * Create By IntelliJ IDEA
 */
public class Account {
    //  账户类
    private double balance;

    //  账户类里面的存钱方法

    public void deposit ( double amt){
        if (amt > 0){
            balance += amt;
            try {
                Thread.sleep (1000);
            } catch (InterruptedException e) {
                e.printStackTrace ();
            }
            System.out.println(Thread.currentThread ().getName ()+"存钱成功，余额为："+balance);
        }

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
