package blackberry.day4;

import java.util.Scanner;

/**
 * @author bberzhou@gmail.com
 * @date 3/28/20 11:15
 * Create By IntelliJ IDEA
 */
public class SwitchTest3Plus {
    /*
    扩展题目：从键盘分别输入年、月、日，判断这一天是当年的第几天
    判断一年是否是闰年的标准：
        1）可以被4整除，但是不可以被100整除，或者
        2）可以被400整除


        *************
        1、凡是可以使用switch-case的结构，都可以转换为if-else。反之，不成立。
        2、但是一般switch-case效率更高。
    */
    public static void main (String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println ("请输入年份：");
        int year = in.nextInt ();
        System.out.println ("请输入月份：");
        int month = in.nextInt ();
        System.out.println ("请输入当前天数：");
        int day = in.nextInt ();
        int sumDays = 0;
        switch (month) {
            case 12:
                sumDays += 30;
            case 11:
                sumDays += 31;
            case 10:
                sumDays += 30;
            case 9:
                sumDays += 31;
            case 8:
                sumDays += 31;
            case 7:
                sumDays += 30;
            case 6:
                sumDays += 31;
            case 5:
                sumDays += 30;
            case 4:
                sumDays += 31;
            case 3:
//                sumDays += 28;
                //  根据平年闰年来判断2月是多少天,被四整除但是不能被整100整除或着被400整除
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                    sumDays += 29;

                } else {
                    sumDays += 28;
                }
            case 2:
                sumDays += 31;
            case 1:
                sumDays += day;
        }
        System.out.println ("这是" + year + "年的" + "第" + sumDays + "天");
    }
}
