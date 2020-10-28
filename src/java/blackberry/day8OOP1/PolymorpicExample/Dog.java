package blackberry.day8OOP1.PolymorpicExample;

/**
 * @Description: 狗
 * @author: bberzhou@gmail.com
 * @date: 4/17/20 09:19
 * Create By IntelliJ IDEA
 */
public class Dog extends Animal {
    @Override
    public void eat () {
        System.out.println ("狗吃骨头");
    }

    @Override
    public void shout () {
        System.out.println ("汪汪汪！");
    }
}
