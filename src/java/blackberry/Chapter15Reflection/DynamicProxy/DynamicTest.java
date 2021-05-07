package blackberry.Chapter15Reflection.DynamicProxy;

import blackberry.Chapter15Reflection.ReflectionProxy.ClothFactory;
import blackberry.Chapter15Reflection.ReflectionProxy.NikeClothFactory;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 5/8/21 12:24 AM
 * Create By IntelliJ IDEA
 */
public class DynamicTest {
    /*
        要想实现动态代理，需要解决的问题：
            问题一：如何根据加载到内存中的被代理类，动态的创建一个代理类及其对象
            问题二：当通过代理类的对象调用方法时，如何动态的去调用被代理类中的同名方法
     */
    public static void main(String[] args){
        //  动态代理的实现实例

        //  一、先创建一个代理类的对象
        Superman superman = new Superman ();

        //  二、使用代理工厂，返回一个代理类的对象，proxyInstance，这里因为superman是实现的Human接口，所以返回的代理类相当于是Human接口的对象
        Human proxyInstance = (Human) ProxyFactory.getInstance (superman);

        //  三、代理类对象调用方法
        //  当通过代理类的对象调用方法时，会自动的调用被代理类中同名的方法
        String belief = proxyInstance.getBelief ();
        System.out.println (belief);
        //  I believe i can fly
        proxyInstance.eat ("四川麻辣烫。");
        //  超人喜欢吃:四川麻辣烫。


        System.out.println ("************************");

        //  对比NikeClothFactory()的静态实现
        NikeClothFactory nikeClothFactory = new NikeClothFactory ();
        ClothFactory ClothInstance = (ClothFactory) ProxyFactory.getInstance (nikeClothFactory);
        ClothInstance.produceCloth ();



    }
}
