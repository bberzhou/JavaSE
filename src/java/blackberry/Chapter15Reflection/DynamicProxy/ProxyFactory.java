package blackberry.Chapter15Reflection.DynamicProxy;

import java.lang.reflect.Proxy;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 5/8/21 12:27 AM
 * Create By IntelliJ IDEA
 */
public class ProxyFactory {
    /*
        代理工厂
     */

    // 这个方法的作用， 通过调用此方法，返回一个代理类的对象：解决问题1

    //  形参obj：被代理类的对象
    public static Object getInstance(Object obj){
        //  这里返回值Object就是代理类的类型，这里如果写Human就写死了
        //  java.lang.reflect
        //  newProxyInstance()有三个参数

        MyInvocationHandler myInvocationHandler = new MyInvocationHandler ();

        //  同时传入被代理对象
        myInvocationHandler.bind (obj);
        return Proxy.newProxyInstance (obj.getClass ().getClassLoader (),obj.getClass ().getInterfaces (),myInvocationHandler);
    }
}
