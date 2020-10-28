package blackberry.day7OOP3;

/**
 * @Description: constructor
 * @author: bberzhou@gmail.com
 * @date: 4/10/20 17:57
 * Create By IntelliJ IDEA
 */
public class Constructor {
    /*
        类的结构之构造器：
            一：构造器的作用：
                1.创建对象
                2.初始化对象的属性
            二：说明：
                1。如果没有显式的定义类的构造器的话，则系统会默认提供一个空参数的构造器
                2。定义构造器的格式 权限修饰符 类名(参数列表){}
                3。一个类中可以有多个构造器，彼此构成重载
                4。一旦显式的定义类的构造器之后，系统就不会提供空参的构造器了
                5。一个类中至少会有一个构造器


           总结：对象属性赋值的先后顺序

           1）默认初始化值
           2）显式的初始化值
           3）构造器中赋值
           1 2 3 在创建一个对象的时候都只会执行一次，而通过set get方法可以使用多次
           4）通过"对象.方法"或"对象.属性"的方式，赋值
           上面的赋值顺序
            1 2 3  4

            构造器的权限与类的权限是相同的

     */
    public static void main (String[] args) {
        //  Person...创建类的对象：new +构造器
        P p1 = new P ();
        //  使用构造器二；
        P p2 = new P ("tom");

        User user = new User ();
        System.out.println (user.age);   //  此时调用user对象的age属性  默认初始化值为0
        //  当显式的给age属性 赋值为1  int age = 1; 时打印出user对象的age属性为1
        User user1 = new User (3);
//        user1.setAge (4); 通过set方式设置之后age为4
        System.out.println (user1.age);  //  此时根据有参构造器传入的为3

    }
}

class P {
    //  属性
    String name;
    int age;

    //  构造器一
    public P () {
        System.out.println ("Person...");
    }

    public P (String n) {
        name = n;
    }
}

//  这个类用来验证属性赋值的先后关系
class User {
    String name;
    int age = 1;

    public User () {

    }

    public User (int a) {
        age = a;
    }

    public void setAge (int a) {
        age = a;
    }
}
