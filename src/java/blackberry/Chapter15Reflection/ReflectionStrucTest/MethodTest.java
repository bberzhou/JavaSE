package blackberry.Chapter15Reflection.ReflectionStrucTest;

import blackberry.Chapter15Reflection.ReflectionStruc.Pop;
import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 4/12/21 16:56
 * Create By IntelliJ IDEA
 */
public class MethodTest {
    /*
        获取运行时类的方法结构
     */
    @Test
    public void test () {
        Class<Pop> popClass = Pop.class;


        //getMethods()：获取当前运行时类及其所有父类中声明为public权限的方法
        Method[] methods = popClass.getMethods ();
        for (Method method : methods) {
            System.out.println (method);
        }
        //public java.lang.String blackberry.Chapter15Reflection.ReflectionStruc.Pop.display(java.lang.String)
        //public void blackberry.Chapter15Reflection.ReflectionStruc.Pop.info()
        //public int blackberry.Chapter15Reflection.ReflectionStruc.Pop.compareTo(java.lang.Object)
        //public int blackberry.Chapter15Reflection.ReflectionStruc.Pop.compareTo(java.lang.String)
        //public void blackberry.Chapter15Reflection.ReflectionStruc.Creature.est()
        //public final void java.lang.Object.wait(long,int) throws java.lang.InterruptedException
        //public final native void java.lang.Object.wait(long) throws java.lang.InterruptedException
        //public final void java.lang.Object.wait() throws java.lang.InterruptedException
        //public boolean java.lang.Object.equals(java.lang.Object)
        //public java.lang.String java.lang.Object.toString()
        //public native int java.lang.Object.hashCode()
        //public final native java.lang.Class java.lang.Object.getClass()
        //public final native void java.lang.Object.notify()
        //public final native void java.lang.Object.notifyAll()

        System.out.println ();

        //getDeclaredMethods()：获取当前运行时类中声明的所有（可以是public和private）方法。（不包含父类中声明的方法）
        Method[] declaredMethods = popClass.getDeclaredMethods ();
        for (Method method : declaredMethods) {
            System.out.println (method);
        }
        //private java.lang.String blackberry.Chapter15Reflection.ReflectionStruc.Pop.show(java.lang.String)
        //public java.lang.String blackberry.Chapter15Reflection.ReflectionStruc.Pop.display(java.lang.String)
        //public void blackberry.Chapter15Reflection.ReflectionStruc.Pop.info()
        //public int blackberry.Chapter15Reflection.ReflectionStruc.Pop.compareTo(java.lang.Object)
        //public int blackberry.Chapter15Reflection.ReflectionStruc.Pop.compareTo(java.lang.String)
    }

    //  返回方法的权限修饰符、返回值类型、方法名（参数类型1，形参名1，...），还有方法上面的注解等
    @Test
    public void test2 () {
        Class<Pop> popClass = Pop.class;
        Method[] declaredMethods = popClass.getDeclaredMethods ();
        //  1、获取权限修饰符
        for (Method method : declaredMethods) {
            int modifiers = method.getModifiers ();
            System.out.println (Modifier.toString (modifiers));
        }
        System.out.println ();
        //  2、获取方法声明的注解
        for (Method m : declaredMethods) {
            Annotation[] annotations = m.getAnnotations ();
            for (Annotation a : annotations) {
                System.out.println (a);

                //  获取方法的注解
                //@blackberry.Chapter15Reflection.ReflectionStruc.myAnnotation(value=show)
                //@blackberry.Chapter15Reflection.ReflectionStruc.myAnnotation(value=display)
            }
        }
        System.out.println ("");
        //  3、返回值类型
        for (Method m : declaredMethods) {
            String name = m.getReturnType ().getName ();
            System.out.print (name + "\t");
            //  返回值类型：java.lang.String	java.lang.String	void	int	int


        }

        //  4、方法名
        System.out.println ();
        for (Method m : declaredMethods) {
            String name = m.getName ();
            System.out.print (name + "\t");
            //  display	show	info	compareTo	compareTo
        }
        System.out.println ("");
        System.out.println ("--------------------");

        //  5、形参列表
        for (Method m : declaredMethods) {
            String name = m.getName ();
            System.out.print (name);
            System.out.print ("(");
            //  遍历参数列表
            Class<?>[] parameterTypes = m.getParameterTypes ();
            if (!(parameterTypes == null && parameterTypes.length == 0)) {
                for (int i = 0 ; i < parameterTypes.length ; i++) {
                    //  这里为了拼接，做一下判断,如果是最后一个参数了，就不加","了，break出循环
                    if (i == (parameterTypes.length - 1)) {
                        System.out.print (parameterTypes[i].getName () + " args_" + i);
                        break;
                    }
                    //  中间加上一个逗号
                    System.out.print (parameterTypes[i].getName () + " args_" + i + ",");
                }
            }
            System.out.print (")");
            System.out.println ();
        }

    }
    //  接测试2，
    @Test
    public void test3(){
        //  6、抛出的异常
        Class<Pop> popClass = Pop.class;
        Method[] declaredMethods = popClass.getDeclaredMethods ();
        for (Method m :declaredMethods){
            Class<?>[] exceptionTypes = m.getExceptionTypes ();
            //  如果是 exceptionTypes == null && exceptionTypes.length ==0 ，那么就没有异常,非 就表示有异常
//            if (!(exceptionTypes == null || exceptionTypes.length ==0)){
//                System.out.print ("throws:");
//                for (int i = 0 ; i < exceptionTypes.length ; i++) {
//                    if (i == exceptionTypes.length-1){
//                        System.out.print (exceptionTypes[i].getName ());
//                        break;
//                    }
//                    System.out.print (exceptionTypes[i].getName ()+" ,");
//                }
//            }
            if (exceptionTypes.length>0){
                System.out.print ("throws:");
                for (int i = 0 ; i < exceptionTypes.length ; i++) {
                    if (i == (exceptionTypes.length-1)){
                        System.out.print (exceptionTypes[i].getName ());
                        break;
                    }
                    System.out.print (exceptionTypes[i].getName ()+" ,");
                }
            }
        }
    }
}
