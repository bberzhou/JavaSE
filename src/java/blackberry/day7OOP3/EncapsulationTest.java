package blackberry.day7OOP3;

/**
 * @Description: encapsulation
 * @author: bberzhou@gmail.com
 * @date: 4/10/20 15:28
 * Create By IntelliJ IDEA
 */
public class EncapsulationTest {
    /*
        面向对象的特征一：
        一：封装性和隐藏
            当我们创建一个类的对象以后，我们可以通过"对象,属性"的方式，对对象的属性进行赋值，
            这里，赋值操作收到属性的数据类型和存储范围的限制。但是没有其他制约条件，
            但是在实际问题中往往需要给属性赋值加入额外的限制条件，这个条件不能再属性声明时体现，
            只能通过方法进行限制条件的添加，并且需要将属性声明为私有的，
            此时针对于属性来讲就是封装的
        二：封装性的体现
            将类中的属性XXX进行私有化(private),同时，提供公共的(public)方法来获取(get())和设置(set())
            不对外暴露的私有方法
            单例模式（将构造器私有化）

        三：封装性的体现，需要权限修饰符来配合
            1。Java中的四种权限修饰符  ：
                private(类里面访问)、
                缺省（同一个类，同一个包里面）
                protected（同一个类，同一个包里面，或不同包的子类）、
                public（同一个类，同一个包里面，或不同包的子类、同一个工程）
                四种权限从小到大的顺序为 private < 缺省 < protected < public
            2。 四种权限修饰符还可以用来修饰类和类的内部结构：属性、方法、构造器、内部类、
                修饰类的时候只能使用：public 或者缺省
         四：Java提供了4种权限修饰符来修饰类以及类的内部结构，体现类以及类的内部结构在被调用时的可见性
     */
    public static void main (String[] args) {
        Animal animal = new Animal ();
        animal.name = "大黄";
//        animal.legs = 3;  //legs为private时就会报错
        animal.age = 4;
        animal.show ();
        System.out.println (animal.getName ());
    }

}

class Animal {
    private int legs;   //  动物腿的个数
    String name;
    int age;


    public void eat () {
        System.out.println ("动物进食");
    }

    public void show () {
        System.out.println ("name=" + name + ",age=" + age + ",legs" + legs);

    }

    public void setLegs (int i) {
        if (i >= 0 && 1 % 2 == 0) {
            legs = 1;
        } else {
            legs = 0;
        }
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public int getAge () {
        return age;
    }

    public void setAge (int age) {
        this.age = age;
    }

    public int getLegs () {
        return legs;
    }

//    public void setLegs (int legs) {
//        this.legs = legs;
//    }
}