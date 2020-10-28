package blackberry.day1;

/**
 * @author bberzhou@gmail.com
 * @date 7/29/19 15:38
 * Create By IntelliJ IDEA
 */
public class leixingzhuanhuan {
    /*
     1。自动类型转换：当容量小的数据类型与容量大的数据类型运算时，
        容量小的会自动转换为容量大的数据类型:
        char,byte,short===>int===>long===>float===>double;
      */
    public static void main (String[] args) {
        int i1 = 12;
        short s1 = 2;
        int i2 = i1 + s1;
        float f1 = 12.3f;
        float f2 = f1 + i2;
        long l1 = 12L;
        float f3 = 1;
        System.out.println (i2); //  14
        System.out.println (f2); //  26.3


        //  当char/byte/short之间做运算时，默认的结果为int类型

        //  2/强制类型转换，容量大的转换为容量小的，要使用强制类型转换符;()

        long l2 = 12345L;
        int m = (int) l2;
        System.out.println (m);  //12345


        //  字符串与基本数据类型之间的运算：只能是连接运算：+ 得到的结果仍然是一个字符串

    }
}
