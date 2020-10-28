package blackberry.day5Loop;

/**
 * @author bberzhou@gmail.com
 * @date 3/29/20 10:41
 * Create By IntelliJ IDEA
 */
public class TestDoWhile {
    /*
                循环结构的四个要素：
        1、初始化条件
        2、循环条件 ---》是boolean类型
        3、循环体
        4、迭代条件

        do-while循环结构
        1
        do{
            3;
            4;
         }
         while（2）；
         执行过程：1-->3--->4-->2-->3-->4
         说明：do-while循环至少都会执行依次循环体（3和4）
     */
    public static void main (String[] args) {
        //  遍历100以内的偶数,并计算所有偶数的和和偶数的个数
        int sum = 0; //  计算总和
        int count = 0;
        int num = 1;
        do {
            if (num % 2 == 0) {
                System.out.println (num);
                sum += num;
                count++;
            }
            num++;

        } while (num <= 100);
        System.out.println (sum);
        System.out.println (count);

        //  *************** 注意while和do-while(至少执行一次)的区别
        int number1 = 10;
        while (number1 > 10) {
            System.out.println ("hello while");
            number1--;
        }
        int number2 = 10;
        do {
            System.out.println ("hello do while");
            number2--;
        } while (number2 > 10);


    }
}
