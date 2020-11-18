package blackberry.Chapter8Thread.NewThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 11/14/20 15:37
 * Create By IntelliJ IDEA
 */
public class ThreadPool {
    /**
     *  线程池相关API，JDK5.0开始提供了线程池相关API：ExecutorService和Executors
     *  ExecutorService:线程池接口，子类有ThreadPoolExecutor
     *
     *  创建线程的方式四：使用线程池
     *  好处：
     *  1。提高响应速度（减少了创建新线程的时间）
     *  2。降低资源消耗（重复利用线程池中线程，不需要每次都创建）
     *  3。便于线程管理
     *      corePoolSize:核心池的大小
     *      maximumPoolSize:最大线程数
     *      keepAliveTime:线程没有任务时最多保持多长时间后会终止
     *
     *
     *   面试题：创建线程的方式
     */
    public static void main (String[] args) {
        //  1。提供指定线程数量的线程池  ExecutorService是一个接口
        ExecutorService service = Executors.newFixedThreadPool (10);
        // 设置线程池的属性
        //  首先需要将ExecutorService接口强转转换成ThreadPoolExecutor 对象
//        ThreadPoolExecutor executor = (ThreadPoolExecutor) service;
//        executor.setCorePoolSize (15);


        //  2。执行指定的线程的操作。需要提供实现Runnable接口或者callable接口实现类的对象
        service.execute (new NumberThread ());     //  适合适用于Runnable        pool-1-thread-10
//        service.submit ();      //  适合使用于callable


        //  3。关闭连接池
        //  当线程使用完毕之后，就可以关闭了,关闭连接池
        service.shutdown ();

    }
}

