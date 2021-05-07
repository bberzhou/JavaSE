package blackberry.Chapter15Reflection.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 5/8/21 12:35 AM
 * Create By IntelliJ IDEA
 */
public class MyInvocationHandler implements InvocationHandler {
    private Object obj; //  需要使用被代理类的对象进行赋值
    public void bind(Object object){
        this.obj = object;
    }

    //  自定义的InvocationHandler来处理，代理时的问题二

    //  invoke()方法解决的就是问题二：
    //  通过代理类的对象调用方法时，如何动态的去调用被代理类中的同名方法
    //  当我们通过代理类的对象，调用方法a时，就会自动的调用如下的方法：invoke()
    //  将被代理类要执行的方法a的功能就声明在invoke()方法里面
    @Override
    public Object invoke (Object proxy, Method method, Object[] args) throws Throwable {
        //  proxy就是返回的代理类的对象，method,就是代理类调用的方法

        //  这里传入的参数就是上面的属性obj，

        //  method：即为代理类对象调用的方法，此方法也就作为了被代理类对象要调用的方法
        //  obj:被代理类的对象
        Object returnInvoke = method.invoke (obj, args);
        //  上述method方法的返回值returnInvoke就作为当前类invoke()的返回值
        return returnInvoke;
    }
}
