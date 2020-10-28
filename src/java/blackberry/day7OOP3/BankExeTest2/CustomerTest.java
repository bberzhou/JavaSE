package blackberry.day7OOP3.BankExeTest2;

/**
 * @Description: customerTest
 * @author: bberzhou@gmail.com
 * @date: 4/11/20 09:55
 * Create By IntelliJ IDEA
 */
public class CustomerTest {
    /*
        写一个程序。
        1）创建一个Customer对象，名字Jane Smith，他有一个账号为1000，余额为2000元，
            年利率为1.23
        2）对Jane Smith的操作：
                1。存入100，再取出960。再取出2000。然后打印Jane Smith的基本信息

     */
    public static void main (String[] args) {
        Customer customer = new Customer ("Jane", "Smith");
        //  先创建一个account对象
        Account account = new Account (1000, 2000, 1.23);
        //  利用customer的set方法设置account属性
        customer.setAccount (account);
        //  customer.getAccount ()，返回的是一个account对象
        customer.getAccount ().deposit (100);
        //  成功取出：960.0
        customer.getAccount ().withdraw (960);
        //  获取customer对象的Account属性，然后利用account对象调用withdraw方法
        customer.getAccount ().withdraw (2000);
        //  打印当前customer信息Customer [Jane,Smith ] has a account：id is1000 	annualInterest is 1.23
        System.out.println ("Customer [" + customer.getFirstName () + "," + customer.getLastName () + " ] "
            + "has a account：id is" + customer.getAccount ().getId () + " \t" + "annualInterest is " +
            customer.getAccount ().getAnnualInterestRate ());

    }
}
