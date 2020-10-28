package blackberry.day5Loop;

import java.util.Scanner;

/**
 * @author bberzhou@gmail.com
 * @date 3/29/20 11:34
 * Create By IntelliJ IDEA
 */
public class WhileTestExe {
    /*
        从键盘读入个数不确定的整数，并判断读入的正数和负数的个数，输入为0的时候结束程序
     */
    public static void main (String[] args) {
        Scanner in = new Scanner (System.in);
        //  不确定要循环多少次，可以通过break和boolean来结束循环
        int positiveNumber = 0;
        int negativeNumber = 0;
        //  通过while循环初始化为true保障一直循环
//        while (true),或者使用for (;;)，不限制循环次数
        for ( ; ; ) {
            //  从键盘读入输入的数据
            int number = in.nextInt ();
            //  当输入大于0 的数据+1
            if (number > 0) {
                positiveNumber++;
            } else if (number < 0) {
                //  当为负数时 +1
                negativeNumber++;
            } else {
                //  为0时跳出循环
                break;
            }
            /*
                结束循环的方式：
                    1、在循环条件部分返回false
                    2、或者在循环体中执行break
             */
        }
        System.out.println ("正数的个数：" + positiveNumber);
        System.out.println ("负数的个数：" + negativeNumber);
    }
}
