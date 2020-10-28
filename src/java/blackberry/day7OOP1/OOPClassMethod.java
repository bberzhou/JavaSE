package blackberry.day7OOP1;

/**
 * @Description: Method
 * @author: bberzhou@gmail.com
 * @date: 4/7/20 23:49
 * Create By IntelliJ IDEA
 */
public class OOPClassMethod {
    /*
        类中的方法声明和使用
            方法：描述类应该具有的功能，例如Math类（sqrt（）），Arrays类（sort()），Scanner类

            方法的声明：
                权限修饰符 返回值类型 方法名（形参列表）{
                    方法体
                }

                1）权限修饰符：private、public、缺省、protected,默认使用public
                2）返回值类型：
                    a:有返回值，则必须在方法声明时，指定返回值类型，同时，方法中需要使用return返回相应类型的变量和常量
                    b:无返回值，方法声明时使用void来表示，同时不需要return,也可以在方法中添加一个return来结束方法
                3）是否需要返回值
                    根据题目的要求和实际情况来判断

                4）形参列表：方法可以声明0个或者多个
                5）return关键字的使用：
                    1。使用范围：使用在方法体中
                    2。作用：结束当前方法，针对于有返回值类型的方法，使用"return 数据"方法返回需要的数据
                    3。使用return之后后面就不能声明执行语句
                    可以在方法中调用方法和属性，但是不能在方法中定义方法

     */


}

class Customer {
    String name;
    int age;
    boolean isMale;

    //  定义几个方法，void无返回值
    public void eat () {
        System.out.println ("客户吃饭");

    }

    public void sleep (int hour) {
        System.out.println ("休息了" + hour + "个小时");
    }

    public String getName () {
        return name;
    }

    public String getNation (String nation) {
        String info = "我的国籍是" + nation;
        return info;
    }
}