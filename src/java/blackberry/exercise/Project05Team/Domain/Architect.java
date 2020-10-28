package blackberry.exercise.Project05Team.Domain;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 10/2/20 17:20
 * Create By IntelliJ IDEA
 */
public class Architect extends Designer {
    /**
     * 架构师类Architect继承自设计师类
     */
    private int stock;  //  stock表示公司奖励的股票数量

    //
    public Architect () {
    }

    public Architect (int id, String name, int age, double salary, Equipment equipment, double bonus, int stock) {
        super (id, name, age, salary, equipment, bonus);
        this.stock = stock;
    }

    public int getStock () {
        return stock;
    }

    public void setStock (int stock) {
        this.stock = stock;
    }

    @Override
    public String toString () {
        return super.getDetail () + "\t架构师\t" +
            "status=" + getStatus () + "\t" +
            "bonus=" + getBonus () + "\t" +
            "stock=" + stock + "\t" + getEquipment ().getDescription ();
    }

    public String getDetailForTeam () {
        return getTeamDetailBase () + "架构师" + "\t" + getBonus () + "\t" + getStock ();

    }
}
