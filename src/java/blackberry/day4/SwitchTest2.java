package blackberry.day4;

import java.util.Scanner;

/**
 * @author bberzhou@gmail.com
 * @date 3/28/20 10:08
 * Create By IntelliJ IDEA
 */
public class SwitchTest2 {
    /*
        例题：对学生成绩大于60分的，输出"合格"。低于60分的，输出"不合格"
     */
    public static void main (String[] args) {
        System.out.println ("请输入你的成绩：");
        Scanner in = new Scanner (System.in);
        int score = in.nextInt ();
        //  方法一：
//        if (score <60) {
//            score = 0;
//        } else {
//            score = 1;
//        }
//        switch (score){
//            case 0:
//                System.out.println("不及格");
//                break;
//            case 1:
//                System.out.println("及格");
//                break;
//        }
        //  方法二，用score除10,多个case合并
//        switch (score/10){
//            //  前面默认通过，直到case5
//            case 0:
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("不及格！");
//                break;
//            case 6:
//            case 7:
//            case 8:
//            case 9:
//                System.out.println("及格了！");
//                break;
//        }
        //  方法3
        switch (score / 60) {
            case 0:
                System.out.println ("不及格！");
                break;
            case 1:
                System.out.println ("及格");
                break;
        }


    }
}
