package blackberry.day8OOP1.ExtendClass;

/**
 * @Description: 集成测试
 * @author: bberzhou@gmail.com
 * @date: 4/14/20 10:42
 * Create By IntelliJ IDEA
 */
public class ExtendsTest {
    public static void main (String[] args) {
        /*
            面向对象的特征二：继承性
            一：继承性的好处
                1）减少了代码的冗余，提高了代码的复用性，
                2）便于功能的扩展
                3）为之后多态性的使用，提供了前提
            二：Student extends Person    Class A extends B ,
                    A：子类，派生类  ，subCLass
                    B:父类 ，超类 ，superClass
              体现：一旦子类继承了父类，子类A中就获取了父类B中声明的结构：属性和方法
                    特别的，当属性或者方法，声明为private时，子类在继承父类之后，
                    仍然认为继承到了，由于封装性的原因，而使得子类无法直接调用

               子类继承父类之后，还可以定义自己专属的一些特有的属性或方法。


            三：Java中继承的规定
                1）一个类可以被多个类继承，一个类中只能有一个父类，不支持多继承
                2）子类和父类是相对的概念，即可以会有多个继承
                3）子类继承直接父类或间接父类，就继承了父类中的所有属性和方法

            四：
                1。如果没有显式的声明一个类的父类的话，则此类继承于java.lang.Object类
                2。所有的Java类都直接或间接的继承于Object类
                3。所有的Java类中都具有Object类中声明的属性和方法

                Java中类的单继承性，接口就不是单继承了
         */

        Person person = new Person ();
        person.setAge (1);
        person.eat ();

        Student student = new Student ();
        student.eat ();
        student.sleep ();
    }
}
