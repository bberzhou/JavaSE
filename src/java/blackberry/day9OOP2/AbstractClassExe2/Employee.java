package blackberry.day9OOP2.AbstractClassExe2;

/**
 * @Description: 员工类
 * @author: bberzhou@gmail.com
 * @date: 4/29/20 23:00
 * Create By IntelliJ IDEA
 */
    /*
        定义一个Employee类，该类包含name,number ,birthday 属性和抽象方法earnings()
        重写toString()方法

     */
abstract public class Employee {
    private String name;
    private int number;
    private Mydate birthday;

    //  父类中的抽象方法
    public abstract double earnings ();

    //  构造器
    public Employee () {

    }

    public Employee (String name, int number, Mydate birthday) {
        this.name = name;
        this.number = number;
        this.birthday = birthday;
    }

    public void setName (String name) {
        this.name = name;
    }

    public void setBirthday (Mydate birthday) {
        this.birthday = birthday;
    }

    public void setNumber (int number) {
        this.number = number;
    }

    public String getName () {
        return name;
    }

    public int getNumber () {
        return number;
    }

    public Mydate getBirthday () {
        return birthday;
    }

    @Override
    public String toString () {
        return
            "name='" + name + '\'' +
                ", number=" + number +
                //  注意这里的birthday 是调的自己的toDateString 不是本身的toString
                ", birthday=" + birthday.toDateString ();
    }
}
