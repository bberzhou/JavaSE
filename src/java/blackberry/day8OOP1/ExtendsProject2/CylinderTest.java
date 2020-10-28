package blackberry.day8OOP1.ExtendsProject2;

/**
 * @Description: 圆柱测试
 * @author: bberzhou@gmail.com
 * @date: 4/14/20 16:05
 * Create By IntelliJ IDEA
 */
public class CylinderTest {
    public static void main (String[] args) {
        Cylinder cylinder = new Cylinder ();
        //  设置半径
        cylinder.setRadius (2.0);
        //  设置高
        cylinder.setLength (8);
        System.out.println ("圆柱的体积为：" + cylinder.findVolume ());
        //  默认半径为1.0 输出结果：3.141592653589793
        //  没有重写findArea()方法时
//        System.out.println("底面圆的面积为："+cylinder.findArea ());
        //  此时findArea()方法就是圆柱的表面积
        System.out.println ("圆柱的表面积为：" + cylinder.findArea ());
    }
}

