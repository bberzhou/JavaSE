package blackberry.Chapter15Reflection.ReflectionStrucTest;

import blackberry.Chapter15Reflection.ReflectionStruc.Pop;
import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 4/12/21 21:25
 * Create By IntelliJ IDEA
 */
public class ParentTest {
    /*
        获取运行时类的父类的测试
     */
    @Test
    public void test(){
        Class<Pop> popClass = Pop.class;
        Class<? super Pop> superclass = popClass.getSuperclass ();
        //  class blackberry.Chapter15Reflection.ReflectionStruc.Creature
        System.out.println (superclass);

    }

    //  获取运行时类的带泛型的父类
    @Test
    public void test1(){
        Class<Pop> popClass = Pop.class;
        //  返回带泛型的父类
        Type genericSuperclass = popClass.getGenericSuperclass ();
        System.out.println (genericSuperclass);
        //  blackberry.Chapter15Reflection.ReflectionStruc.Creature<java.lang.String>
    }
    //  获取运行时类的带泛型的父类的泛型
    //  逻辑性代码  VS  功能性代码
    @Test
    public void test3(){
        Class<Pop> popClass = Pop.class;
        Type genericSuperclass = popClass.getGenericSuperclass ();
        ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
        //  获取泛型类型
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments ();
        for (Type t: actualTypeArguments){
//            System.out.println (t.getTypeName ());
            //  获取到泛型的类型，java.lang.String
            //  或者采用强转的方式
            System.out.println (((Class) actualTypeArguments[0]).getTypeName ());

        }
    }


    /*
        获取运行时类实现的接口
     */
    @Test
    public void test4(){
        Class<Pop> popClass = Pop.class;
        Class<?>[] interfaces = popClass.getInterfaces ();
        for (Object o: interfaces){
            System.out.println (o);
            //  interface java.lang.Comparable
            //interface blackberry.Chapter15Reflection.ReflectionStruc.myInterface
        }

        System.out.println ("---------");
        System.out.println ();

        //  获取运行时类的父类实现的接口
        Class<? super Pop> superclass = popClass.getSuperclass ();
        Class<?>[] interfaces1 = superclass.getInterfaces ();
        for (Object o :interfaces1){
            System.out.println (o);
            //  Pop父类实现的接口：
            //  interface java.io.Serializable
        }
        System.out.println ("");
        System.out.println ();

        /*
            获取当前运行时类所在的包
         */
        Package aPackage = popClass.getPackage ();
        System.out.println (aPackage);
        //  package blackberry.Chapter15Reflection.ReflectionStruc
    }

    /*
       获取运行是类的注解
     */
    @Test
    public void test5(){
        Class<Pop> popClass = Pop.class;
        Annotation[] annotations = popClass.getAnnotations ();
        for (Annotation annotation: annotations){
            System.out.println (annotation);
            //  @blackberry.Chapter15Reflection.ReflectionStruc.myAnnotation(value=hi)
        }
    }
}
