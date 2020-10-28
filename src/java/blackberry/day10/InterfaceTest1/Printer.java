package blackberry.day10.InterfaceTest1;

/**
 * @Description: 打印机
 * @author: bberzhou@gmail.com
 * @date: 5/1/20 00:23
 * Create By IntelliJ IDEA
 */
public class Printer implements USB {
    @Override
    public void start () {
        System.out.println ("打印机开始工作");
    }

    @Override
    public void stop () {
        System.out.println ("打印机停止工作");
    }
}
