package blackberry.Chapter14Socket;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 4/7/21 22:22
 * Create By IntelliJ IDEA
 */
public class TCPTest2 {
    /*
        TCP 通信练习2：
            客户端发送文件给服务器，服务器将文件保存在本地
     */
    @Test
    public void Client() throws IOException {
        //  1、创建Socket的对象，指明服务器端的ip和端口号
        //  注意这里的ip地址是指的服务器端的
        InetAddress inetAddress = InetAddress.getByName ("127.0.0.1");
        Socket socket = new Socket (inetAddress,8859);

        //  2、获取输出流（因为是将数据发送出去）
        OutputStream outputStream = socket.getOutputStream ();

        //  3、写出文件数据
        FileInputStream fileInputStream = new FileInputStream (new File ("Photo.jpg"));
        byte[] buffer = new byte[1024];
        int len;
        while ((len = fileInputStream.read (buffer)) != -1){
            outputStream.write (buffer,0,len);
        }

        //  4、关闭资源
        fileInputStream.close ();
        outputStream.close ();
        socket.close ();

    }

    //  服务器端
    @Test
    public void Server() throws IOException {
        //  1、创建服务器端的ServerSocket，并且指明自己的端口号
        ServerSocket serverSocket = new ServerSocket (8859);
        //  2、调用accept()方法，表示接收来自于客户端的socket
        Socket socket = serverSocket.accept ();
        //  3、获取输入流
        InputStream inputStream = socket.getInputStream ();

        //  4、输出到指定文件
        FileOutputStream fileOutputStream = new FileOutputStream (new File ("PhotoSocket.jpg"));
        byte[] buffer = new byte[1024];
        int len;
        while ((len = inputStream.read (buffer)) != -1){
            // 5、 输出流写入
            fileOutputStream.write (buffer,0,len);
        }
        //  6、关闭资源
        fileOutputStream.close ();
        inputStream.close ();
        socket.close ();
        serverSocket.close ();

    }
}
