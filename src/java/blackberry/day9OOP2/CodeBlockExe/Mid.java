package blackberry.day9OOP2.CodeBlockExe;

/**
 * @Description: mid类
 * @author: bberzhou@gmail.com
 * @date: 4/25/20 10:59
 * Create By IntelliJ IDEA
 */
public class Mid extends Root {
    static {
        System.out.println ("MID的静态初始化代码块");
    }

    public Mid () {
        //  此处省略了一个super()
        System.out.println ("MID的无参构造器");
    }

    public Mid (String msg) {
        this ();
        System.out.println ("Mid的带参数的构造器，参数值为" + msg);
    }

    {
        System.out.println ("MID的非静态初始代码块");
    }
}
