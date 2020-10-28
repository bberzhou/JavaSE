package blackberry.day7OOP1.Exc;

/**
 * @Description: Circle
 * @author: bberzhou@gmail.com
 * @date: 4/8/20 10:31
 * Create By IntelliJ IDEA
 */
public class CircleAreaTest {
    //  利用面向对象的方法，设计一个计算圆面积的方法
    public static void main (String[] args) {
        Circle c1 = new Circle ();
        c1.radius = 5;
        double a = c1.CulArea ();
        System.out.println (a);
    }
}

//  定义一个circle类
class Circle {
    //  定义一个成员变量
    double radius;

    //  定义circle类的一个方法来返回面积
    public double CulArea () {
        double area = 3.14 * radius * radius;
        return area;
    }
}

