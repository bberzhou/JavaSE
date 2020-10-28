package blackberry.day7OOP2;

/**
 * @Description: Method overloading
 * @author: bberzhou@gmail.com
 * @date: 4/9/20 16:52
 * Create By IntelliJ IDEA
 */
public class MethodOverloading {
    /*
        方法重载：
            定义：在同一个类中，允许存在一个以上的同名方法，只要他们的参数个数或者参数类型不同即可
            特点：重载与返回值的类型无关，只看参数列表，且参数列表必须不同。
                参数的个数或者参数的类型都是在调用的时候，根据方法参数列表的不同来进行区别的
                两同一不同：同一个类，同一个方法名；参数列表不同，
                例如 Arrays类中sort()、fill()等方法，同名方法
                int add(int X,int Y){return X+Y}  返回两个整数的和
                int add(intX,int Y,int Z){return X+Y+Z} 返回三个整数的和


         在通过对象调用方法时，如何确定某一个指定的方法
            方法名------->参数列表

            方法重写和重载的区别
            String StringBuffer StringBuilder
     */

    //  下面这几个方法都是重载，相同的方法名，在同一个类中
    //  判断是否是重载，跟方法的权限修饰符，返回值类型，方法体，形参变量名都没有关系


    public void getSum (int i, int j) {
        System.out.println (i + j);

    }

    public void getSum (double i, double j) {
        System.out.println (i * j);
    }

    public void getSum (int i, String s) {

    }
}
