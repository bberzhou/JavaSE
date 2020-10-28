package blackberry.day9OOP2.AbstractClassExe;

/**
 * @Description: 矩形类
 * @author: bberzhou@gmail.com
 * @date: 4/19/20 15:46
 * Create By IntelliJ IDEA
 */
public class Rectangle extends GeometricObject {
    private double width;
    private double height;

    //  带参构造器
    public Rectangle (String color, double weight, double width, double height) {
        super (color, weight);
        this.width = width;
        this.height = height;
    }

    //  无参构造器
    public Rectangle () {

    }
    //  重写父类的findArea()方法


    @Override
    public double findArea () {
        //  矩形的面积 长✖️宽
        return width * height;
    }

    public void setHeight (double height) {
        this.height = height;
    }

    public void setWidth (double width) {
        this.width = width;
    }

    public double getHeight () {
        return height;
    }

    public double getWidth () {
        return width;
    }
}
