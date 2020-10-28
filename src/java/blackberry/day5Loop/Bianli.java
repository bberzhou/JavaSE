package blackberry.day5Loop;

/**
 * @author bberzhou@gmail.com
 * @date 3/28/20 12:43
 * Create By IntelliJ IDEA
 */
public class Bianli {
    /*
        遍历100以内的偶数,并输出所有偶数的和，输出偶数的个数
     */
    public static void main (String[] args) {
        int sum = 0;
        int count = 0;
        for (int i = 0 ; i <= 100 ; i++) {
            if (i % 2 == 0) {
                sum += i;
                count++;
                System.out.print (i);
            }

        }
        System.out.println ("_______");
        System.out.println (sum);
        System.out.println (count);

    }

}
