package blackberry.Chapter12IOStream;

import org.junit.Test;

import java.io.*;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 3/31/21 8:37 PM
 * Create By IntelliJ IDEA
 */
public class FileReaderWriter1 {
    @Test
    public void test() throws IOException {
            /*
                从内存中写出数据到硬盘的文件里面
                说明：1。输出操作，对应的File可以不存在，并不会报异常，
                    2。
                        对应的File可以不存在，如果不存在在输出的过程中，会自动创建此文件
                        对应的file如果存在，
                            如果流使用的构造器是：fileWriter(file, false)/FileWriter（file）:就会对原有的文件覆盖掉
                            如果流使用的构造器是：fileWriter(file,True):不会对原有文件覆盖，而是在原有文件基础上追加


            */

        //  1、提供File类的对象，指明写出到的文件
        File file = new File ("hello1.text");

        //  2、提供FileWriter的对象，用于数据的写出
        FileWriter fileWriter = new FileWriter (file);

        //  3、写出数据的操作,注意write()方法不同的参数
//        fileWriter.write ("I have a ream");
        //  也可以传入一个字符数组
        fileWriter.write ("I have a dream");
        fileWriter.write ("you have a dream too");
        //  4、关闭流

        fileWriter.close ();
    }

    /*
        使用字符流将文件写进来读出去，将hello.txt里面的文件读入，并输出到新的文件helloWrite
        不能使用字符流来处理图片等字节数据
     */

    @Test
    public void test2() throws IOException {
        //  创建文件，并实例化对应的流
        FileReader fileReader = new FileReader (new File ("hello.txt"));
        FileWriter fileWriter = new FileWriter (new File ("helloWrite.txt"));
        //  定义一个字符数组
        char[] cbuf  = new char[5];
        //  记录每次读入到cbuf数组中的字符的个数
        int len;
        while ((len = fileReader.read (cbuf))!= -1){
            //  注意，不能直接把cbuf数组的内容写入
//            fileWriter.write (cbuf);
            //  应该每次读入多少个就写入多少个，
//            String str = new String (cbuf,0,len);
//            fileWriter.write (str);
            //  这里也可以用write的另外一个构造器方法
            fileWriter.write (cbuf,0,len);
        }
        //  关闭流
        fileWriter.close ();
        fileReader.close ();

    }

    //  使用字节流FileInputStream和FileOutputStream实现对Photo照片的复制操作
    @Test
    public void test3() throws IOException {
        //  实例化流
        FileInputStream fileInputStream = new FileInputStream (new File ("Photo.jpg"));
        FileOutputStream fileOutputStream = new FileOutputStream (new File ("PhotoCopy.jpg"));

        //  读取数据
        byte[] buffer = new byte[5];
        int len;    //  记录每次读取的字节的长度
        while ((len = fileInputStream.read (buffer)) != -1){
            String str = new String (buffer,0,len);
            System.out.print (str);

        }fileInputStream.close ();
        fileOutputStream.close ();

    }
}
