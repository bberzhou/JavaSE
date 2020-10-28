package blackberry.day8OOp2.ObjectClassExecise2;

/**
 * @Description: mydate测试类
 * @author: bberzhou@gmail.com
 * @date: 4/21/20 09:48
 * Create By IntelliJ IDEA
 */
public class MyDateTest {
    /*
        MyDate的一个测试方法
        没有重写MyDate的equasl方法的时候，输出：
            m1 != m2
            m1 is not equals to m2
        重写了equals方法之后
            m1 != m2
            m1 is equals to m2
     */
    public static void main (String[] args) {
        MyDate myDate1 = new MyDate (14, 3, 1976);
        MyDate myDate2 = new MyDate (14, 3, 1976);
        if (myDate1 == myDate2) {
            System.out.println ("m1 == m2");
        } else {
            System.out.println ("m1 != m2");
        }
        if (myDate1.equals (myDate2)) {
            System.out.println ("m1 is equals to m2");

        } else {
            System.out.println ("m1 is not equals to m2");
        }
    }

}
