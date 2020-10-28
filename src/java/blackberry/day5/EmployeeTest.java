package blackberry.day5;

/**
 * @author bberzhou@gmail.com
 * @date 7/23/19 08:55
 * Create By IntelliJ IDEA
 */
public class EmployeeTest {
    public static void main (String[] args) {
        Employee employee1 = new Employee ();
        Employee employee2 = new Employee ();
        employee1.setAge (10);
        employee1.setName ("张三 ");
        employee1.setSalary (30.89);
        employee2.setAge (10);
        employee2.setName ("里斯本");
        employee2.setSalary (33.45);
        employee1.printEmployee ();
        employee2.printEmployee ();
    }
}
