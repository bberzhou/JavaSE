package blackberry.day11Exception2;

/**
 * @Description: 自定义异常类
 * @author: bberzhou@gmail.com
 * @date: 8/17/20 16:06
 * Create By IntelliJ IDEA
 */

/*
    如何自定义异常类？==     自定义异常类的方法
        1.继承于现有的异常结构：RuntimeException 、Exception
        2.提供全局常量：serialVersionUID
        3.提供重载的构造器
 */
public class MyException extends RuntimeException {
    static final long serialVersionUID = -7034897190745766939L;

    public MyException () {

    }

    public MyException (String msg) {
        super (msg);
    }
}
