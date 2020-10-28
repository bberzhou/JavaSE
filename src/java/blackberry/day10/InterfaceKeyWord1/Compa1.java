package blackberry.day10.InterfaceKeyWord1;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 5/31/20 11:01
 * Create By IntelliJ IDEA
 */
public interface Compa1 {
    default void method3 () {
        System.out.println ("compa1 method3");
    }
}
