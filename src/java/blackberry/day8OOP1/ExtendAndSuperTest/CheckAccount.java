package blackberry.day8OOP1.ExtendAndSuperTest;

/**
 * @Description: CheckAccount
 * @author: bberzhou@gmail.com
 * @date: 4/16/20 22:56
 * Create By IntelliJ IDEA
 */
public class CheckAccount extends Account {
    /*
        CheckAccount 是account的子类，该账户定义一个属性overdraft代表可透支限额。
        在CheckAccount类中重写withdraw方法，其算法：
            如果（取款金额<账户余额），
                可直接取款
            如果（取款金额>账户余额），
                计算需要透支的额度，
                判断克透支额overdraft是否可以支付本次透支的需要，如果可以将账户余额修改为0，
                冲减可透支金额
            如果不可以
                提示用户超过可透支额的限额。
     */
    private double overdraft;

    //    public CheckAccount(double overdraft){
//          这里会默认有一个super()调用父类的无参构造器
//        this.overdraft = overdraft;
//    }
    //  如果父类中没有无参的构造器，就需要使用super调用带参的构造器，并显式的调用
    public CheckAccount (int id, double balance, double annualInterestRate, double overdraft) {
        super (id, balance, annualInterestRate);
        this.overdraft = overdraft;
    }

    @Override
    public void withdraw (double amount) {
//        //  默认是使用super调用父类的withdraw方法
//        super.withdraw (amount);

        //  这里使用this.getBalance ()是因为balance是private的，
        //  需要使用get方法获取当前对象的balance属性来判断当前balance是否大于amount
        if (this.getBalance () >= amount) { //   余额足够的情况
            //  方式一：通过set get方法修改private的属性
            //  this.setBalance (this.getBalance () - amount);
            //  方式二：调用父类的withdraw方法
            super.withdraw (amount);
            //  如果余额不足，看透支额度够不够
        } else if (overdraft >= amount - this.getBalance ()) {
            //  先用amount - balance 就是需要透支的额度，再用overdraft减
            overdraft -= (amount - this.getBalance ());
            //  将balance赋值为0；
            //  或者直接取完  super.withdraw (this.getBalance ());
            this.setBalance (0);
        } else {
            System.out.println ("超过可透支限额");
        }
    }

    public void setOverdraft (double overdraft) {
        this.overdraft = overdraft;
    }

    public double getOverdraft () {
        return overdraft;
    }
}
