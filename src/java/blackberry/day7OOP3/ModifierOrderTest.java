package blackberry.day7OOP3;

/**
 * @Description: ModifierTest
 * @author: bberzhou@gmail.com
 * @date: 4/10/20 16:00
 * Create By IntelliJ IDEA
 */
public class ModifierOrderTest {
    /*
      不同修饰符测试
   */
    private int orderPrivate;
    int orderDefault;
    public int orderPublic;

    private void methodPrivate () {
        orderPrivate = 1;
        orderDefault = 2;
        orderPublic = 3;
    }

    void methodDefault () {
        orderPrivate = 1;
        orderDefault = 2;
        orderPublic = 3;
    }

    public void methodPublic () {
        orderPrivate = 1;
        orderDefault = 2;
        orderPublic = 3;
    }
}
