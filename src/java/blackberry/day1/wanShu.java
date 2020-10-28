package blackberry.day1;

/**
 * @author bberzhou@gmail.com
 * @date 7/24/19 10:32
 * Create By IntelliJ IDEA
 */
public class wanShu {
    //  一个数恰好等于它的因子之和，这个数就称为"完数"，如6=1+2+3
    public static void main (String[] args) {
        int flag = 0;
        for (int i = 1 ; i < 1000 ; i++) {
            for (int j = 1 ; j < i ; j++) {
                if (i % j == 0) {
                    flag = flag + j;
                }

            }
            if (i == flag) {
                System.out.println (i);
            }
            flag = 0;
        }

    }
}
