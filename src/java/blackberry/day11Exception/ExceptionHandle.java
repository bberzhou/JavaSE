package blackberry.day11Exception;

import org.junit.Test;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 6/27/20 11:46
 * Create By IntelliJ IDEA
 */
public class ExceptionHandle {
    /*
      一、异常的处理机制：try-catch-finally  或者throws+异常类型
        过程一："抛出异常"
            程序在正常执行的过程中，一旦出现异常，就会在异常代码处生成一个对应异常类的对象
            并将此对象对抛出，一旦抛出对象以后，其后的代码就不会再执行

            关于异常的产生：1）系统自动生成的异常对象
                        2）手动的生成一个异常对象，并抛出

        过程二："抓"：
            异常的处理方式：try-catch-finally  或者throws+异常类型

     二、try-catch-finally 的使用
        try{
            可能出现异常的代码
         }catch(异常类型 变量名){
            处理异常的方式}
          finally{
            一定会执行的代码
          }

          说明：1.finally是可选的
               2.使用try将可能出现异常代码包装起来，在执行的过程中，一旦出现异常，就会
                    生成一个对象异常类的对象，根据此对象的类型，去catch中进行匹配
               3.一旦try中的异常对象匹配到某一个catch时，就进入catch中进行异常的处理，
                    处理完成之后，就会跳出当前的try-catch结构，继续执行后面的代码
               4.catch中的异常类型如果没有子父类的关系，则声明时的顺序没有关系，
                    如果有子父类的关系就需要注意.
               5.常用的异常对象处理的方式: 1.e.printStackTrace ()  2.e.getMessage ()
               6.在try结构中定义的变量，出了try结构之后，就不能再被调用

     */

    @Test
    public void test1 () {
        String str = "123";
        str = "abc";
        try {
            int num = Integer.parseInt (str);
        } catch (NumberFormatException e) {
            System.out.println ("出现数值转换异常");
            //  常用的异常对象的方法
//            e.printStackTrace ();
//            e.getMessage ();
        }
    }

}
