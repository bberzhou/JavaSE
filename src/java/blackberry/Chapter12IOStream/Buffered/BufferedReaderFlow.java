package blackberry.Chapter12IOStream.Buffered;

import org.junit.Test;

import java.io.*;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 4/5/21 4:07 PM
 * Create By IntelliJ IDEA
 */
public class BufferedReaderFlow {
    /*
        使用BufferedReader和BufferedWriter来进行文本文件的复制操作
     */
    @Test
    public void testBufferedReaderWriter(){
        //  1、造文件
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            File srcFile = new File ("hello.txt");
            File destFile = new File("helloBufferedReader.txt");

            //  2、字符流
            FileReader fr = new FileReader (srcFile);
            FileWriter fw = new FileWriter (destFile);

            //  3、处理流
            br = new BufferedReader (fr);
            bw = new BufferedWriter (fw);
            //  4、具体的数据读取操作
            //  方式一：使用char[]型数组
//            char[] cbuf = new char[5];
//            int len;
//            while ((len = br.read (cbuf)) != -1){
//                bw.write (cbuf,0,len);
//            }
            //  方式二：使用String
            //  readLine()方法：
//              @return  A String containing the contents of the line, not including
//              any line-termination characters, or null if the end of the stream has been reached
//            String data;
//            while ((data = br.readLine ()) != null){
//                bw.write (data);    //  data中不包含换行符
//            }
            //  方式三：使用String，并且能够换行的方法
            String data;
            while ((data = br.readLine ())!=null){
                bw.write (data);    //  data中不包含换行符，
                bw.newLine ();  //  提供换行的操作
            }

        } catch (IOException e) {
            e.printStackTrace ();
        } finally {
            try {
                assert bw != null;
                bw.close ();
            } catch (IOException e) {
                e.printStackTrace ();
            }
            try {
                br.close ();
            } catch (IOException e) {
                e.printStackTrace ();
            }
        }

    }
}
