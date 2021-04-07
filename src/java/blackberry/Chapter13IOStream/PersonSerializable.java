package blackberry.Chapter13IOStream;

import java.io.Serializable;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 4/6/21 20:10
 * Create By IntelliJ IDEA
 */
public class PersonSerializable implements Serializable {
    /*
        自定义测试类来持久化的存储起来

        Person需要满足条件：
           1、实现Serializable接口,但是这个接口里面没有具体的方法，一个标识接口
           2、"serialVersionUID" that must be static, final, and of type long:
                ANY-ACCESS-MODIFIER static final long serialVersionUID = 42L;

              需要当前类提供一个全局常量：serialVersionUID
              说明：凡是实现serializable接口的类都有一个表示序列化版本标识符的静态变量：
                    public static final long serialVersionUID = 8989890L;
                    serialVersionUID用来表明类的不同版本间的兼容性。简而言之，其目的是以序列化对象进行版本控制，有关各版本反序列化时是否兼容
                    如果类没有显示定义这个静态变量，它的值是Java运行时环境根据类的内部细节自动生成的。若类的实例变量做了修改，serialVersionUID可能发生变化，所以建议显示声明

                    简单来说：Java的序列化机制是通过在运行时判断类的serialVersionUID来验证版本一致性的，
                            在进行反序列化时，JVM会把传来的字节流中的serialVersionUID与本地相应实体类的serialVersionUID进行比较，
                            如果相同就认为是一致的，可以进行反序列化，否则就会出现序列化版本不一致的异常（InvalidCastException）
           3、除了当前Person类需要实现serializable接口之外，还必须保证其内部所有属性也是必须可序列化的。（默认情况下，基本数据类型是可序列化的）
           4、ObjectOutputStream和ObjectInputStream不能序列化static和transient修饰的成员变量

    可序列化的Java对象必须实现java.io.Serializable接口，类似Serializable这样的空接口被称为“标记接口”（Marker Interface）；
    反序列化时不调用构造方法，可设置serialVersionUID作为版本号（非必需）
    Java的序列化机制仅适用于Java，如果需要与其它语言交换数据，必须使用通用的序列化方法，例如JSON。

     */
    public static final long serialVersionUID = 8989890L;
//    private static String name;
    private String name;
    private int age;

    //  先把serialVersionUID注释掉，然后执行序列化操作，再添加这个number属性，执行反序列化操作就会报错
//    private int number;
//    java.io.InvalidClassException: blackberry.Chapter12IOStream.PersonSerializable; local class incompatible: stream classdesc serialVersionUID = 8196525326163359513, local class serialVersionUID = -3686403896066590624


    public PersonSerializable (String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString () {
        return "PersonSerializable{" +
            "name='" + name + '\'' +
            ", age=" + age +
            '}';
    }
}
