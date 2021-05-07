package blackberry.Chapter15Reflection.ReflectionProxy;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 5/7/21 12:36 AM
 * Create By IntelliJ IDEA
 */
public class ProxyClass implements ClothFactory {
    //  代理类实现ClothProxy接口

    private ClothFactory clothFactory;  //  这里就是用被代理类对象进行实例化

    //  当前类的构造器
    public ProxyClass(ClothFactory clothFactorys){
        this.clothFactory = clothFactorys;

    }
    //  实现接口里面的方法
    @Override
    public void produceCloth () {
        System.out.println ("代理工厂做一些准备工作。");

        //  被代理对象开始执行
        clothFactory.produceCloth ();

        System.out.println ("代理工厂做一些后续的收尾工作");
    }


}
