package blackberry.day8OOP3.Review;

import org.junit.Test;

/**
 * @Description: 复习
 * @author: bberzhou@gmail.com
 * @date: 4/22/20 16:24
 * Create By IntelliJ IDEA
 */
public class ReviewTest {
    /*
        1。如何实现向下转型？需要注意什么问题，如何解决此问题
            使用强转符：Person p = (Person) Obj
            Person p = new Man()：向上转型就称为多态
            可能会出现ClassCastException的异常，使用instanceOf进行向下转型前的判断

        2. == 和equals()有什么区别？
            一：== 运算符的使用
            基本数据类型：byte short int long double float char boolean
            1。可以使用在基本数据类型变量和引用数据类型变量中
            2。如果是比较的基本数据类型的变量：比较这两个变量保存的数据是否相等。（不一定要类型完全相同，有类型提升）
               如果比较的是引用数据类型的变量：比较两个对象的地址值是否相同，即两个引用是否指向同一个对象实体
            3。== 富豪在使用的时候，必须保证符号左右两边的变量类型一致

            二：equals()方法的使用
            1。equals是一个方法，不是运算符
            2。只能适用于引用数据类型，比较两个对象是否相等
                    public boolean equals(Object obj) {
                        return (this == obj);
                    }
                说明：Object类中定义的equals()和==的作用是相同的：比较的是两个对象的地址值是否相同，即两个引用是否指向同一个对象实体
            3。像String,Date,File,包装类等都重写了Object类中的equals()方法。重写以后，
                比较的不是两个引用的地址是否相同，而是比较的两个对象的"实体内容"是否相同（相当于对象的属性）

            4。通常情况下，自定义的类如果使用equals()方法的话，通常也是比较的两个对象的"实体内容"是否相同，
                就需要对Object类中的equals()方法重写
               重写的原则：比较两个对象的实体内容（例如AboutObjectClass类中：name属性）是否相同就可以了

             5。equals()方法应该具有，对称性，自反性，传递性和一致性，任何情况下x.equals(null)永运都是返回false

                    重写equals()方法
                    public boolean equals(Object obj){
                    //  先比较当前两个对象是否相等，
                        if(this == obj){
                            return true;
                         }
                         if(obj instanceof Class){
                         // obj 是某个类的实例，则继续比较属性值是否相同
                         }

                      }



        3。写出8中基本数据类型及其对应的包装类
            byte    Byte
            short   Short
            int     Integer
            double  Double
            long    Long
            float   Float
            boolean Boolean
            char    Character

        4。基本数据类型、包装类与String三者之间的转换
            基本数据类型和包装类自动拆箱与装箱
            Integer i = 10; ----> String :valueOf(XXX)
            String转换为基本数据类型,paresXXX()


        5。instanceOf的作用：
         1⃣️ a instanceOf b，：判断对象a 是否是类b 的实例，如果是，返回true,如果不是，返回false。
         2⃣️ 如果a instanceOf b返回true, a instanceOf A也返回true，其中b是A的父类。
         3⃣️ X instanceOf A：要求X所属的类与类A必须是子类和父类的关系，否则编译错误

        6。对多态性的理解：
            更多的是使代码达到一个通用性，比如equals方法
            抽象类和接口的使用肯定体现了多态性，（ 如果没有多态性，抽象类和接口就不能实例化）

        7。多态是编译时的行为还是运行时的行为？
            运行时的行为

        8。关于Object类
            1。Object类是所有Java类的根父类
            2。如果在类的声明中没有使用extends关键字指明其父类，则默认父类为java.lang.Object类
            3。Object类中的功能（属性、方法）就具有通用性，Object类没有属性，方法有 equals()/ toString()/ getClass()/hashcode()/ clone()/ finalize()
            4.Object类只声明了一个空参的构造器，
            5。数组也可以看成是一个特殊的类，继承于Object，数组也可以调用Object类的一些方法

        9。手动重写equals()方法

            public boolean equals(Object otherObject){
                if(this == otherObject) return true;
                if( otherObject instanceOf XXX){
                    ClassXXX xx = (XXX) otherObject;
                    当有String类型的属性时就不用== 来判断，而是使用 equals()
                    return this.attr == xx.attr &&
                  }



          10。==运算符的使用

          11。Object类中toString()的使用
                1。当我们输出一个对象的引用时，实际上就是调用当前对象的toString()
                2。Object类中toString()的定义
                     public String toString() {
                        return getClass().getName() + "@" + Integer.toHexString(hashCode());
                    }
                    这里的16进制地址实际上是虚拟的地址，在JVM中

                3。像String、Date、File、包装类等都重写了Object类中的toString()方法，
                    使得在调用对象的toString()时，返回"实体内容"的信息

                4。自定义类也可以重写toString（）方法，当调用此方法时，返回对象的"实体内容"


           13。面试题：final finally finalize

           14。为什么要有包装类
                为了使得基本数据类型的变量具有类的特征，

           15。包装类的使用
                基本数据类型<----->包装类：JDK5.0之后新特性：自动装箱和拆箱
                基本数据类型、包装类---->String：调用String重载的valueOf(XXX xxx)
                String----->基本数据类型、包装类：调用包装类的parseXXX( String s)
                转换的时候可能会报NumberFormatException 的错误


     */


    //  数组也可以作为Object类的子类出现，可以调用Object类中声明的方法
    @Test
    public void test1 () {
        int[] arr = new int[]{1, 2, 4, 2};
        print (arr);
        System.out.println (arr.getClass ().getSuperclass ());   //   java.lang.Object
    }

    public void print (Object obj) {
        System.out.println (obj);
    }

    //  区别手动写的equals()方法和自动生成equals()方法的区别

    //  关于toString()
    @Test
    public void test2 () {
        String s = "abc";
        s = null;
        System.out.println (s);  //  null
        System.out.println ("***********");
        System.out.println (s.toString ());  //  出现NUllPointException
    }
}
