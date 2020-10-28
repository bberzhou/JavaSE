package blackberry.day9OOP2.AbstractClassExe1;

import blackberry.day8OOP1.instanceofKeyword.Man;

/**
 * @Description: 管理者类
 * @author: bberzhou@gmail.com
 * @date: 4/29/20 21:34
 * Create By IntelliJ IDEA
 */
public class Manager extends Employee {
    //  manager自身的属性  奖金 bonus
    private double bonus;

    //  无参构造器
    public Manager () {

    }

    //  带一个参数的构造器
    public Manager (double bonus) {
        super ();
        this.bonus = bonus;
    }

    //  带参构造器
    public Manager (String name, int id, double salary, double bonus) {
        //  调用父类的构造器
        super (name, id, salary);
        this.bonus = bonus;
    }


    //  子类继承抽象类，需要重写里面的抽象方法
    @Override
    public void work () {
        System.out.println ("管理者的工作是管理员工");
    }
    //  bonus对应的set get

    public void setBonus (double bonus) {
        this.bonus = bonus;
    }

    public double getBonus () {
        return bonus;
    }
}
