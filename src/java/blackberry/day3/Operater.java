package blackberry.day3;

/**
 * @author bberzhou@gmail.com
 * @date 3/21/20 17:39
 * Create By IntelliJ IDEA
 */
public class Operater {
    /**
     * java中的运算符
     * + - * / %（取模）左+右+
     */
    public static void main (String[] args) {
        //  除法
        int num1 = 12;
        int num2 = 5;
        int result = num1 / num2;
        System.out.println (result); //2
        double result1 = (double) num1 / num2;
//        double result1 = num1/(num2+0.0);
        System.out.println (result1);    //2.0

        //  %取模运算,结果的符号是跟被取模的数符号一致，
        int m1 = 12;
        int m2 = 5;
        int m3 = m1 % m2;
        System.out.println (m3);
        int m4 = -12;
        int m5 = 5;
        int m6 = m4 % m5;
        System.out.println (m6);

        //  = 赋值运算符 += -= *=  /= %=


    }
}
