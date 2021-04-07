package blackberry.Chapter13IOStream;

import org.junit.Test;

import java.io.*;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 3/30/21 10:13 PM
 * Create By IntelliJ IDEA
 */
public class FileReaderWriterChar {
       /*
        输入input：读取外部数据（磁盘、光盘等存储设备的数据）到内存中去
        输出output：将程序（内存中）的数据输出到磁盘、光盘等存储设备中去

        按照操作数据单位不同分类为：字节(一个byte)流(8 bit)图片或者视频更适合用字节流，字符(char，2个byte)流（16bit），字符流更适合用来处理文本数据
        Java提供了Reader和Writer表示字符流，字符流传输的最小数据单位是char
        二进制数据（字节）以byte为最小单位在InputStream/OutputStream中单向流动；
        字符数据(char)以char为最小单位在Reader/Writer中单向流动。
        按照流的角色的不同分为：节点流和处理流

        Java标准库的java.io包提供了同步IO功能
        节点流就是直接作用于文件之上的
        处理流就是作用在已有流的外层又包了一层的流，也叫包装流

        这四个类都是抽象类
                            字节流         字符流
               输入流      InputStream     Reader
               输出流      OutputStream    Writer





      整个IO流体系：

              分类          字节输入流                字节输出流                  字符输入流                字符输出流

节点流      * 抽象基类        InputStream              OutputStream              Reader                Writer
           *访问文件        FileInputStream         FileOutputStream           FileReader            FileWriter

  处理流：    访问数组        ByteArrayInputStream    ByteArrayOutputStream      CharArrayReader       CharArrayWriter
            访问管道        PipeInputStream         PipeOutputStream           PipeReader            PipeWriter
            访问字符串                                                         StringReader          StringWriter
          * 缓冲流         BufferedInputStream     BufferedOutputStream       BufferedReader        BufferedWriter
          * 转换流                                                            InputStreamReader     OutputStreamWriter
          * 对象流         ObjectInputStream       ObjectOutputStream
                         FilterInputStream       FilterOutputStream          FilterReader            FilterWriter
            打印流                                 PrintStream                                       PrintWriter
            推回输入流      PushbackStream                                     PushbackReader
            特殊流         DataInputStream         DataOutputStream




     一、流的分类：
        1。操作数据单位的不同：字节流、字符流
        2。数据流向的不同：输入流、输出流
        3。流的角色的不同：节点流、处理流

    二、流的体系结构
        抽象基类                    节点流(文件流)                                    处理流（缓冲流）
   字符  InputStream             FileInputStream (read(byte[] buffer))             BufferedInputStream (read(byte[] buffer))
        OutputStream            FileOutputStream (write(byte[] buffer,0,len))     BufferedOutputStream (write(byte[] buffer,0,len))
   字节  Reader                  FileReader (read(char[] cbuf))                    BufferReader  (read(char[] cbuf)/ readLine())
        Writer                  FileWriter (write(char[] cbuf,0,len))             BufferWriter (write(char[] cbuf,0,len))

        抽象类定义的一个最重要的方法就是int read():
        public abstract int read() throws IOException;
        这个方法会读取输入流的下一个字节，并返回字节表示的int值（0~255）。
        如果已读到末尾，返回-1表示不能继续读取了。


     三、说明点：
        1。read()的理解，返回读入的一个字符（是ASCII）码的形式，如果达到文件末尾，就返回-1
        2。异常的处理：为了保证流资源一定可以执行关闭操作，需要使用try-catch-finally来处理
        3。读入的文件一定要存在，否则就会报错FileNotFoundException
        4。也要注意read()方法不同的参数的方法调用
     */


    //  一、字符流


