package blackberry.day7OOP2;

/**
 * @Description: Instance
 * @author: bberzhou@gmail.com
 * @date: 4/9/20 15:37
 * Create By IntelliJ IDEA
 */
public class InstanceTest {
    /*
        理解：万事皆是对象
        1：在Java语言中，我们都是将功能、结构等封装起来，通过类的实例话，来调用具体的功能结构
        2：在设计到Java语言和前端，以及数据库交互时，前后端的结构在Java层面交互时

        3。引用类型的变量，只可能存储两类值：null或者地址值（包含变量的类型）

        4。匿名对象的使用
            创建的对象，没有显式的赋值给一个变量名，只能使用一次，不能重复使用
     */
    public static void main (String[] args) {
        Phone phone = new Phone ();
        //  phone就是相当于一个名为phone的对象
        phone.sendEmail ();
        phone.play ();

        //  匿名对象,此时调用的时候这两个是不同的对象调用的
        new Phone ().sendEmail ();
        new Phone ().play ();

        //  匿名类的使用
        PhoneCall phoneCall = new PhoneCall ();
        //  此时相当于把new的对象地址传递给形参，
        phoneCall.showPhone (new Phone ());
    }

}

class Phone {
    double price;

    public void sendEmail () {
        System.out.println ("发送邮件");
    }

    public void play () {
        System.out.println ("玩游戏");
    }
}

class PhoneCall {
    public void showPhone (Phone phone) {
        //  因此此时是由传进来的参数（对象的地址调用，所以实际上此时调用play和sendEmail对象是相同的）
        phone.play ();
        phone.sendEmail ();
    }

}
