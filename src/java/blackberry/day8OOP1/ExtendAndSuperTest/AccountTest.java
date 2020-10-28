package blackberry.day8OOP1.ExtendAndSuperTest;

/**
 * @Description: 账户测试
 * @author: bberzhou@gmail.com
 * @date: 4/16/20 17:52
 * Create By IntelliJ IDEA
 */
public class AccountTest {
    /*
        编写一个用户程序测试account类，在用户程序中
        创建一个账号为1122、余额为20000，年利率为4.5%的account对象。
        使用withdraw方法提款30000元，并打印余额
        再使用withdraw方法提款2500元，
        使用deposit方法存款3000，然后打印余额和月利率
     */
    public static void main (String[] args) {
        Account account = new Account (1122, 20000, 0.045);
        account.withdraw (30000);
        System.out.println ("您的账户余额为：" + account.getBalance ());
        account.withdraw (2500);
        System.out.println ("您的账户余额为：" + account.getBalance ());
        account.deposit (3000);
        System.out.println ("您的账户余额为：" + account.getBalance () + " 月利率：" + account.getMonthlyInterest ());


    }
}
