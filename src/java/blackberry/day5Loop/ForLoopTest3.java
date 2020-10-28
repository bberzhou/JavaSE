package blackberry.day5Loop;

/**
 * @author bberzhou@gmail.com
 * @date 3/29/20 10:01
 * Create By IntelliJ IDEA
 */
public class ForLoopTest3 {
    /*
        输出1000以内的水仙花数，其各个位上的数字的立方和等于其本身
        例如：153=1*1*1+3*3*3+5*5*5

     */
    public static void main (String[] args) {
        for (int i = 100 ; i < 1000 ; i++) {
            int baiwei = i / 100;
            int shiwei = (i % 100) / 10;
            int gewei = i - baiwei * 100 - shiwei * 10;
            if (i == baiwei * baiwei * baiwei + shiwei * shiwei * shiwei + gewei * gewei * gewei) {
                System.out.println ("水仙花数:" + i);
            }


        }
    }

}
