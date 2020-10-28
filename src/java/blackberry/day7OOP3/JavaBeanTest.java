package blackberry.day7OOP3;

/**
 * @Description: javaBean
 * @author: bberzhou@gmail.com
 * @date: 4/10/20 22:08
 * Create By IntelliJ IDEA
 */
public class JavaBeanTest {
    /*
        JavaBean的概念：
            JavaBean是一种Java语言写成的可重用的组件
                它是符合以下标准的Java类：
                1）类是公共的；
                2）有一个无参数的构造器；
                3）有属性，且有对应的get、set方法

                用户可以使用JavaBean将功能、处理、值、数据库访问和其他人
                和可以用Java代码创造的对象进行打包，

     */

    private int id;
    private String name;

    //  默认构造器的访问权限跟类的权限是一致的，无参构造器有利于反射的方式造对象
    public JavaBeanTest () {

    }

    public int getId () {
        return id;
    }

    public void setId (int id) {
        this.id = id;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }
}
