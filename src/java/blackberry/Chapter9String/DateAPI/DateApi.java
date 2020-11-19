package blackberry.Chapter9String.DateAPI;

import blackberry.exercise.Project05Team.Service.Data;
import org.junit.Test;

import java.util.Date;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 11/19/20 21:18
 * Create By IntelliJ IDEA
 */
public class DateApi {
    /**
     * SimpleDateFormat
     * Calendar
     *
     *  与时间有关的类 ：System.currentTimeMillis ()
     *  java.util.Date 类
     *   1。两个构造器的使用
     *       ---->//  构造器1：Date()：创建一个对应当前时间的Date对象
     *       ---->//  构造器2：创建指定毫秒数的Date对象
     *   2。两个方法的使用
     *      --->toString()：显示当前的年、月、日、时、分、秒
     *      --->getTime()：获取当前Date对象对应的时间戳（毫秒数）
     *
     *   3.java.sql.Date对应数据库中的日期类型的变量
     *      --->如何实例化？
     *      ---->如何将sql.Date的对象转换为 ----java.util.Date的对象？----->直接赋值，利用多态，向上转型
     *      ---->如何将java.util.Date对象转换为java.sql.date的对象
     *
     */
    @Test
    public void test1(){
        //  System.currentTimeMillis (),返回从当前时间与1970年1月1日0时0分0秒之间以毫秒为单位的时间差，称为时间戳
        System.out.println(System.currentTimeMillis ());
    }

    @Test
    public void test2(){
        //  构造器1：Date()：创建一个对应当前时间的Date对象

        Date date = new Date ();
        System.out.println(date.toString ());   //  Thu Nov 19 21:23:23 CST 2020
        System.out.println(date.getTime ());    //  1605792341362

        Date date1 = new Date (2020, 11, 20);   //  此方法不建议使用了

        //  构造器2：创建指定毫秒数的Date对象
        Date date2 = new Date (1605792341362L);
        System.out.println(date2);      //  Thu Nov 19 21:25:41 CST 2020

        java.sql.Date date3 = new java.sql.Date (1605792341362L);
        System.out.println(date3.toString ());      // 2020-11-19

        //  如何将sql.Date的对象转换为 ----java.util.Date的对象？ 多态
        //  case 1:
//        Date data = new java.sql.Date (1605792341362L); //  向上转
//        java.sql.Date date4 = (java.sql.Date) date; //  向下强转  。此时是因为本身是子类赋值给父类之后再向下转

        //  case 2:
        Date date5 = new Date ();   //  new的就是父类，不能转成子类
//        java.sql.Date date7 = (java.sql.Date) date5;  //  报错java.lang.ClassCastException: java.util.Date cannot be cast to java.sql.Date

        java.sql.Date date7 = new java.sql.Date (date5.getTime ()); //  将Date的毫秒数作为参数传入

        //  471-----478 的内容


    }


}
