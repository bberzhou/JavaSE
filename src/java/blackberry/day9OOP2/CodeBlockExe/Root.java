package blackberry.day9OOP2.CodeBlockExe;

/**
 * @Description: 根类
 * @author: bberzhou@gmail.com
 * @date: 4/25/20 10:58
 * Create By IntelliJ IDEA
 */
public class Root {
    static {
        System.out.println ("ROOT的静态初始代码块");
    }

    {
        System.out.println ("ROOT的非静态初始代码块");
    }

    //  空参构造器
    public Root () {
        //  此处也省略了一个super()
        System.out.println ("ROOT的无参构造器");
    }
}
