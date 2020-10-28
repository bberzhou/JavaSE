package blackberry.exercise.Project05Team.Domain;

import blackberry.exercise.Project05Team.Service.Status;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 10/2/20 17:11
 * Create By IntelliJ IDEA
 */
public class Designer extends Programmer {
    /**
     * 设计师继承自程序员类
     */
    private double bonus;   //  奖金

    //  空参构造器
    public Designer () {
        super ();
    }


    //  带参构造器，包括父类的属性
    public Designer (int id, String name, int age, double salary, Equipment equipment, double bonus) {
        super (id, name, age, salary, equipment);
        this.bonus = bonus;
    }


    public double getBonus () {
        return bonus;
    }

    public void setBonus (double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString () {
//        return "Designer{" +
//            "bonus=" + bonus +
//            '}';

        //  调用父类的父类中的方法
        return super.getDetail () + "\t设计师\t" +
            "status=" + getStatus () + "\t" +
            "bonus=" + bonus + "\t" + getEquipment ().getDescription ();
    }

    //  更好的在teamView里面展示
    public String getDetailForTeam () {
        return getTeamDetailBase () + "设计师" + "\t" + getBonus ();

    }
}
