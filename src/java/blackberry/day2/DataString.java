package blackberry.day2;

/**
 * @author bberzhou@gmail.com
 * @date 3/21/20 15:12
 * Create By IntelliJ IDEA
 */
public class DataString {
    /**
     * String 属于引用数据类型，可以和8种基本数据类型做运算，连接运算+ 运算结果任然是String类型的
     */
    public static void main (String[] args) {
        String name = "lim";
        int id = 234;
        String s = name + id;
        System.out.println (s);
        //  练习
        char c = 'a';
        int num = 10;
        String str = "hello";
        System.out.println (c + num + str);//   107hello
        System.out.println (c + str + num);//   ahello10
        System.out.println (c + (num + str));// a10hello
        System.out.println ((c + num) + str);// 107hello
        System.out.println (str + num + c);//   hello10a
        //  二进制的负数，先看二进制负数的原码，然后除了符号位各个位取反变为反码，反码再加1就变为该负数的的补码

    }
}
