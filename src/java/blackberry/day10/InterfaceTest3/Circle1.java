package blackberry.day10.InterfaceTest3;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 5/31/20 07:31
 * Create By IntelliJ IDEA
 */
public class Circle1 {
    //  定义一个Circle类，声明radius属性
    private Double radius;  //  半径是包装类型

    //  构造器
    public Circle1 () {

    }

    public Circle1 (Double radius) {
        super ();
        this.radius = radius;
    }

    public Double getRadius () {
        return radius;
    }

    public void setRadius (Double radius) {
        this.radius = radius;
    }
}
