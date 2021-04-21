package blackberry.day3;

/**
 * @author bberzhou@gmail.com
 * @date 3/22/20 17:08
 * Create By IntelliJ IDEA
 */
public class CompareTest {
    public static void main (String[] args) {
        //  比较运算符   == 等于 ! =不等于 >大于 <小于 >= <=
        //  比较运算符的结果一定是布尔类型,操作的都是布尔类型的值。

        //  逻辑运算符 逻辑与& 逻辑或| 逻辑非! && 短路与 ||短路或 ^ 异或（同真异假）

        //  逻辑& 和短路&&的区别:
        //  1、相同点&和&&的运算结果是相同的，
        //  2、当符号左边都是true时，二者都会执行右边的运算
        //  3、当符号左边都是false时，&会继续执行右边的运算，而&&不再继续执行右边的运算
        boolean b1 = true;
        b1 = false;
        int num1 = 10;
        if (b1 & (num1++ > 0)) {
            System.out.println ("我现在在北京");
        } else {
            System.out.println ("我现在在南京");
        }
        System.out.println (num1);

        boolean b2 = true;
        b2 = false;
        int num2 = 10;
        if (b2 && (num2++ > 0)) {
            System.out.println ("我现在在北京");
        } else {
            System.out.println ("我现在在南京");
        }
        System.out.println (num2);


        /*
            区分：| 和||
            1、相同点：|和｜｜的运算结果是相同的，
            2、当符号左边是false时，二者都会执行有右边的运算
            3、当符号左边是true时，|会继续执行右边的运算，||不会再继续执行右边的运算

         */
        boolean b3 = true;

        int num3 = 10;
        if (b3 | (num3++ > 0)) {
            System.out.println ("我现在在北京");
        } else {
            System.out.println ("我现在在南京");
        }
        System.out.println (num3);

        boolean b4 = true;
        int num4 = 10;
        if (b4 || (num4++ > 0)) {
            System.out.println ("我现在在北京");
        } else {
            System.out.println ("我现在在南京");
        }
        System.out.println (num4);
    }
}
