package blackberry.day9OOP2.CodeBlockExe;

/**
 * @Description: 叶子类
 * @author: bberzhou@gmail.com
 * @date: 4/25/20 11:02
 * Create By IntelliJ IDEA
 */
public class Leaf extends Mid {
    static {
        System.out.println ("Leaf的静态初始代码块");
    }

    {
        System.out.println ("leaf的非静态初始代码块");
    }

    public Leaf () {
        //  通过super调用父类的带参数的构造器
        super ("leaf调用父类的带参构造器");
        System.out.println ("Leaf的空参构造器");
    }
}
