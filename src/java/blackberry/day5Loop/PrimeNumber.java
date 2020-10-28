package blackberry.day5Loop;

/**
 * @author bberzhou@gmail.com
 * @date 3/29/20 15:19
 * Create By IntelliJ IDEA
 */
public class PrimeNumber {
    /*
        输出100以内所有的质数
     */
    public static void main (String[] args) {
        // 质数只能被1和自身整除，则2～n-1之间都不能被整除。最小的质数是2


        //  循环2到100
        for (int i = 2 ; i < 100 ; i++) {
            //  使用flag来标示i是否能被j除尽
            boolean isFlag = true;
            //  i能否被从2到i-1的数整除
            for (int j = 2 ; j < i ; j++) {
                //  如果能够被整除掉就将flag置为false；不能整除则flag还是true
                if (i % j == 0) {
                    isFlag = false;
                }
            }
            //  如果flag是true就输出当前的i
            if (isFlag) {
                System.out.println (i);
            }
            //  重置flag
//            isFlag = true;
        }
    }
}
