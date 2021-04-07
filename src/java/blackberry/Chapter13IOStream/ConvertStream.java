package blackberry.Chapter13IOStream;

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
                InputStreamReader:将一个字节的输入流转换为字符的输入流------>解码
                OutputStreamWriter:将一个字符的输出流转换为字节的输出流------>编码

            2、作用：提供字节流与字符流之间的转换


            3、解码：字节、字节数组------->字符数组、字符串
               编码：字符数组、字符串----->字节、字节数组

            4、字符集
                ASCII：美国标准信息交换码，用一个字节的7位就可以表示
                ISO8859：拉丁码表，欧洲码表，用一个字节的8位就可以表示
                GB2312：中文编码表，最多两个字节编码所有的字符。注意是最多，并不是所有都是两个字节，看首位是否为0，
                        为0表示一个字节可以表示，为1就表示一个字节不够，需要两个字节来进行表示
                GBK：国标，融合了更多的中文文字符合，最多两个字符编码
                Unicode：国际标准码，融合了目前所有的字符，为每个字符分配了唯一的字符码，所有的文字都用两个字节来表示
                        为了解决跟上面两个一样的问题，
                UTF-8：变长的编码方式，可以用1-4个字节来表示一个字符，修正后也可能用6个字节来表示
                        e.g 0XXXXXXX        一个字节表示
                            110XXXXX 10XXXXXX 两个字节表示
                            1110XXXX 10XXXXXX 10XXXXXX  三个字节来表示汉字
                            11110XXX 10XXXXXX 10XXXXXX 10XXXXXX 四个字节来表示
                        比如十六进制：e5b09a，转换成2进制为：111001011011000010011010，此时使用UTF-8就需要四个字节来存储
                        存的时候的方式
                        1110 0101 1011 0000 1001 1010





     */

    /*
        InputStreamReader的使用，实现字节的输入流到字符的输入流的转化
        在处理异常的时候，仍然应该使用try-catch-finally

     */
    @Test
    public  void test() throws IOException {
        //  写法一：直接省略File
//        FileInputStream fileInputStream = new FileInputStream ("hello.txt");
        //  写法二：将File传入到FileInputStream，然后读入字节流转换为字符流
        FileInputStream fileInputStream = new FileInputStream (new File ("hello.txt"));
//        InputStreamReader inputStreamReader = new InputStreamReader (fileInputStream);  使用系统默认的字符编码
        //  参数二：指明了所使用的字符集
        //  An InputStreamReader is a bridge from byte streams
        //  to character streams: It reads bytes and decodes them
        //  into characters using a specified charset.

//        InputStreamReader inputStreamReader = new InputStreamReader (fileInputStream,"GBK");
        InputStreamReader inputStreamReader = new InputStreamReader (fileInputStream,"UTF-8");
        char[] cbuf = new char[20];
        int len;
        while ((len=inputStreamReader.read (cbuf)) != -1){
            String str = new String (cbuf,0,len);
            System.out.print (str);
            //  testclassdidi中国人

            //  如果在charSet设置为GBK就会出现乱码的情况，原因是是因为hello.txt默认是使用的UTF-8的格式
            //  testclassdidi涓浗浜�
        }
        inputStreamReader.close ();
    }

    /*
        综合使用InputStreamReader和OutputStreamWriter
        输入是UTF-8,输出为gbk
     */
    @Test
    public void test1() throws IOException {
        //  1、第一步：造文件，造流
        File file = new File ("hello.txt");
        File file1 = new File ("hello_GBK.txt");
        //  2、节点流
        FileInputStream fileInputStream = new FileInputStream (file);
        FileOutputStream fileOutputStream = new FileOutputStream (file1);
        //  3、转换流
        InputStreamReader inputStreamReader = new InputStreamReader (fileInputStream,"UTF-8");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter (fileOutputStream,"gbk");
        //  4、数据的读取具体操作
        char[] cbuf = new char[20];
        //  5、读写过程
        int len;
        while ((len = inputStreamReader.read (cbuf))!= -1){
            outputStreamWriter.write (cbuf,0,len);
        }
        //  第三步，关闭资源
        inputStreamReader.close ();
        outputStreamWriter.close ();

        //  此时打开hello_GBK文件就可以看到已经乱码了，testclassdidi�й���
    }

    //  读取以gbk格式存储的文件hello_GBK.txt，并输出到控制台
    @Test
    public void testInputStreamReader(){
        InputStreamReader inputStreamReader = null;
        try {
            File file = new File ("hello_GBK.txt");
            FileInputStream fis = new FileInputStream (file);
            inputStreamReader = new InputStreamReader (fis,"gbk");
            char[] cbuf = new char[5];
            int len;
            while ((len = inputStreamReader.read (cbuf)) != -1){
                String s = new String (cbuf, 0, len);
                System.out.print (s);
            }
        } catch (IOException e) {
            e.printStackTrace ();
        } finally {
            try {
                inputStreamReader.close ();
            } catch (IOException e) {
                e.printStackTrace ();
            }
        }
    }








}
