package blackberry.day10.InterfaceTest1;

/**
 * @Description: 计算机类
 * @author: bberzhou@gmail.com
 * @date: 5/1/20 00:24
 * Create By IntelliJ IDEA
 */
public class Computer {
    //  计算机类，定义一个传输数据的方法
    public void transferDate (USB usb) {
        //  实际调用的方法不是USB接口中的抽象方法，而是具体的实现类中的方法
        usb.start ();
        System.out.println ("具体的传输数据细节");
        usb.stop ();
    }
}
