package blackberry.day8OOp2.ToStringTest;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 4/21/20 10:07
 * Create By IntelliJ IDEA
 */
public class ToString {
    public static void main (String[] args) {
        /*
            Object类中的toString()方法的使用

            1。当我们直接输出一个对象的引用时，实际上就是调用当前对象的toString()方法
            2。object类中的toString()的定义，
              public String toString() {
                return getClass().getName() + "@" + Integer.toHexString(hashCode());
             }
             这里的16进制地址实际上是虚拟的地址，在JVM中

           3。像String、Date、File、包装类等都重写了Object类中的toString()方法，
              使得在调用对象的toString()时，返回"实体内容"的信息

           4。自定义类也可以重写toString（）方法，当调用此方法时，返回对象的"实体内容"


           */
        Cust cust = new Cust ("Tim", 24);
        //  blackberry.day8OOp2.ToStringTest.Cust@2503dbd3,此时的ToString()是Object类的方法
        System.out.println (cust.toString ());
        //  重写Cust类的toString()方法 ：Cust[ name = Tim, age = 24]


    }
}

