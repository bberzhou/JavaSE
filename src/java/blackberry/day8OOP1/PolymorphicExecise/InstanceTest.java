package blackberry.day8OOP1.PolymorphicExecise;

/**
 * @Description: instanceTest类
 * @author: bberzhou@gmail.com
 * @date: 4/17/20 23:27
 * Create By IntelliJ IDEA
 */
public class InstanceTest {
    /*
        建立InstanceTest类，在类中定义方法method(Person e);
        在method中；
        （1）根据e 的类型调用相应的getInfo（）方法
        （2）根据e 的类型执行：
            如果e 为Person类的对象，输出："a person ";
            如果e 为Student类的对象，输出："a student"   "a person"
            如果e 为Graduate类的对象，输出："a student"   "a person"   "a graduate"
     */
    public static void main (String[] args) {
        InstanceTest instanceTest = new InstanceTest ();
        Person p1 = new Person ();
        Student s1 = new Student ();
        Graduate g1 = new Graduate ();
        instanceTest.method (p1);
        instanceTest.method (s1);
        instanceTest.method (g1);

    }

    public void method (Person e) {
        //  不同的对象调用时候，直接调用info方法   虚拟方法调用,这里就可以体现多态性
        String info = e.getInfo ();
        System.out.println (info);
        //  方式一：
//        if (e instanceof Graduate) {
//            System.out.println ("a graduate student");
//            System.out.println ("a student");
//            System.out.println ("a person");
//        } else if (e instanceof Student) {
//            System.out.println ("a student");
//            System.out.println ("a person");
//
//        } else {
//            System.out.println ("a person");
//        }
        //  方式二：从子类父类考虑
        if (e instanceof Graduate) {
            System.out.println ("a graduate student");
        }
        if (e instanceof Student) {
            System.out.println ("a student");
        }
        if (e instanceof Person) {
            System.out.println ("a person");
        }

    }
}
