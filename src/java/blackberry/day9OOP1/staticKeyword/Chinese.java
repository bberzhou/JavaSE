package blackberry.day9OOP1.staticKeyword;

/**
 * @Description: 中国人
 * @author: bberzhou@gmail.com
 * @date: 4/22/20 23:41
 * Create By IntelliJ IDEA
 */
public class Chinese {
    String name;
    int age;
    //  定义一个static修饰的属性
    static String nation;

    public void eat () {
        System.out.println ("吃饭");
        //  在非静态方法里面调用非静态方法
        info ();    //  相当于this.info()

        //  在非静态方法里面调用静态方法
        show ();
        //  此时不是使用的this调用的，还是使用的Chinese.nation，即类调用的
        System.out.println ("nation:" + nation);

    }

    public static void show () {
        System.out.println ("static方法");

//        eat();    在static方法里面不能调用非静态的方法，因为此时都还没有加载非静态的方法
//        name = "tom"; 在static方法里面不能调用非静态的属性
        //   但是可以在静态方法里面调用静态的属性，相当于是Class.Attr  Chinese.nation
        System.out.println (nation);
        walk ();    //  调用类的静态方法
    }

    public static void walk () {
        System.out.println ("调用静态方法");
    }

    public void info () {
        System.out.println ("非静态");
    }
}
