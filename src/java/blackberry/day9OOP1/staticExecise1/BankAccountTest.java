package blackberry.day9OOP1.staticExecise1;

/**
 * @Description: 银行账户测试类
 * @author: bberzhou@gmail.com
 * @date: 4/23/20 09:49
 * Create By IntelliJ IDEA
 */
public class BankAccountTest {

    public static void main (String[] args) {
        BankAccount b1 = new BankAccount ();
        System.out.println (b1.getAccount ());
        BankAccount b2 = new BankAccount ();
        System.out.println (b2.getAccount ());
        BankAccount b3 = new BankAccount ("123zzj", 5000, 200);
        System.out.println (b3.getRate ());
        System.out.println (b1); //  BankAccount{account=1001, password='null', rate=0.014, money=0.0, minMoney=0.0}

        System.out.println (b2);
        //BankAccount{account=1002, password='null', rate=0.014, money=0.0, minMoney=0.0}

        System.out.println (b3);
        //BankAccount{account=1003, password='123zzj', rate=0.014, money=5000.0, minMoney=200.0}

    }
}
