package blackberry.day10.InterfaceKeyword;

/**
 * @Description: 飞机类实现Flyable
 * @author: bberzhou@gmail.com
 * @date: 5/1/20 00:03
 * Create By IntelliJ IDEA
 */
public class Plane implements Flyable {
    @Override
    public void fly () {
        System.out.println ("飞机类实现Flyable中的fly抽象方法");
    }

    @Override
    public void stop () {
        System.out.println ("飞机类实现Flyable中的stop抽象方法");
    }


}










