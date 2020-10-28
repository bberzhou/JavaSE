package blackberry.day2;

/**
 * @author bberzhou@gmail.com
 * @date 3/21/20 11:32
 * Create By IntelliJ IDEA
 */
public class DataType {
    /**
     * Java数据类型：
     * 一、 基本数据类型
     * 1.数值型：byte short int long
     * byte 1字节=8bit -128～127
     * int 4字节
     * long 8字节
     * <p>
     * 2.浮点型：float(单精度)4字节 double（双精度)8字节 Java默认为double
     * 3.字符型：char （一个字符两个字节）
     * 4.布尔型：boolean
     * <p>
     * 二、 引用数据类型：
     * 1.类：class  字符串属于这里String
     * 2.接口：interface
     * 3.数组{[]}
     * 三、变量在类中声明的位置
     * 成员变量和局部变量
     * <p>
     * 整型常量默认为int型
     */
    public static void main (String[] args) {
        char t = 'A';
        long l = 1234;
        System.out.println (t);
        System.out.println (l);
        char c = '\u0043';
        System.out.println (c);
        //  \n 换行 \t制表符

        System.out.println ("你好啊\"");
    }
}
