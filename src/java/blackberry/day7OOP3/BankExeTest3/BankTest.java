package blackberry.day7OOP3.BankExeTest3;

/**
 * @Description: test
 * @author: bberzhou@gmail.com
 * @date: 4/11/20 16:05
 * Create By IntelliJ IDEA
 */
public class BankTest {
    /*
        BanKTest

     */
    public static void main (String[] args) {
        //  创建一个Bank对象
        Bank bank = new Bank ();
        //  在Bank对象里面给Customers数组里面添加一个customer
        bank.addCustomer ("Jean", "Smith");
        //  创建一个account对象,并初始化balance为3000
        Account account = new Account (3000);
        bank.getCustomer (0).setAccount (account);
        //  对index =0 的customer账户进行一个取钱的操作
        bank.getCustomer (0).getAccount ().withdraw (2000);
        //  获取index =0 的customer的account的balance
        double ban = bank.getCustomer (0).getAccount ().getBalance ();
        System.out.println ("客户:" + bank.getCustomer (0).getFirstName () + "的余额为 " + ban);
        System.out.println ("*******************");
        bank.addCustomer ("杨", "万里");
        System.out.println ("当前银行的客户个数：" + bank.getNumberOfCustomer ());
    }
}
