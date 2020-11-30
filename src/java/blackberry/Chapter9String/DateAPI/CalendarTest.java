package blackberry.Chapter9String.DateAPI;

import java.util.Calendar;
import java.util.Date;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 11/23/20 21:44
 * Create By IntelliJ IDEA
 */
public class CalendarTest {
    /**
     *  Calendar日历类的使用
     *   Calendar类是一个抽象基类，不能被实例化，主要用于完成日期字段之间相互操作的功能
     *   获取Calendar类实例的方法：
     *      1。使用Calendar.getInstance()方法
     *      2。调用它的子类GregorianCalendar的构造器
     *
     *   注意：
     *      1。获取月份时，一月是0，二月是1，---12月是11
     *      2。获取星期时：周日是1，周二是2，---周六是7
     *
     */
    public static void main (String[] args) {
        //  1。实例化，创建子类GregorianCalendar的对象



        //  2。调用其静态方法getInstance()
        Calendar calendar = Calendar.getInstance ();
        System.out.println(calendar.getClass ());   //  class java.util.GregorianCalendar，是这个类的对象

        //  3。常用方法
        //  get()
        System.out.println(calendar.get (Calendar.DAY_OF_MONTH));   //  23 那个月的哪一天
        System.out.println(calendar.get (Calendar.DAY_OF_YEAR));    //  那一年的哪一天 328

        //  set()
        //  这里相当于就是直接修改的calendar对象的属性，不是像String那样重新返回一个对象
        calendar.set (Calendar.DAY_OF_MONTH,22);
        int days = calendar.get (Calendar.DAY_OF_MONTH);
        System.out.println(days);   //  22,


        //  add()
        calendar.add (Calendar.DAY_OF_MONTH,3); //  也可以做减法，直接后面参数 输入 -3 负数即可
        days = calendar.get (Calendar.DAY_OF_MONTH);
        System.out.println(days);
        //  getTime()   :日历类---->Date
        Date date = calendar.getTime ();
        System.out.println(date);   //  Wed Nov 25 21:27:51 CST 2020


        //  setTime():Date---->日历类
        Date date1 = new Date ();
        calendar.setTime (date1);   //  传入的是一个Date对象
        days = calendar.get (Calendar.DAY_OF_YEAR);
        System.out.println(days);   //  329






    }
}
