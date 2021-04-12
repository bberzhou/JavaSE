package blackberry.Chapter15Reflection.ReflectionStrucTest;

import blackberry.Chapter15Reflection.ReflectionStruc.Pop;
import org.junit.Test;

import java.lang.reflect.Constructor;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 4/12/21 21:17
 * Create By IntelliJ IDEA
 */
public class OtherTest {
    /*
        获取运行时类的构造器信息
     */
    @Test
    public void test(){
        Class<Pop> popClass = Pop.class;
        //  getConstructors(),获取当前运行时类中声明为public的构造器
        Constructor<?>[] constructors = popClass.getConstructors ();
        for (Object c : constructors){
            System.out.println (c);
        }
        //获取的两个构造方法
        //public blackberry.Chapter15Reflection.ReflectionStruc.Pop()
        //public blackberry.Chapter15Reflection.ReflectionStruc.Pop(java.lang.String)


        System.out.println ();

        //  使用getDeclaredConstructors ()方法获取当前运行时类的所有的构造器
        Constructor<?>[] declaredConstructors = popClass.getDeclaredConstructors ();
        for (Object o :declaredConstructors){
            System.out.println (o);
        }
        // public blackberry.Chapter15Reflection.ReflectionStruc.Pop()
        //blackberry.Chapter15Reflection.ReflectionStruc.Pop(java.lang.String,int)
        //public blackberry.Chapter15Reflection.ReflectionStruc.Pop(java.lang.String)
    }
}
