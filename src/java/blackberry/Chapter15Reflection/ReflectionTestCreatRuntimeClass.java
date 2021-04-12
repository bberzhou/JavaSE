package blackberry.Chapter15Reflection;

import org.junit.Test;

import java.util.Random;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 4/10/21 10:32
 * Create By IntelliJ IDEA
 */
public class ReflectionTestCreatRuntimeClass {
    /*
        创建运行时类的对象：
            通过反射的方式来创建
     */

    @Test
    public void testNewInstance() throws IllegalAccessException, InstantiationException {
        Class<Person> personClass = Person.class;
        //  newInstance():调用此方法，创建对应的运行时类的对象,这里调用的是运行时类的空参构造器
        //  InstantiationException，这个异常就是来处理没有没有空参构造器的.
        //  要想此方法正常的创建此运行时类的对象，要求：
        //  1、运行时类必须提供空参的构造器
        //  2、空参的构造器的访问权限必须得够，通常，设置为public的

        /*
            通常在JavaBean中要求提供一个public的空参构造器，
            原因是：
                1、便于通过反射，创建运行时类的对对象
                2、便于子类继承此类的运行时类，默认调用super()时，保证父类有此构造器

            使用空参构造器这样方便不同的运行时类对象的创建，创建之后再去设置属性即可

         */
        Person person = personClass.newInstance ();
        System.out.println (person);
        //  造了一个Person类的对象，Person{name='null', age=0}
    }



    //  体会反射的动态性，只有在运行的时候才会真正知道造的是那个类的对象
    @Test
    public void testDynamic() throws IllegalAccessException, ClassNotFoundException, InstantiationException {
        int num  = new Random ().nextInt (3);   //  返回3以内的整数 0,1,2
        String classPath = "";
        switch (num){
            case 0:
                classPath = "java.util.Date";
                break;
            case 2:
                classPath = "blackberry.Chapter15Reflection.Person";
                break;
            case 3:
                classPath = "java.sql.Date";
        }
        Object instance = getInstance (classPath);
        System.out.println (instance);
    }
    /*
        创建一个指定路径下类的对象：
            ClassPath:指定类的全类名

     */
    public Object getInstance(String classPath) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        Class<?> aClass = Class.forName (classPath);
        return aClass.newInstance ();
    }
}
