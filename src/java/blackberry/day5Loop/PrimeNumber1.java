package blackberry.day5Loop;

/**
 * @author bberzhou@gmail.com
 * @date 3/29/20 15:46
 * Create By IntelliJ IDEA
 */
public class PrimeNumber1 {
    /*
        100以内的质数优化
     */
    public static void main (String[] args) {

        long BeforeTime = System.currentTimeMillis ();
        for (int i = 2 ; i < 100 ; i++) {
            boolean isFlag = true;
            //  优化二：不用完全到i-1个数，只需要看根号之间
//            for (int j = 2 ; j < i ; j++)
            for (int j = 2 ; j < Math.sqrt (i) ; j++) {
                if (i % j == 0) {
                    isFlag = false;
                    // 优化一：利用这个break来提高效率，当能够除尽的时候，直接跳出内循环，
                    //  只对本身就不是质数是有效的
                    break;
                }
            }
            if (isFlag) {
                System.out.println (i);
            }
        }
        long AfterTime = System.currentTimeMillis ();
        long time = AfterTime - BeforeTime;
        System.out.println (time);
    }
}
