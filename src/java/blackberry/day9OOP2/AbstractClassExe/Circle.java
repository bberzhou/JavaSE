package blackberry.day9OOP2.AbstractClassExe;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 4/19/20 15:41
 * Create By IntelliJ IDEA
 */
public class Circle extends GeometricObject {
    //  圆类继承自GeometricObject
    //  圆的半径
    private double radius;

    //  带参构造器
    public Circle (String color, double weight, double radius) {
        super (color, weight);
        this.radius = radius;

    }

    //  无参构造器
    public Circle () {

    }
    //  重写findArea()方法

    @Override
    public double findArea () {
        return Math.PI * radius * radius;
    }

    public double getRadius () {
        return radius;
    }

    public void setRadius (double radius) {
        this.radius = radius;
    }
}
