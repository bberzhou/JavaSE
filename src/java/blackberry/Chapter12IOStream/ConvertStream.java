package blackberry.Chapter12IOStream;

import org.junit.Test;

import java.io.*;

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
                ASCII：美国标准信息交换码
                ISO8859：拉丁码表
                GB2312：中文编码表
                GBK：国标，融合了更多的中文文字符合
                Unicode：国际标准码，融合了目前所有的字符
                UTF-8：变长的编码方式


     */

    /*
        InputStreamReader的使用，实现字节的输入流到字符的输入流的转化
     */
    @Test
    public  void test() throws IOException {
        FileInputStream fileInputStream = new FileInputStream ("hello.txt");
//        InputStreamReader inputStreamReader = new InputStreamReader (fileInputStream);  使用系统默认的字符编码
        //  参数二：指明了字符集
        InputStreamReader inputStreamReader = new InputStreamReader (fileInputStream,"UTF-8");
        char[] cbuf = new char[20];
        int len;
        while ((len=inputStreamReader.read (cbuf)) != -1){
            String str = new String (cbuf,0,len);
            System.out.print (str);
        }
        inputStreamReader.close ();
    }

    /*
        综合使用InputStreamReader和OutputStreamWriter
        输入是UTF-8,输出为gbk
     */
    @Test
    public void test1() throws IOException {
        //  第一步：造文件，造流
        File file = new File ("hello.txt");
        File file1 = new File ("hello_GBK.txt");
        FileInputStream fileInputStream = new FileInputStream (file);
        FileOutputStream fileOutputStream = new FileOutputStream (file1);
        InputStreamReader inputStreamReader = new InputStreamReader (fileInputStream,"UTF-8");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter (fileOutputStream,"GBK");
        char[] cbuf = new char[20];
        //  第二步：读写过程
        int len;
        while ((len = inputStreamReader.read (cbuf))!= -1){
            outputStreamWriter.write (cbuf,0,len);
        }
        //  第三步，关闭资源
        inputStreamReader.close ();
        outputStreamWriter.close ();
    }













}
