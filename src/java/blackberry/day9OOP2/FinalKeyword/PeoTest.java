package blackberry.day9OOP2.FinalKeyword;

/**
 * @Description: Peo类测试
 * @author: bberzhou@gmail.com
 * @date: 4/25/20 15:04
 * Create By IntelliJ IDEA
 */
public class PeoTest {
    public static void main (String[] args) {
        Peo n = new Peo ();
        System.out.println ("静态变量" + n.getNUM ());
        int s = n.Som (2);
        System.out.println (s);  //  静态形参传入2 ，然后返回 num +1，只是不能对num进行修改
    }
}
