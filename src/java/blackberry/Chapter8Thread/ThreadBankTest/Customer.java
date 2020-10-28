package blackberry.Chapter8Thread.ThreadBankTest;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 10/28/20 21:29
 * Create By IntelliJ IDEA
 */
public class Customer extends Thread {
    //  客户类，
    private Account account;
    //  利用这种方式来创建两个
    //  在构造器中，将属性做实例化
    public Customer (Account account){
        this.account = account;
    }

    @Override
    public void run () {
        for (int i = 0 ; i < 3 ; i++) {
            //  customer去存钱，每次存1000

            account.deposit (1000);
        }

    }
}
