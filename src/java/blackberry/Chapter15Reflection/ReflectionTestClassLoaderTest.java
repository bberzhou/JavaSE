package blackberry.Chapter15Reflection;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 4/9/21 16:35
 * Create By IntelliJ IDEA
 */
public class ReflectionTestClassLoaderTest {
    /*
        了解类的加载器：
            JVM规范了如下类型的类加载器：
                引导类加载器：用C++编写的，是JVM自带的类加载器，负责Java平台核心库，用来装在核心类库。该记载器无法直接获取
                扩展类加载器：负责jre/lib/ext目录下的jar包或者指定目录下的jar包装入工作库
                系统类加载器：负责java-classPath或指定的目录下的类与jar包装，是最常用的类加载器

     */
    @Test
    public void test1(){
        //  获取当前自定义类的加载器，
        //  对于自定义类可以使用系统类加载器进行加载
        ClassLoader classLoader = ReflectionTestClassLoaderTest.class.getClassLoader ();
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

    /*
        Properties:用来读取配置文件

     */
    //  读取properties配置文件的方式一：使用properties类加载
    @Test
    public void testProperties() throws IOException {
        //  创建一个Properties的实例
        Properties properties = new Properties ();
        //  此时的文件默认在当前的module下
//        FileInputStream fis = new FileInputStream ("JDBC.properties");
        
        //  加载Src下面的
        FileInputStream fis = new FileInputStream ("src/jdbc1.properties");


        //  加载文件
        properties.load (fis);
        //  读取相关的属性
        String name = properties.getProperty ("name");
        String password = properties.getProperty ("password");
        System.out.println ("name="+name+","+"password="+password);
    }


    //  读取properties配置文件的方式二：使用ClassLoader拉加载
    //  使用ClassLoader来加载配置文件
    @Test
    public void testGetPropertiesClassLoader() throws IOException {
        Properties properties = new Properties ();
        //  获取当前类的类加载器
        ClassLoader classLoader = ReflectionTestClassLoaderTest.class.getClassLoader ();
        //  加载配置文件，返回一个输入流
        
        //  直接加载module下面的配置文件会报错
//        InputStream resourceAsStream = classLoader.getResourceAsStream ("JDBC.properties");
        
        //  读入配置文件的方式二：使用ClassLoader
        //  配置文件默认识别为当前的module下的Src文件夹下面
        InputStream resourceAsStream = classLoader.getResourceAsStream ("jdbc1.properties");
        

        //  加载文件
        properties.load (resourceAsStream);
        String name = properties.getProperty ("name");
        String password = properties.getProperty ("password");
        System.out.println ("name:"+name+",   "+"password:"+password);

    }
}
