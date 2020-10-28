package blackberry.day9OOP2.AbstractClassExe;

/**
 * @Description: 测试类
 * @author: bberzhou@gmail.com
 * @date: 4/19/20 15:51
 * Create By IntelliJ IDEA
 */
public class GeometricObjectTest {
    /*
        定义一个测试类GeometricObjectTest
            编写equalsArea方法测试两个对象是否相等（注意方法的参数类型，利用动态绑定的技术）
            编写displayGeometricObject方法显示对象的面积（注意方法的参数类型，利用动态绑定技术）

     */
    public static void main (String[] args) {
        GeometricObjectTest ge = new GeometricObjectTest ();
        Circle c1 = new Circle ("white", 1.0, 3);
        ge.displayGeometricObject (c1);
        Circle c2 = new Circle ("black", 1.0, 2.5);
        ge.displayGeometricObject (c2);
        boolean isEqual = ge.equalsArea (c1, c2);
        if (isEqual) {
            System.out.println ("两个面积是相等的");
        } else {
            System.out.println ("面积不相等");
        }

    }


    //  测试两个对象是否相等
    public boolean equalsArea (GeometricObject g1, GeometricObject g2) {
        return g1.findArea () == g2.findArea ();
    }

    //  显示对象的面积
    //  这里就是用了多态 GeometricObject g = new Circle()，
    //  实际上传入的是GeometricObject的子类对象
    public void displayGeometricObject (GeometricObject g) {
        double area = g.findArea ();
        System.out.println ("面积为：" + area);

    }
}
