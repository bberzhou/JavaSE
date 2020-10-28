package blackberry.day9OOP2.AbstractClassExe1;

/**
 * @Description: 员工类
 * @author: bberzhou@gmail.com
 * @date: 4/29/20 21:31
 * Create By IntelliJ IDEA
 */
abstract public class Employee {
    private String name;
    private int id;
    private double salary;

    //  无参构造器
    public Employee () {

    }

    public Employee (String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    //  抽象方法,每个员工的工作不相同
    public abstract void work ();

    //  get set 方法


    public String getName () {
        return name;
    }

    public int getId () {
        return id;
    }

    public double getSalary () {
        return salary;
    }

    public void setName (String name) {
        this.name = name;
    }

    public void setId (int id) {
        this.id = id;
    }

    public void setSalary (double salary) {
        this.salary = salary;
    }
}
