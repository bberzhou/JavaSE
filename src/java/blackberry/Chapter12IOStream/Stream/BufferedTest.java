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

    //--------------------------------------------------
    /*
            使用BufferedReader和BufferedWriter来实现文本文件的复制
     */
    @Test
    public void testBufferedReaderBufferedWriter() throws IOException {
        //  这是使用字节流需要创的问价
//        //  1、造文件
//        File srcFile = new File("");
//        File destFile = new File("");
//
//        //  2、造节点流
//        FileInputStream fis = new FileInputStream(srcFile);
//        FileOutputStream fos = new FileOutputStream(destFile);
//
//        //  3、造缓冲流
//        BufferedInputStream  bis = new BufferedInputStream(fis);
//        BufferedOutputStream bos = new BufferedOutputStream(fos);
//        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(new File("")));
//        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream( new File("")));





        //  下面是使用BufferedReader和BufferedWriter
//        //  1、造文件
//        File srcFile = new File("");
//        File destFile = new File("");
//
//        //  2、造节点流,注意Reader和Writer对应的节点流是FileReader和FileWriter
//        FileReader fr = new FileReader(srcFile);
//        FileWriter fw = new FileWriter(destFile);
//
//        //  3、缓冲流,他们所对应的缓冲流分别是*BufferedReader   *BufferedWriter
//        BufferedReader bufferedReader = new BufferedReader(fr);
//        BufferedWriter bufferedWriter = new BufferedWriter(fw);

        //  也可以写成匿名类的形式，造文件造流
        BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("new.txt")));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File("newWithBufferReader.txt")));

        //  文件的读写操作,这里的BufferedReader和BufferedWriter是字符流，所以需要使用字符数组
        char[] cbuf = new char[1024];
        int len;
        while ((len = bufferedReader.read(cbuf)) != -1){
            bufferedWriter.write(cbuf,0,len);
            //  默认的缓冲区足够大，没必要再刷新
//            bufferedWriter.flush();
        }

        //  关闭资源
        bufferedWriter.close();
        bufferedReader.close();


    }
    @Test
    public void testBufferedReaderBufferedWriter2() throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("new.txt")));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File("newWithBufferReader2.txt")));

        //  文件的读写操作,这里的BufferedReader和BufferedWriter是字符流，所以需要使用字符数组
        //  方式一：使用的char型数组
//        char[] cbuf = new char[1024];
//        int len;
//        while ((len = bufferedReader.read(cbuf)) != -1){
//            bufferedWriter.write(cbuf,0,len);
//            //  默认的缓冲区足够大，没必要再刷新
////            bufferedWriter.flush();
//        }

        //  方式二：使用bufferedReader.readLine(String )
        //  bufferedReader.readLine()方法
        //  @return     A String containing the contents of the line, not including
        //     *             any line-termination characters, or null if the end of the
        //     *             stream has been reached
        String data;
        while ((data = bufferedReader.readLine()) != null){
            //  方法一：
//            bufferedWriter.write(data); //  注意的是返回值里面不包括任何的换行符
            //  注意这个bufferedReader.readLine()方法不会识别换行符，所以如果有需要自己添上
            //  注意看文件newWithBufferReader2.txt和newWithBufferReader.txt的区别

            //  方法二：自己加上换行符的两种方式
//            bufferedWriter.write(data+"\n");
            //  或者使用自带的方法加上换行符
            bufferedWriter.write(data);
            bufferedWriter.newLine();   //newLine()方法的作用就是提供换行的操作

        }
        //  关闭资源
        bufferedWriter.close();
        bufferedReader.close();



    }

}
