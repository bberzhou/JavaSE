package blackberry.day10.InterfaceTest2;

/**
 * @Description: 服务器类
 * @author: bberzhou@gmail.com
 * @date: 5/5/20 22:12
 * Create By IntelliJ IDEA
 */
//  被代理类
public class Server implements NetWork {
    @Override
    public void browse () {
        System.out.println ("真实的服务器访问网络");
    }
}
