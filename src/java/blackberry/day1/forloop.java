package blackberry.day1;

/**
 * @author bberzhou@gmail.com
 * @date 7/23/19 19:43
 * Create By IntelliJ IDEA
 */
public class forloop {
    public static void main (String[] args) {
        for (int i = 0 ; i < 10 ; i++) {
            for (int j = 1 ; j < i + 1 ; j++) {
                System.out.print (j + "*" + i + "=" + i * j + "\t");
            }
            System.out.println ();
        }

//        倒置
        /*
         ******
         *****
         ****
         ***
         **
         *
         */

//        for (int i = 0 ; i < 6 ; i++) {
//            for (int j = 0 ; j < 6-i; j++) {
//                System.out.print("*");
//
//            }
//            System.out.println();
//        }


        /*
         *
         **
         ***
         ****
         *****
         */
//        for (int i = 0 ; i < 6 ; i++) {
//            for (int j = 0 ; j < i ; j++) {
//                System.out.print("*");
//
//            }
//            System.out.println();
//
//        }

        //正三角
        /*
            i j k
            0 5 1
            1 4 2
            6 0 5
         */
        for (int i = 0 ; i < 6 ; i++) {
            for (int j = 0 ; j < 5 - i ; j++) {
                System.out.print ("-");

            }
            for (int k = 0 ; k < i + 1 ; k++) {
                System.out.print ("* ");

            }
            System.out.println ();

        }
//        外层控制行数
        for (int i = 0 ; i < 6 ; i++) {
            for (int j = 1 ; j < i + 1 ; j++) {
                System.out.print ("-");

            }
            for (int k = 0 ; k < 6 - i ; k++) {
                System.out.print ("* ");
            }
            System.out.println ();

        }
        // 打印100以内的所有质数
//        boolean flag = false;
//        long start = System.currentTimeMillis ();
//        for (int i = 2 ; i < 100 ; i++) {
//            //  如何判断,如果能被他之前的数整出则不是质数
//            for (int j = 2 ; j <i ; j++) {
//                if (i%j==0){
//                    flag = true;
//                }
//
//            }
//            if (flag == false){
//                System.out.println(i);
//            }
//            //  每一次循环之后都将标志置为false
//            flag = false;
//        }
//        long end = System.currentTimeMillis ();
//        System.out.println(end-start);

        //  对该程序进行优化
        boolean flag = false;
        long start = System.currentTimeMillis ();
        for (int i = 2 ; i < 100000 ; i++) {
            //  如何判断,如果能被他之前的数整出则不是质数
            //  在判断的时候还可以进行优化，因为每个数相当于是前面某两个数的乘积
            for (int j = 2 ; j < Math.sqrt (i) ; j++) {
                if (i % j == 0) {
                    flag = true;
                    //  如果能被整出的时候直接就判断非质数，直接就跳出循环
                    break;
                }

            }
            if (flag == false) {
                System.out.println (i);
            }
            //  每一次循环之后都将标志置为false
            flag = false;
        }
        long end = System.currentTimeMillis ();
        System.out.println (end - start);

    }
}
