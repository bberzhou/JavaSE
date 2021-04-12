package blackberry.Chapter15Reflection.ReflectionStrucTest;

import blackberry.Chapter15Reflection.ReflectionStruc.Pop;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 4/12/21 15:53
 * Create By IntelliJ IDEA
 */
public class FiledTest {
    /*
        获取运行时类的属性结构

     */
    @Test
    public void test1 () {
        Class<Pop> popClass = Pop.class;
        //  获取属性结构
        //  getFields()：获取当前运行时类及其父类中声明为public访问权限的属性
        Field[] fields = popClass.getFields ();
        //  增强for循环
        for (Field field : fields) {
            System.out.println (field);
        }
        //  public int blackberry.Chapter15Reflection.ReflectionStruc.Pop.id
        //  public double blackberry.Chapter15Reflection.ReflectionStruc.Creature.weight
        System.out.println ("*********************");


        //  getDeclaredFields()：获取当前运行时类中声明的所有属性（包括public,private等），但是不包含父类中声明的属性
        Field[] declaredFields = popClass.getDeclaredFields ();
        for (Field field : declaredFields) {
            System.out.println (field);
        }
        //  private java.lang.String blackberry.Chapter15Reflection.ReflectionStruc.Pop.name
        //  int blackberry.Chapter15Reflection.ReflectionStruc.Pop.age
        //  public int blackberry.Chapter15Reflection.ReflectionStruc.Pop.id
    }

    //  获取到属性更为详细的信息，权限修饰符，数据类型，变量名，
    @Test
    public void test2(){
        Class<Pop> popClass = Pop.class;
        Field[] declaredFields = popClass.getDeclaredFields ();
        for (Field field :declaredFields){
            //  1、获取权限修饰符
            //  1、2 0 1 ,返回的修饰符是一个int类型的数字，在Modifier这个类里面有定义
//            System.out.print (field.getModifiers ());
            //  将修饰符转换一下
            int modifiers = field.getModifiers ();
            System.out.print (Modifier.toString (modifiers)+" ");   //  private (default)  public ，第二个有个默认的属性
        }
        System.out.println ();


        for (Field field :declaredFields){
            //  2、获取变量名
            System.out.print (field.getName ()+" ");    //  name age id
        }
        System.out.println ();

        for (Field field :declaredFields){
            //  3、获取变量名
            System.out.print (field.getType ()+" ");    // class java.lang.String, int, int
        }
    }
}
