package blackberry.day10.InterfaceTest1;

/**
 * @Description: U盘
 * @author: bberzhou@gmail.com
 * @date: 5/1/20 00:22
 * Create By IntelliJ IDEA
 */
public class Flash implements USB {
    @Override
    public void start () {
        System.out.println ("U盘开始工作");
    }

    @Override
    public void stop () {
        System.out.println ("U盘停止工作");
    }
}
