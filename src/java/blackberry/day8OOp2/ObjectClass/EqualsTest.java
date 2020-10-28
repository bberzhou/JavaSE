package blackberry.day8OOp2.ObjectClass;

import blackberry.day8OOP1.SuperTest.TestSuper;

import java.util.Date;

/**
 * @Description: 关于equals
 * @author: bberzhou@gmail.com
 * @date: 4/19/20 22:12
 * Create By IntelliJ IDEA
 */
public class EqualsTest {
    /*
        面试题：== 和equals()的区别
        一：== 运算符的使用
            基本数据类型：byte short int long double float char boolean
            1。可以使用在基本数据类型变量和引用数据类型变量中
            2。如果是比较的基本数据类型的变量：比较这两个变量保存的数据是否相等。（不一定要类型完全相同，有类型提升）
               如果比较的是引用数据类型的变量：比较两个对象的地址值是否相同，即两个引用是否指向同一个对象实体
            3。== 富豪在使用的时候，必须保证符号左右两边的变量类型一致

        二：equals()方法的使用
            1。equals是一个方法，不是运算符
            2。只能适用于引用数据类型
                    public boolean equals(Object obj) {
                        return (this == obj);
                    }
                说明：Object类中定义的equals()和==的作用是相同的：比较的是两个对象的地址值是否相同，即两个引用是否指向同一个对象实体
            3。像String,Date,File,包装类等都重写了Object类中的equals()方法。重写以后，
                比较的不是两个引用的地址是否相同，而是比较的两个对象的"实体内容"是否相同（相当于对象的属性）

            4。通常情况下，自定义的类如果使用equals()方法的话，通常也是比较的两个对象的"实体内容"是否相同，
                就需要对Object类中的equals()方法重写
               重写的原则：比较两个对象的实体内容（例如AboutObjectClass类中：name属性）是否相同就可以了、、

             5。equals()方法应该具有，对称性，自反性，传递性和一致性，任何情况下x.equals(null)永运都是返回false
     */
    public static void main (String[] args) {
        int i = 10;
        int j = 10;
        System.out.println (i == j);//  true ,基本数据类型，直接比较数据是否相等
        char c = 10;
        System.out.println (c == i);//   true ,char类型的也是可以直接进行比较的

        String s1 = new String ("hello");
        String s2 = new String ("hello");
        System.out.println (s1 == s2);// 此时比较的就是两个对象的地址值是否相等  false


        //  使用equals比较两个对象
        AboutObjectClass a1 = new AboutObjectClass (1);
        AboutObjectClass a2 = new AboutObjectClass (1);

        //  boolean java.lang.Object.equals(Object anObject)
        //  当重写了equals()方法之后，就变成true了
        System.out.println (a1.equals (a2)); //false ---->true   ,
        System.out.println ("*******************");
        //  boolean java.lang.String.equals(Object anObject),此时已经重写了这个equals方法
        System.out.println (s1.equals (s2)); //  true
        Date date1 = new Date (33);
        Date date2 = new Date (33);
        System.out.println (date1.equals (date2));   //  true


    }
}
