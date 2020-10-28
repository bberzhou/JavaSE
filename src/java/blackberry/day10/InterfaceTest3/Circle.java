package blackberry.day10.InterfaceTest3;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 5/31/20 07:01
 * Create By IntelliJ IDEA
 */
public class Circle {
    //  定义一个Circle类，声明radius属性
    private double radius;  //  半径

    //  构造器
    public Circle () {

    }

    public Circle (double radius) {
        super ();
        this.radius = radius;
    }

    public double getRadius () {
        return radius;
    }

    public void setRadius (double radius) {
        this.radius = radius;
    }

}
