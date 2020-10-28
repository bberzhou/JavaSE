package blackberry.day7OOP1.Exc;

/**
 * @Description: Test
 * @author: bberzhou@gmail.com
 * @date: 4/8/20 10:08
 * Create By IntelliJ IDEA
 */
public class Test {
    public static void main (String[] args) {
         /*
        创建一个Person类的对象，设置该对象的name、age、和sex的属性，
        调用study（）方法，输出字符串"studying"，
        调用showAge（）方法显示age的值，
        调用addAge（）方法给对象的age属性值增加2岁
        在Test类中进行测试
     */
        Person person1 = new Person ();
        person1.name = "Tom";
        person1.age = 20;
        person1.sex = 2;
        person1.study ();   // studyinf
        person1.showAge (); // age 20
        System.out.println (person1.addAge (2)); //22，修改对象中的属性
        person1.showAge (); //age:22,此时堆中的age也变成22了
        //********************
        Person person2 = new Person ();
        person2.showAge (); // 0


    }
}
