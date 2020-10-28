package blackberry.day7OOP1.Exc;

/**
 * @Description: exercise
 * @author: bberzhou@gmail.com
 * @date: 4/8/20 10:41
 * Create By IntelliJ IDEA
 */
public class Exer1Test {
    //  1。编写一个程序，声明一个method方法，在方法中打印一个10*8的*型的矩形，在main方法中调用该方法

    //  2。修改上一个程序，在method方法中，除了打印一个10*8的*型矩形外，再计算该矩形的面积
    public static void main (String[] args) {
        Rectangle rectangle1 = new Rectangle ();
        rectangle1.length = 10.0;
        rectangle1.width = 8.0;
        rectangle1.method ();
    }
}

class Rectangle {
    double length;
    double width;

    public void method () {
        for (int i = 0 ; i < length ; i++) {
            for (int j = 0 ; j < width ; j++) {
                System.out.print ("*" + " ");
            }
            System.out.println ();
        }
        System.out.println ("此矩形的面积为：" + width * length);
    }
}
