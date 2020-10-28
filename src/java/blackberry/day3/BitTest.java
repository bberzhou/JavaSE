package blackberry.day3;

/**
 * @author bberzhou@gmail.com
 * @date 3/23/20 10:18
 * Create By IntelliJ IDEA
 */
public class BitTest {
    public static void main (String[] args) {
        /*
            运算符五：位运算符
                位运算符都是操作的整型的数据，
                <<：在一定范围内，每向左移动1位，相当于*2
                >>：在一定范围内，向右移动1位，相当于 /2
                面试题：最高效的计算2*8的计算方式。2<<3 或者8<<1

                >>>无符号右移，被移位二进制最高位无论是0还是1，空缺位都是用0填充
         */
        int i = 21;
        System.out.println ("i<<1:" + (i << 2)); //  21 *2的2次方

        int m = 12;
        int n = 5;
        System.out.println ("m & n:" + (m & n));   //  m & n:4 看二进制
        System.out.println ("m | n:" + (m | n));   //  m | n:13
        System.out.println ("m ^ n:" + (m ^ n));   //  m ^ n:9

        //  ^   取反 相同二进制位进行^运算，结果是0: 1^1=0 0^0=0；不同二进制位^运算结果是1 1^0=1,0^1=1
        //


    }
}
