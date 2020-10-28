package blackberry.day8OOP1.ExtendAndSuperTest;

/**
 * @Description: 账户类
 * @author: bberzhou@gmail.com
 * @date: 4/16/20 17:42
 * Create By IntelliJ IDEA
 */
public class Account {
    /*
        一个名为account的账户类，该类的属性和方法
     */
    //  账户id
    private int id;
    //  账户余额
    private double balance;
    //  年利率
    private double annualInterestRate;

    //  空参构造器
    public Account () {

    }

    //  带参构造器
    public Account (int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId () {
        return id;
    }

    public double getBalance () {
        return balance;
    }

    public double getAnnualInterestRate () {
        return annualInterestRate;
    }

    public void setId (int id) {
        this.id = id;
    }

    public void setBalance (double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate (double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    //  获取月利率
    public double getMonthlyInterest () {
        return annualInterestRate / 12;
    }

    //  取钱操作
    public void withdraw (double amount) {
        if (balance >= amount) {
            balance -= amount;

        } else {
            System.out.println ("余额不足！");
        }
    }

    //  存钱操作
    public void deposit (double amount) {
        if (amount > 0) {
            balance += amount;
        }

    }
}
