package blackberry.Chapter15Reflection.ReflectionProxy;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 5/7/21 12:42 AM
 * Create By IntelliJ IDEA
 */
public class NikeClothFactory implements ClothFactory{
    /*
    这个类就是需要被代理的类

 */

    @Override
    public void produceCloth () {
        System.out.println ("Nike工厂生产一批运动服");

    }

}
