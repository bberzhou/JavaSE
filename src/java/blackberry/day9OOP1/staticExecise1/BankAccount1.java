package blackberry.day9OOP1.staticExecise1;

/**
 * @Description: BankAccount类改进
 * @author: bberzhou@gmail.com
 * @date: 4/23/20 10:09
 * Create By IntelliJ IDEA
 */
public class BankAccount1 {
    //  账户id
    private int id;
    //  默认初始密码
    private String password = "00000";
    //  账户余额
    private double balance;


    //  下面几个都是静态的属性
    //  银行利率
    private static double interestRate;
    //  最低金额
    private static double minMoney = 1.0;
    //  用于自动生成id
    private static int initId = 1001;

    public BankAccount1 () {
        //  初始化账户的id
        id = initId;
        //  赋值后，initId自增
        initId++;
    }

    public BankAccount1 (String password, double balance) {
        this ();
        this.balance = balance;
        this.password = password;
    }

    public static double getMinMoney () {
        return minMoney;
    }

    public static int getInitId () {
        return initId;
    }

    //  属性是static的，则对应的操作该属性的方法也是static的
    public static double getInterestRate () {
        return interestRate;
    }

    public static void setMinMoney (double minMoney) {
        BankAccount1.minMoney = minMoney;
    }

    public static void setInterestRate (double interestRate) {
        BankAccount1.interestRate = interestRate;
    }

    public static void setInitId (int initId) {
        BankAccount1.initId = initId;
    }

    public void setPassword (String password) {
        this.password = password;
    }

    public void setId (int id) {
        this.id = id;
    }

    public void setBalance (double balance) {
        this.balance = balance;
    }

    public String getPassword () {
        return password;
    }

    public int getId () {
        return id;
    }

    public double getBalance () {
        return balance;
    }


}
