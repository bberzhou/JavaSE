package blackberry.Chapter14Socket;

import org.junit.Test;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 4/7/21 21:16
 * Create By IntelliJ IDEA
 */
public class InetAddressTest {
    /*
        一、网络编程中的两个主要的内容：
            1、如何准确地定位到网络上的一台或者多台主机；定位主机上的特定应用；
            2、找到主机后如何可靠高效的进行数据传输
        二、网络编程中的两个要素
            1、对应问题一：IP和端口号
            2、对应问题二：提供网络通信协议，TCP/IP

        三、通信要素一：IP和端口号
           1、IP地址：InetAddress，唯一的标识Internet上的计算机
           2、在Java中是哟哦那个InetAddress类代表IP
           3、IP分类：IPV4和IPV6
           4、域名：www.baidu.com
           5、本地回路地址：127.0.0.1--对应着 localhost
           6、如何实例化InetAddress：两个方法。getByName, getLocalHost
                两个常用的方法：getHostName和getHostAddress
           7、端口号用来标识正在计算机上运行的进程
                要求：不同的进程有不同的端口号

           8、端口号和IP地址的组合就得到网络套接字:Socket

          通信协议： TCP 和 UDP协议
                TCP协议：
                    使用TCP协议前，必须先建立连接，形成传输数据通道
                    传输前，采用"三次握手"的方式，点对点通信，是可靠的-----三次握手四次挥手
                    TCP协议进行通信的两个应用进程：客户端、服务端
                    在连接中可进行大数据量的传输
                    传输完毕，需要释放已经建立的连接，效率比较低
                UDP协议：
                    将数据、源、目的封装成数据包，不需要建立连接
                    每个数据报的大小限制在64K内
                    发送方不用管对方是否准备好，接收方收到也不确认，所以是不可靠的
                    可以广播发送
                    发送数据结束时不需要释放资源，开销比较小，速度比较快


     */

    @Test
    public void testInet(){
        try {
            InetAddress inetAddress = InetAddress.getByName ("127.0.0.1");
            System.out.println (inetAddress);
            //  /127.0.0.1
            InetAddress inetAddress1 = InetAddress.getByName ("www.baidu.com");
            System.out.println (inetAddress1);
            //  www.baidu.com/14.215.177.38

            //  获取本机IP地址
            InetAddress localHost = InetAddress.getLocalHost ();
            System.out.println (localHost);
            //  BlackBerrys-Mac.local/10.20.20.65

            //  getHostName 和getHostAddress
            System.out.println (localHost.getHostName ());
            //  BlackBerrys-Mac.local
            System.out.println (localHost.getHostAddress ());
            //  10.20.20.65
        } catch (UnknownHostException e) {
            e.printStackTrace ();
        }
    }


}
