package blackberry.Chapter12IOStream.Stream;

import org.junit.Test;

import java.io.*;

public class FileReaderWriterTest {
    /**
     *  一、流的分类：
     *      1、操作数据单位：字节流、字符流
     *      2、数据得流向：输入流、输出流
     *      3、流得角色：节点流和处理流
     *
     *
     *  二、流得体系结构
     *      抽象基类                    节点流（或文件流）                   缓冲流（处理流得一种）
     *        InputStream               FileInputStream                 BufferedInputStream
     *        OutputStream              FileOutputStream                BufferedOutputStream
     *        Reader                    FileReader                      BufferedReader
     *        Writer                    FileWriter                      BufferedWriter
     */
    //  要注意文件得位置
//    public static void main(String[] args){
//        File file = new File("hello.txt");
//        System.out.println(file.getAbsolutePath());
//
//        File file1 = new File("JavaSE\\hello.txt");
//        System.out.println(file1.getAbsolutePath());
//
//    }



    //  将hello.txt文件中得内如读入到程序中，并输出到控制台
    @Test
    public void testFileReader() throws IOException {

        //  hello.txt是相当于当前得Module
        //  第一步：实例化File类得对象，指明要操作得文件
        File file = new File("hello.txt");

        //  第二步：提供具体得流
        FileReader fileReader = new FileReader(file);

        //  第三步：数据得读入过程,并输出到控制台
        //  这个方法会读取输入流的下一个字节，并返回字节表示的int值（0~255）。
        //  如果已读到末尾，返回-1表示不能继续读取
        //  read()方法，返回读入得一个字符，如果达到文件末尾，返回-1
//        int data  = fileReader.read();
//        while (data != -1){
//            System.out.print((char) data );
//            data = fileReader.read();
//        }

        //  小修改
        int data;
        while ((data =fileReader.read()) != -1){
            System.out.print((char) data);
        }


        //  第四步：流得关闭操作
        fileReader.close();


        //  输出文件中的内容：test class,hello world
    }

    //  打印文件中的内容，写法二
    @Test
    public void test2() throws IOException {
        InputStream inputStream = new FileInputStream("hello.txt");
        for (;;){
            int n = inputStream.read();
            if (n == -1){
                break;
            }
            //  输出时，要注意进行强转，因为返回的n时字节表示的int值（0~255）
            System.out.print((char)n);
        }
        inputStream.close();
        //  输出结果：test class,hello world
    }


    /*
        将hello.txt文件内容读入程序中，并输出到控制台
        说明点：
            1、read()的理解：返回读入的一个字符，如果达到文件末尾，返回-1
            2、异常的处理：为了保证流资源一定可以执行关闭操作，需要使用try-catch-finally来处理
            3、读入的文件一定要存在，否则就会报异常
     */
    @Test
    public void test3() throws IOException {
        File file = new File("hello.txt");

        //  第二步：提供具体得流
            FileReader fileReader = new FileReader(file);
        try {
            int data;
            while ((data = fileReader.read())!=0){
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fileReader != null)
                fileReader.close();
        }
    }



    //  对read()操作的升级，使用read()的重载方法,read()方法有多个，
    @Test
    public void test4() {
        //  1、File类的实例化
        FileReader fileReader = null;
        try {
            File file = new File("hello.txt");

            //  2、FileReader
            fileReader = new FileReader(file);
            //  3、读入的操作
            //  read(char[] cbuf)：返回每次读入cbuf数组中的字符的个数,如果达到文件末尾，返回-1
            char[] cbuf = new char[5];

            int len;
            while ((len = fileReader.read(cbuf))!= -1){
                //  方式一：
                //  错误写法注意这里循环的条件不是：cbuf.length
//                for (int i = 0; i < cbuf.length; i++) {
//                    System.out.print(cbuf[i]);
//                }

                //  正确写法：
//                for (int i = 0; i < len; i++) {
//                    System.out.print(cbuf[i]);
//                }

                //  方式二：字符数组转换为字符串错误写法，对应着方式一的错误
//                String str = new String(cbuf);
//                System.out.println(str);
                // test
                //class
                //,hell
                //o wor
                //ldwor

                //  方式二：正确的写法,使用String(char[]. offset)这个构造器
                String str = new String(cbuf,0,len);
                System.out.print(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileReader != null){
                //  4、资源的关闭
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }



    }
}
