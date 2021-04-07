package blackberry.Chapter13IOStream.Stream;

import org.junit.Test;

import java.io.*;

/**
 *  处理流二：转换流的使用
 *  1、转换流属于字符流
 *      InputStreamReader
 *      OutputStreamWriter
 *  2、作用：转换流提供了字节流和字符流之间的转换
 *
 *  3、解码：字节、字节数组------------>字符数组、字符串
 *     编码：字符数组、字符串---------->字节、字节数组
 *
 *  4、字符集
 *
 */


public class ConversionStream {
    @Test
    public void test1() throws IOException {
        /*
            转换流：
                转换流提供了字节流和字符流之间的转换
                Java API 提供了两个转换流：
                    InputStreamReader :将一个字节的InputStream转换为字符的Reader
                    OutputStreamWriter：将一个字符的Writer转换为字节的OutputStream

                字节流中的数据都是字符时，转换成字符操作更高效

         */

        FileInputStream fileInputStream = new FileInputStream("hello.txt");
//        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);   //  使用系统默认的字符集
        //  参数2指明了字符集，具体使用哪个字符集，取决于文件hello.txt保存的时候使用的字符集
        InputStreamReader inputStreamReader1 = new InputStreamReader(fileInputStream,"UTF-8");
        char[] cbuf = new char[20];
        int len;
        while ((len = inputStreamReader1.read(cbuf))!=-1){
            String str= new String(cbuf,0,len);
            System.out.print(str);

        }
        inputStreamReader1.close();

    }


}
