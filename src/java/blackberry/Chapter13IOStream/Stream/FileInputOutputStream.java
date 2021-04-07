package blackberry.Chapter13IOStream.Stream;

import org.junit.Test;

import java.io.*;

public class FileInputOutputStream {
    /*
        测试字节流：InputStream和OutputStream
        1、对于文本文件(.txt,.c , .java , .cpp)，使用字符流处理
        2、对于非文本文件(.jpg, .mp3, .doc , .ppt)，使用字节流处理


     */

    //  用字节流来处理文本数据hello.txt，用字节流FileInputStream处理文本文件，可能出现乱码
    @Test
    public void test() throws IOException {
        //  1、造文件
        File file = new File("hello.txt");

        //  2、造流
        FileInputStream fileInputStream = new FileInputStream(file);

        //  3、读数据
        byte[] buffer = new byte[5];        //  字节数组
        int len;    // 记录每次读取的字节的个数
        while ((len = fileInputStream.read(buffer)) !=-1){
            String  str = new String(buffer,0,len);
            System.out.print(str);

            //  输出结果：I have a dream! you are the truth
            //  这里没报错是因为，数字和字母都是一个byte存的，而汉字在UTF-8里面需要三个byte进行存储
        }
        //  4、关闭资源
        fileInputStream.close();
    }

    //  使用字节流实现对照片的复制
    @Test
    public void test1() throws IOException {
        //  1、造文件
        File srcFile = new File("QQ图片20210312214503.jpg");
        File destFile = new File("newSrc.jpg");

        //  2、造流
        FileInputStream fis = new FileInputStream(srcFile);
        FileOutputStream fos = new FileOutputStream(destFile);

        //  3、复制的过程
        byte[] buffer = new byte[5];
        int len;
        while ((len = fis.read(buffer)) != -1){
            fos.write(buffer,0,len);
        }

        //  关闭流
        fos.close();
        fis.close();
    }
    //  一个方法来实现指定路径下的文件的复制操作
    public static void copy(String srcPath, String destPath){

        //  1、造文件
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            File srcFile = new File(srcPath);
            File destFile = new File(destPath);

            //  2、造流
            fis = new FileInputStream(srcFile);
            fos = new FileOutputStream(destFile);

            //  3、复制的过程
            byte[] buffer = new byte[1024];
            int len;
            while ((len = fis.read(buffer)) != -1){
                fos.write(buffer,0,len);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //  关闭流
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }

    //  测试复制一个视频
    @Test
    public void test2CopyVideoFile(){
        long start = System.currentTimeMillis();
        copy("C:\\Users\\laboratory\\Videos\\1.mkv","C:\\Users\\laboratory\\Videos\\cpoy.mkv");
        long end = System.currentTimeMillis();
        System.out.println("复制花费的时间为："+(end-start));

        //  复制花费的时间为：685

    }

    //  这个方法虽然是字节流，但是在复制的时候，不用写读取内部的数据，
    //  所以就可以直接将文件复制过去
    @Test
    public void testCopyFileText(){
        long start = System.currentTimeMillis();
        copy("hello.txt","copyMethodTest.txt");
        long end = System.currentTimeMillis();
        System.out.println("复制花费的时间为："+(end-start)+"ms");
    }

}


