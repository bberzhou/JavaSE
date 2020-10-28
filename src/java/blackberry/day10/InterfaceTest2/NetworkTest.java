package blackberry.day10.InterfaceTest2;

/**
 * @Description: 网络接口测试类
 * @author: bberzhou@gmail.com
 * @date: 5/5/20 22:16
 * Create By IntelliJ IDEA
 */
public class NetworkTest {
    public static void main (String[] args) {
        Server server = new Server ();
        ProxyServer proxyServer = new ProxyServer (server);
        proxyServer.browse ();

        /*
            这里没有显式的使用Server的对象调研Server类里面的方法，
            但是实际上是通过proxyServer类来间接调用的
            联网之前的检查工作
            真实的服务器访问网络
         */
    }
}
