package blackberry.day9OOP1.staticExecise1;

/**
 * @Description: 银行账户
 * @author: bberzhou@gmail.com
 * @date: 4/23/20 09:39
 * Create By IntelliJ IDEA
 */
public class BankAccount {
    /*
        编写一个类实现银行账户的概念：包含的属性有"账号"、"密码"、"存款余额"、"利率"、"最小余额"
        定义封装这些属性的方法。账号自动生成。
            编写测试类，输入、输出3个账户的上述信息
            考虑：哪些属性可以设计成为static的
     */
    private int account;
    private String password;
    //  利率
    private double rate;
    //  余额
    private double money;
    //  最小余额
    private double minMoney;
    //  账户id,用于自动生成
    private static int initId = 1001;
    private static double initRate = 0.014;

    //  空参构造器，默认初始化账户的利率和账户账号
    public BankAccount () {
        rate = initRate;
        account = initId;
        //  每次给对象的account赋值之后，initID自增1
        initId++;
    }

    //  带参数的构造器
    public BankAccount (String password, double money, double minMoney) {
        this ();
        this.password = password;
        this.money = money;
        this.minMoney = minMoney;

    }

    //  重写toString()方法
    @Override
    public String toString () {
        return "BankAccount{" +
            "account=" + account +
            ", password='" + password + '\'' +
            ", rate=" + rate +
            ", money=" + money +
            ", minMoney=" + minMoney +
            '}';
    }

    public void setAccount (int account) {
        this.account = account;
    }

    public void setMinMoney (double minMoney) {
        this.minMoney = minMoney;
    }

    public void setMoney (double money) {
        this.money = money;
    }

    public void setPassword (String password) {
        this.password = password;
    }

    public void setRate (double rate) {
        this.rate = rate;
    }

    public double getMinMoney () {
        return minMoney;
    }

    public double getMoney () {
        return money;
    }

    public double getRate () {
        return rate;
    }

    public int getAccount () {
        return account;
    }

    public String getPassword () {
        return password;
    }

    //  属性是static的，那么对应的操作该属性的方法也必须是static的

    public static void setInitId (int initId) {
        BankAccount.initId = initId;
    }

    public static void setInitRate (double initRate) {
        BankAccount.initRate = initRate;
    }

    public static double getInitRate () {
        return initRate;
    }

    public static int getInitId () {
        return initId;
    }
}
