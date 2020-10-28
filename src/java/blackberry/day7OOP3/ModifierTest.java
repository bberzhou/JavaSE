package blackberry.day7OOP3;

/**
 * @Description: Modifier
 * @author: bberzhou@gmail.com
 * @date: 4/10/20 16:00
 * Create By IntelliJ IDEA
 */
public class ModifierTest {
    /*
        不同修饰符测试
     */
    public static void main (String[] args) {
        ModifierOrderTest m = new ModifierOrderTest ();
        m.orderPublic = 3;
        //  出了order类所在的包之后，就不可以调用了，对于default
        m.orderDefault = 1;
        //  出类ModifierOrderTest类就不可以调用了
//        m.orderPrivate =4;    private access,is not visible
        m.methodDefault ();
        m.methodPublic ();
        //  无法调用
//        m.methodPrivate();

    }

}
