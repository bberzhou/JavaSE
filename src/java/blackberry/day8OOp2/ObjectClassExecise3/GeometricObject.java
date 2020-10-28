package blackberry.day8OOp2.ObjectClassExecise3;

/**
 * @Description: 几何类
 * @author: bberzhou@gmail.com
 * @date: 4/21/20 14:27
 * Create By IntelliJ IDEA
 */
public class GeometricObject {
    /*
        父类定义颜色和权重
     */
    protected String color;
    protected double weight;

    protected GeometricObject () {
        //  初始化 color = white  weight = 1.0
        this.color = "white";
        this.weight = 1.0;

    }

    protected GeometricObject (String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor () {
        return color;
    }

    public double getWeight () {
        return weight;
    }

    public void setWeight (double weight) {
        this.weight = weight;
    }

    public void setColor (String color) {
        this.color = color;
    }
}
