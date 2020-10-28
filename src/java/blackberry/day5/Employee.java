package blackberry.day5;

/**
 * @author bberzhou@gmail.com
 * @date 7/23/19 08:51
 * Create By IntelliJ IDEA
 */
public class Employee {
    int age;
    String name;
    double salary;

    public int getAge () {
        return age;
    }

    public void setAge (int age) {
        this.age = age;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public double getSalary () {
        return salary;
    }

    public void setSalary (double salary) {
        this.salary = salary;
    }

    public void printEmployee () {
        System.out.println ("age" + age + "   " + "name" + " " + name + "    " + "salary" + "    " + salary);
    }
}
