package blackberry.day9OOP2.AbstractClassExe1;

/**
 * @Description: 员工类的测试
 * @author: bberzhou@gmail.com
 * @date: 4/29/20 21:40
 * Create By IntelliJ IDEA
 */
public class EmployeeTest {
    public static void main (String[] args) {
        Manager manager = new Manager ("Cook", 1002, 100000.0, 5000);
        //  也可以使用下面的声明方式，这里就可以体现多态的意义，父类的引用指向子类的对象
        Employee employee = new CommonEmployee ();
        manager.work ();    //  管理者的工作是管理员工

        employee.work ();   //  普通员工的工作负责生产
    }
}
