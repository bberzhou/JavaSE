package blackberry.day6Array;

/**
 * @author bberzhou@gmail.com
 * @date 7/29/19 15:10
 * Create By IntelliJ IDEA
 */
public class yiweiArray {
    /*
        1。数组是多个相同类型数据的组合，实现对这些数据的统一管理。
        2。数组中的元素可以是任何数据类型，包括基本数据类型和引用数据类型
        3。数组属于引用数据类型，数组型数据是对象(day5)，数组中的每个元素相当于改对象的成员变量

        基本数据类型：
        整型：byte,short,int long
        浮点型，float，double
        字符型：char
        布尔型：boolean

        引用数据类型：数组，类，接口，String 字符串
        值传递的时候，将实参的值，copy一份给形参。
        引用传递的时候，将实参的地址值，copy一份给形参。

     */
    public static void main (String[] args) {
        // 1。 数组的声明
        String[] names;
        int[] scores;

        // 2。 静态初始化：初始化数组与数组元素赋值同时进行
        names = new String[]{"nnn", "shkjs", "saisljd"};


        //  第二种动态初始化：初始化数组与数组元素赋值分开进行，但是可以初始化数组
        scores = new int[4];

        //  3。如何调用相应的数组元素：采用元素下标的方式,且是从0开始的到n-1结束

        scores[0] = 80;
        scores[1] = 20;

        //  4。数组的长度，通过数组的length属性
        System.out.println (scores.length);  // 4

        // 5。数组的遍历
        for (int i = 0 ; i < scores.length ; i++) {
            System.out.println (scores[i]);

        }

        //6。对于byte,short，int,long而言，创建数组后默认值为0(数组元素是整形)
        //  对于float,double默认值是0.0
        //  char 默认值为0,不是'0'(像是空格)，应该是对应ascii码 '\u0000',
        //  boolean默认为:false
        //  数组元素是引用数据类型默认值为:null string类型就属于引用数据类型
        boolean[] b = new boolean[2];
        System.out.println (b[1]);   //false

        String[] str = new String[5];
        System.out.println (str[0]);


        //  数组一旦初始化，长度是不可以改变得,长度就确定了
        //  错误的写法

//        int[] arr = new int[];
//        int[] arr=new int[3]{3,4,1,3};
//        int[5] arr2 = new int[5];


        System.out.println ("---------------");
        //  boolean类型默认值是false
        boolean[] bol = new boolean[5];
        System.out.println (bol[2]);

    }

}
