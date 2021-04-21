package lanqiaobei;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 4/13/21 22:31
 * Create By IntelliJ IDEA
 */
public class Real1 {
    public static void main (String[] args) {
        int a = 12;
        int count =0;
        for (int i = 1 ; i <= a  ; i++) {
            if (a % i == 0 ){
                count++;
            }

        }
        System.out.println (count);
    }
}
