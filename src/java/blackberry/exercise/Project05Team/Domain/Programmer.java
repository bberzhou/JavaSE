package blackberry.exercise.Project05Team.Domain;

import blackberry.exercise.Project05Team.Service.Status;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 9/30/20 19:46
 * Create By IntelliJ IDEA
 */
public class Programmer extends Employee {
    /**
     * programmer 类继承自 Employee
     */
    private int memberId;   //  开发团队中的id
    private Status status = Status.FREE;  //  表示员工的状态 free 、busy、vocation几个状态,默认初始状态为free
    private Equipment equipment;  //  员工的装备

    public Programmer () {
        super ();
    }

    public Programmer (int id, String name, int age, double salary, Equipment equipment) {
        super (id, name, age, salary);
        this.equipment = equipment;
    }

    public int getMemberId () {
        return memberId;
    }

    public void setMemberId (int memberId) {
        this.memberId = memberId;
    }

    public Status getStatus () {
        return status;
    }

    public void setStatus (Status status) {
        this.status = status;
    }

    public Equipment getEquipment () {
        return equipment;
    }

    public void setEquipment (Equipment equipment) {
        this.equipment = equipment;
    }

    @Override
    public String toString () {
//        return super.toString ()+"\t程序员\t"+
//            "status=" + status +"\t\t"+
//            "equipment=" + equipment.getDescription ();
        //  programmer是employee的直接子类
        return super.getDetail () + "\t程序员\t" +
            "status=" + getStatus () + "\t";
    }

    //  为了更好的兼容字段展示TeamView里面的getTeam
    //  程序员需要展示的信息 "6", "任志强", "22", "6800" 程序员
//    public String getDetailsForTeam(){
//        return memberId +"/"+getId ()+"\t"+getName ()+"\t" +getAge ()+"\t"+getSalary ()+"\t"+"程序员";
//    }
    //上面这样写比较冗余，因为下面的designer和architect都可以用，所以可以抽离出一个方法来
    public String getTeamDetailBase () {
        return memberId + "/" + getId () + "\t\t" + getName () + "\t\t" + getAge () + "\t\t" + getSalary () + "\t\t";
    }

    public String getDetailForTeam () {
        return getTeamDetailBase () + "程序员";
    }
}
