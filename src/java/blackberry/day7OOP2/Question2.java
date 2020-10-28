package blackberry.day7OOP2;

/**
 * @Description: question
 * @author: bberzhou@gmail.com
 * @date: 4/10/20 09:51
 * Create By IntelliJ IDEA
 */
public class Question2 {
    /*
        1。定义一个circle类，包含一个double型的radius属性代表圆的半径，
        一个findArea()方法返回圆的面积
        2。定义一个类PassObject，在类中定义一个printAreas(Circle c ,int time)方法
         在printAreas方法中打印输出1到time之间每个整数半径值，以及对应的面积。
     */
    public static void main (String[] args) {
        Circle c = new Circle ();
        PassObject passObject = new PassObject ();
        passObject.printAreas (c, 5);
    }
}

class Circle {
    //  定义半径
    double radius;

    //  求圆的面积
    public double findArea () {
        return 3.14 * radius * radius;
    }
}

class PassObject {
    public void printAreas (Circle c, int time) {
        System.out.println ("Radius" + "\t\t" + "Area");
        for (int i = 1 ; i <= time ; i++) {
            c.radius = i;
            System.out.println (i + "\t\t\t" + c.findArea () * i);
        }
        System.out.println ("现在圆的半径:" + (time + 1));
    }
}
