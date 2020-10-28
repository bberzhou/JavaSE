package blackberry.day11Exception;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 7/27/20 17:07
 * Create By IntelliJ IDEA
 */
public class ExceptionTest2 {
    /*
        异常处理的方式二：throws + 异常类型
        1."throws + 异常类型"写在方法的声明处，指明方法执行时，可能会出现的异常类型
         出现异常时，生成一个异常类的对象，此对象满足throws后异常类型时，就会被抛出

         throws并没有真正处理异常，而且将异常抛出


         2。方法重写的规则之一：
            子类重写的方法抛出的异常类型不大于父类被重写的方法抛出的异常类型。

         3。开发中如何选择使用try-catch-finally 还是使用throws？
            3.1 如果父类中被重写的方法没有throws方式处理异常，则子类重写的方法也不能使用throws，
                如果子类重写的方法中有异常，必须使用try-catch-finally的方式处理
            3.2
     */


    public void method1 () {

    }
}
