package blackberry.day2;

/**
 * @author bberzhou@gmail.com
 * @date 3/21/20 14:23
 * Create By IntelliJ IDEA
 */

public class DataChange {
    /**
     * 1、自动类型提升
     * byte、short、char、==> int==> long==> float double 依次提升
     * 当byte char short 三种类型的变量做运算时，结果为int 型
     * <p>
     * 2、强制类型转换
     * 自动类型提升运算的逆运算
     */
    public static void main (String[] args) {
        byte b1 = 3;
        int i2 = 129;
        int b2 = (b1 + i2);
        System.out.println (b2);

        char c = 'a';
        int s1 = c + i2;
        System.out.println (s1);

        //  精度损失
        double d1 = 12.3;
        int in = (int) d1;
        System.out.println (in);

    }

}
