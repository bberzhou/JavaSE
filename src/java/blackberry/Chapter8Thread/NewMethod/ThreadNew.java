package blackberry.Chapter8Thread.NewMethod;

import java.util.concurrent.Callable;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 11/14/20 14:41
 * Create By IntelliJ IDEA
 */

/**
 *  与使用runnable相比，Callable功能更强大一些
 *  相比run()方法，可以有返回值
 *  方法可以抛出异常
 *  支持泛型的返回值
 *  需要借助FutureTask类，比如获取方法返回结果
 *
 *
 * Future接口，可以对具体runnable、callable任务的执行结果进行取消、查询是否完成、获取结果等
 * FutureTask是Future接口的唯一实现类
 * FutureTask同时实现了Runnable、future接口，既可以作为Runnable被线程执行，
 * 又可以作为Future得到Callable的返回值
 *
 *
 *    如何理解实现callable接口的方式创建多线程比实现runnable接口创建多线程方式更强大？
 *    1、callable()可以又返回值的
 *    2、callable()可以抛出异常，被外面的操作所捕获，获取异常的信息
 *    3、callable是支持泛型的
 */


    // 1.创建一个实现callable的实现类
public class ThreadNew implements Callable {
    //  实现call方法，将此线程需要执行的操作声明在call()方法中
    @Override
    public Object call () throws Exception {
        //  遍历100以内的偶数并返回其和
        int sum = 0;
        for (int i = 0 ; i <= 100 ; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
//            System.out.println("和为:"+sum);
        }
        //  这里有一个自动装箱，因为sum是int类型，但是call方法的返回值是Object类型
        return sum;
    }
}
