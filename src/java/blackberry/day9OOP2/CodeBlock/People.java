package blackberry.day9OOP2.CodeBlock;

import blackberry.day8OOP1.instanceofKeyword.Person;

/**
 * @Description: people类
 * @author: bberzhou@gmail.com
 * @date: 4/24/20 11:23
 * Create By IntelliJ IDEA
 */
public class People {
    String name;
    int age;
    //  关于人的描述
    static String describe = "I am a people";

    //  构造器
    public People () {

    }

    public People (String name, int age) {
        this.name = name;
        this.age = age;
    }

    //  静态代码块,就是一个 static{ }
    static {
        System.out.println ("hello,static code block-1");
        //  在静态代码块中，对静态属性进行赋值操作
        describe = " 我是静态代码块中的人";
        //  在静态代码块中不可以调非静态的方法
//        eat();
    }

    //  静态代码块2
    static {
        System.out.println ("hello,static code block-2");
    }

    //  非静态代码块
    {
        System.out.println ("hello,非静态代码块");
        //  在非静态代码块中，对类的属性进行赋值，
        age = 1;
        //  非静态代码块中，调用静态方法或属性
        eat ();
        describe = "在非静态代码块中调用静态属性";
    }


    //  自定义方法
    public void eat () {
        System.out.println ("人吃饭");
    }

    //  重写toString()方法
    @Override
    public String toString () {
        return "People{" +
            "name='" + name + '\'' +
            ", age=" + age +
            '}';
    }
}
