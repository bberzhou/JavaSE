package blackberry.Chapter14Socket;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 4/7/21 21:48
 * Create By IntelliJ IDEA
 */
public class TCPTest1 {
    /*
        实现TCP的网络编程
        例子1：客户端发送信息给服务器端，服务器端将数据显示在控制台上


     */

    //  客户端
    @Test
    public void Client() throws IOException {
        //  创建IP地址
        //  1、创建Socket的对象，指明服务器端的ip和端口号
        InetAddress inetAddress = InetAddress.getByName ("127.0.0.1");

        //  2、获取一个输出流，用于输出数据
        //  指定通信的IP地址和端口号，合起来构成一个Socket套接字
        Socket socket = new Socket (inetAddress,8848);
        //  使用Socket来传输数据
        OutputStream outputStream = socket.getOutputStream ();

        //  3、写出数据的操作
        outputStream.write ("你好，我是客户端！".getBytes(StandardCharsets.UTF_8));

        //  4、资源的关闭
        //  发送完毕之后都要把流关闭
        outputStream.close ();
        socket.close ();


    }
    //  服务端
    @Test
    public void Server(){
        ServerSocket serverSocket = null;
        Socket socket = null;
        InputStream inputStream = null;
        ByteArrayOutputStream bos = null;
        try {
            //  1、创建服务器端的ServerSocket，并且指明自己的端口号

            //  接收来自客户端的数据，使用的构造器，需要传入自己的端口号，这个端口号必须跟客户端的端口号一致
            serverSocket = new ServerSocket (8848);
            //  accept方法： Listens for a connection to be made to this socket and accepts it.
            //  The method blocks until a connection is made.

            //  2、调用accept()方法，表示来自于客户端的socket
            socket = serverSocket.accept ();

            //  3、获取输入流
            //  获取输入流
            inputStream = socket.getInputStream ();


            //  但是这样写有一点问题，因为输入的是汉字，这里使用的是字节流，可能会乱码。中文一个汉字占3个字节
            //  读数据
//        byte[] buffer = new byte[20];
//        int len;
//        while ((len = inputStream.read (buffer)) != -1){
//            //  转换成String
//            String s = new String (buffer, 0, len);
//            System.out.print (s);
//        }

            //  这里就可以使用ByteArrayOutputStream
            //  This class implements an output stream in which the data is
            // * written into a byte array.
            // The buffer automatically grows as data is written to it.  会自动增长长度

            //  4、读取输入流的数据
            bos = new ByteArrayOutputStream ();
            byte[] buffer = new byte[5];
            int len;
            while ((len = inputStream.read (buffer)) != -1){
                //  将字节数组写到内存里面
                bos.write (buffer,0,len);
            }

            //  最后将字节数组转换成字符串输出
            System.out.println (bos.toString ());

            //  先启动服务器端，再启动客户端，就成功输出
            //  你好，我是客户端！

            //  还可以看是谁发出的消息
            System.out.println ("收到了来自于："+socket.getInetAddress ().getHostAddress ()+"的消息");
            //  收到了来自于：127.0.0.1的消息。。  因为这里是在同一个主机，所以是相同的
        } catch (IOException e) {
            e.printStackTrace ();
        } finally {

            //  5、资源的关闭
            //  关闭资源
            try {
                if (bos != null) {
                    bos.close ();
                }
            } catch (IOException e) {
                e.printStackTrace ();
            }
            try {
                if (inputStream != null) {
                    inputStream.close ();
                }
            } catch (IOException e) {
                e.printStackTrace ();
            }
            try {
                if (socket != null) {
                    socket.close ();
                }
            } catch (IOException e) {
                e.printStackTrace ();
            }
            try {
                if (serverSocket != null) {
                    serverSocket.close ();
                }
            } catch (IOException e) {
                e.printStackTrace ();
            }
        }

    }
}
