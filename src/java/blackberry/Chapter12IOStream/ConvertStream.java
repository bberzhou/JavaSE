package blackberry.Chapter12IOStream;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 3/29/21 9:03 PM
 * Create By IntelliJ IDEA
 */
public class ConvertStream {
    /*
        处理流二：转换流的使用
            1、转换流：属于字符流
                inputStreamReader:将一个字节的输入流转换为字符的输入流------>解码
                outputStreamWriter:将一个字符的输出流转换为字节的输出流------>编码

            2、作用：提供字节流与字符流之间的转换


            3、解码：字节、字节数组------->字符数组、字符串
               编码：字符数组、字符串----->字节、字节数组

            4、字符集
     */

    @Test
    public  void test() throws FileNotFoundException, UnsupportedEncodingException {
        FileInputStream fileInputStream = new FileInputStream ("hello.txt");
//        InputStreamReader inputStreamReader = new InputStreamReader (fileInputStream);  使用系统默认的字符编码
        //  参数二：指明了字符集
        InputStreamReader inputStreamReader = new InputStreamReader (fileInputStream,"UTF-8");



    }













}
