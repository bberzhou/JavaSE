package blackberry.Chapter15Reflection;

import org.junit.Test;

import java.lang.annotation.ElementType;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 4/8/21 15:54
 * Create By IntelliJ IDEA
 */
public class ReflectionTest {
    /*
        反射测试：

        疑问？
            1、通过直接new的方式或者反射的方式都可以调用公共的结构，开发中到底用哪个？
                答：建议直接new的方式
                    什么时候会使用反射的方法，当在程序编译期间不能确定，需要在运行的时候才能决定是哪个类的对象的时候
                    反射的特征：动态性
            2、反射机制与面向对象中的封装行是不是矛盾？如果看待这两个技术？
                不矛盾。

            3、关于Java.lang.Class类的理解
                （1）类的加载过程：
                    程序经过javac.exe命令之后，会生成一个或者多个字节码文件（.class结尾），
                    接着使用java.exe命令对某个字节码文件进行解释运行，相当于将某个字节码文件加载到内存中。此过程就称为累的加载
                    加载到内存中的类，我们就称为运行时类，此运行时类，就作为一个Class的实例。类本身也是一个对象Person类也是Class的对象
                （2）换句话说：Class的实例就对应着一个运行时类

                 （3）加载到内存中的运行时类，会缓存一定的时间，在此时间之内，我们可以通过不同的方式来获取此运行时类
                      a、 .getClass()
                      b、 Class.forName("Path")：使用的更多
                      c、 类名.Class
                      d、使用类加载器ClassLoader

              4、哪些类型可以有Class对象？
                （1）Class:外部类，成员（成员内部类，静态内部类），局部内部类，匿名内部类
                （2）interface：接口
                （3）[]：数组
                （4）enum:枚举
                （5）annotation：注解 @interface
                （6）primitive type：基本数据类型
                （7）void

            5、由于JVM为每个加载的class创建了对应的Class实例，并在实例中保存了该class的所有信息，
                包括类名、包名、父类、实现的接口、所有方法、字段等，因此，如果获取了某个Class实例，
                我们就可以通过这个Class实例获取到该实例对应的class的所有信息。
                这种通过Class实例获取class信息的方法称为反射（Reflection）。
            6、通常情况下，我们应该用instanceof判断数据类型，因为面向抽象编程的时候，我们不关心具体的子类型。
                只有在需要精确判断一个类型是不是某个class的时候，我们才使用==判断class实例。

            7、JVM在执行Java程序的时候，并不是一次性把所有用到的class全部加载到内存，而是第一次需要用到class时才加载


            8、通过Class实例获取字段信息。Class类提供了以下几个方法来获取字段：
                Field getField(name)：根据字段名获取某个public的field（包括父类）
                Field getDeclaredField(name)：根据字段名获取当前类的某个field（不包括父类）
                Field[] getFields()：获取所有public的field（包括父类）
                Field[] getDeclaredFields()：获取当前类的所有field（不包括父类）

            9、可以通过Class实例获取所有Method信息。Class类提供了以下几个方法来获取Method
                Method getMethod(name, Class...)：获取某个public的Method（包括父类）
                Method getDeclaredMethod(name, Class...)：获取当前类的某个Method（不包括父类）
                Method[] getMethods()：获取所有public的Method（包括父类）
                Method[] getDeclaredMethods()：获取当前类的所有Method（不包括父类）

                    一个Method对象包含一个方法的所有信息：
                    getName()：返回方法名称，例如："getScore"；
                    getReturnType()：返回方法返回值类型，也是一个Class实例，例如：String.class；
                    getParameterTypes()：返回方法的参数类型，是一个Class数组，例如：{String.class, int.class}；
                    getModifiers()：返回方法的修饰符，它是一个int，不同的bit表示不同的含义。

     */


    //  在使用反射之前，对于Person的操作
    @Test
    public void testPersonReflection(){
        //  1、创建Person类的对象
        Person p1 = new Person ("Tome",23);

        //  2、通过对象、调用其内部的属性、方法
        p1.age = 20;
        System.out.println (p1.toString ());
        p1.show ();

        //  但是在Person类的外部不能通过Person类的对象调用其内部的私有结构
        //  比如Person类里面的私有属性name，showNation()方法、和私有的构造器


    }


    //  使用反射之后，对于Person的操作
    @Test
    public void testPersonReflection1() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Class clazz = Person.class;
        //  1、通过反射，创建一个Person类的对象，并且这个构造器的参数有两个一个是String,一个是int
        Constructor constructor = clazz.getConstructor (String.class, int.class);
        Object obj = constructor.newInstance ("Tome", 13);
//        Person p = (Person) obj;
        System.out.println (obj);
        //  Person{name='Tome', age=13}

