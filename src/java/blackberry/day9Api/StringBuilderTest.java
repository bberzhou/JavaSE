package blackberry.day9Api;

/**
 * @author bberzhou@gmail.com
 * @date 8/29/19 10:28
 * Create By IntelliJ IDEA
 */
public class StringBuilderTest {
    public static void main (String[] args) {
//        Java编译器对String做了特殊处理，使得我们可以直接用+拼接字符串

//        String s = "";
//        for (int i = 0 ; i < 10 ; i++) {
//            s = s + "," + i;
//        }
//        System.out.println(s);
//        ,0,1,2,3,4,5,6,7,8,9

//        为了能高效拼接字符串，Java标准库提供了StringBuilder，
//        它是一个可变对象，可以预分配缓冲区，
//        这样，往StringBuilder中新增字符时，不会创建新的临时对象：

        StringBuilder stringBuilder = new StringBuilder (1024);
        for (int i = 0 ; i < 10 ; i++) {
            stringBuilder.append (',');
            stringBuilder.append (i);
        }
        System.out.println (stringBuilder.toString ());//    ,0,1,2,3,4,5,6,7,8,9
        StringBuilder sb = new StringBuilder (1024);
        sb.append ("Mr ")
            .append ("Bob")
            .append ("!")
            .insert (0, "Hello, ");
        System.out.println (sb.toString ());  //  Hello, Mr Bob!
        //  StringBuffer，这是Java早期的一个StringBuilder的线程安全版本，
        //  它通过同步来保证多个线程操作StringBuffer也是安全的，但是同步会带来执行速度的下降


    }
}
