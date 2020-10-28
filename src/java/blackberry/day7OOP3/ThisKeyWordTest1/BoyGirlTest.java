package blackberry.day7OOP3.ThisKeyWordTest1;

/**
 * @Description: boygirlTest
 * @author: bberzhou@gmail.com
 * @date: 4/11/20 09:26
 * Create By IntelliJ IDEA
 */
public class BoyGirlTest {
    /*
        对this关键字进行测试
     */
    public static void main (String[] args) {
        Boy boy = new Boy ("lili", 21);
        boy.shout ();
        Girl girl = new Girl ("kkk", 23);
        girl.marry (boy);
        Girl girl1 = new Girl ("祝英台", 19);
        int com = girl.compare (girl1);
        if (com > 0) {
            System.out.println ("girl大");
        } else if (com < 0) {
            System.out.println ("girl1大");
        } else {
            System.out.println ("一样大");
        }
    }
}
