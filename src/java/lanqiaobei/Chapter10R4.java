package lanqiaobei;

import java.util.Scanner;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 4/14/21 20:04
 * Create By IntelliJ IDEA
 */
public class Chapter10R4 {
    /*
        水仙花数
     */
    public static void main (String[] args) {
        //  水仙花数
//        for (int i = 100 ; i <1000  ; i++) {
//            int g = i %10;
//            int s = (i/10) % 10;
//            int b = (i/100)%10;
//            if ((g*g*g +s*s*s+b*b*b) == i){
//                System.out.println (i);
//            }
//        }

        //  累加法
        int sum =0;
        Scanner in = new Scanner (System.in);
        int i = in.nextInt ();
        if (1<= i && i <= 10000){
            for (int j = 1 ; j <=i ; j++) {
                sum += j;
            }
            System.out.println (sum);
        }
    }
}
