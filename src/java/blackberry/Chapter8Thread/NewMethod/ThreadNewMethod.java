package blackberry.Chapter8Thread.NewMethod;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 11/14/20 14:39
 * Create By IntelliJ IDEA
 */
public class ThreadNewMethod {
    /**
     *  创建线程的方式三：实现callable接口，-----JDK5.0新增
     */

    public static void main (String[] args) {

        //  3。创建callable接口实现类的对象
        ThreadNew threadNew = new ThreadNew ();
        //  4.将此callable接口实现类的对象作为传递到futureTask的构造器中国，
        //  创建FutureTask的对象
        FutureTask futureTask = new FutureTask(threadNew);
        //  5。将FutureTask的对象作为参数传递到Thread类的构造器中，创建Thread对象，并调用start()
        new Thread (futureTask).start ();

        Object sum = null;
        try {
            //  6。获取callable中call方法的返回值
            //  get()方法返回值即为futureTask构造器参数
            //  callable实现类重写的call()方法的返回值
            sum = futureTask.get ();
            System.out.println("总和为"+ sum);
        } catch (InterruptedException e) {
            e.printStackTrace ();
        } catch (ExecutionException e) {
            e.printStackTrace ();
        }

    }
}
