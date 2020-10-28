package blackberry.day8OOP1.instanceofKeyword;

/**
 * @Description: 女人类
 * @author: bberzhou@gmail.com
 * @date: 4/17/20 16:07
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
