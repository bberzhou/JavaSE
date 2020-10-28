package blackberry.day8OOp2.ObjectClassExecise3;

/**
 * @Description: 圆类
 * @author: bberzhou@gmail.com
 * @date: 4/21/20 14:32
 * Create By IntelliJ IDEA
 */
public class Circle extends GeometricObject {
    private double radius;

    public Circle () {
        //  调用父类的构造器
        super ();
        //  默认radius初始化为1.0
        this.radius = 1.0;
    }

    public Circle (double radius) {
        super ();
        this.radius = radius;
    }

    //  带多个参数的构造器
    public Circle (String color, double weight, double radius) {
        //  调用父类的带两个参数的构造器
        super (color, weight);
        this.radius = radius;
    }

    //  计算圆的面积的方法
    public double findArea () {
        return Math.PI * radius * radius;
    }

    //  重写equals()方法

    @Override
    public boolean equals (Object Obj) {
        //  首先判断和当前对象是否是相同的地址值
        if (this == Obj) {
            return true;
        }
        //  判断Obj是否是Circle的实例
        if (Obj instanceof Circle) {
            Circle circle = (Circle) Obj;
            //  这里只需要考虑两个圆的半径是否相等就行了
            return this.radius == circle.radius;

        }
        return false;
    }

    //  重写toString()方法

    @Override
    public String toString () {
        return "Circle[ color =" + color + ", weight = " + weight + ", radius = " + radius + " ]";
    }

    public void setRadius (double radius) {
        this.radius = radius;
    }

    public double getRadius () {
        return radius;
    }
}
