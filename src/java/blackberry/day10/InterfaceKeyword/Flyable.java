package blackberry.day10.InterfaceKeyword;

/**
 * @Description: 可以飞的接口
 * @author: bberzhou@gmail.com
 * @date: 4/30/20 23:46
 * Create By IntelliJ IDEA
 */
public interface Flyable {
    //  全局常量 public static final 可以省略不写，
    public static final int MAX_SPEED = 79000;  //  定义一个全局常量，最大速度

    public static final int MIN_SPEED = 1;  //  最小速度

    //  抽象方法,public abstract 也是可以省略的
    public abstract void fly ();

    public abstract void stop ();

}
