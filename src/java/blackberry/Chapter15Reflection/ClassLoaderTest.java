package blackberry.Chapter15Reflection;

import org.junit.Test;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 4/9/21 16:35
 * Create By IntelliJ IDEA
 */
public class ClassLoaderTest {
    /*
        了解类的加载器：

     */
    @Test
    public void test1(){
        //  获取当前自定义类的加载器，
        //  对于自定义类可以使用系统类加载器进行加载
        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader ();
        System.out.println (classLoader);
        //  sun.misc.Launcher$AppClassLoader@4e25154f，这就是系统类加载器

        //  调用系统类加载的getParent()：获取扩展类加载器
        ClassLoader parent = classLoader.getParent ();
        System.out.println (parent);
        //  sun.misc.Launcher$ExtClassLoader@2957fcb0，扩展类加载器

        //  调用扩展类加载器的getParent()：无法获取到引导类加载器
        //  引导类加载器主要负责加载Java的核心类库，无法加载自定义的。
        ClassLoader parent1 = parent.getParent ();
        System.out.println (parent1);   //  null

        ClassLoader classLoader1 = String.class.getClassLoader ();
        System.out.println (classLoader1);
        //  这里输出的String类型的类加载器为null，
    }
}
