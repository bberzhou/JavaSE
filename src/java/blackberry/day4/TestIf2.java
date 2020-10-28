package blackberry.day4;

import java.util.Scanner;

/**
 * @author bberzhou@gmail.com
 * @date 3/25/20 09:27
 * Create By IntelliJ IDEA
 */
public class TestIf2 {
    /*
        从键盘输入三个整数分别存入变量num1、num2、num3，并对他们进行排序
     */
    public static void main (String[] args) {
        System.out.println ("请输入三个整数:");
        Scanner in = new Scanner (System.in);
        int num1 = in.nextInt ();
        System.out.println ("第一个整数：" + num1);
        int num2 = in.nextInt ();
        System.out.println ("第2个整数：" + num2);
        int num3 = in.nextInt ();
        System.out.println ("第3个整数：" + num3);
        if (num1 > num2 && num1 > num3) {
            if (num2 > num3) {
                System.out.println ("num1>>num2>num3");
            } else {
                System.out.println ("num1>num3>num2");
            }
        } else if (num2 > num1 && num2 > num3) {
            if (num1 > num3) {
                System.out.println ("num2>num1>num3");
            } else {
                System.out.println ("num2>num3>num1");
            }
        } else {
            if (num1 > num2) {
                System.out.println ("num3>num1>num2");
            } else {
                System.out.println ("num3>num2>num1");
            }
        }
//        if (num1 >= num2) {
//            if (num3 > num1) {
//                System.out.println ("num2" + "<" + "num1" +"<"+ "num3");
//            } else if (num3 < num1) {
//                if (num3 > num2){
//                    System.out.println ("num2" + "<" + "num3" +"<"+ "num1");
//                }else {
//                    System.out.println ("num3" + "<" + "num2" +"<"+ "num1");
//
//                }
//            }
//        }else{
//            //  num1 < num2
//            if (num3>num2){
//                System.out.println ("num1" + "<" + "num2" +"<"+ "num3");
//            }else if (num3<num2){
//                if (num1<num3){
//                    System.out.println ("num1" + "<" + "num3" +"<"+ "num2");
//                }else {
//                    System.out.println ("num3" + "<" + "num1" +"<"+ "num2");
//
//                }
//            }
//        }
    }
}
