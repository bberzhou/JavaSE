package blackberry.day1;

/**
 * @author bberzhou@gmail.com
 * @date 7/24/19 08:33
 * Create By IntelliJ IDEA
 */
public class continueTest {
    public static void main (String[] args) {
//        //  外层控制行数，内层控制列数
//        for (int i = 0 ; i < 5 ; i++) {
//            for (int j = 1 ; j < 10 ; j++) {
//                if (j%4==0){
//                    //  这个break只控制内层的
//                    break;
//
//
//
//
//
////1235679
////1235679
////1235679
////1235679
////1235679
////                    continue;
//                }
//                System.out.print(j);
//            }
//            System.out.println();
        label:
        for (int i = 0 ; i < 5 ; i++) {
            for (int j = 1 ; j < 6 ; j++) {
                if (j % 4 == 0) {
                    //   可以通过标签来控制外层的循环,跳出整个循环
//                   break label;

                    //   结束当前这次的循环
                    continue label;

                    //   在break和continue后面的语句不会被执行，并且在编译的时候还会报错
//                   System.out.println("sas");
                }
                System.out.print (j);
            }
            System.out.println ();
        }

    }
}
