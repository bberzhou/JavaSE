package blackberry.exercise.Project05Team.Domain;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 9/30/20 19:42
 * Create By IntelliJ IDEA
 */
public class Employee {
    //  员工类

    private int id;
    private String name;
    private int age;
    private double salary;

    //  无参构造器
    public Employee () {

    }

    //  有参构造器
    public Employee (int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getId () {
        return id;
    }

    public void setId (int id) {
        this.id = id;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public int getAge () {
        return age;
    }

    public void setAge (int age) {
        this.age = age;
    }

    public double getSalary () {
        return salary;
    }

    public void setSalary (double salary) {
        this.salary = salary;
    }

    //  此方法方便子类去调用父类的toString方法
    public String getDetail () {
        return id + "\t" +
            name + "\t" +
            age + "\t" + salary + "\t";
    }

    //重写toString方法
    @Override
    public String toString () {
        return getDetail ();

    }
}
