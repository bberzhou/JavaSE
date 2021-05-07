package blackberry.Chapter15Reflection.ReflectionProxy;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 5/7/21 12:34 AM
 * Create By IntelliJ IDEA
 */
public class StaticProxyTest {

    /*
        静态代理举例子：
        特点：代理类和被代理类在编译期间就会确定下来。（写死了）
     */



    //  静态代理测试，通过ProxyClass代理类去创建被代理类NikeClothFactory的对象
    public static void main(String[] args){

        //  1、先创建一个被代理类的对象
        NikeClothFactory nikeClothFactory = new NikeClothFactory ();

        //  2、创建一个代理类对象，并将被代理类的对象作为参数传入
        ProxyClass proxyClass = new ProxyClass (nikeClothFactory);

        //  3、被代理类执行
        proxyClass.produceCloth ();

        // 代理工厂做一些准备工作。
        //Nike工厂生产一批运动服
        //代理工厂做一些后续的收尾工作
    }
}
