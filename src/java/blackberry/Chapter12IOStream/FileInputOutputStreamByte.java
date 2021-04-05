package blackberry.Chapter12IOStream;

import org.junit.Test;

import java.io.*;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 4/5/21 10:35 AM
 * Create By IntelliJ IDEA
 */
public class FileInputOutputStreamByte {
    /*
        测试FileInputSteam和FileOutputStream的使用。
        总结：
            1、对于文本文件（.txt,.java,.c,.cpp），可以使用字符流来处理
            2、对于非文本文件（.jpg,.mps,.mp4,.avi,.ppt），就可以使用字节流来处理
            3、如果是文本文件只想复制一下，不在内存层面去读出来，用字节流也是可以的，读出来的话可能会出现乱码（中文的情况）
            4、但是反过来对于非文本，也不能使用字符流去复制
     */

    //  使用hello.txt来测试字节流FileOutputStream
    //  注意这里能够正确的读取，是因为hello.txt文件里面的都是英文一个字节存的，如果是汉字就是两个字节存的
    //  如果在里面加入中文就会出现乱码，因为在UTF-8里面一个汉字是用3个字节存的
    //  使用FileOutputStream来处理文本文件可能会出现乱码
    @Test
    public void testFileInputStream(){
        //  1、造文件
        FileInputStream fileInputStream = null;
        try {
            File file = new File ("hello.txt");
            //  2、造流
            fileInputStream = new FileInputStream (file);

            //  3、读取数据，byte数组用来存每次读到的数据，len,用来记录每次读取的字节的个数
            byte[] buffer = new byte[5];
            int len;
            while ((len = fileInputStream.read (buffer)) != -1){
                //  4、输出读取到的数据
                String s = new String (buffer, 0, len);
                System.out.print (s);

                //  testclassdidi��国���
            }
            //5、关闭流
        } catch (IOException e) {
            e.printStackTrace ();
        } finally {
            try {
                fileInputStream.close ();
            } catch (IOException e) {
                e.printStackTrace ();
            }
        }

    }
    //  使用字符流来进行对比
    @Test
    public void testReader(){
        FileReader fileReader = null;
        try {
            fileReader = new FileReader ("hello.txt");
            char[] cbuf = new char[5];
            int len;
            while ((len = fileReader.read (cbuf)) != -1){
//                System.out.println (cbuf);
                String s = new String (cbuf, 0, len);
                System.out.print (s);
                //  testclassdidi中国人,使用字符流，就能够将中文正确输出
            }
        } catch (IOException e) {
            e.printStackTrace ();
        } finally {
            try {
                fileReader.close ();
            } catch (IOException e) {
                e.printStackTrace ();
            }
        }
    }

    //  指定路径下文件的复制操作方法，输入源文件路径，输出到目标路径
    public void copyFile(String srcFile,String  destFile){
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream (new File (srcFile));
            fileOutputStream = new FileOutputStream (new File (destFile));
            byte[] buffer = new byte[5];
            int len;
            while ((len = fileInputStream.read (buffer))!=-1){
                fileOutputStream.write (buffer,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace ();
        } finally {
            try {
                fileOutputStream.close ();
            } catch (IOException e) {
                e.printStackTrace ();
            }
            try {
                fileInputStream.close ();
            } catch (IOException e) {
                e.printStackTrace ();
            }
        }

    }

    @Test
    public void testCopyFileMethod(){
        long start = System.currentTimeMillis ();

        //  这个CopyFile方法里面虽然是使用的字节流，但是如果只是复制的话，是可以正常复制的，不进行输出即可。
        //  因为如果在内存层面对数据进行读取就会出现错误

        //  但是反过来，如果是非文本文件，想用字符流去读取，中间过程即使不看，也是不能完成复制操作的
        String srcPath = "hello.txt";
        String destPath = "helloCopyFileMethod.txt";
        copyFile (srcPath,destPath);
        long end = System.currentTimeMillis ();
        System.out.println ("copy time:"+(end-start));
    }
}
