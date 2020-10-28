package blackberry.day8OOP1.PolymorpicExample;

/**
 * @Description: 猫类
 * @author: bberzhou@gmail.com
 * @date: 4/17/20 09:22
 * Create By IntelliJ IDEA
 */
public class Cat extends Animal {
    int id = 1002;

    @Override
    public void eat () {
        System.out.println ("猫吃鱼");
    }

    @Override
    public void shout () {
        System.out.println ("喵喵喵！");
    }
}
