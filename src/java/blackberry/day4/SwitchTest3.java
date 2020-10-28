package blackberry.day4;

import java.util.Scanner;

/**
 * @author bberzhou@gmail.com
 * @date 3/28/20 10:19
 * Create By IntelliJ IDEA
 */
public class SwitchTest3 {
    /*
        编写程序：从键盘上输入2019年的"month"和"day",通过程序输出输入的日期为2019年的第几天
     */
    public static void main (String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println ("请输入月份：");
        int month = in.nextInt ();
        System.out.println ("请输入天数:");
        int day = in.nextInt ();

//        if (month <=0 || month >12){
//            System.out.println("输入的月份有误！");
//        }
        //  方式一：直接定义一个变量来保存总的天数，累加
//        int SumDays = 0;
//        if (month == 1){
//            SumDays = day;
//        }else if(month == 2){
//            SumDays = 31+day;
//        }

        //  方式二：使用switch
//        int sumDays;
//        switch (month){
//            case 1:
//                sumDays = day;
//                break;
//            case 2:
//                sumDays = 31+day;
//                break;
//
//        }

        //  方式三：解决代码冗余的问题，同时说明break在switch在是可选灵活的
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
                sumDays += 28;
            case 2:
                sumDays += 31;
            case 1:
                sumDays += day;

        }
        System.out.println ("2019年的第" + sumDays + "天。");

    }
}


