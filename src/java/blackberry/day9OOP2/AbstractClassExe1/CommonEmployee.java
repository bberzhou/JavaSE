package blackberry.day9OOP2.AbstractClassExe1;

/**
 * @Description: 普通员工
 * @author: bberzhou@gmail.com
 * @date: 4/29/20 21:39
 * Create By IntelliJ IDEA
 */
public class CommonEmployee extends Employee {
    @Override
    public void work () {
        System.out.println ("普通员工的工作负责生产");
    }
}
