package lanqiaobei;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 4/14/21 10:02
 * Create By IntelliJ IDEA
 */
public class Real2 {
    public static void main (String[] args) {
        int a = 2019;
        long count = 0;
//        for (long i = 1 ; i <= a ; i++) {
//            if (i % 10 == 0 || i % 10 == 1 || i % 10 == 2 || i % 10 == 9 || i / 10 == 1 || i / 10 == 2||i/10==9
//                ||i/100==1||i/100==2||i/100==9||i/1000==1||i/1000==2||i/1000==9) {
//                System.out.println (i);
//                count+= i*i*i;
//
//            }
//        }
//        System.out.println (count);

        for (long i = 0 ; i <=a ; i++) {
            if (i % 10 == 0 || i % 10 == 1 || i % 10 == 2 || i % 10 == 9) {
                count += i * i * i;
                continue;
            }
            if (i >=10) {
                if ((i / 10) % 10 == 0 || (i / 10) % 10 == 1 || (i / 10) % 10 == 2 || (i / 10) % 10 == 9) {
                    count += i * i * i;
                    continue;
                }
            }
            if (i >=100) {
                if ((i / 100) % 10 == 0 || (i / 100) % 10 == 1 || (i / 100) % 10 == 2 || (i / 100) % 10 == 9) {
                    count += i * i * i;
                    continue;
                }
            }
            if (i>=1000){
                if ((i/1000 )% 10 == 0 || (i/1000 )% 10 == 1 || (i/1000 )% 10 ==2 || (i/1000 )% 10 == 9 ){
                    count+=i*i*i;
                }
            }
        }
        System.out.println (count);
    }
}
