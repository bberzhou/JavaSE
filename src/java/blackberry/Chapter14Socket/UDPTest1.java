package blackberry.Chapter14Socket;

import org.junit.Test;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 4/8/21 09:34
 * Create By IntelliJ IDEA
 */
public class UDPTest1 {
    /*
        UDP网络通信：
            类DatagramSocket和DatagramPacket实现了基于UDP协议网络编程。
            1、UDP数据报通过数据报套接字DatagramSocket发送和接收。优势是比较快速
            2、DatagramPacket对象封装了UDP数据报，在数据报中包含了发送端的IP地址和端口号以及接收端的IP地址和端口号
            3、UDP协议中每个数据报都给出了完整的地址信息，因此无需建立发送方和接收方的连接
     */

    @Test
    public void Sender() throws IOException {
        //  This class represents a socket for sending and receiving datagram packets.
        DatagramSocket socket = new DatagramSocket ();
        //  需要发送的数据
        String str = "我是UDP方式传送的数据";
        //  字符串转换成字节数组
        byte[] data = str.getBytes(StandardCharsets.UTF_8);
        //  ip地址
        InetAddress inetAddress = InetAddress.getByName ("127.0.0.1");
        //  封装一个数据报packet
        DatagramPacket packet = new DatagramPacket (data,0,data.length,inetAddress,9009);

        //  发送数据报
        socket.send (packet);
        //  关闭资源
        socket.close ();


    }
    //  接收端
    @Test
    public void Receiver() throws IOException {
        DatagramSocket socket = new DatagramSocket (9009);
        //  为了防止一次接收不完，可以定义一个字节数组来存放
        byte[] buffer = new byte[100];
        //  封装成一个数据报
        DatagramPacket packet = new DatagramPacket (buffer,0,buffer.length);
        //  接收数据报
        socket.receive (packet);

        //  最后将获取到的数据输出，但是具体到buffer里面的长度不知道，所以可以使用packet数据包
        //  packet.getData ()获取里面的数据，packet.getLength ()获取里面的数据长度
        System.out.println (new String (packet.getData (),0,packet.getLength ()));

        //  关闭资源
    }
}
