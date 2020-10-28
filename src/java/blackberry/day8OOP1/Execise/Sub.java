package blackberry.day8OOP1.Execise;

/**
 * @Description: 子类
 * @author: bberzhou@gmail.com
 * @date: 4/17/20 21:33
 * Create By IntelliJ IDEA
 */
public class Sub extends Base {
    int count = 20;

    @Override
    public void display () {
        System.out.println (this.count);
    }
}
