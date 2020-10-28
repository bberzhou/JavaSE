package blackberry.day7OOP1;

/**
 * @author bberzhou@gmail.com
 * @date 8/28/19 09:57
 * Create By IntelliJ IDEA
 */
public class Polymorphic {
    /*
        测试多态性
     */
    public static void main (String[] args) {

        //  给一个工资，算出需要的税收
        Income income = new Income (3000);
        Income income1 = new Salary (6000);
        Income income2 = new SpecialAllowance (10000);
        System.out.println (income.getTax ());
        System.out.println (income1.getTax ());
        System.out.println (income2.getTax ());
        /*
            300.0
            200.0
            0.0
         */

    }
}

//  父类
class Income {
    protected double income;

    public Income (double income) {
        this.income = income;
    }

    public double getTax () {
        return income * 0.1;
    }
}

class Salary extends Income {
    public Salary (double income) {
        super (income);

    }

    @Override
    public double getTax () {
        if (income <= 5000) {
            return 0;
        }

        return (income - 5000) * 0.2;
    }
}

class SpecialAllowance extends Income {
    public SpecialAllowance (double income) {
        super (income);
    }

    @Override
    public double getTax () {
        return 0;
    }
}