package blackberry.Chapter13IOStream;

import org.junit.Test;

import java.io.*;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 3/29/21 10:08 PM
 * Create By IntelliJ IDEA
 */
public class StandardStream {
    /*
        其他流的使用：
            1、标准输入输出流：
            2、打印流
            3、数据流

     */
    public static void main (String[] args) throws IOException {
        /*
          1、标准的输入、输出流
             1.1 System.in：标准的输入流，默认从键盘输入
                System.out：标准的输出流，默认从控制台输出
             1.2
                System类的setIn(InputStream is )和setOut(PrintStream ps)方式可以重新指定输入和输出的流

             1.3练习：
                从键盘输入字符串，要求将读取到的整行字符串转换成大写输出，然后继续进行输入操作
                直至当输入"e"或者"exit"的时候，退出程序

                方法一：使用Scanner来实现,调用next()方法返回一个字符串


                方法二：使用System.in来实现。System.in---->转换流------->BufferedReader的ReadLine()方法
         */

        //  转换流，从键盘输入，InputStream是字节流，所以这里使用InputStreamReader()转换流，将字节流转换成字符流
        InputStreamReader inputStreamReader = new InputStreamReader (System.in);
        BufferedReader bufferedReader = new BufferedReader (inputStreamReader);

        while (true) {
            System.out.println ("请输入字符串：");
            //  readLine()读入一行数据
            String data = bufferedReader.readLine ();
            //  为了避免空指针异常
//            if (data.equalsIgnoreCase ("e")|| data.equalsIgnoreCase ("exit")){
//                break;
//            }
            if ("e".equalsIgnoreCase (data) || "exit".equalsIgnoreCase (data)) {
                break;
            } else {
                //  如果输入的字符串不是e或者"exit"就转换成大写
                String uppercase = data.toUpperCase ();
                System.out.println (uppercase);

            }

        }
        bufferedReader.close ();

    }

    /*
        2、打印流：PrintStream和PrintWriter，实现将基本数据类型的格式转化为字符串输出
            2.1、提供了一系列重载的print()和println()方法，用于多种数据类型的输出
            2.2、PrintStream和PrintWriter的输出不会抛出IOException的异常
            2.3、PrintStream和PrintWriter有自动flush的功能
            2.4、PrintStream打印的所有字符都使用平台的默认字符编码转换为字节
                在需要写入字符而不是字节的情况下，应该使用PrintWriter类
            2.5、System.out返回的是PrintStream的实例


       2。6 练习：

     */
    @Test
    public void test () {
        PrintStream ps = null;
        FileOutputStream fileOutputStream = null;
        try {
            //  输出到helloPrintStream.txt这个文件
            fileOutputStream = new FileOutputStream (new File ("helloPrintStream.txt"));
            //  创建打印输出流，设置为自动刷新模式（写入换行符或字节'\n'时都会刷新缓冲区）,并且设置新的打印
            //  The output stream to which values and objects will be printed
            //  改变输出的位置，现在就不是输出到控制台了，而是写入到fileOutputStream，
            ps = new PrintStream (fileOutputStream, true);
            if (ps != null) {
                //  把标准输出流（控制台输出）改成文件
                System.setOut (ps);

            }
            for (int i = 0 ; i <= 255 ; i++) {   //  输出ASCII码
                System.out.print ((char) i);    //  强转
                if (i % 50 == 0) {
                    //  每50个数据一行
                    System.out.println ();  //  换行
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace ();
        } finally {
            if (ps != null){
                ps.close ();
            }

        }

    }

    /*
        3、数据流
            3.1 DataInputStream和DataOutputStream
                作用：为了方便地操作java语言的基本数据类型和String的数据
                用于读取或写出基本数据类型的变量或者字符串
                分别"套接"在InputStream和OutputStream子类的流上
                DataInputStream中的方法:
                boolean readBoolean()       byte readByte()
                char readChar()             float readFloat()
                double readDouble()         short readShort()
                long readLong()             int readInt()
                String readUTF()            void readFully(byte[] b)
                DataOutputStream中的方法，将read改为相应的write即可
     */

    //  练习：将内存中的字符串、基本数据类型的变量写出到文件中。
    //  注意：处理异常的话，仍然应该使用try-catch-finally
    @Test
    public void test3 () throws IOException {
        //  数据的输出流，DataOutputStream写入到文件dataStream.txt
        DataOutputStream dataOutputStream = new DataOutputStream (new FileOutputStream ("dataStream.txt"));
        dataOutputStream.writeUTF ("对方就好");
        //  执行刷新操作就会将内存中的数据写入到文件中去
        dataOutputStream.flush ();
        dataOutputStream.write (34);
        dataOutputStream.flush ();
        dataOutputStream.writeBoolean (true);
        dataOutputStream.flush ();
        //  关闭流
        dataOutputStream.close ();

    }


    /*
        将dataStream.txt文件中存储的基本数据类型变量和字符串读取到内存中去，保存在变量中
        注意点：读取不同类型的数据的顺序要与当初写入文件时保存的数据的顺序一致
     */
    @Test
    public void test4() throws IOException {
        //  数据的输入流
        //  1、创建流
        DataInputStream dataInputStream = new DataInputStream (new FileInputStream (new File ("dataStream.txt")));
        //  2、读数据,根据test3写入的顺序逆序来读
        String name = dataInputStream.readUTF ();
        int age = dataInputStream.read ();
        boolean isMale = dataInputStream.readBoolean ();
        System.out.println ("name："+name);
        System.out.println ("age："+age);
        System.out.println ("isMale："+isMale);
        dataInputStream.close ();
    }
}
