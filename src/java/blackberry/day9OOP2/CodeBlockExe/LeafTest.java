package blackberry.day9OOP2.CodeBlockExe;

/**
 * @Description: leaf测试
 * @author: bberzhou@gmail.com
 * @date: 4/25/20 11:04
 * Create By IntelliJ IDEA
 */
public class LeafTest {
    public static void main (String[] args) {
        //  总结：由父到子，静态先行
        new Leaf ();
        System.out.println ();
        new Leaf ();
        /*
            创建leaf对象时，首先是Leaf类的构造器，而Leaf类的构造器又调用了super()，
            此时会继续到Mid类的带参数构造器，mid类的带参构造器中又含有this，
            所以会继续执行mid的空参构造器，而空参构造器中又调用super，即调用Root的空参构造器
            因为ROOT类没有继承，所以会直接调用Object类的构造器，初始化 Object类的属性和方法
            然后继续加载ROOT类的static代码块---->Mid类的static代码块----->Leaf类的static代码块

            类中的代码块（不论是静态还是非静态）先于构造器执行


                执行过程：
                ROOT的静态初始代码块
                MID的静态初始化代码块
                Leaf的静态初始代码块
                ROOT的非静态初始代码块
                ROOT的无参构造器
                MID的非静态初始代码块
                MID的无参构造器
                Mid的带参数的构造器，参数值为leaf调用父类的带参构造器
                leaf的非静态初始代码块
                Leaf的空参构造器

                创建第二个leaf类时，就不会执行静态代码块了
                ROOT的非静态初始代码块
                ROOT的无参构造器
                MID的非静态初始代码块
                MID的无参构造器
                Mid的带参数的构造器，参数值为leaf调用父类的带参构造器
                leaf的非静态初始代码块
                Leaf的空参构造器

            */
    }
}
