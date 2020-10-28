package blackberry.day9OOP2.AbstractClassExe2;

/**
 * @Description: 小时工
 * @author: bberzhou@gmail.com
 * @date: 4/30/20 22:52
 * Create By IntelliJ IDEA
 */
public class HourlyEmployee extends Employee {
    //  小时工，继承自employee，实现按小时计算工资
    private int wage;   //  时薪
    private int hour;  //  工作的小时数

    public HourlyEmployee () {

    }

    public HourlyEmployee (String name, int number, Mydate birthday, int wage, int hour) {
        super (name, number, birthday);
        this.wage = wage;
        this.hour = hour;
    }

    //  这个子类重写父类的抽象方法，返回 wage*hour
    @Override
    public double earnings () {
        //  返回钟点工的薪水
        return wage * hour;
    }

    //  重写toString方法，输出HourlyEmployee的信息
    @Override
    public String toString () {
        return "HourlyEmployee{" +
            super.toString () +
            ", wage=" + wage +
            ", hour=" + hour +
            '}';
    }
}
