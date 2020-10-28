package blackberry.day10.InterfaceTest2;

/**
 * @Description: 代理类
 * @author: bberzhou@gmail.com
 * @date: 5/5/20 22:13
 * Create By IntelliJ IDEA
 */
public class ProxyServer implements NetWork {
    private NetWork work;

    public ProxyServer (NetWork work) {
        this.work = work;
    }

    //  此类是一个代理类,
    public void check () {
        System.out.println ("联网之前的检查工作");
    }

    @Override
    public void browse () {
        check ();
        work.browse ();
    }
}