    //  将hello.txt文件内容读入到程序中去，并输出到控制台中
    @Test
    public void test () throws IOException {
        //  1、实例化file类的对象，指明要操作的文件
        File file = new File ("hello.txt");
        //  2、提供具体的流，流的实力话（这里是使用字符流）
        FileReader fileReader = new FileReader (file);
        //  3、方式一：数据的读入过程，并将读入的数据输出
//        int read = fileReader.read ();
//        while (read!=-1){
//            System.out.print ((char) read);
//            read = fileReader.read ();
//        }

        //  3、方式二：比方式一更精简，fileReader.read ()读取到的是ASCII 码，需要转换
        int data;
        while ((data = fileReader.read ()) != -1){
//            System.out.print (data);
            //  116101115116329910897115115
            System.out.print ((char) data);
        }

        //  4、关闭流
        fileReader.close ();












//        //  1、实例化file类的对象，指明要操作的文件
//        File file = new File ("hello.txt"); //  相对于当前的module
//
//        //  2、提供具体的流，流的实例化(这里是字符流)
//        FileReader fileReader = new FileReader (file);
//
//        //  3、数据的读入过程
//        //   @return The character read, or -1 if the end of the stream has been  reached
//
//        //  read()方法：返回一个字符，如果达到文件末尾就返回-1
//        int read = fileReader.read ();
//        while (read != -1) {
//            System.out.print ((char) read);
//            //  读了一次之后，重新给read赋值判断是否为-1
//            read = fileReader.read ();
//        }
//
//        //  4、流的关闭,close()
//        fileReader.close ();


    }

    // 对Read()方法的一个升级，使用read的重载方法
    @Test
    public void test2() throws IOException {
        //  1，2 两步可以直接省略
        FileReader fileReader = new FileReader (new File ("hello.txt"));


        //  2、
        char[] cbuf = new char[5];
        int len;
        while ((len = fileReader.read (cbuf)) != -1){
            //  注意这里在循环的时候，不能使用cbuf.length(),因为每次读入5个字符到数组里面去的时候，
            //  实际上是后面5个字符把上一次读的5个字符给覆盖掉，所以，如果有不是5的倍数的时候，就会出现后面几个字符是上一次读入的字符
            //  并不是获得5个之后就把数组清空了，所以这里循环的时候要用len,因为len是实际每次fileReader.read读到的个数

            //  错误写法
//            for (int i = 0 ; i < cbuf.length ; i++) {
//                System.out.print (cbuf[i]);
//            }
            //  testclassdidisd 输出结果


//            System.out.println ();

            //  正确写法方式一：
//            for (int i = 0 ; i < len ; i++) {
//                System.out.print (cbuf[i]);
//            }
            //  输出结果：testclassdidi

            //  方式二：char型数组转换为string
//            String str = new String (cbuf);
//            System.out.print (str);
            //testclassdidisd，还是错误的写法，因为这样每次都把读入到cbuf数组的字符输出了，对应方式一的错误
            String str = new String (cbuf,0,len);   //  设置每次转换的长度，具体长度又每次读的来定
            System.out.print (str);
            //  testclassdidi





        }
        fileReader.close ();
    }


//
//    //  1.实例化文件对象
//    File file = new File ("hello.txt");
//
//    //  2.File Reader流的实例化
//    FileReader fileReader = new FileReader (file);
//    //  3。读入的操作，使用read()的重载方法，
//    //  public int read(char cbuf[])：可以一次读入多个字符
//    //  这里具体的字符个数，就根据自己来定
//    char[] cbuf = new char[5];
//    //  Returns:The character read, or -1 if the end of the stream has been reached
//    int len;
//    //      fileReader.read (cbuf)，这里就是read方法每次读取的cbuf个字符，如果读完了最后为读取到的值就为-1
//    //  read(char[] cbuf)：返回每次读入cbuf数组中的字符的个数，如果达到文件末尾返回-1
//    //  此时已经将字符读入到了cbuf数组中去了
//
//        while ((len = fileReader.read (cbuf)) != -1){
//        //  循环遍历数组，将字符输出
//        for (int i = 0 ; i < len ; i++) {
//            System.out.print (cbuf[i]);
//        }
//
//    }
//
//    //  4。流的关闭
//        fileReader.close ();







}