        //  2、通过反射，调用对象指定的属性和方法
        //  调用属性
        Field age = clazz.getDeclaredField ("age");
        age.set (obj,90);
        System.out.println (obj);
        //  Person{name='Tome', age=90}

        //  调用方法,'getDeclaredMethod(String, Class<?>...)'，前面是方法名，后面是可变的形参
        Method show = clazz.getDeclaredMethod ("show");
        show.invoke (obj);
        System.out.println ();



        //  通过反射：可以调用Person类的私有结构的。比如：私有的构造器、方法、属性

        //  调用Person的私有的构造器，这里的String.class表明构造器的参数是String类型的
        Constructor declaredConstructor = clazz.getDeclaredConstructor (String.class);
        declaredConstructor.setAccessible (true);
        Object jerry = declaredConstructor.newInstance ("Jerry");
        Person p2 = (Person) jerry;
        System.out.println (p2);
        //  Person{name='Jerry', age=0}


        //  调用私有的属性
        Field name = clazz.getDeclaredField ("name");
        name.setAccessible (true);
        name.set (p2,"hanmeimei");
        System.out.println (p2);
//        Person{name='hanmeimei', age=0}



        //  调用私有的方法
        Method showNation = clazz.getDeclaredMethod ("showNation", String.class);
        showNation.setAccessible (true);
        Object nation = showNation.invoke (p2,"中国");
        //  我的国籍是：中国
        //  调用私有的方法也会有返回值,
        System.out.println (nation);
        //  showNation.invoke的方法的返回值跟showNation()方法的一致：中国

    }

    /*
         如何获取Class的实例，即相当于获取类对象的实例
         获取Class实例的方式，前三种需要掌握

     */
    @Test
    public void testClassInstance() throws ClassNotFoundException {
        //  方式一:运行时类的属性：.class 属性
        Class<Person> clazz1 =Person.class;
        System.out.println (clazz1);
        //  class blackberry.Chapter15Reflection.Person，这里输出的就是当前Person类本身


        //  方式二：通过运行时类的对象来获取,调用getClass()方法
        Person person = new Person ();
        Class<? extends Person> clazz2 = person.getClass ();
        System.out.println (clazz2);

        //  方式三：调用Class的静态方法：forName(String path)：全类名

        Class<?> clazz3 = Class.forName ("blackberry.Chapter15Reflection.Person");
        System.out.println (clazz3);
        //  class blackberry.Chapter15Reflection.Person

        //  ==  比较地址
        System.out.println (clazz1 == clazz2);       //  true
        System.out.println (clazz1 ==clazz3);       //  true

        //  结论：尽管获取的方式不一样，但是指向的地址是一样的


        //  方式四：使用类的加载器：ClassLoader，
        //  先获取当前类的类加载器
        ClassLoader classLoader = ReflectionTest.class.getClassLoader ();
        //  有了类加载器之后，然后显示的加载某个类,加载完成之后会返回一个类
        Class<?> clazz4 = classLoader.loadClass ("blackberry.Chapter15Reflection.Person");
        System.out.println (clazz4);
        //  class blackberry.Chapter15Reflection.Person
        System.out.println (clazz1 == clazz4);
        //  true

    }

    //  Class实例可以是哪些结构的说明：
    @Test
    public void testClassInstance2(){
        //  Class
        Class<Object> objectClass = Object.class;
        //  接口
        Class<Comparable> comparableClass = Comparable.class;
        //  基本数据类型数组
        Class<String[]> aClass = String[].class;
        Class<int[]> aClass1 = int[].class;
        //  枚举类
        Class<ElementType> elementTypeClass = ElementType.class;
        //  注解
        Class<Override> overrideClass = Override.class;
        //  基本数据类型
        Class<Integer> integerClass = int.class;
        System.out.println (integerClass);  //  int
        int[] a = new int[100];
        int[] b = new int[100];
        Class<? extends int[]> aClass2 = a.getClass ();
        Class<? extends int[]> aClass3 = b.getClass ();
        //  只要数组的元素类型与维度一样，就是同一个Class
        //  用instanceof不但匹配指定类型，还匹配指定类型的子类。
        //  而用==判断class实例可以精确地判断数据类型，但不能作子类型比较。
        System.out.println (aClass2 == aClass3);    //  true

    }
    //  测试Class实例
    @Test
    public void test() throws IllegalAccessException, InstantiationException {
        Class<String> stringClass = String.class;
        String s = stringClass.newInstance ();
        //  上述代码相当于new String()。通过Class.newInstance()可以创建类实例，
        //  它的局限是：只能调用public的无参数构造方法。
        //  带参数的构造方法，或者非public的构造方法都无法通过Class.newInstance()被调用。
        //  如果需要调用带参的构造器就需要先执行 clazz.getConstructor

    }
}
