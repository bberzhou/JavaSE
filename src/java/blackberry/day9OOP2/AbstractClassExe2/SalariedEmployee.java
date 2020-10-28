package blackberry.day9OOP2.AbstractClassExe2;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 4/30/20 22:35
 * Create By IntelliJ IDEA
 */
public class SalariedEmployee extends Employee {
    /*
        SalariedEmployee类继承employee类
        实现按月计算工资的员工处理。该类包括：private成员变量 monthlySalary
        实现父类的抽象方法earnings 该方法返回monthlySalary值
        toString()方法输出员工类型和员工的name,number,birthday


     */
    private double monthlySalary;   //  月工资

    //  构造器
    public SalariedEmployee (String name, int number, Mydate birthday) {
        super (name, number, birthday);
    }

    public SalariedEmployee (String name, int number, Mydate birthday, double monthlySalary) {
        super (name, number, birthday);
        this.monthlySalary = monthlySalary;
    }

    public void setMonthlySalary (double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public double getMonthlySalary () {
        return monthlySalary;
    }

    //  子类SalariedEmployee继承抽象类，重写父类的抽象方法
    @Override
    public double earnings () {
        //  重写父类中的此方法，返回月工资
        return monthlySalary;
    }

    @Override
    public String toString () {
        //  子类的toString方法里面要输出name,number，birthday信息，可以直接调用父类的toString方法

        return "SalariedEmployee{" + super.toString () + "," + monthlySalary + "}";
    }
}
