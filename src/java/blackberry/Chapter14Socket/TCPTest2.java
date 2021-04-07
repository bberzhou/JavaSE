package blackberry.Chapter14Socket;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
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

    }

    @Test
    public void Server(){

    }
}
