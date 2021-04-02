package blackberry.day6Array;

import java.util.Scanner;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 3/31/21 11:34 AM
 * Create By IntelliJ IDEA
 */
public class test {
    public static void main (String[] args) {
        Scanner in = new Scanner (System.in);
        int n = in.nextInt ();
        if (n>=1 && n<=34){
            int[][] arr = new int[n][];
            for (int i = 0 ; i < arr.length ; i++) {
                arr[i] = new int[i+1];
                arr[i][0] = arr[i][i] = 1;
                if (i>1){
                    for (int j = 1; j < arr[i].length-1 ; j++) {
                        arr[i][j] = arr[i-1][j-1]+arr[i-1][j];

                    }
                }

            }
            for (int i = 0 ; i < arr.length ; i++) {
                for (int j = 0 ; j < arr[i].length ; j++) {

                    System.out.print (arr[i][j] + " ");
                }
                System.out.println ();

            }
        }

    }

}
