package blackberry.day1;

/**
 * @author bberzhou@gmail.com
 * @date 7/24/19 08:44
 * Create By IntelliJ IDEA
 */
public class primaryNum {
    //  实现100000以内的素数遍历
    public static void main (String[] args) {
        long start = System.currentTimeMillis ();
        la:
        for (int i = 2 ; i < 100000 ; i++) {
            for (int j = 2 ; j < Math.sqrt (i) ; j++) {
                if (i % j == 0) {
                    //  如果出现等于0的情况，直接进入下一次的循环
                    continue la;
//                    break;
                }

            }
            System.out.println (i);
        }
        long end = System.currentTimeMillis ();
        System.out.println (end - start);

    }

}
