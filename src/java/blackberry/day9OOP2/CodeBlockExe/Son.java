package blackberry.day9OOP2.CodeBlockExe;

/**
 * @Description: 儿子类
 * @author: bberzhou@gmail.com
 * @date: 4/25/20 11:19
 * Create By IntelliJ IDEA
 */
public class Son extends Father {
    static {
        System.out.println ("儿子类的静态代码块");
    }

    {
        System.out.println ("儿子类中的非静态代码块");
    }

    public Son () {
        System.out.println ("子类的空参构造器");
    }

    public static void main (String[] args) {
        System.out.println ("son类中的main方法");
        System.out.println ("****************");
        new Son ();
        /*

            这里main()方法也是静态方法并且执行时也要先加载类，加载类就需要先执行类的静态代码块
            执行结果：
                父亲类中的静态代码块
                儿子类的静态代码块
                son类中的main方法
                ****************
                父亲类中的非静态代码块
                父类的空参构造器
                儿子类中的非静态代码块
                子类的空参构造器
         */
    }
}
