package blackberry.Chapter12IOStream.Stream;

import org.junit.Test;

import java.io.*;

public class BufferedTest {
    /*
        处理流之一：缓冲流的使用
            1.缓冲流
                 BufferedInputStream------------------》 FileInputStream
                 BufferedOutputStream----------------->  FileOutputStream
                 BufferedReader------------------------》 FileReader
                 BufferedWriter-----------------------》  FileWriter

             2、缓冲流的作用：提供流的读取、写入的速度
                提高读写速度的原因：内部提供了一个缓冲区       ：DEFAULT_BUFFER_SIZE = 8192;

             3、处理流，比如缓冲流*BufferedInputStream
                                *BufferedOutputStream
                                *BufferedReader
                                *BufferedWriter 都是”套接“在已有的流的基础上的

     */


    /*
     实现非文本文件的复制
    */
    @Test
    public void test() throws IOException {
        //  1、造文件
        FileInputStream fis = null;
        FileOutputStream fos = null;
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            File srcFile = new File("QQ图片20210312214503.jpg");
            File destFile = new File("节点流测试.jpg");

            //  2、造流，因为BufferedInputStream、BufferedOutputStream是缓冲流，
            //  不能直接作用与文件，所以还需要节点流
            fis = new FileInputStream(srcFile);
            fos = new FileOutputStream(destFile);

            //  3、缓冲流
            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);

            //  复制细节：读取和写入的过程
            //  读取资源，创建一个字节数组
            byte[] buffer = new byte[10];
            //  用len记录读取的长度，
            //  read() return the total number of bytes read into the buffer,
            //  or -1 if there is no more data because the end of the stream has been reached.
            int len;
            while ((len = bis.read(buffer)) != -1){
                //  将读取到的字节写入到BufferedOutputStream
                bos.write(buffer, 0, len);

                //  bos.flush()，刷新缓冲区，清空缓冲区的数据/** Flush the internal buffer */
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        //  写入完毕，资源关闭，
        //  关闭时要注意，先关闭外层的流，再关闭内层的流
        bos.close();
        bis.close();

        //  说明：当我们在关闭外层流的同时，内层流也会自动的进行关闭，关于内层流的关闭，我们也可以省略
        fos.close();
        fis.close();
        }
    }

//    //  使用缓冲流复制文件的方法
//    public void copyFileWithBuffered(String srcPath, String destPath){
//        //  1、造文件
//        FileInputStream fis = null;
//        FileOutputStream fos = null;
//        BufferedInputStream bis = null;
//        BufferedOutputStream bos = null;
//        try {
//            File srcFile = new File(srcPath);
//            File destFile = new File(destPath);
//
//            //  2、造流，因为BufferedInputStream、BufferedOutputStream是缓冲流，
//            //  不能直接作用与文件，所以还需要节点流
//            fis = new FileInputStream(srcFile);
//            fos = new FileOutputStream(destFile);
//
//            //  3、缓冲流
//            bis = new BufferedInputStream(fis);
//            bos = new BufferedOutputStream(fos);
//
//            //  复制细节：读取和写入的过程
//            //  读取资源，创建一个字节数组
//            byte[] buffer = new byte[10];
//            //  用len记录读取的长度，
//            //  read() return the total number of bytes read into the buffer,
//            //  or -1 if there is no more data because the end of the stream has been reached.
//            int len;
//            while ((len = bis.read(buffer)) != -1){
//                //  将读取到的字节写入到BufferedOutputStream
//                bos.write(buffer, 0, len);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            //  写入完毕，资源关闭，
//            //  关闭时要注意，先关闭外层的流，再关闭内层的流
////            bos.close();
////            bis.close();
//
//            //  说明：当我们在关闭外层流的同时，内层流也会自动的进行关闭，关于内层流的关闭，我们也可以省略
//            try {
//                fos.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            try {
//                fis.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//    }

    //  使用缓冲区复制文件的方法
    public void copyFileWithBuffered(String srcPath, String destPath) throws IOException {
        //  1、创建文件，
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            File srcFile = new File(srcPath);
            File destFile = new File(destPath);
            //  2、创建节点流
            FileInputStream fis = new FileInputStream(srcFile);
            FileOutputStream fos = new FileOutputStream(destFile);

            // 3、创建缓冲流
            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);


            //  4、复制细节:读取，写入
            byte[] buffered = new byte[1024];
            int len;
            //  读取文件并复制
            while ((len = bis.read(buffered)) != -1){
                bos.write(buffered,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        bos.close();
        bis.close();

        }
        //  5、复制完毕，关闭源

    }

    @Test
    public void testCopyFileWithBuffered() throws IOException {
        long start = System.currentTimeMillis();
        copyFileWithBuffered("C:\\Users\\laboratory\\Videos\\1.mkv","C:\\Users\\laboratory\\Videos\\copyWithBuffered.mkv");
        long end = System.currentTimeMillis();
        System.out.println("复制花费的时间为："+(end-start)+"ms");
        //  复制花费的时间为：213ms,比FileInputOutputStream类里面的test2CopyVideoFile花费的时间更少
        //  685- 213
    }

}
