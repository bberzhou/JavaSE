package blackberry.day8OOP1.PolymorphicClass;

/**
 * @Description: 女人
 * @author: bberzhou@gmail.com
 * @date: 4/17/20 00:04
 * Create By IntelliJ IDEA
 */
public class Woman extends Person {
    boolean isBeauty;

    public void goShopping () {
        System.out.println ("女人喜欢购物");
    }

    @Override
    public void eat () {
        System.out.println ("女生少吃减肥");
    }

    @Override
    public void walk () {
        System.out.println ("女人走路淑女");
    }
}
