package blackberry.day8OOP1.ExtendsProject1;

/**
 * @Description: 测试kinds类
 * @author: bberzhou@gmail.com
 * @date: 4/14/20 15:42
 * Create By IntelliJ IDEA
 */
public class KidsTest {
    /*
        测试kinds类及其父类的属性和方法
     */
    public static void main (String[] args) {
        Kids kids = new Kids (13);
        kids.printAge ();
        //  下面四个方法为父类Mankind的方法
        kids.setSalary (0);
        kids.setSex (1);
        kids.employed ();
        kids.manOrWoman ();
    }
}
