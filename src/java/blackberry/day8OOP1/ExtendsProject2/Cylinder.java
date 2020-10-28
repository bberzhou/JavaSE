package blackberry.day8OOP1.ExtendsProject2;

/**
 * @Description: 圆柱
 * @author: bberzhou@gmail.com
 * @date: 4/14/20 16:01
 * Create By IntelliJ IDEA
 */
public class Cylinder extends Circle {
    //  圆柱类继承圆类
    //  圆柱自有的高
    private double length;

    //  初始化高度为1
    public Cylinder () {
        length = 1.0;
    }

    public void setLength (double length) {
        this.length = length;
    }

    public double getLength () {
        return length;
    }

    //  返回圆柱的体积
    public double findVolume () {
        return Math.PI * getRadius () * getRadius () * getLength ();
//        return Math.PI*getRadius ()*getRadius ()*length;
        //  findArea()方法就是返回的底面积 ==Math.PI*getRadius ()*getRadius ()
        //  此时findArea ()方法就不是底面圆的面积了，需要使用super关键字
//        return findArea () * getLength ();

    }

    //  重写父类的findArea()方法，返回圆柱的表面积

    @Override
    public double findArea () {
        //  圆柱的表面积
        return Math.PI * getRadius () * getRadius () * 2 + Math.PI * getRadius () * 2 * getLength ();
    }
}
