package blackberry.day3;

/**
 * @author bberzhou@gmail.com
 * @date 3/23/20 16:20
 * Create By IntelliJ IDEA
 */
public class SanYuan {
    public static void main (String[] args) {
        /*
                三元运算符，结构：（条件表达式）？表达式1：表达式2
                1、条件表达式的结果为boolean类型
                2、根据条件表达式的真假来决定执行表达式1还是表达式2
                3、当表达式为true时执行表达式1，表达式为false时执行表达式2
                4、三元运算符可以嵌套
                5、凡是可以使用三元运算符的地方，都可以改写为if-else；
         */
        //  获取两个整数中的较大值。
        int m = 12;
        int n = 5;
        int max = (m > n) ? m : n;
        System.out.println (max);

        //  获取三个数的最大值
        int n1 = 12;
        int n2 = 30;
        int n3 = 33;
        int max1 = (n1 > n2) ? n1 : n2;
        int max2 = (max1 > n3) ? max1 : n3;
        int max3 = (((n1 > n2) ? n1 : n2) > n3) ? ((n1 > n2) ? n1 : n2) : n3;
        System.out.println ("这三个数最大的是：" + max2);
    }
}
