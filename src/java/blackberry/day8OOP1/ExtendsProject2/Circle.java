package blackberry.day8OOP1.ExtendsProject2;

/**
 * @Description: 圆类
 * @author: bberzhou@gmail.com
 * @date: 4/14/20 15:59
 * Create By IntelliJ IDEA
 */
public class Circle {
    private double radius;//    圆的半径

    public Circle () {
        // 初始化时半径设置为10
        radius = 1.0;

    }

    public double getRadius () {
        return radius;
    }

    public void setRadius (double radius) {
        this.radius = radius;
    }

    //  返回圆的面积
    public double findArea () {
        return Math.PI * radius * radius;
    }
}
