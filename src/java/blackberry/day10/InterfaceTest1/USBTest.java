package blackberry.day10.InterfaceTest1;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 5/1/20 00:26
 * Create By IntelliJ IDEA
 */
public class USBTest {
    public static void main (String[] args) {
        /*
            接口的使用：
            1。接口的使用也体现了多态性
            2。接口实际上就是定义了一种规范
            3。接口的主要用途就是被实现类实现（开发中面向接口编程）
         */
        Computer computer = new Computer ();
        //  一、创建了接口的非匿名实现类的非匿名对象
        Printer printer = new Printer ();
        //  这里USB是 抽象类，不能被实例化，所以transferDate方法声明的是一个USB形参，
        //  但是实际上new的是一个实现类的对象，这里也体现了多态性
        //  相当于 USB usb  = new Printer()
        computer.transferDate (printer);
        //  二、创建了接口的非匿名实现类的匿名对象 , 匿名对象 new Flash () ，Flash是非匿名实现类
        computer.transferDate (new Flash ());

        //  三、创建了接口的匿名实现类的非匿名对象，这里的对象名就是usb
        USB usb = new USB () {
            @Override
            public void start () {
                System.out.println ("匿名实现类中非匿名对象的start方法");
            }

            @Override
            public void stop () {
                System.out.println ("匿名实现中非匿名对象的stop方法");
            }
        };
        computer.transferDate (usb);
        //  四、创建了接口的匿名实现类的匿名方法
        computer.transferDate (new USB () {
            @Override
            public void start () {
                System.out.println ("匿名实现类中匿名对象的start方法");
            }

            @Override
            public void stop () {
                System.out.println ("匿名实现类中匿名对象的stop方法");
            }
        });

    }
}
