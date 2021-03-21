package blackberry.Chapter12IOStream.Stream;

import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterTest1 {
    /*
        从内存中写出数据到硬盘的文件里
        说明：
            1、输出操作：对应的File可以不存在的，并不会报异常
                        如果不存在，在输出的过程中，会自动创建此文件
                        如果存在：
                            如果流使用的构造器是：FileWriter(file,false)/FileWriter(file):就是对原有文件的覆盖
                            如果流使用的构造器是：FileWriter(file,true)：不会对原有我呢见覆盖，而是在原有文件基础上继续写入


     */
    @Test
    public void test() throws IOException {
        //  1、提供file类的对象，指明写出到的文件
        //      注意在写入的时候，如果该文件不存在则会自动创建，如果存在在写入的时候会覆盖掉之前的内容
        File file = new File("hi.txt");

        //  2、提供FileWriter的对象，用于数据的写出
        FileWriter fileWriter = new FileWriter(file);

        //  3、写出数据
        fileWriter.write("I have a dream!");
        fileWriter.write("XXX");

        //  4、资源的关闭操作
        fileWriter.close();


    }

    @Test
    public void test3() {
        FileReader fileReader = null;
        FileWriter fileWriter = null;
        try {
            //  1、创建File类的对象，指明读入和写出的文件
            File srcFile = new File("hello.txt");
            File destFile = new File("new.txt");

            //  2、创建输入流和输出流的对象
            fileReader = new FileReader(srcFile);
            fileWriter = new FileWriter(destFile);

            //  3、数据的读入和写入操作
            char[] cbuf = new char[5];
            int length; //  用来记录每次读入到cbuf数组中的字符的个数
            //  return the number of characters read, or -1 if the end of the stream has been reached
            while ((length = fileReader.read(cbuf)) != -1) {
                //  将每次读入的cbuf数组，写出到
                fileWriter.write(cbuf, 0, length);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //  4、关闭资源
            //  写法一：
//            try {
//                fileWriter.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }finally {
//
//                try {
//                    fileReader.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }

            //  写法二：
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }


    }

    //  使用字符流来测试照片:
    /*
        不能使用字符流来处理图片等字节数据数据
     */
    @Test
    public void test4() {
        FileReader fileReader = null;
        FileWriter fileWriter = null;
        try {
            //  1、创建File类的对象，指明读入和写出的文件
            File srcFile = new File("QQ图片20210312214503.jpg");
            File destFile = new File("newPic.jpg");

            //  2、创建输入流和输出流的对象
            fileReader = new FileReader(srcFile);
            fileWriter = new FileWriter(destFile);

            //  3、数据的读入和写入操作
            char[] cbuf = new char[5];
            int length; //  用来记录每次读入到cbuf数组中的字符的个数
            //  return the number of characters read, or -1 if the end of the stream has been reached
            while ((length = fileReader.read(cbuf)) != -1) {
                //  将每次读入的cbuf数组，写出到
                fileWriter.write(cbuf, 0, length);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //  4、关闭资源
            //  写法一：
//            try {
//                fileWriter.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }finally {
//
//                try {
//                    fileReader.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }

            //  写法二：
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }


    }
}
