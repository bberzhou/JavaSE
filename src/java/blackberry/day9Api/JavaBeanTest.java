package blackberry.day9Api;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;

/**
 * @author bberzhou@gmail.com
 * @date 8/29/19 14:56
 * Create By IntelliJ IDEA
 */
public class JavaBeanTest {

    //  符合这种规范的饿就是class就是JavaBean
    //  通常把一组对应的读方法（getter）和写方法（setter）称为属性（property）。例如，name属性：
    //  对应的读方法是String getName(),只有一个get叫只读属性(read-only)
    //  对应的写方法是setName(String name)，只有个set叫做只写属性(write-only)；
    private String name;
    private int age;
    private String email;

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public int getAge () {
        return age;
    }

    public void setAge (int age) {
        this.age = age;
    }

    public String getEmail () {
        return email;
    }

    public void setEmail (String email) {
        this.email = email;
    }

    //    要枚举一个JavaBean的所有属性，可以直接使用Java核心库提供的Introspector：
    public static void main (String[] args) throws IntrospectionException {
        BeanInfo info = Introspector.getBeanInfo (JavaBeanTest.class);
        for (PropertyDescriptor ps : info.getPropertyDescriptors ()) {
            System.out.println (ps.getName ());
            System.out.println ("    " + ps.getReadMethod ());
            System.out.println ("    " + ps.getWriteMethod ());
        /*

            输出：
            age
            public int blackberry.day9Api.JavaBeanTest.getAge()
            public void blackberry.day9Api.JavaBeanTest.setAge(int)
            class
            //  class属性是从Object继承的getClass()方法带来的
            public final native java.lang.Class java.lang.Object.getClass()
            null
            email
            public java.lang.String blackberry.day9Api.JavaBeanTest.getEmail()
            public void blackberry.day9Api.JavaBeanTest.setEmail(java.lang.String)
            name
            public java.lang.String blackberry.day9Api.JavaBeanTest.getName()
            public void blackberry.day9Api.JavaBeanTest.setName(java.lang.String)

         */

        }
    }

}


/*
    枚举类enum:
    通过enum定义的枚举类，和其他的class有什么区别？
    答案是没有任何区别。enum定义的类型就是class，只不过它有以下几个特点：
    定义的enum类型总是继承自java.lang.Enum，且无法被继承；
    只能定义出enum的实例，而无法通过new操作符创建enum的实例；
    定义的每个实例都是引用类型的唯一实例；
    可以将enum类型用于switch语句。

 */
enum Color {
    Red, GREEN, BLUE;
}
