package blackberry.day7OOP1;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 4/7/20 23:28
 * Create By IntelliJ IDEA
 */
public class OOPClassFiled {
    /*
        类中属性的使用：
            属性和局部变量的区别
            1。相同点：
                1）定义变量的格式一样：数据类型 变量名 = 变量值
                2）变量都是先声明后使用
                3）变量都有其对应的作用域

            2。不同点：
                1）在类中声明的位置不同
                    属性直接定义在{}内
                    局部变量声明在方法内，方法形参，代码块内，构造器形参，构造器内部的变量
                2）关于权限修饰符的不同
                    属性：可以在声明属性的时候，指明其权限，使用权限修饰符
                    常用的权限修饰符：private,public,protected,省略（default)
                3）默认初始化值的情况：
                    属性：类的属性，根据其类型，都有默认初始化值
                            整形（byte,short,int,long）：0
                            浮点型（float，double）：0.0
                            字符型(char)：0或者'\u0000'
                            布尔型（boolean）：false
                            引用数据类型（类、数组、接口）：null
                    局部变量：没有初始化值，在调用局部变量之前，一定要显式的赋值
                            特别的：形参在调用的时候再赋值即可


                  4）在内存中加载的位置不同
                     属性：加载到堆空间中
                     局部变量：加载到栈空间中
     */
    public static void main (String[] args) {
        User user1 = new User ();
        System.out.println (user1.age);  // 0
        System.out.println (user1.isMale);  // false
        System.out.println (user1.name);     // null
    }


}

class User {
    //  属性或者成员变量
    String name;
    public int age;
    boolean isMale;

    public void talk (String language) {//   方法形参的局部变量
        System.out.println ("我们使用" + language + "进行交流");
    }

    public void eat () {
        String food = "饼干"; //  方法内部的局部变量
        System.out.println ("南方人喜欢吃" + food);
    }
}
