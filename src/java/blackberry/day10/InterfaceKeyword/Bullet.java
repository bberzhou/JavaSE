package blackberry.day10.InterfaceKeyword;

/**
 * @Description: 子弹类
 * @author: bberzhou@gmail.com
 * @date: 5/1/20 00:08
 * Create By IntelliJ IDEA
 */
public class Bullet implements Flyable, Attackable {
    //  实现多个接口，中间用 逗号 ，隔开 多个接口
    //  子弹类 既可以飞，也可以攻击
    @Override
    public void attack () {
        System.out.println ("子弹可以射击。");
    }

    @Override
    public void fly () {
        System.out.println ("子弹可以飞");
    }

    @Override
    public void stop () {
        System.out.println ("子弹打中之后停下");
    }
}
