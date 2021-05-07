package blackberry.Chapter15Reflection;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 5/5/21 11:37 AM
 * Create By IntelliJ IDEA
 */
public class ReflectionReview {
    /*
        反射复习：
        1、写出获取Class实例的三种常见方式
           a.  CLass clazz1 = String.class;这种方式没有体现出动态性
           b. CLass clazz2 = Pop.getClass(); //  自定义类获取的
           c. CLass clazz3 = CLass.forName(String classPath);// 这种能够体现出反射的动态性，在执行时才会确定是哪个类


        2、对Class类的理解
        Class类的对象（实例）对应着加载到内存中的一个运行时类，就可以通过这个对象调用相关运行时类的方法和属性


        3、创建Class对应运行时类的对象的通用方法，代码实现，以及这样操作，需要对应的运行时类构造器方面需要满足的要求
          Object obj = clazz.newInstance();创建了对应的运行时类的对象；
          要求：
                a. 必须要有空参的构造器
                b. 构造器的权限修饰符要够，通常设置为public

        4、关于反射的理解
            反射是动态语言的关键，反射机制允许程序在执行期间借助于Reflection取得任何类的内部信息，
            并能直接操作任意对象的内部属性及方法。
            框架 = 反射 + 注解+ 设计模式

        5、体会反射的动态性


        创建一个指定路径下类的对象：
            ClassPath:指定类的全类名

        根据传入的字符串参数，在运行的时候才创建对应的对象
        public Object getInstance(String classPath) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        Class<?> aClass = Class.forName (classPath);
        return aClass.newInstance ();
        }

        6、反射机制能提供的功能
            a.在运行时判断任意一个对象所属的类
            b.在运行时构造任意一个类的对象
            c.在运行时判断任意一个类所具有的成员变量和方法
            d.在运行时获取泛型信息
            e.在运行时调用任意一个对象的成员变量和方法
            f.在运行时处理注解
            g.生成动态代理。

        7、相关API
            java.lang.Class：代表一个类
            java.lang.reflect.Method：代表类的方法
            java.lang.reflect.Filed：代表类的成员变量
            java.lang.reflect.Constructor:代表类的构造器

        8、创建类的对象的方式
            方式一：new+构造器
            方式二：要创建XXX类的对象，可以考虑本身提供的方法：XXX、XXXs、XXXFactory、XXXBuilder类中进行查看
                    静态方法的存在，可以调用其静态方法，创建XXX对象
            方式三：通过反射来实现

     */
}
