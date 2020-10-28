package blackberry.Chapter8Thread.ThreadBankTest;


import blackberry.day8OOp2.ToStringTest.Cust;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 10/28/20 21:24
 * Create By IntelliJ IDEA
 */
public class ThreadBank {
    /*
        银行有一个账户：
            有两个储户分别向同一个账户存3000元，每次存1000，存三次，每次存完之后打印账户余额

            分析：
            1、是否是多线程问题？是，两个储户线程
            2、是否有共享数据？  有，账户（或者余额）
            3、是否有线程安全问题
            4、需要考虑如何解决线程安全问题？同步机制：有三种方式
     */

    public static void main (String[] args) {
        //  刚开始的时候账户里面没有钱
        Account account = new Account (0);

        //  使用这种方式来创建两个客户，共用一个account账户,这样就创建两个线程了
        Customer c1 = new Customer (account);
        Customer c2 = new Customer (account);

        c1.setName ("甲");
        c2.setName ("乙");

        c1.start ();
        c2.start ();


    }
}
