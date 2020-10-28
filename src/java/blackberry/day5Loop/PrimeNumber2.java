package blackberry.day5Loop;

/**
 * @author bberzhou@gmail.com
 * @date 3/29/20 18:33
 * Create By IntelliJ IDEA
 */
public class PrimeNumber2 {
    public static void main (String[] args) {
        /*
            输出100以内的质数

         */
        //  记录质数的个数
        int count = 0;
        //  获取当前时间的毫米数
        long startTime = System.currentTimeMillis ();
        //  遍历10000以内的自然数
        la:
        for (int i = 2 ; i < 10000 ; i++) {
            for (int j = 2 ; j < Math.sqrt (i) ; j++) {
                //  i能够被2到i-1之间的数整除
                if (i % j == 0) {
                    //  当能够除尽的时候，不用继续内层循环，直接跳转到外层的循环
                    //  如果没有执行这一行，表明没有能够被除尽的
                    continue la;
                }
            }
            //  表示质数的个数
            count++;
        }
        long endTime = System.currentTimeMillis ();
        System.out.println ("质数的个数：" + count);
        System.out.println ("所花费的时间：" + (endTime - startTime));
    }
}
