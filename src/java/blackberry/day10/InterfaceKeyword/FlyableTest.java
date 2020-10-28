package blackberry.day10.InterfaceKeyword;

/**
 * @Description: 实现Flyable接口
 * @author: bberzhou@gmail.com
 * @date: 4/30/20 23:56
 * Create By IntelliJ IDEA
 */
public class FlyableTest implements Flyable {
    //  FlyableTest实现接口中的抽象方法
    @Override
    public void fly () {
        System.out.println ("FlyableTest 实现接口的fly方法");
    }

    @Override
    public void stop () {
        System.out.println ("FlyableTest 实现接口的stop方法");
    }
}
