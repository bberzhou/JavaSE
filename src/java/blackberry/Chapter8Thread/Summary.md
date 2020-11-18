#### 多线程面试题目
1.画图说明线程的生命周期，以及各个状态切换使用到的方法
>生命周期关注两个概念：状态和相应的方法
关注：状态a--->状态b:哪些方法执行了（回调方法）
       某个方法主动调用：状态a---->状态b
* 阻塞是一个临时的状态       死亡：最终状态

2.同步代码块中涉及到同步监视器和共享数据，谈谈对这两个的理解
* synchronized(同步监视器),同步监视器是一个对象，任何一个类的对象都可以充当，
多个线程需要使用同一个监视器
* 共享数据。多个线程共同操作的数据，synchronized(){ //操作共享数据的代码}
* 同步方法里面也会涉及到同步监视器和共享数据，只是不需要我们显式的声明。同步方法里面的监视器是默认的：
非静态的同步方法，同步监视器是：this；静态的同步方法，同步监视器是：当前类本身

3.sleep()和wait()的区别
* 相同点：一旦执行方法，都可以使得当前的线程进入阻塞状态。
* 
4.写一个线程安全的懒汉式

5.创建多线程有哪几种方式
* 继承Thread类
* 实现runnable接口
* 实现Callable接口
* 线程池Executor:好处 响应速度提高，重用，便于管理


6.使用的优先顺序
*Lock --->同步代码块（已经进入了方法体，分配了相应资源）--->同步方法（在方法体之外）

7.不会释放锁的操作：程序调用sleep() yield()方法 或者suspend()方法将该线程挂起