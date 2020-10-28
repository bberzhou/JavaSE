package blackberry.day8OOP1.ExtendAndSuperTest;

/**
 * @Description: checkAccountTest
 * @author: bberzhou@gmail.com
 * @date: 4/16/20 23:49
 * Create By IntelliJ IDEA
 */
public class CheckAccountTest {
    /*
        编写一个用户程序测试CheckAccount类，在用户程序中
        创建一个账号为1122、余额为20000，年利率为4.5%，可透支金额为5000元的CheckAccount对象。
        使用withdraw方法提款5000元，并打印余额和可透支金额
        再使用withdraw方法提款18000元，并打印余额和可透支金额
        使用deposit方法存款3000，然后打印余额和月利率
     */
    public static void main (String[] args) {
        CheckAccount checkAccount = new CheckAccount (1122, 20000, 0.045, 5000);
        checkAccount.withdraw (5000);
        System.out.println ("账户余额为：" + checkAccount.getBalance () + "  可透支金额为：" + checkAccount.getOverdraft ());
        checkAccount.withdraw (18000);
        System.out.println ("账户余额为：" + checkAccount.getBalance () + "  可透支金额为：" + checkAccount.getOverdraft ());
        checkAccount.deposit (3000);
        System.out.println ("账户余额：" + checkAccount.getBalance ());

    }
}
