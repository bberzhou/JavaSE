package blackberry.day7OOP3.Exe;

/**
 * @Description: TriAngleTest
 * @author: bberzhou@gmail.com
 * @date: 4/10/20 18:25
 * Create By IntelliJ IDEA
 */
public class TriAngleTest {
    public static void main (String[] args) {
        TriAngle triAngle = new TriAngle ();
        //  无参构造器  Base:0.0,height0.0
        //  通过get set方法来给对象的属性赋值
        System.out.println (" Base:" + triAngle.getBase () + ",height" + triAngle.getHeight ());
        TriAngle triAngle1 = new TriAngle (3.0, 5.0);
        //  带参数的构造器 Base:3.0,height5.0
        System.out.println (" Base:" + triAngle1.getBase () + ",height" + triAngle1.getHeight ());


    }
}
