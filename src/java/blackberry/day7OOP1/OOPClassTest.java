package blackberry.day7OOP1;

/**
 * @Description: ClassStructure
 * @author: bberzhou@gmail.com
 * @date: 4/7/20 22:41
 * Create By IntelliJ IDEA
 */
public class OOPClassTest {
    /*
        一：设计类，其实就是设计类的成员
            1。创建类，设计类的成员
            2。创建类的对象
            3。通过"对象.属性"或"对象.方法"调用对象的结构
         三：如果创建了一个类的多个对象，则每个对象都独立的拥有一套类的属性（非static）
            修改一个对象的属性时，不会影响另外的对象

         四：虚拟机栈：主要存储局部变量（栈）
            堆：主要存放对象实例，
            方法区：用于存储已被虚拟机加载的类信息、常量、静态变量、即时编译器编译后的代码
     */

    public static void main (String[] args) {
        //  创建类的对象=类的实例话
        person p1 = new person ();
        p1.age = 10;
        System.out.println (p1.age);
        //  调用方法，
        p1.eat ();

    }
}

class person {
    //  属性（成员变量 filed=域）和行为（成员方法，函数=method）
    //  属性：对应类中的成员变量

    int age;

    //  行为：对应类中的成员方法
    public void eat () {
        System.out.println ("吃饭");
    }
}
