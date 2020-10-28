package blackberry.day7OOP3.BankExeTest2;

/**
 * @Description: Account
 * @author: bberzhou@gmail.com
 * @date: 4/11/20 09:33
 * Create By IntelliJ IDEA
 */
public class Account {
    /*
        Account类：该类的属性和方法如下图所示。该类包括的属性：账号id,余额balance,年利率annualInterestRate
                  包含方法：访问器方法(get 和set),取款方法withdraw()，存款方法deposit()
     */
    //  账户id
    private int id;
    //  账户余额
    private double balance;
    //  年利率
    private double annualInterestRate;

    //  无参构造器
    public Account () {

    }

    //  带参数的构造器
    public Account (int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public void setId (int id) {
        this.id = id;
    }

    public int getId () {
        return this.id;
    }

    public void setBalance (double balance) {
        this.balance = balance;
    }

    public double getBalance () {
        return this.balance;
    }

    public void setAnnualInterestRate (double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getAnnualInterestRate () {
        return this.annualInterestRate;
    }

    //  取钱
    public void withdraw (double amount) {
        if (this.balance < amount) {
            System.out.println ("余额不足,取款失败");
        } else {

            System.out.println ("成功取出：" + amount);
        }
        //  账户余额减了之后的
        this.balance -= amount;
    }

    //  存钱
    public void deposit (double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println ("成功存入：" + amount);
        }
    }
}
