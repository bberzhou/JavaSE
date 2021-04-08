package blackberry.Chapter14Socket;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 4/8/21 08:40
 * Create By IntelliJ IDEA
 */
public class TCPTest3 {
    /*
        TCP练习3：
            从客户端发送文件给服务端，服务端保存到本地，并返回"发送成功"给客户端，最后关闭相应的连接

          注意点：如果在客户端不给服务器端提示，那么服务器端就会一直在while循环里面等待客户端发送数据，
                所以当客户端发送完毕数据之后，需要给服务器端通知，这样服务器端才会进行下一步的操作

     */

    @Test
    public void Client() throws IOException {
        //  1、创建Socket的对象，指明服务器端的ip和端口号
        InetAddress inetAddress = InetAddress.getByName ("127.0.0.1");
        Socket socket = new Socket (inetAddress,7746);
        //   2、获取输出流（因为是将数据发送出去）
        OutputStream outputStream = socket.getOutputStream ();
        //  3、操作文件数据
        FileInputStream fileInputStream = new FileInputStream (new File ("Photo.jpg"));
        byte[] buffer = new byte[1024];
        int len;
        while ((len = fileInputStream.read (buffer)) != -1){
            outputStream.write (buffer,0,len);
        }
        //  发送完毕之后要给服务器端通知一下。输出完毕了。如果不通知，就会因为read方法而阻塞线程
        socket.shutdownOutput ();

        //  容易线程阻塞


        //  4、接收来自服务器端的消息，并显示到控制台上
        InputStream inputStream = socket.getInputStream ();
        //   方式一：使用ByteArrayOutputStream保证不乱码
//        ByteArrayOutputStream baos = new ByteArrayOutputStream ();
//        byte[] buffer1 = new byte[1023];
//        int len1;
//        while ((len1 = inputStream.read (buffer1)) != -1){
//            baos.write (buffer1,0,len1);
//        }
//        //  最后将读到内存中的数据输出
//        System.out.println (baos.toString());

        //  方式二：这里使用转换流也是可以的,将输入的字节流转换为字符流
        InputStreamReader isr = new InputStreamReader (inputStream, StandardCharsets.UTF_8);
        char[] cbuf = new char[5];
        int len1;
        while ((len1 = isr.read (cbuf)) != -1){
            System.out.print (new String (cbuf,0,len1));
        }

        //  关闭资源
//        baos.close ();
        inputStream.close ();

        outputStream.close ();
        fileInputStream.close ();
        outputStream.close ();
        socket.close ();

    }
    @Test
    public void Server() throws IOException {
        //  1、创建服务器端的ServerSocket，并且指明自己的端口号
        ServerSocket serverSocket = new ServerSocket (7746);
        //  2、调用accept()方法，表示接收来自于客户端的socket
        Socket socket = serverSocket.accept ();
        //   3、获取输入流
        InputStream inputStream = socket.getInputStream ();
        //  4、造输出流，写出到指定文件
        FileOutputStream fileOutputStream = new FileOutputStream (new File ("PhotoSocketTest3.jpg"));
        //  5、数据的读写操作
        byte[] buffer = new byte[2048];
        int len;
        while ((len = inputStream.read (buffer)) != -1){
            fileOutputStream.write (buffer,0,len);
        }

        //  服务器端显示信息
        System.out.println ("图片传输完成！");
        //  6、服务器端给予客户端反馈
        OutputStream outputStream = socket.getOutputStream ();
        outputStream.write ("服务器端已经接受完毕".getBytes(StandardCharsets.UTF_8));

        //  7、关闭服务器的流
        outputStream.close ();
        fileOutputStream.close ();
        inputStream.close ();
        socket.close ();
        serverSocket.close ();


    }
}
