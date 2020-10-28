package blackberry.day3;

/**
 * @author bberzhou@gmail.com
 * @date 3/23/20 15:35
 * Create By IntelliJ IDEA
 */
public class BiteEx {
    public static void main (String[] args) {
        //  练习：交换两个变量的值,
        //  方法一：定义临时变量
        int num1 = 10;
        int num2 = 20;
//        int temp = num1;
//        num1 = num2;
//        num2 = temp;
//        System.out.println ("num1=:" + num1);  //num1=:20
//        System.out.println ("num2=:" + num2);  //num2=:10

        //  方法二：好处，不用定义临时变量，弊端：1、有可能相加操作超出存储方法 2、有局限性，只适用数值类型
//        num1 = num1 + num2;
//        num2 = num1 - num2;
//        num1 = num1 - num2;
//        System.out.println ("num1=:" + num1);  //num1=:20
//        System.out.println ("num2=:" + num2);  //num2=:10

        //  方法三：利用异或来处理,    局限性：也只适用数值类型
        num1 = num1 ^ num2;   //  得到一个异或的结果
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;
        System.out.println ("num1=" + num1);
        System.out.println ("num2=" + num2);


    }
}
