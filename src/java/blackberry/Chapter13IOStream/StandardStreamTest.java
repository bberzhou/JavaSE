package blackberry.Chapter13IOStream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 4/6/21 08:05
 * Create By IntelliJ IDEA
 */
public class StandardStreamTest {
    /*
        标准输入输出流的练习，根据控制台输入的字符串，返回对应的类型
     */
    //  从键盘读取字符串的方法
    public static String readString(){
        //  System.in：从键盘读取，再用转换流转换成字符流
        InputStreamReader inputStreamReader = new InputStreamReader (System.in);
        //  用字符流读取
        BufferedReader bufferedReader = new BufferedReader (inputStreamReader);
        //  声明并初始化字符串
        String str = "";

        try {
            str = bufferedReader.readLine ();
        } catch (IOException e) {
            System.out.println (e);
        }
        //  返回从键盘读取到的字符串
        return str;
    }
    //  read an int value from the keyboard
    public static int readInt(){
        return Integer.parseInt (readString());
    }
    //  read a double value from the keyboard
    public static double readDouble(){
        return Double.parseDouble (readString ());
    }
    //  read a byte value from the keyboard
    public static byte readByte(){
        return Byte.parseByte (readString ());
    }
    //  read a long value from the keyboard
    public static long readLong(){
        return Long.parseLong (readString ());
    }
    //  read a short value from the keyboard
    public static short readShort(){
        return Short.parseShort (readString ());
    }
    //  read a float value from the keyboard
    public static float readFloat(){
        return Float.parseFloat (readString ());
    }
}
