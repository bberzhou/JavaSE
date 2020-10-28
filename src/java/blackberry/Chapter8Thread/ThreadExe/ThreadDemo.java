package blackberry.Chapter8Thread.ThreadExe;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 10/12/20 20:39
 * Create By IntelliJ IDEA
 */
public class ThreadDemo {
    /**
     * 练习：创建两个分线程，其中一个线程遍历100以内的偶数，另外一个线程遍历100以内的奇数
     */
    public static void main (String[] args) {
//        //  100以内偶数子线程
//        ThreadSubclass1 threadSubclass1 = new ThreadSubclass1 ();
//
//        //  100以内奇数子线程
//        ThreadSubclass2 threadSubclass2 = new ThreadSubclass2 ();
//
//        threadSubclass1.start ();
//        threadSubclass2.start ();


        //  写法二：创建thread类的匿名子类的方法,就不用去写新的类

        new Thread () {
            @Override
            public void run () {
                for (int i = 0 ; i < 100 ; i++) {
                    if (i % 2 == 0) {
                        System.out.println (Thread.currentThread ().getName () + "偶数" + i);
                    }
                }
            }
        }.start ();

        new Thread () {
            @Override
            public void run () {
                for (int i = 0 ; i < 100 ; i++) {
                    if (i % 2 != 0) {
                        System.out.println (Thread.currentThread ().getName () + "奇数" + i);
                    }
                }
            }
        }.start ();

    }
}
