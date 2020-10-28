package blackberry.day7OOP3.BankExeTest3;

/**
 * @Description: account
 * @author: bberzhou@gmail.com
 * @date: 4/11/20 10:22
 * Create By IntelliJ IDEA
 */
public class Account {
    private double balance;

    public Account (double init_balance) {
        this.balance = init_balance;
    }

    public double getBalance () {
        return this.balance;
    }

    public void deposit (double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println ("成功存入：" + amount);

        } else {
            System.out.println ("金额错误，存入失败");
        }


    }

    public void withdraw (double amount) {
        if (this.balance > amount) {
            this.balance -= amount;
            System.out.println ("成功取出：" + amount);
        } else {
            System.out.println ("取出失败");
        }

    }
}
