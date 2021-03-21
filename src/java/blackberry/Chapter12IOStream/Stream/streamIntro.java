package blackberry.Chapter12IOStream.Stream;

public class streamIntro {
    /*
        IO流原理以及流的分来
            InputStream和OutputStream：InputStream就是Java标准库提供的最基本的输入流。它位于java.io这个包里。
            java.io包提供了所有同步IO的功能。要特别注意的一点是，InputStream并不是一个接口，而是一个抽象类，它是所有输入流的超类
            输入input:读取外部数据到程序中去
            输出output：将程序（内存）数据输出到磁盘、光盘中去
            Input抽象类提供了一个重要的方法就是int read()方法：public abstract int read() throws IOException;
            这个方法会读取输入流的下一个字节，并返回字节表示的int值（0~255）。如果已读到末尾，返回-1表示不能继续读取了


            流分分类：
                按操作数据单位不同分为：字节(8 bit，适合图片视频，非文本数据)流和字符(16 bit， 适合文本数据)流
                按数据的流向分类：输入流和输出流
                按流的角色的不同分为：节点流和处理流

                            抽象基类     字节流             字符流
                            输入流     InputStream        Reader
                            输出流     OutputStream       Writer



            IO流体系:
             分类             字节输入流           字节输出流         字符输入流           字符输出流
 节点流：     抽象基类       *InputStream         *OutputStream         *Reader            *Writer
             访问文件       *FileInputStream     *FileOutputStream     *FileReader       *FileWriter
 处理流：     访问数组       ByteArrayInputStream ByteArrayOutputStream CharArrayReader CharArrayWriter
             访问管道       PipedInputStream    PipedOutputStream   PipedReader         PipedWriter
             访问字符串                                              StringReader        StringWriter
             缓冲流        *BufferedInputStream  *BufferedOutputStream  *BufferedReader   *BufferedWriter
             转换流                                                  *InputStreamReader *OutputStreamWriter
             对象流         *ObjectInputStream   *ObjectOutPutStream
                            FileInputStream     FileOutputStream    FileReader          FileWriter
             打印流                            PrintStream                             PrintWriter
             推回输入流      PushbackInputStream                     PushbackReader
             特殊流        DataInputStream         DataOutputStream






     */
}
