package blackberry.Chapter12IOStream.Buffered;

import org.junit.Test;

import java.io.*;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 4/5/21 1:58 PM
 * Create By IntelliJ IDEA
 */
public class BufferFlow {
    /*
       1、 缓冲流：
            BufferedInputStream
            BufferedOutputStream
            BufferedWriter
            BufferedReader
       2、缓冲流的作用：提高流的读取、写入的速度
            提高读写速度的原因是：内部提供了一个缓冲区，默认情况下是8192
       3、处理流就是套接在已有的流的基础上
     */

    /*
        1、使用缓冲流实现非文本文件复制的操作
     */
    @Test
    public void test1 () {
        //  1、造文件
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            File srcFile = new File ("Photo.jpg");
            File destFile = new File ("PhotoBuffered.jpg");
            //  因为处理流是作用于节点流之上的
            //  2、造流
            //2.1 造节点流
            FileInputStream fileInputStream = new FileInputStream (srcFile);
            FileOutputStream fileOutputStream = new FileOutputStream (destFile);

            //2.2 造处理流--缓冲流
            bufferedInputStream = new BufferedInputStream (fileInputStream);
            bufferedOutputStream = new BufferedOutputStream (fileOutputStream);


            //  3、复制的细节：读取和写入
            byte[] buffer = new byte[10];
            int len;
            while ((len = bufferedInputStream.read (buffer)) != -1) {
                bufferedOutputStream.write (buffer,0,len);

            }
        } catch (IOException e) {
            e.printStackTrace ();
        } finally {
            //  4、关闭流
            //      要求。要先关闭外层的流，再关闭内层的流
            //      说明：关闭外层流的同时，内层的流也会自动的进行关闭。所以内层流就可以直接省略
            try {
                bufferedOutputStream.close ();
            } catch (IOException e) {
                e.printStackTrace ();
            }
            try {
                bufferedInputStream.close ();
            } catch (IOException e) {
                e.printStackTrace ();
            }
        }

    }

    //  使用缓冲流来实现文件复制的方法
    public void copyFileWithBuffered(String srcFile, String destFile){
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            //  1、造文件和节点流
            FileInputStream fileInputStream = new FileInputStream (new File (srcFile));
            FileOutputStream fileOutputStream = new FileOutputStream (new File (destFile));

            //  2、造处理流
            bufferedInputStream = new BufferedInputStream (fileInputStream);
            bufferedOutputStream = new BufferedOutputStream (fileOutputStream);

            //  3、数据的具体操作
            byte[] buffer = new byte[10];
            int len;
            while ((len = bufferedInputStream.read (buffer)) != -1){
                bufferedOutputStream.write (buffer,0,len);
//                bufferedOutputStream.flush ();    flush()方法用来刷新缓冲区
            }
        } catch (IOException e) {
            e.printStackTrace ();
        } finally {
            try {
                bufferedOutputStream.close ();
            } catch (IOException e) {
                e.printStackTrace ();
            }
            try {
                bufferedInputStream.close ();
            } catch (IOException e) {
                e.printStackTrace ();
            }
        }
    }

        // 测试copyFileWithBuffered()方法
    @Test
    public void testcopyFileWithBuffered(){
        long start = System.currentTimeMillis ();

        String srcFile = "";
        String destFile = "";
        copyFileWithBuffered (srcFile,destFile);
        long end = System.currentTimeMillis ();

        System.out.println("复制操作时间："+(end-start));

    }






















}
