package blackberry.day9OOP2.CodeBlockExe;

/**
 * @Description: 父亲类
 * @author: bberzhou@gmail.com
 * @date: 4/25/20 11:18
 * Create By IntelliJ IDEA
 */
public class Father {
    static {
        System.out.println ("父亲类中的静态代码块");
    }

    {
        System.out.println ("父亲类中的非静态代码块");
    }

    public Father () {
        System.out.println ("父类的空参构造器");
    }

}
