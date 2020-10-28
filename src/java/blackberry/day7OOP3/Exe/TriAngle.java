package blackberry.day7OOP3.Exe;

/**
 * @Description: triangel
 * @author: bberzhou@gmail.com
 * @date: 4/10/20 18:25
 * Create By IntelliJ IDEA
 */
public class TriAngle {
    /*
        编写两个类：TriAngle和TriAngleTest，其中TriAngle类中声明私有的底边长base和高height
                  同时声明公共方法访问私有变量。
                  此外，提供类的必要的构造器。另外一个类中使用这些公共方法，计算三角形的面积
     */

    private double base;
    private double height;

    //  两个构造器
    public TriAngle () {

    }

    public TriAngle (double b, double h) {
        base = b;
        height = h;
    }

    public double getBase () {
        return base;
    }

    public void setBase (double base) {
        this.base = base;
    }

    public double getHeight () {
        return height;
    }

    public void setHeight (double height) {
        this.height = height;
    }
}
