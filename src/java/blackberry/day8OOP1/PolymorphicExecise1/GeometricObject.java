package blackberry.day8OOP1.PolymorphicExecise1;

/**
 * @Description: 几何类
 * @author: bberzhou@gmail.com
 * @date: 4/19/20 15:35
 * Create By IntelliJ IDEA
 */
public class GeometricObject {
    //  几何图形
    protected String color;
    protected double weight;

    //  带参的构造器
    public GeometricObject (String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    //  无参构造器
    public GeometricObject () {

    }

    //  求面积的方法
    public double findArea () {
        //  因为每个图形计算的方式不一样，所以在父类就不用实现具体的方法
        return 0.0;
    }

    public void setColor (String color) {
        this.color = color;
    }

    public void setWeight (double weight) {
        this.weight = weight;
    }

    public double getWeight () {
        return weight;
    }

    public String getColor () {
        return color;
    }

}
