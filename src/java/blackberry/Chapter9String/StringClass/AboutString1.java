package blackberry.Chapter9String.StringClass;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 11/15/20 21:04
 * Create By IntelliJ IDEA
 */
public class AboutString1 {
    /**
     * String对象的创建,String的实例化方式
     */
    //  方式一：通过字面量
    String str = "hello";

    //  方式二：new的方式+构造器
    String s1 = new String ();  //  本质上就是this.value = new char[0]

    //  方式
//    String s2 = new String (String orignal);    //  this.value = original.value

    //  方式三:this.value = Arrays.copyOf(value,value.length)；相当于一个数组的赋值操作
//    String s3 = new String (char[] a);


    public static void main (String[] args) {
        //  通过字面量定义的方式：此时的s1和s2的数据javaee声明在方法区中的字符串常量池中。
        String s1 = "javaee";
        String s2 = "javaee";

        //  通过new +构造器的方式：此时s3和s4保存的地址值，数据是在堆空间中开辟空间以后对应的地址值
        String s3 = new String ("javaee");
        String s4 = new String ("javaee");  //  新的对象

        //  == 比较地址，equals 比较地址
        System.out.println (s1 == s2);     //  true    因为都在常量池中
        System.out.println (s1 == s3);     //  false   一个在常量池中，一个是一个对象在堆中
        System.out.println (s1 == s4);     //  false
        System.out.println (s3 == s4);     //  false   两个不同的对象地址肯定是不同的

        System.out.println ("************");
        //  创建两个Person对象
        Person p1 = new Person ("Tom", 13);
        Person p2 = new Person ("Tom", 13);
        System.out.println (p1.name.equals (p2.name));   //  true 比较内容
        System.out.println (p1 == p2);       //  false
        System.out.println (p1.name == p2.name);     // true 这是因为tom是通过字面量的方式定义的

        p1.name = "Jerry";
        System.out.println (p2.name);    //  Tom,修改之后p1的name地址就是在常量池中的另外一个地方



    }

    /**
     *  面试题：String s = new String（"abc");方式创建对象，在内存中创建了几个对象？
     *          两个：一个是堆空间中new结构，然后new里面实际上是一个char型数组，
     *          所以另一个是char[]对应的常量池中的数据："abc，如果常量池里面有的话，就是使用常量池里面的
     */


}
