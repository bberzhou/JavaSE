package blackberry.day9OOP1.MainMethodTest;

/**
 * @Description: main方法，控制台交互
 * @author: bberzhou@gmail.com
 * @date: 4/24/20 11:05
 * Create By IntelliJ IDEA
 */
public class MainDemo {
    public static void main (String[] args) {
        for (int i = 0 ; i < args.length ; i++) {
            System.out.println ("*******" + args[i]);
            int num = Integer.parseInt (args[i]);
            System.out.println ("Configuration配置里面的参数" + num);
        }

    }
    /*
        小结：
        public static void main(String[] args){//方法体}
        public：权限修饰符：private public protected 省略---->封装性
        static：修饰符：static、final、abstract、native  可以用来修饰方法
        返回值类型：void 无返回值  有返回值  return
        方法名：需要满足标识符的规则、规范："见名知意"
        形参列表：重载和重写  ；参数的值传递机制： 基本数据类型--->数据值   引用数据类型--->地址值
        传参数时体现了多态性，一般都是传入参数类型的子类  Person p = new Man(); p.eat()
        方法体：用于体现当前方法的功能


     */
}
