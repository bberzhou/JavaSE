package blackberry.day3;

/**
 * @author bberzhou@gmail.com
 * @date 3/21/20 17:53
 * Create By IntelliJ IDEA
 */
public class Plus {
    public static void main (String[] args) {
        //  左++先自增1再进行运算
        int a1 = 10;
        int b1 = ++a1;
        System.out.println ("a1:" + a1 + "\n" + "b1:" + b1);//a1:11  b1:11
        //  右++先进行运算再自增1
        int a2 = 10;
        int b2 = a2++;
        System.out.println ("a2:" + a2 + "\n" + "b2:" + b2);//a2:11  b2:10

        //  注意点
        short s1 = 10;
//        s1 = s1+1;编译报错,进行强转
        s1 = (short) (s1 + 1);
        s1++;// 自增1不会改变本身变量的数据类型

        byte b = 127;
        b++;
        System.out.println (b);//不会变成int 而是-128

        //  同理，左--先自减1后运算  右--先运算再自减1
        int a3 = 10;
        int b3 = a3--;
        System.out.println (a3); //9
        System.out.println (b3); //10
        int a4 = 10;
        int b4 = --a4;
        System.out.println (a4); //9
        System.out.println (b4); //9

    }
}
