package blackberry.Chapter15Reflection.ReflectionStrucTest;

import blackberry.Chapter15Reflection.ReflectionStruc.Pop;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 4/12/21 22:25
 * Create By IntelliJ IDEA
 */
public class StrucTest {
    /*
        调用运行时类中的指定的结构：属性、方法、构造器
     */

    //  不要去掌握
    @Test
    public void test1() throws NoSuchFieldException, IllegalAccessException, InstantiationException {

        Class<Pop> popClass = Pop.class;
        //  创建运行时类的对象
        Pop pop = popClass.newInstance ();
        //  获取指定的属性，这里可能没有相关的属性，所以就可以报错，需要抛出异常。
        //  要求运行时类中属性声明为public的，通常不采用此方法
        Field id = popClass.getField ("id");

        //  设置当前属性的值,set()方法，参数1：指明设置哪个对象的属性，参数2：将此属性值设置为多少
        id.set (pop,1001);

        //  获取当前属性的值，get()：参数1，获取哪个对象的当前属性值
        Object o = id.get (pop);
        System.out.println (o);


    }
    /*
        操作运行时类的指定的属性的正确方法
     */
    @Test
    public void test2() throws IllegalAccessException, InstantiationException, NoSuchFieldException {
        Class<Pop> popClass = Pop.class;
        //  创建运行时类的对象
        Pop pop = popClass.newInstance ();
        // 1、 getDeclaredField()：获取运行时类中指定变量名的属性（公私有都可以），开发中常用的方法
        Field name = popClass.getDeclaredField ("name");
        //  因为name属性是private的，需要设置可访问性为true
        //  2、设置可访问性为true,保证当前属性是可访问的
        name.setAccessible (true);
        // 3、给指定对象的属性赋值
        name.set (pop,"Tom");
        Object o = name.get (pop);
        System.out.println (o);
        //  如果没有赋值，String类型默认是null
        //  Tom
    }

    /*
        如何操作运行时类中的指定的方法-----需要掌握
     */
    @Test
    public void test5() throws NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Class<Pop> popClass = Pop.class;

        // 1、 创建运行时类的对象
        Pop pop = popClass.newInstance ();

        /*
            2、获取指定的某个方法
              getDeclaredMethod()：参数1：指明获取方法的名称；参数2：指明获取的方法的形参列表
                String.class，表示形参时String类型的
         */
        Method show = popClass.getDeclaredMethod ("show", String.class);

        //  3、设置Accessible
        show.setAccessible (true);

        /*
                4、调用方法,方法名.invoke(参数1，指明对象即方法的调用者；参数2，给形参赋值的形参)
                invoke()方法是有返回值的，返回值即为对应类中调用的方法的返回值,并且默认为一个Object类型的
         */
        Object o = show.invoke (pop, "我是反射调用");
        System.out.println (o); //  我是反射调用
        System.out.println ("***************如何调用静态的方法*************");

        //  按照名字获取方法名
        Method showDesc = popClass.getDeclaredMethod ("showDesc");
        //  设置Accessible
        showDesc.setAccessible (true);
        //  注意调用静态的方法，传入的参数,    类型是： Pop.class
        Object invoke = showDesc.invoke (Pop.class);
        // 返回值,这里静态放啊没有返回值，默认就是Null
        System.out.println (invoke);


    }


}
