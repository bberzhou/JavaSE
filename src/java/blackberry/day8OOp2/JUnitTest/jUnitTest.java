package blackberry.day8OOp2.JUnitTest;

import org.junit.Test;

/**
 * @Description: JUnit单元测试
 * @author: bberzhou@gmail.com
 * @date: 4/21/20 14:58
 * Create By IntelliJ IDEA
 */
public class jUnitTest {
    /*
        创建Java类，进行单元测试，此时的Java类要求：
            1。此类是公共的，public
            2。此类提供公共的无参的构造器
            3。在此类中声明单元测试的方法
                此时的单元测试方法：方法的权限是public的，没有返回值，没有形参

            4。此单元测试方法上面需要声明注解  @Test，并在单元测试类中导入

            5。声明好单元测试方法以后，就可以在方法体内测试相关的代码

        说明：
            1。如果执行结果没有异常，就是绿色，没通过就是红色

     */

    @Test
    public void test () {
        System.out.println ("hello");
    }

}
