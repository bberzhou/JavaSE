package blackberry.exercise;

/**
 * @author bberzhou@gmail.com
 * @date 4/4/20 09:13
 * Create By IntelliJ IDEA
 */
public class Wanshu {
    /*
        一个数如果恰好等于它的因子的和，这个数就成为完数，例如6 =1+2+3；
     */
    public static void main (String[] args) {

        for (int i = 1 ; i < 1000 ; i++) {
            // 定义一个变量输出完数,初始化为0,并且在每次内循环之后重置为0
            int factor = 0;
            //  找到i的所有约数，可以优化为 <=i/2
            for (int j = 1 ; j < i ; j++) {
                if (i % j == 0) {
                    factor += j;
                }
            }
            if (i == factor) {
                System.out.println (i);
            }
        }
    }

}
