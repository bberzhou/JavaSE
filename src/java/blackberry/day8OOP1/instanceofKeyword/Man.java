package blackberry.day8OOP1.instanceofKeyword;

/**
 * @Description: 男人类
 * @author: bberzhou@gmail.com
 * @date: 4/17/20 16:07
 * Create By IntelliJ IDEA
 */
public class Man extends Person {
    boolean isSmoking;
    int id = 1002;

    public void makeMoney () {
        System.out.println ("男人挣钱养家");
    }

    @Override
    public void eat () {
        System.out.println ("男人多吃肉");
    }

    @Override
    public void walk () {
        System.out.println ("男人走路快");
    }
}
