package blackberry.day9OOP1.staticApply;

/**
 * @Description: 圆类
 * @author: bberzhou@gmail.com
 * @date: 4/23/20 09:06
 * Create By IntelliJ IDEA
 */
public class Circle {
    private double radius;
    //  每个circle对象都有一个id，自动赋值
    private int id;
    //  记录circle对象的总和
    private static int total;
    //  初始时的id
    private static int init = 1001; //  static修饰的属性被多个对象共享所属性

    //  构造器
    public Circle () {
        //  每次创建对象的时候，给每个对象的id赋值,在1001的基础上进行自增
        id = init++;

        //  记录创建对象的个数，每次调用Circle类的构造器，total就自增1

        total++;

    }

    //  带参数的构造器
    public Circle (double radius) {
//        id = init++;
//        //  记录对象总的个数
//        total++;

        //  或者直接调用空参的构造器
        this ();
        this.radius = radius;
        //  给对象一个初始化的id
    }

    public double findArea () {
        return 3.14 * radius * radius;
    }

    public void setRadius (double radius) {
        this.radius = radius;
    }

    public double getRadius () {
        return radius;
    }

    public int getId () {
        return id;
    }

    public void setId (int id) {
        this.id = id;
    }

    //  total的set get 方法，因为total属性是static的，所以操作total属性的方法也应该是static的
    public static int getTotal () {
        return total;
    }

    public static void setTotal (int total) {
        Circle.total = total;
    }
}
