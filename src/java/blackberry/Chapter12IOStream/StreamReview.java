package blackberry.Chapter12IOStream;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 4/6/21 09:36
 * Create By IntelliJ IDEA
 */
public class StreamReview {
    /*
        1、说明流的三种分类方式
            a、按照流向分为：输入流、输出流
            b、按照数据单位分为：字节流、字符流
            c、按照流的角色分为：节点流、处理流（包在已有流的上面的流）
        2、写出4个IO流中的抽象基类，4个文件流，4个缓冲流
            InputStream        FileInputStream          BufferedInputStream
            OutputStream       FileOutputStream         BufferedOutputStream
            Reader              FileReader              BufferedReader
            Writer              FileWriter              BufferedWriter
            抽象基类               （节点流）               (处理流)
            InputStreamReader：转换流，父类Reader
        3、字节流与字符流的区别与使用情景
            字节流以字节为单位：read(byte[] buffer)/ read()   非文本文件
            字符流：read(char[] cbuf) /read()               文本文件

        4、使用缓冲流实现a.jpg文件复制为b.jpg文件的操作
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(a.jpg))
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(b.jpg))
            byte[] buffer = new byte[1024]
            int len;
            while((len = bis.read(buffer)) != -1){
                bos.write(buffer,0, len);
                }
            bos.close;
            bis.close;

        5、转换流是哪两个类，分别的作用是什么？请分别创建两个类的对象
            InputStreamReader:将输入的字节流转换为输入的字符流---------解码
            OutputStreamWriter：将输出的字符流转换为输出的字节流-------编码

            InputStreamReader isr = new InputStreamReader(new FileInputStream("XX.txt","charSet"))  charSet根据txt的格式来决定
            OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("xx.txt","setName"))   setName根据需要进行编码


        6、输入输出的标准化过程
            输入过程：
                1、创建File类的对象，指明读取的数据的来源。（要求此文件一定要存在）
                2、创建相应的输入流，将File类的对象作为参数，传入流的构造器中
                3、具体的读入过程：
                    创建相应的byte[]或者char[]
                4、关闭流资源
           输出过程：
                1、创建File类的对象，指明写出的数据的位置。（写出文件可以不存在）
                2、创建相应的输出流，将File类的对象作为参数，传入流的构造器中
                3、具体的写出过程：
                    创建相应的byte[]或者char[]
                4、关闭流资源


     */

}
